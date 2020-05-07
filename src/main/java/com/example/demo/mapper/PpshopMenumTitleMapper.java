package com.example.demo.mapper;

import com.example.demo.bean.familybean.PPMenumEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;


/***
 * 顶部菜单 页面返回《text，imagerview》
 */
@Repository
@Transactional//  事物注解
public interface PpshopMenumTitleMapper {
    /***
     * 返回查询的所有结果
     * <!--state 的状态  1是那个2是三个fargement-->
     */
 public  List<PPMenumEntity> getTitleMenumdata(String state);

}
