package com.example.demo.service;

import com.example.demo.bean.User;

import java.util.List;

public interface UserService {
    // 添加用户

    boolean saveUser(User user);
    //  通过id进行添加用户
    boolean adduserbyid(int userid);

    /***
     * 查询所有的数据
     * @return
     */
    List<String> selectAll();

    //删除单条数据记录
    boolean  deleteuserbyname(String username);
}
