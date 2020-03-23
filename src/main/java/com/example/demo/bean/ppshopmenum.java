package com.example.demo.bean;

import java.io.Serializable;

/**
 * 菜单的实体类
 */
public class ppshopmenum implements Serializable {

    public ppshopmenum() {
    }

    public String getPpshopmenumid() {

        return ppshopmenumid;
    }

    public void setPpshopmenumid(String ppshopmenumid) {
        this.ppshopmenumid = ppshopmenumid;
    }

    public String getPpshopmenumname() {
        return ppshopmenumname;
    }

    public void setPpshopmenumname(String ppshopmenumname) {
        this.ppshopmenumname = ppshopmenumname;
    }

    public String getPpshopmenumimage() {
        return ppshopmenumimage;
    }

    public void setPpshopmenumimage(String ppshopmenumimage) {
        this.ppshopmenumimage = ppshopmenumimage;
    }

    public String getPpshopmenumstate() {
        return ppshopmenumstate;
    }

    public void setPpshopmenumstate(String ppshopmenumstate) {
        this.ppshopmenumstate = ppshopmenumstate;
    }

    public String getPpshopmenumadd() {
        return ppshopmenumadd;
    }

    public void setPpshopmenumadd(String ppshopmenumadd) {
        this.ppshopmenumadd = ppshopmenumadd;
    }

    @Override
    public String toString() {
        return "ppshopmenum{" +
                "ppshopmenumid='" + ppshopmenumid + '\'' +
                ", ppshopmenumname='" + ppshopmenumname + '\'' +
                ", ppshopmenumimage='" + ppshopmenumimage + '\'' +
                ", ppshopmenumstate='" + ppshopmenumstate + '\'' +
                ", ppshopmenumadd='" + ppshopmenumadd + '\'' +
                '}';
    }

    private String ppshopmenumid;
    private String ppshopmenumname;
    private String ppshopmenumimage;
    private String ppshopmenumstate;
    private String ppshopmenumadd;

    public ppshopmenum(String ppshopmenumname, String ppshopmenumimage) {
        this.ppshopmenumname = ppshopmenumname;
        this.ppshopmenumimage = ppshopmenumimage;
    }
}
