package com.example.demo.domain;

import java.util.List;

/****
 * 分页结果集的封装
 * @param <T>
 */
public  class PageResult<T> {
    private long total;//总条数
    private Integer totalPage;//总页数
    private List<T> list;

    public PageResult() {
    }

    public PageResult(long total, List<T> list) {
        this.total = total;
        this.list = list;
    }

    public PageResult(long total, Integer totalPage, List<T> list) {
        this.total = total;
        this.totalPage = totalPage;
        this.list = list;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
