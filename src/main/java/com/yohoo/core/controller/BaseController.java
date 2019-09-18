package com.yohoo.core.controller;

import com.alibaba.fastjson.JSON;
import com.yohoo.core.bo.JsonResult;
import com.yohoo.core.exception.BusinessException;
import com.yohoo.core.utils.UtilPub;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Linxi
 * @Description: Api接口基类
 * @date 2019年1月14日
 */
@Controller
public class BaseController {
    /**
     * 参数key
     */
    private static final String API_PARAM = "yongzhengParam";

    /**
     * @param request
     * @return
     * @Title: getParamterToMap
     * @Description: 获取接口参数信息并且转成Map对象
     */
    public Map<String, Object> getParamterToMap(HttpServletRequest request) throws Exception {
        String apiParam = request.getParameter(API_PARAM);
        if (StringUtils.isNotEmpty(apiParam)) {
            return JSON.parseObject(apiParam, Map.class);
        } else {
            return new HashMap<>();
//            String json = "";
//            try {
//                json = IOUtils.toString(request.getInputStream());
//            } catch (IOException e) {
//                throw new Exception(e.getMessage(), e);
//            }
//            return JSON.parseObject(json, Map.class);
        }
    }

    /**
     * @param request
     * @param clazz
     * @return
     * @Title: getParamterToObject
     * @Description: 获取接口参数信息并且转成自定义对象
     */
    public <T> T getParamterToObject(HttpServletRequest request, Class<T> clazz) throws Exception {
        String apiParam = request.getParameter(API_PARAM);
        if (StringUtils.isNotEmpty(apiParam)) {
            return JSON.parseObject(apiParam, clazz);
        } else {
            return clazz.newInstance();
        }
    }

    /**
     * @param result
     * @param e
     * @return
     * @Title: dealError
     * @Description: 错误信息处理
     */
    public JsonResult dealError(JsonResult result, Exception e) {
        e.printStackTrace();
        if (e instanceof BusinessException) {
            result.setCode(UtilPub.isEmpty(((BusinessException) e).getCode()) ? "-1" : ((BusinessException) e).getCode());
            result.setMessage(e.getMessage());
        } else {
            result.setCode("-1");
            result.setMessage("系统异常,请联系管理员");
        }
        result.setSuccess(false);
        return result;
    }

    /**
     * @param map
     * @param e
     * @return
     * @Title: dealApiError
     * @Description: 错误信息处理
     */
    public Map<String, Object> dealMapError(Map<String, Object> map, Exception e) {
        e.printStackTrace();
        if (e instanceof BusinessException) {
            map.put("code", UtilPub.isEmpty(((BusinessException) e).getCode()) ? "-1" : ((BusinessException) e).getCode());
            map.put("resultMsg", e.getMessage());
        } else {
            map.put("code", "-1");
            map.put("resultMsg", "系统异常,请联系管理员");
        }
        return map;
    }
}
