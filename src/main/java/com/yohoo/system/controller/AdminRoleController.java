package com.yohoo.system.controller;


import com.yohoo.core.bo.JsonObjResult;
import com.yohoo.core.bo.JsonResult;
import com.yohoo.core.controller.BaseController;
import com.yohoo.core.exception.BusinessException;
import com.yohoo.system.bo.AdminRoleBo;
import com.yohoo.system.service.AdminRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 系统角色
 *
 * @author LinXi
 * @date 2017年4月27日11:45:52
 */
@Controller
@RequestMapping("/adminRole")
public class AdminRoleController extends BaseController {

    @Autowired
    AdminRoleService adminRoleService;

    @RequestMapping("/index")
    public String index() {
        return "system/adminRoleList";
    }

    @RequestMapping("/listJson")
    @ResponseBody
    public JsonObjResult<AdminRoleBo> jsonList(AdminRoleBo roleBo) {
        JsonObjResult<AdminRoleBo> result = new JsonObjResult<>();
        try {
            adminRoleService.getUserList(roleBo);
        } catch (Exception e) {
            dealError(result, e);
        }
        return result;

    }

    @RequestMapping("/create")
    public String create(Model model) {
        model.addAttribute("adminRole", new AdminRoleBo());
        return "system/adminRoleEdit";
    }

    @RequestMapping("/saveJson")
    @ResponseBody
    public JsonResult saveJson(AdminRoleBo roleBo) {
        JsonResult jsonResult = new JsonResult();
        try {
            adminRoleService.saveOrUpdate(roleBo);
            jsonResult.setMessage("保存成功！");
        } catch (BusinessException e) {
            dealError(jsonResult, e);
        } catch (Exception e) {
            dealError(jsonResult, e);
        }
        return jsonResult;
    }

    @RequestMapping("/edit")
    public String edit(Integer id, Model model) {
        if (!StringUtils.isEmpty(id)) {
            try {
                AdminRoleBo roleBo = adminRoleService.getById(id);
                model.addAttribute("adminRole", roleBo);
            } catch (BusinessException e) {
//                model.addAttribute("productLabel", new LabelLoanBo());
            }
        }
        return "system/adminRoleEdit";
    }

    @RequestMapping("/deleteAdminRole")
    @ResponseBody
    public JsonResult deleteJson(Integer id) {
        JsonResult jsonResult = new JsonResult();
        try {
            adminRoleService.delete(id);
            jsonResult.setMessage("删除成功！");
        } catch (Exception e) {
            return dealError(jsonResult, e);
        }
        return jsonResult;
    }

    @RequestMapping("/relationDialog")
    public String relationDialog(AdminRoleBo roleBo, Model model) {
        model.addAttribute("roleBo", roleBo);
        return "system/relationMenu";
    }

    /**
     * 绑定（用户权限）
     *
     * @param roleBo
     * @param model
     * @return
     */
    @RequestMapping("/relation")
    @ResponseBody
    public JsonResult relation(AdminRoleBo roleBo, Model model) {
        JsonResult jsonResult = new JsonResult();
        try {
            adminRoleService.saveRelation(roleBo);
            jsonResult.setMessage("绑定成功！");
        } catch (Exception e) {
            return dealError(jsonResult, e);
        }
        return jsonResult;
    }

    @RequestMapping("/getSelected")
    @ResponseBody
    public JsonResult getSelected(Integer roleId) {
        JsonResult result = new JsonResult();
        try {
            result.appendData("selected", adminRoleService.getMenusByRoleId(roleId));
        } catch (Exception e) {
            dealError(result, e);
        }
        return result;
    }
}