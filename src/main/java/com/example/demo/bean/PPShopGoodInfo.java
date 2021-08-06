package com.example.demo.bean;

/***
 * 2021.3.18   快递到哪了
 * 显示    谁的快递   快递编号  电话   日期  当前位置  公司
 */
public class PPShopGoodInfo {


    public String getPPShopGoodInfono() {
        return PPShopGoodInfono;
    }

    public void setPPShopGoodInfono(String PPShopGoodInfono) {
        this.PPShopGoodInfono = PPShopGoodInfono;
    }

    public String getPPShopGoodInfoState() {
        return PPShopGoodInfoState;
    }

    public void setPPShopGoodInfoState(String PPShopGoodInfoState) {
        this.PPShopGoodInfoState = PPShopGoodInfoState;
    }
    public String getPPShopGoodInfoUser() {
        return PPShopGoodInfoUser;
    }

    public void setPPShopGoodInfoUser(String PPShopGoodInfoUser) {
        this.PPShopGoodInfoUser = PPShopGoodInfoUser;
    }

    public String getImage() {
        return PPshopGoodImage;
    }

    public void setImage(String PPshopGoodImage) {
        PPshopGoodImage = PPshopGoodImage;
    }

    public PPShopGoodInfo() {
    }

    private String PPShopGoodInfono;
    private String PPShopGoodInfoState;//  状态 已发/  路上代收/  1,2.3
    //    private PPShopGoodInfoBase PPShopGoodInfoLoacalcity; //  当前位置
//    private String PPShopGoodInfoData;//   当前时间
    private String PPShopGoodInfoUser;//  所属人

    public String getPPshopGoodImage() {
        return PPshopGoodImage;
    }

    public void setPPshopGoodImage(String PPshopGoodImage) {
        this.PPshopGoodImage = PPshopGoodImage;
    }

    private String PPshopGoodImage;//

    public String getPPShopGoodInfoPhone() {
        return PPShopGoodInfoPhone;
    }

    public void setPPShopGoodInfoPhone(String PPShopGoodInfoPhone) {
        this.PPShopGoodInfoPhone = PPShopGoodInfoPhone;
    }

    private  String  PPShopGoodInfoPhone;

    public PPShopGoodInfo(String PPShopGoodInfono, String PPShopGoodInfoState, PPShopGoodInfoBase PPShopGoodInfoLoacalcity, String PPShopGoodInfoData, String PPShopGoodInfoUser, String PPshopGoodImage) {
        this.PPShopGoodInfono = PPShopGoodInfono;
        this.PPShopGoodInfoState = PPShopGoodInfoState;
//        this.PPShopGoodInfoLoacalcity = PPShopGoodInfoLoacalcity;
//        this.PPShopGoodInfoData = PPShopGoodInfoData;
        this.PPShopGoodInfoUser = PPShopGoodInfoUser;
        PPshopGoodImage = PPshopGoodImage;
    }
}
