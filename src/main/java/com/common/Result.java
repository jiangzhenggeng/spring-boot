package com.common;

public class Result {
    public Integer code;
    public Object data;
    public String  msg;

    public Result(){}

    public Result(Integer code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public Object getData() {
        return data;
    }

    public String getMsg() {
        return msg;
    }
}
