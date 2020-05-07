package com.example.demo.mapper;

import com.example.demo.bean.ppshopbean.ppshopfamilybean;
import com.example.demo.query.PatrolplaceListQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import  com.example.demo.global.domain.query.PageQuery;

import java.util.List;

/***
 * 获取家族的所有信息的接口
 */
@Repository
@Transactional//  事物注解
public interface FamilyMapper {
    //    通过数据人员的身份证号和用户名称可以看到家族的成员
    List<ppshopfamilybean> Getfamilybean(String name,String carid);// 用户名称


    List<ppshopfamilybean>  page(PatrolplaceListQuery patrolplaceListQuery);
}
