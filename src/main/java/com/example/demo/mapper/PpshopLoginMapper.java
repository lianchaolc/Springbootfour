package com.example.demo.mapper;

import com.example.demo.bean.PShopUser;
import com.example.demo.bean.User;
import com.example.demo.bean.ppshopbean.ppshopfamilybean;
import com.example.demo.domain.bo.CommonBO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    /***
     * 返回查询的所有结果
     */

    List<ppshopfamilybean> resultlist(@Param("usernumber")String  usernumberCarid,@Param("carid") String carid );

    //  创建token所需
    PShopUser findByUsername(@Param("username") String username);
    PShopUser findUserById(@Param("Id") String Id);
}
