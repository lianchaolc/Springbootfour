package com.example.demo.global.domain.bo;

/**
 * Created by Zhaohui on 2018/3/21.
 */
public class CommonDataBO<T> extends CommonBO{
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
