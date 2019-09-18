package com.yohoo.system.controller;

import com.github.pagehelper.PageInfo;
import com.yohoo.core.bo.JsonObjResult;
import com.yohoo.core.bo.JsonResult;
import com.yohoo.core.controller.BaseController;
import com.yohoo.core.exception.BusinessException;
import com.yohoo.system.bo.AdminMenuBo;
import com.yohoo.system.service.AdminMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 系统用户
 *
 * @author LinXi
 * @date 2017年5月2日09:45:52
 */
@Controller
@RequestMapping("/adminMenu")
public class AdminMenuController extends BaseController {

    @Autowired
    AdminMenuService adminMenuService;



    @RequestMapping("/index")
    public String index() {
        return "system/adminMenuList";
    }

    @RequestMapping("/listJson")
    @ResponseBody
    public JsonObjResult<AdminMenuBo> jsonList(AdminMenuBo userBo) {
        JsonObjResult<AdminMenuBo> result = new JsonObjResult<AdminMenuBo>();
        try {
            PageInfo<AdminMenuBo> menuList = adminMenuService.getMenuList(userBo);

        } catch (Exception e) {
            dealError(result, e);
        }
        return result;
    }

    @RequestMapping("/treeList")
    @ResponseBody
    public Map<String,Object> treeList(AdminMenuBo userBo) {
        Map<String,Object> map = new HashMap<>();
        try {
            //result.setRows(adminMenuService.getTreeList(userBo));
            map.put("rows",adminMenuService.getTreeList(userBo));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    @RequestMapping("/create")
    public String create(Model model) {
        model.addAttribute("adminMenu", new AdminMenuBo());
        return "system/adminMenuEdit";
    }

    @RequestMapping("/saveJson")
    @ResponseBody
    public JsonResult saveJson(AdminMenuBo userBo) {
        JsonResult jsonResult = new JsonResult();
        try {
            adminMenuService.saveOrUpdate(userBo);
            jsonResult.setMessage("保存成功！");
        } catch (BusinessException e) {
            dealError(jsonResult, e);
        } catch (Exception e) {
            return dealError(jsonResult, e);
        }
        return jsonResult;
    }

    @RequestMapping("/edit")
    public String edit(Integer id, Model model) {
        if (!StringUtils.isEmpty(id)) {
            try {
                AdminMenuBo userBo = adminMenuService.getById(id);
                model.addAttribute("adminMenu", userBo);
            } catch (BusinessException e) {
                e.printStackTrace();
            }
        }
        return "system/adminMenuEdit";
    }

    @RequestMapping("/deleteAdminMenu")
    @ResponseBody
    public JsonResult deleteJson(Integer id) {
        JsonResult jsonResult = new JsonResult();
        try {
            adminMenuService.delete(id);
            jsonResult.setMessage("删除成功！");
        } catch (Exception e) {
            return dealError(jsonResult, e);
        }
        return jsonResult;
    }
}