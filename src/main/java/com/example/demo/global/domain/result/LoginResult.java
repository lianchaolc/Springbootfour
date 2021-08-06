package com.example.demo.global.domain.result;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * layui的table响应结果封装
 */
public class LoginResult implements Result {
    private int code;
    private String msg;
    private String token;
    private String refreshToken;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date tokenExpiryTime;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date refreshTokenExpiryTime;
    private long errorNum;

    public long getErrorNum() {
        return errorNum;
    }

    public LoginResult setErrorNum(long errorNum) {
        this.errorNum = errorNum;
        return this;
    }

    public int getCode() {
        return code;
    }

    public LoginResult setCode(ResultCode resultCode) {
        this.code = resultCode.code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public LoginResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public String getToken() {
        return token;
    }

    public LoginResult setToken(String token) {
        this.token = token;
        return this;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public LoginResult setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    public Date getTokenExpiryTime() {
        return tokenExpiryTime;
    }

    public LoginResult setTokenExpiryTime(Date tokenExpiryTime) {
        this.tokenExpiryTime = tokenExpiryTime;
        return this;
    }

    public Date getRefreshTokenExpiryTime() {
        return refreshTokenExpiryTime;
    }

    public LoginResult setRefreshTokenExpiryTime(Date refreshTokenExpiryTime) {
        this.refreshTokenExpiryTime = refreshTokenExpiryTime;
        return this;
    }

    @Override
    public String toString() {

        return JSON.toJSONString(this);
    }
}
