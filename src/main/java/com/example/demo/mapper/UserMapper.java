package com.example.demo.mapper;

import com.example.demo.bean.User;
import com.example.demo.query.PatrolplaceListQuery;
import com.example.demo.userlistquery.UserListQuery;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository用于标注数据访问组件，即DAO组件；
@Repository
public interface UserMapper {
    //接口用户存储
    int save(@Param("user") User user);// 新增用户
    List<User> selectall();//  查询所有
    int  deleteuserbyname(@Param("username") String username);// 用户名称
//    spring boot  修改数据
//    @Update("update user set username=#{username} where username=#{username}")
    int update(@Param("user")User user);
//    @Select("select * from user where id = #{id}")
//    boolean  findById(@Param("id") String id);
      List<User> selectbyid(@Param("username") String username);

    /***
     *
     * @param userListQuery
     * @return
     * 分页查询
     */
      List<User> selectType(UserListQuery userListQuery);
}