package com.example.demo.mapper;

import com.example.demo.bean.ppshopbean.ShopMenumbase;
import com.example.demo.bean.ppshopbean.ShopMenunData;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface PpshopMenumMapper {
    /***
     * 返回查询的所有结果
     */
    List<Map<String, String>> resultlist();

    /***
     查询菜单的分类
     */
    List<ShopMenunData>  resultclasslist();

    List<ShopMenumbase>   ShopMenumbase();
}
