package com.yohoo.taobao.controller;

import com.github.pagehelper.PageInfo;
import com.yohoo.core.bo.JsonObjResult;
import com.yohoo.core.bo.JsonResult;
import com.yohoo.core.controller.BaseController;
import com.yohoo.core.exception.BusinessException;
import com.yohoo.taobao.bo.TbGoodsBo;
import com.yohoo.taobao.service.TbGoodsService;
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
 * @date 2019年4月27日15:45:52
 */
@Controller
@RequestMapping("/tb_goods")
public class TbGoodsController extends BaseController {

    @Autowired
    TbGoodsService tbGoodsService;


    @RequestMapping("/index")
    public String index(HttpServletRequest request, Model model) {
        model.addAttribute("icon", request.getParameter("icon"));
        model.addAttribute("f", request.getParameter("f"));
        model.addAttribute("z", request.getParameter("z"));
        return "taobao/goods";
    }

    @RequestMapping("/list")
    @ResponseBody
    public Map<String, Object> treeList(TbGoodsBo bo) {
        Map<String, Object> map = new HashMap<>();
        try {
            PageInfo<TbGoodsBo> typeList = tbGoodsService.getList(bo);
            map.put("rows", typeList.getList());
            map.put("total", typeList.getTotal());
        } catch (Exception e) {
            dealMapError(map, e);
        }
        return map;
    }

    @RequestMapping("/save")
    @ResponseBody
    public JsonResult save(TbGoodsBo bo) {
        JsonResult result = new JsonResult();
        try {
            tbGoodsService.saveOrUpdate(bo);
        } catch (Exception e) {
            dealError(result, e);
        }
        return result;
    }

    @RequestMapping("/findById")
    @ResponseBody
    public JsonObjResult<TbGoodsBo> findById(String typeId) {
        JsonObjResult<TbGoodsBo> result = new JsonObjResult<>();
        try {
            TbGoodsBo bo = tbGoodsService.getById(typeId);
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
            tbGoodsService.delete(typeId);
        } catch (Exception e) {
            dealError(result, e);
        }
        return result;
    }
}