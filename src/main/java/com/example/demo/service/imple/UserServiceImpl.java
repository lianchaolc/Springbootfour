package com.example.demo.service.imple;

import com.example.demo.bean.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    /**
     *
     */
    @Autowired
    private  UserMapper userMapper;


    /***
     * 存储用
     * @param user
     * @return
     */
    @Override
    @Transactional//  事物注解
    public boolean saveUser(User user) {
        boolean result= userMapper.save(user)>0;
        return result;
    }

    @Override
    public boolean adduserbyid(int userid) {
        return false;
    }

    @Override
    @Transactional//  事物注解
    public List<String> selectAll() {
        List<String> list=userMapper.selectall();
        return list;
    }
}
