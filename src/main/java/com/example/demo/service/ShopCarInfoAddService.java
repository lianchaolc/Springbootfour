package com.example.demo.service;

import com.example.demo.bean.shopcarinfoentity;
import com.example.demo.dao.CartDto;

import java.util.List;

/***
 *
 * 添加购物车明细接口服务
 */
public interface ShopCarInfoAddService {

    boolean add(shopcarinfoentity shopcarinfoentity);

    /**
     * 查询id
     */
    List<shopcarinfoentity> selectByShopId(String shopcarinfoid);

    /**
     * 通过id 进行更新
     */
    boolean updatashopinfo(shopcarinfoentity shopcarinfoentity);



    public boolean DeleteShopInfo(String Userid);
}
