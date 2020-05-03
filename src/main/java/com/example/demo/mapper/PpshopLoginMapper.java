package com.example.demo.mapper;

import com.example.demo.bean.familybean.p_shopEntity;
import com.example.demo.bean.ppshopbean.ppshopfamilybean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PpshopLoginMapper {
    //接口用户存储

    p_shopEntity login(@Param("PShopUser") p_shopEntity PShopUser);// 新增用户

    /***
     * 判断返回的结果是false 还是true
     * @param PShopUser
     * @return
     */
    boolean reginaction(@Param("PShopUser") p_shopEntity PShopUser);

    /**
     * 更新用户
     *
     * @param PShopUser
     * @return
     */
    boolean updatareginuser(@Param("PShopUser") p_shopEntity PShopUser);

    /***
     * 返回查询的所有结果
     */

    List<ppshopfamilybean> resultlist(@Param("usernumber")String  usernumberCarid,@Param("carid") String carid );

    //  创建token所需
    p_shopEntity findByUsername(@Param("username") String username);
    p_shopEntity findUserById(@Param("Id") String Id);
}
