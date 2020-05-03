package com.example.demo.service;

import com.example.demo.bean.familybean.p_shopEntity;

import java.util.Map;

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
    p_shopEntity login1(p_shopEntity pShopUser);


    /***
     * 用户用于注册 的接口
     */
    boolean ReginActivon(p_shopEntity pShopUser);

    /***
     * 用户更新状态
     * @param pShopUser
     */
    boolean updatareginuser(p_shopEntity pShopUser);

    /***
     * 查询祖先信息
     * @param pShopUser
     * @return
     */
    boolean selectfamily(p_shopEntity pShopUser);

    /**
     * 用户的注册并获取token
     *
     * @param username
     * @param password
     * @return
     */
    Map<String, String> regin(String username, String password);


    public Map<String, String> register(String userName, String password);

    public String login2(String username, String password);

    public String addLoginTicket(int user_id);

    public p_shopEntity getUser(int id);


    public String getToken(p_shopEntity PShopUser);

    public p_shopEntity findByUsername(p_shopEntity PShopUser);
};
