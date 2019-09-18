package com.yohoo.taobao.controller;

import com.github.pagehelper.PageInfo;
import com.yohoo.core.bo.JsonObjResult;
import com.yohoo.core.bo.JsonResult;
import com.yohoo.core.controller.BaseController;
import com.yohoo.core.exception.BusinessException;
import com.yohoo.taobao.bo.TbBannerBo;
import com.yohoo.taobao.service.TbBannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 产品类型
 *
 * @author LinXi
 * @date 2019年4月26日09:45:52
 */
@Controller
@RequestMapping("/tb_banner")
public class TbBannerController extends BaseController {

    @Autowired
    TbBannerService tbBannerService;


    @RequestMapping("/index")
    public String index(HttpServletRequest request, Model model) {
        model.addAttribute("icon", request.getParameter("icon"));
        model.addAttribute("f", request.getParameter("f"));
        model.addAttribute("z", request.getParameter("z"));
        return "taobao/banner";
    }

    @RequestMapping("/list")
    @ResponseBody
    public Map<String, Object> treeList(TbBannerBo bo) {
        Map<String, Object> map = new HashMap<>();
        try {
            PageInfo<TbBannerBo> typeList = tbBannerService.getList(bo);
            map.put("rows", typeList.getList());
            map.put("total", typeList.getTotal());
        } catch (Exception e) {
            dealMapError(map, e);
        }
        return map;
    }

    @RequestMapping("/save")
    @ResponseBody
    public JsonResult save(TbBannerBo bo) {
        JsonResult result = new JsonResult();
        try {
            tbBannerService.saveOrUpdate(bo);
        } catch (Exception e) {
            dealError(result, e);
        }
        return result;
    }

    @RequestMapping("/findById")
    @ResponseBody
    public JsonObjResult<TbBannerBo> findById(String typeId) {
        JsonObjResult<TbBannerBo> result = new JsonObjResult<>();
        try {
            TbBannerBo bo = tbBannerService.getById(typeId);
            result.setRecord(bo);
        } catch (BusinessException e) {
            dealError(result, e);
        }
        return result;
    }

    @RequestMapping("/remove")
    @ResponseBody
    public JsonResult remove(String typeId) {
        JsonResult result = new JsonResult();
        try {
            tbBannerService.delete(typeId);
        } catch (Exception e) {
            dealError(result, e);
        }
        return result;
    }
}