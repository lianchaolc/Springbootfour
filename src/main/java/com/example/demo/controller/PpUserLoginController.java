package com.example.demo.controller;

import com.example.demo.bean.PShopUser;
import com.example.demo.domain.Result;
import com.example.demo.domain.ResultGenerator;
import com.example.demo.domain.bo.CommonBO;
import com.example.demo.service.PpshopLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.*;
import sun.plugin2.message.Message;
import sun.plugin2.message.Serializer;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

/****
 * pp
 * 商成的用户登陆 对移动端或者是PC端 用户提交数据进行验证
 * lc
 * 20190520
 * https://www.cnblogs.com/dqh94/p/7404100.html
 * https://www.cnblogs.com/dqh94/p/7404100.html
 * https://www.cnblogs.com/lcngu/p/5470695.html
 * https://www.jianshu.com/p/558844c96fc1
 * http://www.java1234.com/a/javaziliao/shuji/2013/1104/1011.html
 * https://www.jb51.net/article/87679.htm
 * https://www.cnblogs.com/lixiaochao/p/6164665.html
 * https://www.jb51.net/article/87679.htm
 */

// 自动加载配置信息

@EnableAutoConfiguration
@RestController
public class PpUserLoginController {

    @Autowired

//    @Resource/
    private PpshopLoginService ppshopLoginService;

    @ResponseBody
    @PostMapping("/login")
    public String getlogin(String username, String userpassword) {
        System.out.print("IIIIIIIIIIIIIIIIIIIIII" + username + ":::" + userpassword);
        if (username.equals("") || username == null) {
            return "用户名为空";
        }
        if (userpassword.equals("") || userpassword == null) {
            return "账户不能对";
        }
//    商城的登陆返回数据传入参数的校验判断
        System.out.println("XXXXXXX" + username + userpassword);
        PShopUser pShopUser = new PShopUser();
        pShopUser.setUsername(username);
        pShopUser.setUserpassword(userpassword);

        System.out.println("IIIIIIIIIIIIIIIIIIIIII" + pShopUser);
        System.out.println("I" + pShopUser.getUsername());
        System.out.println("II" + pShopUser.getUserpassword());
        PShopUser listlogin = ppshopLoginService.login(pShopUser);//   返回字符串jie'guo
        return listlogin.toString();
    }


    /***
     *
     *   注册方法
     */
    @PostMapping("/reginaction")
    public Boolean reginAction(String username, String userpassword, String userstate, String userpw, String userphoen) {
        boolean flag = false;

        if (username.isEmpty()) {
            return flag;
        }
        if (userpassword.isEmpty()) {

            return flag;
        }
        System.out.println("reginaction" + username + ":" + userpassword + ":" + userstate);
        PShopUser pShopUser = new PShopUser();
        pShopUser.setUserpassword(userpassword);
        pShopUser.setUsername(username);
        pShopUser.setUserphone(userphoen);
        pShopUser.setUserstate(userstate);
        pShopUser.setUserpw(userpw);
        System.out.println("对象：" + pShopUser.getUserphone() + pShopUser.getUserpw() + pShopUser.getUserstate());
        boolean userregin = ppshopLoginService.ReginActivon(pShopUser);//   返回字符串jie'guo
        if (userregin) {
            flag = true;
        }
        return flag;

    }

    /**
     * 更新用户（更新方法）
     */
    @PostMapping("/updatareginuser")
    public Result updatareginuser(String username, String userpassword,
                                  String userpw, String userphoen, String userstate) {
        System.out.print("II" + username + ":::" + userpassword + userpw + userphoen + userstate);

        if (username.equals("") || username == null) {
            return ResultGenerator.genFailResult("账户名不能为null");
        }
        if (userpassword.equals("") || userpassword == null) {
            return ResultGenerator.genFailResult("账户名不能为null");
        }
        if (userphoen.equals("") || userphoen == null) {
            return ResultGenerator.genFailResult("账户名不能为null");
        }
        if (userstate.equals("") || userstate == null) {
            return ResultGenerator.genFailResult("账户名不能为null");
        }

        PShopUser pShopUser = new PShopUser();
        pShopUser.setUserpw(userpw);
        pShopUser.setUsername(username);
        pShopUser.setUserphone(userphoen);
        pShopUser.setUserstate(userstate)
        ;
        System.out.println("对象：" + pShopUser.getUserphone() + pShopUser.getUserpw() + pShopUser.getUserstate());
//        CommonBO commonBO = ppshopLoginService.updatareginuser(pShopUser);
//
//        if () {
//            return true;
//        }else{
//            return false;
//        }

//    }
        return null;
    }
}