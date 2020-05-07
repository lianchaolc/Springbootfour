package com.example.demo.global.domain.query;


/**
 * 分页信息
 * @author Zhaohui
 */
public class PageQuery {
    private Integer page = 1;
    private Integer limit = 10;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "PageQuery{" +
                "page=" + page +
                ", limit=" + limit +
                '}';
    }
}
