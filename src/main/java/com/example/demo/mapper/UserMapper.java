package com.example.demo.mapper;

import com.example.demo.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository用于标注数据访问组件，即DAO组件；
@Repository
public interface UserMapper {
    //接口用户存储
    int save(@Param("user") User user);// 新增用户

    List<User> selectall();
}