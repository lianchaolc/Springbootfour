package com.example.demo.service;

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
}
