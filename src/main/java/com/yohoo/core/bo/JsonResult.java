package com.yohoo.core.bo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Linxi
 * @Description: JSON数据返回对象
 * @date 2019年1月14日
 */
public class JsonResult implements Serializable {

    private boolean success = true;

    private String code = "1";

    private String message = "成功";

    private Map<Object, Object> data = new HashMap<>();

    public JsonResult() {
        super();
    }

    public JsonResult(boolean success) {
        super();
        this.success = success;
    }

    public JsonResult(String code, String message) {
        super();
        this.code = code;
        this.message = message;
        this.success = false;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<Object, Object> getData() {
        return data;
    }

    public void setData(Map<Object, Object> data) {
        this.data = data;
    }

    public void appendData(Object key, Object value) {
        this.data.put(key, value);
    }

    public void appendData(Map<?, ?> map) {
        this.data.putAll(map);
    }
}
