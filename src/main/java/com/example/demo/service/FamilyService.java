package com.example.demo.service;

import com.example.demo.bean.ppshopbean.ppshopfamilybean;

import java.util.List;

public interface FamilyService {
    //  查询所用的用户名称
    List<ppshopfamilybean> selectAll(String usernaem,String userCarid);
}
