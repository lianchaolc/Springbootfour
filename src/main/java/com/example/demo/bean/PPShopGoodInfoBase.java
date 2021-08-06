package com.example.demo.bean;

/***
 * 21.3.18
 * 实体类代码
 * 快递 到哪了和位置
 */
public class PPShopGoodInfoBase {


    public PPShopGoodInfoBase() {
    }

    @Override
    public String toString() {
        return "PPShopGoodInfoBase{" +
                "PPShopGoodInfoData='" + PPShopGoodInfoData + '\'' +
                ", PPShopGoodInfoLocalCity='" + PPShopGoodInfoLocalCity + '\'' +
                '}';
    }

    public String getPPShopGoodInfoData() {
        return PPShopGoodInfoData;
    }

    public void setPPShopGoodInfoData(String PPShopGoodInfoData) {
        this.PPShopGoodInfoData = PPShopGoodInfoData;
    }

    public String getPPShopGoodInfoLocalCity() {
        return PPShopGoodInfoLocalCity;
    }

    public void setPPShopGoodInfoLocalCity(String PPShopGoodInfoLocalCity) {
        this.PPShopGoodInfoLocalCity = PPShopGoodInfoLocalCity;
    }

    public PPShopGoodInfoBase(String PPShopGoodInfoData, String PPShopGoodInfoLocalCity) {
        this.PPShopGoodInfoData = PPShopGoodInfoData;
        this.PPShopGoodInfoLocalCity = PPShopGoodInfoLocalCity;
    }

    private String PPShopGoodInfoData;//   当前时间
    private String PPShopGoodInfono; //  唯一标识代码 与上一次代表联系
    private String PPShopGoodInfoLocalCity;//   到达的位置
}
