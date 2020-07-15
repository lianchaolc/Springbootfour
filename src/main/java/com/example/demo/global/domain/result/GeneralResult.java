package com.example.demo.global.domain.result;

import com.alibaba.fastjson.JSON;

/**
 * 一般的响应结果封装
 */
public class GeneralResult implements Result{
    private int code;
    private String msg;
    private Object data;

    public GeneralResult setCode(ResultCode resultCode) {
        this.code = resultCode.code;
        return this;
    }

    public int getCode() {
        return code;
    }

    public GeneralResult setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public GeneralResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getData() {
        return data;
    }

    public GeneralResult setData(Object data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {

        return JSON.toJSONString(this);
    }
}
