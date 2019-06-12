package com.example.demo.controller;

import com.example.demo.bean.PShopUser;
import com.example.demo.service.PpshopLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/****
 * pp
 * 商成的用户登陆 对移动端或者是PC端 用户提交数据进行验证
 * lc
 * 20190520
 */
// 自动加载配置信息
@EnableAutoConfiguration
@RestController
public class PpUserLoginController {

    @Autowired

//    @Resource/
    private PpshopLoginService ppshopLoginService;

    @PostMapping("/login")
    public String getlogin(String username, String userpassword) {
        System.out.print("IIIIIIIIIIIIIIIIIIIIII"+username+":::"+userpassword);
        if (username.equals("")||username==null) {
            return "用户名为空";
        }
        if (userpassword.equals("")||userpassword==null) {
            return "账户不能对";
        }
//    商城的登陆返回数据传入参数的校验判断
        System.out.println("XXXXXXX"+username+userpassword);
        PShopUser  pShopUser=new PShopUser();
        pShopUser.setUsername(username);
        pShopUser.setUserpassword(userpassword);

        System.out.println("IIIIIIIIIIIIIIIIIIIIII"+pShopUser);
        System.out.println("I"+pShopUser.getUsername());
        System.out.println("II"+pShopUser.getUserpassword());
        PShopUser listlogin = ppshopLoginService.login(pShopUser);//   返回字符串jie'guo
        return listlogin.toString();
    }

}
