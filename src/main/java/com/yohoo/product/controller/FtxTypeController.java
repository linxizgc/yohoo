package com.yohoo.product.controller;

import com.github.pagehelper.PageInfo;
import com.yohoo.core.bo.JsonObjResult;
import com.yohoo.core.bo.JsonResult;
import com.yohoo.core.controller.BaseController;
import com.yohoo.core.exception.BusinessException;
import com.yohoo.product.bo.FtxTypeBo;
import com.yohoo.product.service.FtxTypeService;
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
 * @date 2019年3月27日09:45:52
 */
@Controller
@RequestMapping("/ftx_type")
public class FtxTypeController extends BaseController {

    @Autowired
    FtxTypeService typeService;


    @RequestMapping("/index")
    public String index(HttpServletRequest request, Model model) {
        model.addAttribute("icon", request.getParameter("icon"));
        model.addAttribute("f", request.getParameter("f"));
        model.addAttribute("z", request.getParameter("z"));
        return "product/product_type";
    }

    @RequestMapping("/list")
    @ResponseBody
    public Map<String, Object> treeList(FtxTypeBo bo) {
        Map<String, Object> map = new HashMap<>();
        try {
            PageInfo<FtxTypeBo> typeList = typeService.getTypeList(bo);
            map.put("rows", typeList.getList());
            map.put("total", typeList.getTotal());
        } catch (Exception e) {
            dealMapError(map, e);
        }
        return map;
    }

    @RequestMapping("/save")
    @ResponseBody
    public JsonResult save(FtxTypeBo bo) {
        JsonResult result = new JsonResult();
        try {
            typeService.saveOrUpdate(bo);
        } catch (Exception e) {
            dealError(result, e);
        }
        return result;
    }

    @RequestMapping("/findById")
    @ResponseBody
    public JsonObjResult<FtxTypeBo> findById(String typeId) {
        JsonObjResult<FtxTypeBo> result = new JsonObjResult<>();
        try {
            FtxTypeBo bo = typeService.getById(typeId);
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
            typeService.delete(typeId);
        } catch (Exception e) {
            dealError(result, e);
        }
        return result;
    }
}