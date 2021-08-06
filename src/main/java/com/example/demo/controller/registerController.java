package com.example.demo.controller;

import com.example.demo.bean.Reginentity;
import com.example.demo.service.PpshopLoginService;
import com.example.demo.service.RedisService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/***
 * 注册功能生成token
 * lianc
 * 19.12.13
 */


@Controller
public class registerController {
    private static final Logger log = LoggerFactory.getLogger(registerController.class);
    private Logger log1 = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private RedisService mRedisService;

//    }

    //       /image/文字/image//image/文字
//    1/2/3/4

    /***
     * 判断是否注册成功
     * @return
     */

    @ApiOperation(value = "取出")
    @RequestMapping(value = "Userresgeiner", method = RequestMethod.POST)
    @ResponseBody
    @ApiImplicitParams({
//            @ApiImplicitParam(name = "phone", value = "手机号码", required = true, paramType = "query", dataType = "String"),
    })
//    @PostMapping("/Userresgeiner")
    public boolean Userresgeiner() {
        boolean result = false;// 默认注册不成功
        Reginentity pShopUser = new Reginentity();
//        pShopUser.setCarid("211321199202141516");
//        pShopUser.setUserpassword("aaaa");
        Object strresult = mRedisService.get("9fab12ee-fd43-4e72-a82c-ed0cd7ee6e15");
        log.info("strresult=====" + strresult);

        if (strresult==null||strresult.equals("")) {
            return false;
        } else {
            return true;
        }


    }

    @ApiOperation(value = "家注册获取token")
    @RequestMapping(value = "MyReginer", method = RequestMethod.POST)
    @ResponseBody
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "号码", required = true, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, paramType = "query", dataType = "String"),
    })
    public boolean MyReginer(String username, String password) {
        log.info(username);
        log.info("password=====" + password);
        log1.info("username=====" + username);
        System.out.println(username);
        System.out.println(password);
        if (username.isEmpty() || password.isEmpty()) {
            return false;
        } else {
            String token = UUID.randomUUID().toString();
            System.out.println("token=====" + token);
            mRedisService.set(token, username);
            return true;
        }
    }
}
