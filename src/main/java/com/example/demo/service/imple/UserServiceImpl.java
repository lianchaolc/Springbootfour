package com.example.demo.service.imple;

import com.example.demo.bean.User;
import com.example.demo.bean.ppshopbean.ppshopfamilybean;
import com.example.demo.global.domain.bo.PageBO;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import com.example.demo.userlistquery.UserListQuery;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import org.mortbay.log.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
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
        System.out.println(user.getUsername());
        System.out.println(user.getUsertel());
        System.out.println(user.getUsertest());
        System.out.println(user.getUsertype());

        boolean result = userMapper.save(user) > 0;
        return result;
    }


    @Override
    @Transactional//  事物注解
    public List<User> selectAll() {
        List<User> list = new ArrayList<User>();
        List<String> strlist = new ArrayList<String>();
        list.clear();
        list = userMapper.selectall();
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println("长度！！！！！" + list.get(i));
//            strlist.add(list.get(i));
//        }
//        Gson gso = new Gson();
//        strlist.add(gso.toJson(list));
//        for (int i = 0; i < strlist.size(); i++) {
//            System.out.println("长度！！！！！" + strlist.size());
//            System.out.println("长度！！！！！" + strlist.get(i));
//        }
        Log.info("", "" + list.size());
        System.out.println("长度！！！！！" + list.size());
        return list;
    }


    /***
     * 通过人员姓名进行删除
     * @param username
     * @return
     */
    @Override
    @Transactional//  事物注解
    public boolean deleteuserbyname(String username) {
        boolean result = userMapper.deleteuserbyname(username) > 0;
        return result;
    }

    /**
     * 通过id进行 单条更新
     *
     * @param user
     * @return
     */


    @Override
    public boolean update(User user) {
        if (null != user.getUsername()) {
            System.out.println("updataResult======impl" + user.getUsername());
            System.out.println("getUsertype=====impl" + user.getUsertype());
            System.out.println("getUsertest======impl" + user.getUsertest());
            System.out.println("getUsertel======impl" + user.getUsertel());
            boolean result = userMapper.update(user) > 0;
            return result;
        }
        return false;
    }


    /***
     * t通过用户的id查询单条记录
     * @param username
     * @return
     */
    @Transactional//  事物注解
    @Override
    public List<User> selectbyid(String username) {
        List<User> list = new ArrayList<User>();
        List<String> strlist = new ArrayList<String>();
        list = userMapper.selectbyid(username);
//        Gson gso = new Gson();
        if(list.size()!=0){
            for (int  i=0; i<list.size() ; i++){
                User  user=new User();
                strlist.add(list.get(i).getUsername());
                strlist.add(list.get(i).getUsertel());
                strlist.add(list.get(i).getUsertest());
                strlist.add(list.get(i).getUsertype());
            }
        }
        return list;
    }

    @Override
    public PageBO<User> selectType(UserListQuery userListQuery) {
        List<User> selectTypelist = new ArrayList<>();
        if (userListQuery.getPage() != null && userListQuery.getLimit() != null) {
            PageHelper.startPage(userListQuery.getPage(), userListQuery.getLimit(), true, false, true);
        }
        List<User> ppshopfamilylist = userMapper.selectType(userListQuery);
        PageInfo page = new PageInfo<>(ppshopfamilylist);
        boolean flag = ppshopfamilylist.size() > 0;
        PageBO<User> pageBO = new PageBO<>();
        pageBO.setFlag(flag);
        if (flag) {
            pageBO.setCount(page.getTotal());
            pageBO.setData(ppshopfamilylist);
            return pageBO;
        }


        return null;
    }

//    @Override
//    public List<User> selectType(String pager, String papgershowtoto) {
//
//        List<User>  selectTypelist=new ArrayList<>();
//        selectTypelist=userMapper.selectType(pager,papgershowtoto);
//        if(selectTypelist==null){
//         return null;
//         }else{
//            return  selectTypelist;
//        }
//    }


}
