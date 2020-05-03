package com.example.demo.mapper;

import com.example.demo.bean.familybean.PPMenumEntity;
import com.example.demo.bean.ppshopbean.ShopMenumbase;
import com.example.demo.bean.ppshopbean.ShopMenunData;
import org.apache.ibatis.annotations.Param;
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


    /***
     * app 顶部数据
     * @param strType   请求类型
     * @return
     */
    List<PPMenumEntity> getMenum(@Param("strType") String strType);
}
