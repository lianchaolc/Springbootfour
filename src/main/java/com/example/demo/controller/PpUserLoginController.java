package com.example.demo.controller;

//import com.example.demo.bean.PShopUser;

import com.example.demo.bean.familybean.p_shopEntity;
import com.example.demo.domain.GeneralResult;
import com.example.demo.domain.Result;
import com.example.demo.domain.ResultGenerator;
import com.example.demo.service.PpshopLoginService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

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
    private Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private PpshopLoginService ppshopLoginService;

    /****
     *通过用户名   和密码 返回所有数据
     * @param username
     * @param userpassword
     * @return
     */
    @RequestMapping(value = "/pplogin", method = RequestMethod.PUT)

    public GeneralResult getlogin(String username, String userpassword) {
        GeneralResult GeneralResult = new GeneralResult();
        log.info("username!!!!!!", "" + username);
        log.info("userpassword!!!!!!", "" + userpassword);

        if (null == username || username.equals("")) {
            return GeneralResult.setMsg("用户名为空");
        }
        if (null == userpassword || userpassword.equals("")) {
            return GeneralResult.setMsg("账户不能对");
        }
//    商城的登陆返回数据传入参数的校验判断
        System.out.println("XXXXXXXusername==userpassword==" + username + userpassword);
        p_shopEntity pShopUser = new p_shopEntity();
        pShopUser.setUsername(username);
        pShopUser.setUserpassword(userpassword);
        p_shopEntity listlogin = ppshopLoginService.login1(pShopUser);//   返回字符串jie'guo
        if (null != listlogin || "null".equals(listlogin)) {
            p_shopEntity pShopUserresult = new p_shopEntity();
            pShopUserresult.setUserstate(listlogin.getUserstate());
            pShopUserresult.setUserphone(listlogin.getUserphone());
            pShopUserresult.setUsername(listlogin.getUsername());
            pShopUserresult.setUserpw(listlogin.getUserpw());
            pShopUserresult.setUserpassword(listlogin.getUserpassword());
            pShopUserresult.setCarid(listlogin.getCarid());
            System.out.println("IIIIIIIIIIIIIIIIIIIIII----" + pShopUserresult.getUsername());
            System.out.println("IIIIIIIIIIIIIIIIIIIIII-----" + pShopUserresult.getUserpassword());
            log.info("---------" + pShopUserresult.getUsername() + "!!!" + pShopUserresult.getUsername());
            GeneralResult.setCode(00);
            GeneralResult.setMsg("Success");
            GeneralResult.setData(pShopUserresult);
            return GeneralResult;

        } else {
            GeneralResult.setCode(99);
            GeneralResult.setMsg("Failed");
            GeneralResult.setData(null);
            return GeneralResult;
        }
    }

    @ResponseBody
    @ApiOperation(value = "登陆请求页面")
//    @RequestMapping(value = "/pplogin", method = RequestMethod.POST)
    @RequestMapping(value = "/pploginbyhtml", method = {RequestMethod.GET, RequestMethod.PUT})

    public GeneralResult pploginbyhtml(String username, String password) {
        GeneralResult GeneralResult = new GeneralResult();
        log.info("username!!!!!!", "" + username);
        log.info("userpassword!!!!!!", "" + password);

        if (null == username || username.equals("")) {
            return GeneralResult.setMsg("username");

        }
        if (null == password || password.equals("")) {
            return GeneralResult.setMsg("userpassword");
        }
//    商城的登陆返回数据传入参数的校验判断
        System.out.println("XXXXXXXusername==userpassword==" + username + password);
        p_shopEntity pShopUser = new p_shopEntity();
        pShopUser.setUsername(username);
        pShopUser.setUserpassword(password);
        p_shopEntity listlogin = ppshopLoginService.login1(pShopUser);//   返回字符串jie'guo
        if (null != listlogin || "null".equals(listlogin)) {
            p_shopEntity pShopUserresult = new p_shopEntity();
            pShopUserresult.setUserstate(listlogin.getUserstate());
            pShopUserresult.setUserphone(listlogin.getUserphone());
            pShopUserresult.setUsername(listlogin.getUsername());
            pShopUserresult.setUserpw(listlogin.getUserpw());
            pShopUserresult.setUserpassword(listlogin.getUserpassword());
            pShopUserresult.setCarid(listlogin.getCarid());
            System.out.println("IIIIIIIIIIIIIIIIIIIIII----" + pShopUserresult.getUsername());
            System.out.println("IIIIIIIIIIIIIIIIIIIIII-----" + pShopUserresult.getUserpassword());
            log.info("---------" + pShopUserresult.getUsername() + "!!!" + pShopUserresult.getUsername());
            GeneralResult.setCode(00);
            GeneralResult.setMsg("Success");
            GeneralResult.setData(pShopUserresult);
            return GeneralResult;

        } else {
            log.info("----99-----");
            GeneralResult.setCode(99);
            GeneralResult.setMsg("Failed");
            GeneralResult.setData("登陆失败了");
            return GeneralResult;
        }
    }


    @RequestMapping("/redirectLogin")
    public String redirectLogin() {
        System.out.println("login跳转");
        return "/pploginbyhtml";
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
        p_shopEntity pShopUser = new p_shopEntity();
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
        System.out.print("II！！！！！！！！！！！" + username + ":::" + userpassword);


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

        p_shopEntity pShopUser = new p_shopEntity();
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