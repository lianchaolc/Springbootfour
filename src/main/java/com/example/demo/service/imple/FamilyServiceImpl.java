package com.example.demo.service.imple;

import com.example.demo.bean.ppshopbean.ppshopfamilybean;
import com.example.demo.mapper.FamilyMapper;
import com.example.demo.service.FamilyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.List;

public class FamilyServiceImpl implements FamilyService {

    @Autowired
    private FamilyMapper familyMapper;


    /****
     * 通过用户名和身份证号获取数据
     * @param usernaem
     * @param userCarid
     * @return
     */
    @Override
    public List<ppshopfamilybean> selectAll(String usernaem, String userCarid) {
        if(null!=usernaem){
            return null;
        }else{
            List<ppshopfamilybean> ppshopfamilylist = familyMapper.ppshopfamilyList(usernaem, userCarid);
            if (null != ppshopfamilylist) {
                System.out.println("长度：：：：：："+ppshopfamilylist.size());
                return ppshopfamilylist;
            }
        }

        return null;
    }
    /***
     * 添加图片和和说明
     */

    /***
     * redes 应用
     */

    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Test
    public void test()  {

        // 保存字符串
        stringRedisTemplate.opsForValue().set("aaa", "111");

    }

}
