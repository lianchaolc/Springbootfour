package com.example.demo.mapper;

import com.example.demo.bean.PShopUser;
import com.example.demo.bean.User;
import com.example.demo.domain.bo.CommonBO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PpshopLoginMapper {
    //接口用户存储

    PShopUser login(@Param("PShopUser") PShopUser PShopUser);// 新增用户

    /***
     * 判断返回的结果是false 还是true
     * @param PShopUser
     * @return
     */
    boolean reginaction(@Param("PShopUser") PShopUser PShopUser);

    /**
     * 更新用户
     *
     * @param PShopUser
     * @return
     */
    boolean updatareginuser(@Param("PShopUser") PShopUser PShopUser);
}
