package com.example.demo.service.imple;

import com.auth0.jwt.JWT;
import com.example.demo.bean.familybean.p_shopEntity;
import com.example.demo.service.PpshopLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.mapper.PpshopLoginMapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/***
 * Response{protocol=http/1.1, code=404, message=, url=http://192.168.1.167:8988/loginaction?username=1&userpassword=1}
 */

@Service
public class PpShopLoginServiceImpl implements PpshopLoginService {
    @Autowired
    private PpshopLoginMapper PpshopLoginMapper;

    /***
     * 该方法栈溢出因为循环调用了
     * @param p_shopEntity
     * @return
     */
    @Override
    @Transactional//  事物注解
    public p_shopEntity login1(p_shopEntity p_shopEntity) {
        System.out.println(p_shopEntity.getUsername() + "::::::" + p_shopEntity.getUserpassword());

        if (null == p_shopEntity) {
            System.out.println("null");
            return null;
        } else {
            p_shopEntity listps1 = PpshopLoginMapper.login(p_shopEntity);
            if (null == listps1 || listps1.equals("")) {
                return null;
            } else {
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!" + listps1);
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!" + listps1.getUserstate() + listps1.getUserphone());
                String token = UUID.randomUUID().toString();
                return listps1;
            }


        }

    }


    /***
     * 用户用于登陆的信息
     * @param pShopUser
     * @return
     */
    @Override
    public boolean ReginActivon(p_shopEntity pShopUser) {

        Boolean result = PpshopLoginMapper.reginaction(pShopUser);
        return result;
    }

    /***
     * 用于用户更新状态的方法 （用户重新输入密码）
     * @param pShopUser
     * @return
     */
    @Override
    public boolean updatareginuser(p_shopEntity pShopUser) {
        boolean result = PpshopLoginMapper.updatareginuser(pShopUser);
        return result;
    }

    /***
     * 根据自己的信息显示家族信息
     * @param pShopUser
     * @return
     */
    @Override
    public boolean selectfamily(p_shopEntity pShopUser) {
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
    public String login2(String username, String password) {
        return null;
    }

    @Override
    public String addLoginTicket(int user_id) {


        return null;
    }

    @Override
    public p_shopEntity getUser(int id) {
        return null;
    }

    @Override
    public String getToken(p_shopEntity PShopUser) {
        String token = "";
        token = JWT.create().withAudience(PShopUser.getUsername())// 将 user id 保存到 token 里面
                .sign(com.auth0.jwt.algorithms.Algorithm.HMAC256(PShopUser.getUserstate()));// 以 password 作为 token 的密钥


        return token;

    }

    @Override
    public p_shopEntity findByUsername(p_shopEntity PShopUser) {
        return PpshopLoginMapper.findByUsername(PShopUser.getUsername());
    }


    public String login(String username, String password) {
        if (Objects.equals("dalaoyang", username) &&
                Objects.equals("123", password)) {
            String token = UUID.randomUUID().toString();
//            PpshopLoginMapper.reginaction(null);
            return "用户：" + username + "登录成功，token是：" + token;
        } else {
            return "用户名或密码错误，登录失败！";
        }
    }
}
