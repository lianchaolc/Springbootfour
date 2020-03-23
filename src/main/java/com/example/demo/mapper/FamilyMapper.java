package com.example.demo.mapper;

import com.example.demo.bean.ppshopbean.ppshopfamilybean;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/***
 * 获取家族的所有信息的接口
 */
@Repository
public interface FamilyMapper {
    //    通过数据人员的身份证号和用户名称可以看到家族的成员

    List<ppshopfamilybean> ppshopfamilyList(@Param("username") String username, @Param("usercarid") String usercarid);// 用户名称
}
