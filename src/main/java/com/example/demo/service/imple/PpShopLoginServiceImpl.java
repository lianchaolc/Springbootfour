package com.example.demo.service.imple;

import com.auth0.jwt.JWT;
import com.example.demo.bean.PShopUser;
import com.example.demo.domain.bo.CommonBO;
import com.example.demo.service.PpshopLoginService;
import com.sun.org.apache.xml.internal.security.algorithms.Algorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.mapper.PpshopLoginMapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import com.auth0.jwt.JWT;



@Service
public class PpShopLoginServiceImpl implements PpshopLoginService {
    @Autowired
    private PpshopLoginMapper PpshopLoginMapper;
    /***
     * 该方法栈溢出因为循环调用了
     * @param pShopUser
     * @return
     */
    @Override
    @Transactional//  事物注解
    public PShopUser login(PShopUser pShopUser) {
        System.out.println(pShopUser.getUsername() + "::::::" + pShopUser.getUserpassword());
        PShopUser listps1 = PpshopLoginMapper.login(pShopUser);
//        if (null != listps1 && "null".equals(listps1)) {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!" + listps1);
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!" + listps1.getUserstate() + listps1.getUserphone());
        String token = UUID.randomUUID().toString();
            return listps1;
//        } else {
//            return null;
//        }
    }

    /***
     * 用户用于登陆的信息
     * @param pShopUser
     * @return
     */
    @Override
    public boolean ReginActivon(PShopUser pShopUser) {

        Boolean result = PpshopLoginMapper.reginaction(pShopUser);
        return result;
    }

    /***
     * 用于用户更新状态的方法 （用户重新输入密码）
     * @param pShopUser
     * @return
     */
    @Override
    public boolean updatareginuser(PShopUser pShopUser) {
        boolean result = PpshopLoginMapper.updatareginuser(pShopUser);
        return result;
    }

    /***
     * 根据自己的信息显示家族信息
     * @param pShopUser
     * @return
     */
    @Override
    public boolean selectfamily(PShopUser pShopUser) {
        return false;
    }

    @Override
    public Map<String, String> regin(String username, String password) {
        return null;
    }

    @Override
    public Map<String, String> register(String userName, String password) {
        return null;
    }

    @Override
    public Map<String, Object> login(String username, String password) {
        return null;
    }

    @Override
    public String addLoginTicket(int user_id) {


        return null;
    }

    @Override
    public PShopUser getUser(int id) {
        return null;
    }

    @Override
    public String getToken(PShopUser PShopUser) {
        String token="";
        token= JWT.create().withAudience(PShopUser.getUsername())// 将 user id 保存到 token 里面
                .sign(com.auth0.jwt.algorithms.Algorithm.HMAC256(PShopUser.getUserstate()));// 以 password 作为 token 的密钥
        return token;

    }

    @Override
    public PShopUser findByUsername(PShopUser PShopUser) {
        return PpshopLoginMapper.findByUsername(PShopUser.getUsername());
    }



//    public String login(String username, String password) {
//        if (Objects.equals("dalaoyang", username) &&
//                Objects.equals("123", password)) {
//            String token = UUID.randomUUID().toString();
//            redisService.set(token, username);
//            return "用户：" + username + "登录成功，token是：" + token;
//        } else {
//            return "用户名或密码错误，登录失败！";
//        }
//    }
}
