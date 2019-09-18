package com.yohoo.core.controller;

import com.yohoo.core.bo.JsonResult;
import com.yohoo.core.config.Constant;
import com.yohoo.core.controller.BaseController;
import com.yohoo.core.exception.BusinessException;
import com.yohoo.core.utils.UtilPub;
import com.yohoo.system.bo.FtxFileBo;
import com.yohoo.system.service.FtxFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/ftx_upload")
public class FtxFileController extends BaseController {

    @Autowired
    FtxFileService fileService;


    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public JsonResult upload(@RequestParam MultipartFile file) {
        JsonResult result = new JsonResult();
        Map<String, Object> map = new HashMap<>();
        try {
            if (file == null || file.getSize() <= 0) {
                throw new BusinessException("文件不能为空");
            }
            if (file.getSize() > 1024 * 1024 * 5) {
                throw new BusinessException("上传文件大小不能超过5M！");
            }

            String originalFilename = file.getOriginalFilename();
            //文件后缀名
            String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));

            byte[] fileByte = file.getBytes();

            String uuid = UtilPub.getUUID();

            //以当前年月命名的目录名
            String dateDir = new SimpleDateFormat("yyyyMM").format(new Date()) + "/" + new SimpleDateFormat("dd").format(new Date()) + "/";

            String path = Constant.SYS_FILE_UPLOAD_URL_PATH + dateDir;

            //判断目录是否存在，若不存则创建目录
            File dir = new File(path);
            if (!dir.exists()) {
                dir.mkdirs();
            }

            //存储全路径
            String fullPath = path + uuid + suffix;
            File f = new File(fullPath);
            FileOutputStream out = new FileOutputStream(f); // 输出文件路径
            out.write(fileByte);
            out.flush();
            out.close();

            map.put("imgId", uuid);
            map.put("imgUrl", Constant.DOMAIN_NAME + dateDir + uuid + suffix);
            result.appendData(map);

            FtxFileBo bo = new FtxFileBo();
            bo.setFileId(uuid);
            bo.setFileName(uuid);
            bo.setSuffix(suffix);
            bo.setSize((int) file.getSize());
            bo.setFullPath(dateDir + uuid + suffix);
            bo.setCreateTime(new Date());
            fileService.save(bo);
        } catch (Exception e) {
            dealError(result, e);
        }
        return result;
    }


    @RequestMapping(value = "/uploadBase64", method = RequestMethod.POST)
    public JsonResult uploadBase64(@RequestParam("file") String file) {

        JsonResult result = new JsonResult();
        Map<String, Object> map = new HashMap<>();
        try {


            Base64.Decoder decoder = Base64.getDecoder();

            // 去掉base64编码的头部 如："data:image/jpeg;base64," 如果不去，转换的图片不可以查看
            file = file.substring(23);

            //解码
            byte[] imgByte = decoder.decode(file);

            String uuid = UtilPub.getUUID();
            //存储到磁盘的文件名
            String newFileName = new Date().getTime() + uuid;

            //以当前年月命名的目录名
            String dateDir = new SimpleDateFormat("yyyyMM").format(new Date()) + "/" + new SimpleDateFormat("dd").format(new Date()) + "/";

            String path = Constant.SYS_FILE_UPLOAD_URL_PATH + dateDir;

            //判断目录是否存在，若不存则创建目录
            File dir = new File(path);
            if (!dir.exists()) {
                dir.mkdirs();
            }

            //存储全路径
            String fullPath = path + newFileName;
            try {
                File f = new File(fullPath + ".jpg");
                FileOutputStream out = new FileOutputStream(f); // 输出文件路径
                out.write(imgByte);
                out.flush();
                out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            map.put("imgId", uuid);
            map.put("imgUrl", dateDir + newFileName + ".jpg");
            result.appendData(map);
            FtxFileBo bo = new FtxFileBo();

            bo.setFileId(uuid);
            bo.setFileName(newFileName);
            bo.setSuffix(".jpg");
            bo.setSize(imgByte.length);
            bo.setFullPath(dateDir + newFileName + ".jpg");
            bo.setCreateTime(new Date());
            fileService.save(bo);
        } catch (Exception e) {
            dealError(result, e);
        }
        return result;
    }
}
