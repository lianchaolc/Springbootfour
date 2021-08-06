package com.example.demo.bean;

import java.io.Serializable;

public class shopcarinfoentity  implements Serializable {


    public Integer getShopcarinfiid() {
        return shopcarinfiid;
    }

    public void setShopcarinfiid(Integer shopcarinfiid) {
        this.shopcarinfiid = shopcarinfiid;
    }

    public Integer getShopcarinfocoutt() {
        return shopcarinfocoutt;
    }

    public void setShopcarinfocoutt(Integer shopcarinfocoutt) {
        this.shopcarinfocoutt = shopcarinfocoutt;
    }

    public Double getShopcarinfomoney() {
        return shopcarinfomoney;
    }

    public void setShopcarinfomoney(Double shopcarinfomoney) {
        this.shopcarinfomoney = shopcarinfomoney;
    }

    public String getShopcarinfoname() {
        return shopcarinfoname;
    }

    public void setShopcarinfoname(String shopcarinfoname) {
        this.shopcarinfoname = shopcarinfoname;
    }

    public String getShopcarinfourl() {
        return shopcarinfourl;
    }

    public void setShopcarinfourl(String shopcarinfourl) {
        this.shopcarinfourl = shopcarinfourl;
    }

    public shopcarinfoentity(Integer shopcarinfiid, Integer shopcarinfocoutt, Double shopcarinfomoney, String shopcarinfoname, String shopcarinfourl) {
        this.shopcarinfiid = shopcarinfiid;

        this.shopcarinfocoutt = shopcarinfocoutt;
        this.shopcarinfomoney = shopcarinfomoney;
        this.shopcarinfoname = shopcarinfoname;
        this.shopcarinfourl = shopcarinfourl;
    }

    public shopcarinfoentity() {
    }

    private Integer shopcarinfiid;  //  id
    private Integer shopcarinfocoutt;   // 单个商品数量
    private Double shopcarinfomoney;//  单个商品钱数
    private String shopcarinfoname; //  商品名称
    private String shopcarinfourl; //  商品名称
}
