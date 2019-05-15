package com.example.demo.service.imple;

import com.example.demo.bean.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
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
    public List<User> selectAll() {
        List<User> list = new ArrayList<User>();
        list.clear();
        ;
        list = userMapper.selectall();
        Log.info("", "" + list.size());
        System.out.print("长度！！！！！" + list.size());
        for (int i = 0; i < list.size(); i++) {

            System.out.print("!!!!!!!" + list.get(i
            ));
        }

        return list;
    }
}
