package com.example.demo.global.domain.model;

public class HbOrgdwDispose {

    private String dwid;//单位编号

    private String dwname;//单位名称

    private String state;//1.已处理 2.未处理

    public String getDwid() {
        return dwid;
    }

    public void setDwid(String dwid) {
        this.dwid = dwid;
    }

    public String getDwname() {
        return dwname;
    }

    public void setDwname(String dwname) {
        this.dwname = dwname;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}