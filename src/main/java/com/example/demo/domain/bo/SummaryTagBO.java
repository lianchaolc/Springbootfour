package com.example.demo.domain.bo;

/**
 * Created by Zhaohui on 2018/3/26.
 */
public class SummaryTagBO {
    /**
     * 券别编号
     */
    private String rmbcls;

    /**
     * 券种编号
     */
    private String rmbedition;
    /**
     * 袋数
     */
    private int bagnum;
    /**
     * 券别名称
     */
    private String moneytype;
    /**
     * 总金额
     */
    private int amount;

    public String getRmbcls() {
        return rmbcls;
    }

    public void setRmbcls(String rmbcls) {
        this.rmbcls = rmbcls;
    }

    public String getRmbedition() {
        return rmbedition;
    }

    public void setRmbedition(String rmbedition) {
        this.rmbedition = rmbedition;
    }

    public int getBagnum() {
        return bagnum;
    }

    public void setBagnum(int bagnum) {
        this.bagnum = bagnum;
    }

    public String getMoneytype() {
        return moneytype;
    }

    public void setMoneytype(String moneytype) {
        this.moneytype = moneytype;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
