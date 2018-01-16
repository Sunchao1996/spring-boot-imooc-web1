package com.imooc.exception;

/**
 * 用户自定义异常
 */
public class GirlException extends RuntimeException{
    private Integer code;
    private String msg;
    public GirlException(Integer code,String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
