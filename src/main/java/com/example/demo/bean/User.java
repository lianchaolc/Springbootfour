package com.example.demo.bean;

import java.io.Serializable;

/****
 * 用户实体类
 */
public class User implements Serializable {
    private String usertype;
    private String usertest;
    private String usertel;
    private String username;

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getUsertest() {
        return usertest;
    }

    public void setUsertest(String usertest) {
        this.usertest = usertest;
    }

    public String getUsertel() {
        return usertel;
    }

    public void setUsertel(String usertel) {
        this.usertel = usertel;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    @Override
    public String toString() {
        return "User{" +
                "usertype='" + usertype + '\'' +
                ", usertest='" + usertest + '\'' +
                ", usertel='" + usertel + '\'' +
                ", username='" + username + '\'' +
                '}';
    }









}
//<!--
//<select id="selectroleByUserid">
//        select * from role where userid=#{userid}
//</select>
//        -->
//<!--<resultMap id="userMap" type="com.example.demo.bean.User">-->
//<!--<id property="userid" column="userid"></id>-->
//<!--<collection property="rolelist" column="userid" select="selectroleByUserid">-->
//<!--</collection>-->
//<!--</resultMap>-->
//
//<!--<select id="selectallTwo" parameterType="java.lang.String" resultMap="userMap">-->
//<!--SELECT * FROM user-->
//<!--</select>-->