package com.example.demo.mapper;

import com.example.demo.bean.shopcarinfoentity;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/****
 * 购物车详情 mapper
 */
@Repository
public interface TableShopCarInfoMapper {
    int addtableShopCarList(shopcarinfoentity shopcarinfoentity1);

    // 查询单个id  反显数据这样

    //    @Select("SELECT * FROM shopcarinfo")
    List<shopcarinfoentity> Selectall();
//    @Select("SELECT * FROM shopcarinfo where shop_carinfiid=12")
//    TableShopCar SelectByshopcarinf3();

    int updatatablecarlist(shopcarinfoentity shopcarinfoentity);

    //  添加购物车
    int addcar(String userId, String productId, int num);

    //    删除购物车的id
    int Delete(int userId);
}
