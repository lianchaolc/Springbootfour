package com.example.demo.service.imple;

import com.example.demo.bean.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import com.google.gson.Gson;
import org.mortbay.log.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    /**
     *
     */
    @Autowired
    private UserMapper userMapper;


    /***
     * 存储用
     * @param user
     * @return
     */
    @Override
    @Transactional//  事物注解
    public boolean saveUser(User user) {
        boolean result = userMapper.save(user) > 0;
        return result;
    }

    @Override
    public boolean adduserbyid(int userid) {
        return false;
    }

    @Override
    @Transactional//  事物注解
    public List<String> selectAll() {
        List<User> list = new ArrayList<User>();
        List<String> strlist =new ArrayList<String>();
        list.clear();
     list=userMapper.selectall();
       Gson gso=new Gson();
        strlist.add( gso.toJson(list));
     for (int i=0 ;i<strlist.size();i++ ){
         System.out.println("长度！！！！！" + strlist.size());
         System.out.println("长度！！！！！" + strlist.get(i));
     }

        Log.info("", "" + list.size());
        System.out.println("长度！！！！！" + list.size());


        return strlist;
    }



    /***
     * 通过人员姓名进行删除
     * @param username
     * @return
     */
    @Override
    public boolean deleteuserbyname(String username) {
        boolean result = userMapper.deleteuserbyname(username) > 0;
        return result;
    }
}
