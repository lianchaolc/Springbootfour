package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.mapper.UserMapper;

import com.example.demo.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController
public class UserController {
    @Autowired
    static Map<Long , User> map = new ConcurrentHashMap<>();
    private UserService userService;

    @PostMapping("/addUser")
    public boolean addUser(User user) {
        boolean result = userService.saveUser(user);
        return result;
    }


    /***
     * 通过id进行修改
     * @param userid
     * @return
     */
//    public  boolean   addUserbyid(int userid){
//  boolean result=userService.adduserbyid(userid);
////        return result;
//    }

    /***
     * 查询所有
     */
    @ApiOperation(value = "获取用户列表")
//    @RequestMapping(value = "",method = RequestMethod.GET)
    @RequestMapping("selectall")
    @ResponseBody
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "手机号码", required = true, paramType = "query", dataType = "String"),

            @ApiImplicitParam(name = "nickName", value = "用户昵称", required = true, paramType = "query", dataType = "String")

    })
//    原文：https://blog.csdn.net/oceanyang520/article/details/83120411
    @PostMapping("/selectall")
    public List<String> selectAll() {
        List<String> list = userService.selectAll();
        return list;
    }

    /***
     * 输入单条姓名进行删除单挑数据
     */

    @PostMapping("/deletebyid")
    public   Boolean deletebyusername(String  username){

        System.out.println("usernaeme==="+username);
       boolean
               result = userService.deleteuserbyname(username);
        return result;
    }




}
