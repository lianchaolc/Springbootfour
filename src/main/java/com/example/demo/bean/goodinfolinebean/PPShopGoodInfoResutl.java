package com.example.demo.bean.goodinfolinebean;

import java.io.Serializable;

/***
 * 返回数据为 当前商品经过那个城市 时间 和  图片 位置信息
 */
public class PPShopGoodInfoResutl implements Serializable {
    private String PPshopGoodImage;

    public String getPPshopGoodImage() {
        return PPshopGoodImage;
    }

    public void setPPshopGoodImage(String PPshopGoodImage) {
        this.PPshopGoodImage = PPshopGoodImage;
    }

    public int getPPShopGoodInfono() {
        return PPShopGoodInfono;
    }

    public void setPPShopGoodInfono(int PPShopGoodInfono) {
        this.PPShopGoodInfono = PPShopGoodInfono;
    }

    public String getPPShopGoodInfonoData() {
        return PPShopGoodInfonoData;
    }

    public void setPPShopGoodInfonoData(String PPShopGoodInfonoData) {
        this.PPShopGoodInfonoData = PPShopGoodInfonoData;
    }

    public String getPPshopGoodInfoPhone() {
        return PPshopGoodInfoPhone;
    }

    public void setPPshopGoodInfoPhone(String PPshopGoodInfoPhone) {
        this.PPshopGoodInfoPhone = PPshopGoodInfoPhone;
    }

    public int getPPShopGoodInfostate() {
        return PPShopGoodInfostate;
    }

    public void setPPShopGoodInfostate(int PPShopGoodInfostate) {
        this.PPShopGoodInfostate = PPShopGoodInfostate;
    }

    public String getPPshopGoodUser() {
        return PPshopGoodUser;
    }

    public void setPPshopGoodUser(String PPshopGoodUser) {
        this.PPshopGoodUser = PPshopGoodUser;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public int getPPShopGoodInfonobase() {
        return PPShopGoodInfonobase;
    }

    public void setPPShopGoodInfonobase(int PPShopGoodInfonobase) {
        this.PPShopGoodInfonobase = PPShopGoodInfonobase;
    }

    public String getPPShopGoodInfonoDatabase() {
        return PPShopGoodInfonoDatabase;
    }

    public void setPPShopGoodInfonoDatabase(String PPShopGoodInfonoDatabase) {
        this.PPShopGoodInfonoDatabase = PPShopGoodInfonoDatabase;
    }

    public String getPPShopGoodInfonoLocalcity() {
        return PPShopGoodInfonoLocalcity;
    }

    public void setPPShopGoodInfonoLocalcity(String PPShopGoodInfonoLocalcity) {
        this.PPShopGoodInfonoLocalcity = PPShopGoodInfonoLocalcity;
    }

    public int getPPShopGoodInfonostate() {
        return PPShopGoodInfonostate;
    }

    public void setPPShopGoodInfonostate(int PPShopGoodInfonostate) {
        this.PPShopGoodInfonostate = PPShopGoodInfonostate;
    }

    public String getPuserPhone() {
        return PuserPhone;
    }

    public void setPuserPhone(String puserPhone) {
        PuserPhone = puserPhone;
    }


    private int PPShopGoodInfono;
    private String PPShopGoodInfonoData;
    private String PPshopGoodInfoPhone;
    private int PPShopGoodInfostate;
    private String PPshopGoodUser;
    private String userPhone;

    private int PPShopGoodInfonobase;
    private String PPShopGoodInfonoDatabase;
    private String PPShopGoodInfonoLocalcity;
    private int PPShopGoodInfonostate;

    public PPShopGoodInfoResutl() {
    }

    private String PuserPhone;

    public PPShopGoodInfoResutl(String PPshopGoodImage, int PPShopGoodInfono, String PPShopGoodInfonoData, String PPshopGoodInfoPhone, int PPShopGoodInfostate, String PPshopGoodUser, String userPhone, int PPShopGoodInfonobase, String PPShopGoodInfonoDatabase, String PPShopGoodInfonoLocalcity, int PPShopGoodInfonostate, String puserPhone) {
        this.PPshopGoodImage = PPshopGoodImage;
        this.PPShopGoodInfono = PPShopGoodInfono;
        this.PPShopGoodInfonoData = PPShopGoodInfonoData;
        this.PPshopGoodInfoPhone = PPshopGoodInfoPhone;
        this.PPShopGoodInfostate = PPShopGoodInfostate;
        this.PPshopGoodUser = PPshopGoodUser;
        this.userPhone = userPhone;
        this.PPShopGoodInfonobase = PPShopGoodInfonobase;
        this.PPShopGoodInfonoDatabase = PPShopGoodInfonoDatabase;
        this.PPShopGoodInfonoLocalcity = PPShopGoodInfonoLocalcity;
        this.PPShopGoodInfonostate = PPShopGoodInfonostate;
        PuserPhone = puserPhone;
    }
}
