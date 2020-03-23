package com.example.demo.bean.familybean;

import java.io.Serializable;

/***
 * 家的实体类
 * lianc
 * 201912.7
 */
public class familybean  implements Serializable{
    public String getNoid() {
        return noid;
    }

    public familybean(String new_column) {
        this.new_column = new_column;
    }

    @Override
    public String toString() {
        return "familybean{" +
                "noid='" + noid + '\'' +
                ", cardid='" + cardid + '\'' +
                ", name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", comment='" + comment + '\'' +
                ", time='" + time + '\'' +
                ", imagerurl='" + imagerurl + '\'' +
                ", endTime='" + endTime + '\'' +
                ", new_column='" + new_column + '\'' +
                '}';
    }

    public familybean(String noid, String cardid, String name, String state, String comment, String time, String imagerurl, String endTime, String new_column) {
        this.noid = noid;
        this.cardid = cardid;
        this.name = name;
        this.state = state;
        this.comment = comment;
        this.time = time;
        this.imagerurl = imagerurl;
        this.endTime = endTime;
        this.new_column = new_column;
    }

    public void setNoid(String noid) {
        this.noid = noid;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getImagerurl() {
        return imagerurl;
    }

    public void setImagerurl(String imagerurl) {
        this.imagerurl = imagerurl;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getNew_column() {
        return new_column;
    }

    public void setNew_column(String new_column) {
        this.new_column = new_column;
    }

    private  String  noid;
private  String  cardid;
private  String name;
private  String state;
private  String comment;
private  String time;
private  String imagerurl;
private  String endTime;
private  String new_column;



}
