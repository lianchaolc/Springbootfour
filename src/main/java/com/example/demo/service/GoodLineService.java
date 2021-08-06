package com.example.demo.service;

import com.example.demo.bean.User;
import com.example.demo.global.domain.bo.PageBO;
import com.example.demo.userlistquery.UserListQuery;

import java.util.List;

public interface GoodLineService {

    // 添加用户
    boolean saveUser(User user);

    // 查询所有的数据
    List<User> selectAll();

    //删除单条数据记录
    boolean deleteuserbyname(String username);

    //      通过username进行更新数据
    boolean update(User user);

    //  通过id查询单条数据
    List<User> selectbyid(String username);

    //进行分页查询   传递页数  和当前页显示的条数
//    List<User> selectType(String pager,String papgershowtoto);
    PageBO<User> selectType(UserListQuery userListQuery);
}
