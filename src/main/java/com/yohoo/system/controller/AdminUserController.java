package com.yohoo.system.controller;

import com.github.pagehelper.PageInfo;
import com.yohoo.core.bo.JsonObjResult;
import com.yohoo.core.bo.JsonResult;
import com.yohoo.core.controller.BaseController;
import com.yohoo.core.exception.BusinessException;
import com.yohoo.system.bo.AdminMenuBo;
import com.yohoo.system.bo.AdminUserBo;
import com.yohoo.system.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * 系统用户
 *
 * @author LinXi
 * @date 2017年4月27日11:45:52
 */
@Controller
@RequestMapping("/adminUser")
public class AdminUserController extends BaseController {

    @Autowired
    AdminUserService adminUserService;

//    @Autowired
//    PasswordEncoder passwordEncoder;

    @RequestMapping("/index")
    public String index() {
        return "system/adminUserList";
    }

    @RequestMapping("/listJson")
    @ResponseBody
    public JsonObjResult<AdminUserBo> jsonList(AdminUserBo userBo) {
        JsonObjResult<AdminUserBo> result = new JsonObjResult<>();
        try {
            PageInfo<AdminUserBo> userList = adminUserService.getUserList(userBo);

        } catch (Exception e) {
            dealError(result, e);
        }
        return result;

    }

    @RequestMapping("/list")
    @ResponseBody
    public Map<String,Object> treeList(AdminUserBo userBo) {
        Map<String,Object> map = new HashMap<>();
        try {
            PageInfo<AdminUserBo> userList = adminUserService.getUserList(userBo);
            map.put("rows",userList.getList());
            map.put("total",userList.getTotal());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    @RequestMapping("/create")
    public String create(Model model) {
        model.addAttribute("adminUser", new AdminUserBo());
        return "system/adminUserEdit";
    }

    @RequestMapping("/saveJson")
    @ResponseBody
    public JsonResult saveJson(AdminUserBo userBo) {
        JsonResult jsonResult = new JsonResult();
        try {
            adminUserService.saveOrUpdate(userBo);
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
                AdminUserBo userBo = adminUserService.getById(id);
                model.addAttribute("adminUser", userBo);
            } catch (BusinessException e) {
//                model.addAttribute("productLabel", new LabelLoanBo());
            }
        }
        return "system/adminUserEdit";
    }

    @RequestMapping("/deleteAdminUser")
    @ResponseBody
    public JsonResult deleteJson(Integer id) {
        JsonResult jsonResult = new JsonResult();
        try {
            adminUserService.delete(id);
            jsonResult.setMessage("删除成功！");
        } catch (Exception e) {
            return dealError(jsonResult, e);
        }
        return jsonResult;
    }


    @RequestMapping("/relationDialog")
    public String relationDialog(AdminUserBo userBo, Model model) {
        model.addAttribute("userBo", userBo);
        return "system/relationRole";
    }

    @RequestMapping("/relation")
    @ResponseBody
    public JsonResult relation(AdminUserBo userBo, Model model) {
        JsonResult jsonResult = new JsonResult();
        try {
            adminUserService.saveRelation(userBo);
            jsonResult.setMessage("绑定成功！");
        } catch (Exception e) {
            return dealError(jsonResult, e);
        }
        return jsonResult;
    }

    @RequestMapping("/getSelected")
    @ResponseBody
    public JsonResult getSelected(Integer userId) {
        JsonResult result = new JsonResult();
        try {
            result.appendData("selected", adminUserService.getRolesByUserId(userId));
        } catch (Exception e) {
            dealError(result, e);
        }
        return result;
    }

    @RequestMapping("/changeStatus")
    @ResponseBody
    public JsonResult changeStatus(Integer id, Integer status) {
        JsonResult jsonResult = new JsonResult();
        try {
            adminUserService.changeStauts(id, status);
            jsonResult.setMessage("操作成功！");
        } catch (BusinessException e) {
            dealError(jsonResult, e);
        } catch (Exception e) {
            return dealError(jsonResult, e);
        }
        return jsonResult;
    }


    /**
     * @param request
     * @param response
     * @return
     * @Description: 执行登陆验证
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult login(HttpServletRequest request, HttpServletResponse response) {
        JsonResult result = new JsonResult();
        try {
            HttpSession session = request.getSession(true);
            String loginName = ServletRequestUtils.getStringParameter(request, "loginName", "");
            String password = ServletRequestUtils.getStringParameter(request, "password", "");
            // 校验验证码
            String code = ServletRequestUtils.getStringParameter(request, "code", "");
//            if (!code.equals(session.getAttribute(SysConstant.LOGIN_VERIFY_CODE_SESSION))) {
//                result.setSuccess(false);
//                result.setMessage("验证码错误，请刷新后再试");
//                return result;
//            }
            AdminUserBo ubo = new AdminUserBo();
            ubo.setLoginName(loginName);
            AdminUserBo userBo = adminUserService.getAdminUser(ubo);
            // 校验密码
//            if (UtilPub.isEmpty(userBo) || !passwordEncoder.matches(password, userBo.getPassword())) {
//                result.setSuccess(false);
//                result.setMessage("用戶名或密码错误");
//                return result;
//            }
            // 验证状态
            if (0 == userBo.getStatus()) {
                result.setSuccess(false);
                result.setMessage("该用户已停用，请联系管理员");
                return result;
            }
//            AdminSession adminSession = new AdminSession(String.valueOf(userBo.getId()), userBo.getLoginName());
            // 登录写cookie
//            session.setAttribute(SysConstant.YAYA_ADMIN_SESSION, adminSession);
        } catch (Exception e) {
            return dealError(result, e);
        }
        return result;
    }


}