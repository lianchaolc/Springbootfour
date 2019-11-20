package com.example.demo.bean;

import java.io.Serializable;

/*创建一个商城的bean 类里面字段不一样
 */
public class PShopUser implements Serializable {

    @Override
    public String toString() {
        return "PShopUser{" +
                "username='" + username + '\'' +
                ", userpassword='" + userpassword + '\'' +
                ", userpw='" + userpw + '\'' +
                ", userphone='" + userphone + '\'' +
                ", userstate='" + userstate + '\'' +
                ", carid='" + carid + '\'' +
                '}';
    }

    private String username;
    private String userpassword;
    private String userpw; //密码
    private String userphone;
    private String userstate;
    private String  carid;
    public String getCarid() {
        return carid;
    }

    public void setCarid(String carid) {
        this.carid = carid;
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getUserpw() {
        return userpw;
    }

    public void setUserpw(String userpw) {
        this.userpw = userpw;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    public String getUserstate() {
        return userstate;
    }

    public void setUserstate(String userstate) {
        this.userstate = userstate;
    }
}
