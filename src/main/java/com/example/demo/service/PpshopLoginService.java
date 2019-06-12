package com.example.demo.service;

import com.example.demo.bean.PShopUser;

/****
 *
 *
 *
 * 萍萍商城的登陆服务类接口
 *
 */
public interface PpshopLoginService {

    PShopUser login(PShopUser pShopUser);  //  查询用户是否存在于账户表中的记录
}
