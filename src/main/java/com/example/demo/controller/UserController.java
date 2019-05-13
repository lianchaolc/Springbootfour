package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.mapper.UserMapper;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public boolean addUser(User user){
        boolean  result=userService.saveUser(user);
        return  result;
    }


    /***
     * 通过id进行修改
     * @param userid
     * @return
     */
//    public  boolean   addUserbyid(int userid){
//  boolean result=userService.adduserbyid(userid);
//        return result;
//    }
    /***
     * 查询所有
     */
    @PostMapping("/selectall")
    public List<String>  selectAll(){
       List<String> list=userService.selectAll();
        return list;
    }
}
