package com.example.demo.service;

import com.example.demo.bean.PShopUser;
import com.example.demo.domain.Result;
import com.example.demo.domain.bo.CommonBO;
import org.springframework.beans.factory.annotation.Autowired;

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
    PShopUser login(PShopUser pShopUser);


    /***
     * 用户用于注册 的接口
     */
    boolean ReginActivon(PShopUser pShopUser);

    /***
     * 用户更新状态
     * @param pShopUser
     */
    boolean updatareginuser(PShopUser pShopUser);

    /***
     * 查询祖先信息
     * @param pShopUser
     * @return
     */
    boolean selectfamily(PShopUser pShopUser);

    /**
     * 用户的注册并获取token
     * @param username
     * @param password
     * @return
     */
    Map<String, String> regin (String username, String password);


    public Map<String,String > register(String userName,String password);
    public Map<String,Object> login(String username, String password);
    public String addLoginTicket(int user_id);
    public PShopUser getUser(int id);




    public String getToken(PShopUser PShopUser)  ;
    public PShopUser findByUsername(PShopUser PShopUser);
};
