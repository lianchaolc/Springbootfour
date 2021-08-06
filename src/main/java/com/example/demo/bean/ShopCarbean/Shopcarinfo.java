package com.example.demo.bean.ShopCarbean;

import java.io.Serializable;

/***
 * 购物车详细
 */
public class Shopcarinfo implements Serializable {
    private int shop_car_id;
    private String shop_cardbyname;
    private String shop_cardcout;
    private String shop_cardname;
    private int shop_carinfiid;
    private String shop_cartype;
    private Double shop_money;

    public int getShop_car_id() {
        return shop_car_id;
    }

    public void setShop_car_id(int shop_car_id) {
        this.shop_car_id = shop_car_id;
    }

    public String getShop_cardbyname() {
        return shop_cardbyname;
    }

    public void setShop_cardbyname(String shop_cardbyname) {
        this.shop_cardbyname = shop_cardbyname;
    }

    public String getShop_cardcout() {
        return shop_cardcout;
    }

    public void setShop_cardcout(String shop_cardcout) {
        this.shop_cardcout = shop_cardcout;
    }

    public String getShop_cardname() {
        return shop_cardname;
    }

    public void setShop_cardname(String shop_cardname) {
        this.shop_cardname = shop_cardname;
    }

    public int getShop_carinfiid() {
        return shop_carinfiid;
    }

    public void setShop_carinfiid(int shop_carinfiid) {
        this.shop_carinfiid = shop_carinfiid;
    }

    public String getShop_cartype() {
        return shop_cartype;
    }

    public void setShop_cartype(String shop_cartype) {
        this.shop_cartype = shop_cartype;
    }

    public Double getShop_money() {
        return shop_money;
    }

    public void setShop_money(Double shop_money) {
        this.shop_money = shop_money;
    }

    public Shopcarinfo() {

    }

    public Shopcarinfo(int shop_car_id, String shop_cardbyname, String shop_cardcout, String shop_cardname, int shop_carinfiid, String shop_cartype, Double shop_money) {
        this.shop_car_id = shop_car_id;

        this.shop_cardbyname = shop_cardbyname;
        this.shop_cardcout = shop_cardcout;
        this.shop_cardname = shop_cardname;
        this.shop_carinfiid = shop_carinfiid;
        this.shop_cartype = shop_cartype;
        this.shop_money = shop_money;
    }
}
