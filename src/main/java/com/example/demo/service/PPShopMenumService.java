package com.example.demo.service;

import com.example.demo.bean.familybean.PPMenumEntity;
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

    /***
     * 获取菜单的顶部数据  文字和图片
     * @return
     */
    List<PPMenumEntity>  dataget(String strType);

    /**
     * 猜你喜欢
     * @return
     */
    List<PPMenumEntity>  listlike();
}
