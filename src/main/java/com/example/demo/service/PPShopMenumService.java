package com.example.demo.service;

import com.example.demo.bean.ppshopbean.Lay;

import java.util.List;
import java.util.Map;

public interface PPShopMenumService {
    /***
     * h获取菜单列表
     * @return
     */
    List<Map<String,String>> Getmaplist();

    /***
     *  获取菜单的分类
     */
    List<String> classification();

    /***
     * 实现分页
     */

//    Lay getSysDepts(SysDept SysDept, Integer page, Integer limit);
}
