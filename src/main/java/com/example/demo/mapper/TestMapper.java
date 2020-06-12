package com.example.demo.mapper;

import com.example.demo.bean.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/****
 * 目的记录最合理的mapper写法
 */

public interface TestMapper {
    /*******查询所有用户数据********/
    @Select("select * from user")
    public List<User> selectUserByAll();

    /*******根据id查询符合用户********/
    @Select("select * from user where id = #{id}")
    public User selectUserById(int id);

    /*******根据name查询符合用户********/
    @Select("select * from user where name=#{name}")
    public List<User> selectUserByName(String name);

    /*******添加新用户********/
    @Insert("insert into user(name,age,phone) values (#{name},#{age},#{phone})")
    public int addUser(User user);

    /*******修改已有用户信息********/
    @Update("update user set name=#{name},age=#{age},phone=#{phone} where id=#{id}")
    public int updateUser(User user);

    /*******根据id删除用户********/
    @Delete("delete from user where id=#{id}")
    public int deleteUser(int id);

//————————————————
//    版权声明：本文为CSDN博主「一只想飞的鱼_」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//    原文链接：https://blog.csdn.net/qq_29370483/java/article/details/79043972
}
