package com.example.demo.mapper;

import com.example.demo.bean.PShopUser;
import com.example.demo.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PpshopLoginMapper {
    //接口用户存储
    PShopUser login(@Param("PShopUser") PShopUser PShopUser);// 新增用户
}
