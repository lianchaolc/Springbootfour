package com.example.demo.service;

import com.example.demo.bean.User;

import java.util.List;

public interface UserService {
    // 添加用户

    boolean saveUser(User user);
    boolean adduserbyid(int userid);
    List<String> selectAll();
}
