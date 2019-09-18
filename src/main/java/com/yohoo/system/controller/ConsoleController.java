package com.yohoo.system.controller;

import com.yohoo.core.bo.JsonResult;
import com.yohoo.core.controller.BaseController;
import com.yohoo.system.bo.AdminUserBo;
import com.yohoo.system.bo.TreeMenu;
import com.yohoo.system.service.AdminMenuService;
import com.yohoo.system.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by kaikentule on 2018/10/19.
 */
@Controller
@RequestMapping("/console")
public class ConsoleController extends BaseController {

    @Autowired
    AdminUserService adminUserService;

    @Autowired
    AdminMenuService adminMenuService;

    @Value("${customParm}")
    private String customParm;

    @RequestMapping("/product")
    public String products(HttpServletRequest request, Model model) {
        model.addAttribute("icon",request.getParameter("icon"));
        model.addAttribute("f",request.getParameter("f"));
        model.addAttribute("z",request.getParameter("z"));
        return "product/product";
    }

    @RequestMapping("/index")
    public String index(HttpServletRequest request, Model model) {
        List<TreeMenu> menuList = adminMenuService.getMenusByUserId(1004);
        model.addAttribute("menulist", menuList);
        return "platform/index";
    }

    /**
     * @param request
     * @param model
     * @return
     * @Description: 初始化登陆页面
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(HttpServletRequest request, Model model) {
        return "platform/login";
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
//            // 校验验证码
//            String code = ServletRequestUtils.getStringParameter(request, "code", "");
//            if (!code.equals(session.getAttribute(SysConstant.LOGIN_VERIFY_CODE_SESSION))) {
//                result.setSuccess(false);
//                result.setMessage("验证码错误，请刷新后再试");
//                return result;
//            }
            AdminUserBo ubo = new AdminUserBo();
            ubo.setLoginName(loginName);
//            AdminUserBo userBo = adminUserService.getAdminUser(ubo);
            // 校验密码
//            if (UtilPub.isEmpty(userBo) || !passwordEncoder.matches(password, userBo.getPassword())) {
//                result.setSuccess(false);
//                result.setMessage("用戶名或密码错误");
//                return result;
//            }
            // 验证状态
//            if (0 == userBo.getStatus()) {
//                result.setSuccess(false);
//                result.setMessage("该用户已停用，请联系管理员");
//                return result;
//            }
//            AdminSession adminSession = new AdminSession(String.valueOf(userBo.getId()), userBo.getLoginName());
//            // 登录写cookie
//            session.setAttribute(SysConstant.YAYA_ADMIN_SESSION, adminSession);
//            session.setAttribute("realName", userBo.getRealName());
//            SystemConstant.nowLoginUser = userBo.getLoginName();
//            SystemConstant.setAppList(appLoanService.getAppList());
//
//            String ip = SystemParamConstant.getRemortIP(request);
//            if(UtilPub.isNotEmpty(ip) && !ip.contains("125.82")){
//                IpMonitor ipm = new IpMonitor();
//                ipm.setIp(ip);
//                ipm.setTime(new Date());
//                ipMonitorDao.insertSelective(ipm);
//            }
        } catch (Exception e) {
            return dealError(result, e);
        }
        return result;
    }

    @RequestMapping("/tools")
    @ResponseBody
    public String devtol() {
        return "欢迎光临 饭特稀 - " + customParm;
    }
}
