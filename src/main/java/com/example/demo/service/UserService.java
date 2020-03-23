package com.example.demo.service;

import com.example.demo.bean.User;

import java.util.List;

public interface UserService {
    // 添加用户
    boolean saveUser(User user);

    // 查询所有的数据
    List<String> selectAll();

    //删除单条数据记录
    boolean deleteuserbyname(String username);

    //      通过username进行更新数据
    boolean update(User user);

    //  通过id查询单条数据
    List<String> selectbyid(String username);
}
