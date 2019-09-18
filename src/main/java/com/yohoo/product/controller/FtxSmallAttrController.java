package com.yohoo.product.controller;

import com.github.pagehelper.PageInfo;
import com.yohoo.core.bo.JsonObjResult;
import com.yohoo.core.bo.JsonResult;
import com.yohoo.core.controller.BaseController;
import com.yohoo.core.exception.BusinessException;
import com.yohoo.product.bo.FtxSmallAttrBo;
import com.yohoo.product.service.FtxSmallAttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 小属性
 *
 * @author LinXi
 * @date 2019年7月27日09:45:52
 */
@Controller
@RequestMapping("/ftx_small_attr")
public class FtxSmallAttrController extends BaseController {

    @Autowired
    FtxSmallAttrService service;


    @RequestMapping("/index")
    public String index(HttpServletRequest request, Model model) {
        model.addAttribute("icon", request.getParameter("icon"));
        model.addAttribute("f", request.getParameter("f"));
        model.addAttribute("z", request.getParameter("z"));
        return "product/small_attr";
    }

    @RequestMapping("/list")
    @ResponseBody
    public Map<String, Object> treeList(FtxSmallAttrBo bo) {
        Map<String, Object> map = new HashMap<>();
        try {
            PageInfo<FtxSmallAttrBo> list = service.getList(bo);
            map.put("rows", list.getList());
            map.put("total", list.getTotal());
        } catch (Exception e) {
            dealMapError(map, e);
        }
        return map;
    }

    @RequestMapping("/save")
    @ResponseBody
    public JsonResult save(FtxSmallAttrBo bo) {
        JsonResult result = new JsonResult();
        try {
            service.saveOrUpdate(bo);
        } catch (Exception e) {
            dealError(result, e);
        }
        return result;
    }

    @RequestMapping("/findById")
    @ResponseBody
    public JsonObjResult<FtxSmallAttrBo> findById(String smallAttrId) {
        JsonObjResult<FtxSmallAttrBo> result = new JsonObjResult<>();
        try {
            FtxSmallAttrBo bo = service.getById(smallAttrId);
            result.setRecord(bo);
        } catch (BusinessException e) {
            dealError(result, e);
        }
        return result;
    }

    @RequestMapping("/remove")
    @ResponseBody
    public JsonResult remove(String smallAttrId) {
        JsonResult result = new JsonResult();
        try {
            service.delete(smallAttrId);
        } catch (Exception e) {
            dealError(result, e);
        }
        return result;
    }
}