package com.example.demo.global.domain.bo;

import java.util.List;

/**
 * Created by Zhaohui on 2018/3/21.
 */
public class PageBO<T> extends CommonBO{
    private List<T> data;
    private long count;


    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
