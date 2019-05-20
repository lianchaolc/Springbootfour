package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/****
 * pp
 * 商成的用户登陆 对移动端或者是PC端 用户提交数据进行验证
 * lc
 * 20190520
 */
@RestController
public class PpUserLoginController {
@PostMapping("/login")
    public String getlogin(String username , String password){
    if(username.equals("")){
        return "用户名为空";
    }
    if(password.equals("")){
        return  "账户不能对";
    }
     String  listlogin=selectall(username,password);
    return listlogin;
}

}
