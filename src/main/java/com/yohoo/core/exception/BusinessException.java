package com.yohoo.core.exception;

/**
 * @author Linxi
 * @Description: 业务异常，主要用于业务逻辑处理过程中
 * @date 2019年2月1日
 */
public class BusinessException extends RuntimeException {


    private String code;

    public BusinessException() {
        super();
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String code, String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }
}
