package com.example.demo.bean.ppshopbean;

import java.util.List;

/**
 * 家的实体类
 */
public class ppshopfamilybean {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDATE() {
        return DATE;
    }

    public void setDATE(String DATE) {
        this.DATE = DATE;
    }

    public String getEndDATE() {
        return EndDATE;
    }

    public void setEndDATE(String endDATE) {
        EndDATE = endDATE;
    }

    @Override
    public String toString() {
        return "ppshopfamilybean{" +
                "id='" + id + '\'' +
                ", cardid='" + cardid + '\'' +
                ", name='" + name + '\'' +
                ", DATE='" + DATE + '\'' +
                ", EndDATE='" + EndDATE + '\'' +
                ", comment='" + comment + '\'' +
                ", endTime='" + endTime + '\'' +
                ", imagerurl='" + imagerurl + '\'' +
                ", new_column='" + new_column + '\'' +
                ", noid='" + noid + '\'' +
                ", state='" + state + '\'' +
                ", Time='" + Time + '\'' +
                ", rolelist=" + rolelist +
                '}';
    }

    private String id;        // id  进行排序
    private String cardid;    //  身份证号
    private String name;     //姓名
    private String DATE;    //开始时间
    private String EndDATE;//  结束时间
    private String comment;
    private String endTime;
    private String imagerurl;
    private String new_column;
    private String noid;
    private String state;
    private String  Time;

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getImagerurl() {
        return imagerurl;
    }

    public void setImagerurl(String imagerurl) {
        this.imagerurl = imagerurl;
    }

    public String getNew_column() {
        return new_column;
    }

    public void setNew_column(String new_column) {
        this.new_column = new_column;
    }

    public String getNoid() {
        return noid;
    }

    public void setNoid(String noid) {
        this.noid = noid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public List<role> getRolelist() {
        return rolelist;
    }

    public void setRolelist(List<role> rolelist) {
        this.rolelist = rolelist;
    }

    private List<role> rolelist;
}
