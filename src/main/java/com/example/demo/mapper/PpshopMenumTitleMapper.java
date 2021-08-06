package com.example.demo.mapper;


import com.example.demo.bean.familybean.PPMenumEntity;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/***
 * 顶部菜单 页面返回《text，imagerview》
 */
@Repository
public interface PpshopMenumTitleMapper {
    /***
     * 返回查询的所有结果
     * <!--state 的状态  1是那个2是三个fargement-->
     *     =#{name}
     */
    @Select("SELECT pp_menum_textimage,pp_menum_texttitle  FROM ppshop_menum_title where pp_menum_state =#{type}")
    List<PPMenumEntity> getTitleMenumdata(String type);

}
