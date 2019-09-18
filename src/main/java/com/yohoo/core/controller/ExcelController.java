package com.yohoo.core.controller;

import com.yohoo.core.bo.JsonResult;
import com.yohoo.core.exception.BusinessException;
import com.yohoo.core.utils.UtilPub;
import com.yohoo.system.service.FtxFileService;
import com.yohoo.taobao.bo.TbGoodsBo;
import com.yohoo.taobao.bo.TbTypeBo;
import com.yohoo.taobao.service.TbGoodsService;
import org.apache.commons.lang3.RandomUtils;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@RequestMapping("/ftx_excel")
public class ExcelController extends BaseController {

    @Autowired
    FtxFileService fileService;

    @Autowired
    TbGoodsService goodsService;


    /**
     * 商品导入
     *
     * @param file
     * @param typTitle
     * @return
     */
    @RequestMapping(value = "/import", method = RequestMethod.POST)
    public JsonResult excelImport(@RequestParam MultipartFile file, String typTitle) {
        TbTypeBo tbType = goodsService.getTbType(typTitle);
        JsonResult result = new JsonResult();
        try {
            if (file == null || file.getSize() <= 0) {
                throw new BusinessException("文件不能为空");
            }
            HSSFWorkbook workbook = new HSSFWorkbook(new POIFSFileSystem(file.getInputStream()));
            for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
                HSSFSheet sheet = workbook.getSheetAt(i);
                for (int j = 0; j < sheet.getPhysicalNumberOfRows(); j++) {
                    if (j == 0) {
                        continue;//标题行
                    }
                    HSSFRow row = sheet.getRow(j);
                    TbGoodsBo goods = new TbGoodsBo();
                    goods.setGooType(UtilPub.isNotEmpty(tbType) ? tbType.getTypId() : null);
                    goods.setGooName(row.getCell(1).getStringCellValue());
                    goods.setGooImg(row.getCell(2).getStringCellValue());
                    goods.setShopName(row.getCell(4).getStringCellValue());
                    goods.setGooPrice(Float.parseFloat(row.getCell(5).getStringCellValue()));

                    String couponVal = row.getCell(15).getStringCellValue();
                    goods.setGooNowPrice(Float.parseFloat(row.getCell(5).getStringCellValue()) - Integer.parseInt(couponVal.substring(couponVal.lastIndexOf("减") + 1, couponVal.lastIndexOf("元"))));

                    goods.setMonthSale(Integer.parseInt(row.getCell(6).getStringCellValue()));
                    goods.setIncomeRatio(Float.parseFloat(row.getCell(7).getStringCellValue()));
                    goods.setCommission(Float.parseFloat(row.getCell(8).getStringCellValue()));
                    goods.setTkUrl(row.getCell(11).getStringCellValue());
                    goods.setTkPassword(row.getCell(12).getStringCellValue());
                    goods.setCouponTotal(row.getCell(13).getStringCellValue());
                    goods.setCouponSurp(row.getCell(14).getStringCellValue());
                    goods.setCouponVal(Integer.parseInt(couponVal.substring(couponVal.lastIndexOf("减") + 1, couponVal.lastIndexOf("元"))));
                    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
                    goods.setCouponBegin(sdf1.parse(row.getCell(16).getStringCellValue()));
                    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
                    goods.setCouponEnd(sdf2.parse(row.getCell(17).getStringCellValue()));
                    goods.setCouponUrl(row.getCell(18).getStringCellValue());
                    goods.setCouponPassword(row.getCell(19).getStringCellValue());
                    goods.setSorts(RandomUtils.nextInt(1, 10000));
                    goods.setStatus("1");
                    List<TbGoodsBo> byName = goodsService.getByName(row.getCell(1).getStringCellValue());
                    if (byName.size() < 1) {
                        goodsService.saveOrUpdate(goods);
                    }
                }
            }
        } catch (Exception e) {
            dealError(result, e);
        }
        return result;
    }
}
