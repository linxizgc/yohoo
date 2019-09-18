package com.yohoo.product.controller;

import com.github.pagehelper.PageInfo;
import com.yohoo.core.bo.JsonObjResult;
import com.yohoo.core.bo.JsonResult;
import com.yohoo.core.controller.BaseController;
import com.yohoo.core.exception.BusinessException;
import com.yohoo.product.bo.FtxBigAttrBo;
import com.yohoo.product.service.FtxBigAttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 大属性
 *
 * @author LinXi
 * @date 2019年7月27日09:45:52
 */
@Controller
@RequestMapping("/ftx_big_attr")
public class FtxBigAttrController extends BaseController {

    @Autowired
    FtxBigAttrService service;


    @RequestMapping("/index")
    public String index(HttpServletRequest request, Model model) {
        model.addAttribute("icon", request.getParameter("icon"));
        model.addAttribute("f", request.getParameter("f"));
        model.addAttribute("z", request.getParameter("z"));
        return "product/ftx_attr";
    }

    @RequestMapping("/list")
    @ResponseBody
    public Map<String, Object> treeList(FtxBigAttrBo bo) {
        Map<String, Object> map = new HashMap<>();
        try {
            PageInfo<FtxBigAttrBo> list = service.getList(bo);
            map.put("rows", list.getList());
            map.put("total", list.getTotal());
        } catch (Exception e) {
            dealMapError(map, e);
        }
        return map;
    }

    @RequestMapping("/allList")
    @ResponseBody
    public JsonObjResult<FtxBigAttrBo> allList(FtxBigAttrBo bo) {
        JsonObjResult<FtxBigAttrBo> result = new JsonObjResult<>();
        try {
            List<FtxBigAttrBo> list = service.getAllList(bo);
            result.setRows(list);
        } catch (Exception e) {
            dealError(result, e);
        }
        return result;
    }

    @RequestMapping("/save")
    @ResponseBody
    public JsonResult save(FtxBigAttrBo bo) {
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
    public JsonObjResult<FtxBigAttrBo> findById(String bigAttrId) {
        JsonObjResult<FtxBigAttrBo> result = new JsonObjResult<>();
        try {
            FtxBigAttrBo bo = service.getById(bigAttrId);
            result.setRecord(bo);
        } catch (BusinessException e) {
            dealError(result, e);
        }
        return result;
    }

    @RequestMapping("/remove")
    @ResponseBody
    public JsonResult remove(String bigAttrId) {
        JsonResult result = new JsonResult();
        try {
            service.delete(bigAttrId);
        } catch (Exception e) {
            dealError(result, e);
        }
        return result;
    }
}