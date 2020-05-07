package com.example.demo.service;

import com.example.demo.bean.familybean.PPMenumEntity;

import java.util.List;
import java.util.Map;

public interface PpshopMenumTitleService {
    /***
     *  查询  页面信息
     */
//    返菜单

    List<PPMenumEntity> getTitleMenumdata(String statetype);
}
