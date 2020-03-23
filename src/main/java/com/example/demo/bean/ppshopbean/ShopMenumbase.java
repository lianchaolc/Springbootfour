package com.example.demo.bean.ppshopbean;

import java.io.Serializable;

public class ShopMenumbase implements Serializable{
    private String id;


    private String desc;


    private String type;


    private String title;


    private String imgURL;


    private String linkType;


    private String linkParam;


    private String online_time;


    private String offline_time;


    public void setId(String id){

        this.id = id;

    }

    public String getId(){

        return this.id;

    }

    public void setDesc(String desc){

        this.desc = desc;

    }

    public String getDesc(){

        return this.desc;

    }

    public void setType(String type){

        this.type = type;

    }

    public String getType(){

        return this.type;

    }

    public void setTitle(String title){

        this.title = title;

    }

    public String getTitle(){

        return this.title;

    }

    public void setImgURL(String imgURL){

        this.imgURL = imgURL;

    }

    public String getImgURL(){

        return this.imgURL;

    }

    public void setLinkType(String linkType){

        this.linkType = linkType;

    }

    public String getLinkType(){

        return this.linkType;

    }

    public void setLinkParam(String linkParam){

        this.linkParam = linkParam;

    }

    public String getLinkParam(){

        return this.linkParam;

    }

    public void setOnline_time(String online_time){

        this.online_time = online_time;

    }

    public String getOnline_time(){

        return this.online_time;

    }

    public void setOffline_time(String offline_time){

        this.offline_time = offline_time;

    }

    public String getOffline_time(){

        return this.offline_time;

    }
}
