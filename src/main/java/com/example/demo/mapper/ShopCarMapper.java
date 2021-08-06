package com.example.demo.mapper;

import com.example.demo.bean.ShopCarbean.TableShopCar;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


/***\
 *用户的购物物车
 */
@Repository
public interface ShopCarMapper {
    //    增加数据
//    @Insert("into shopcarinfo(shop_carinfiid, shop_carinfocoutt, shop_carinfomoney,shop_carinfoname,shop_carinfourl)\n" +
//            "    VALUES (\n" +
//            "  '2',\n" +
//            "          '2',\n" +
//            "          '2',\n" +
//            "          '2',\n" +
//            "          '2'\n" +
//            "    )")
//    @Select("SELECT pp_menum_textimage,pp_menum_texttitle  FROM ppshop_menum_title where pp_menum_state =#{type}")
}