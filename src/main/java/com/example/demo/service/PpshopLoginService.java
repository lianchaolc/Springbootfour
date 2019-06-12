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

    /***
     * 用户登陆的放回信息
     * @param pShopUser
     * @return
     *  //  查询用户是否存在于账户表中的记录
     */
    PShopUser login(PShopUser pShopUser);


    /***
     * 用户用于注册 的接口
     */
    boolean ReginActivon(PShopUser pShopUser);


}
