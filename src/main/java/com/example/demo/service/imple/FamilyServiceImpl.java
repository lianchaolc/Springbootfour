package com.example.demo.service.imple;

import com.example.demo.bean.ppshopbean.ppshopfamilybean;
import com.example.demo.mapper.FamilyMapper;
import com.example.demo.service.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamilyServiceImpl implements FamilyService {

    @Autowired
    private FamilyMapper familyMapper;
    /****
     * 通过用户名和身份证号获取数据
     * @param familybean
     * @return
     */
//    @Override
//    public List<ppshopfamilybean> selectAll(familybean familybean) {
//        if (null != familybean.getName()) {
//            return null;
//
//        } else if (null != familybean.getCardid()) {
//            return null;
//        } else {
//            System.out.println("长度：：：：：：" + familybean.getCardid() + "=====" + familybean.getName());
//            List<ppshopfamilybean> ppshopfamilylist = familyMapper.ppshopfamilyList(familybean);
//            if (null != ppshopfamilylist) {
//                System.out.println("长度：：：：：：" + ppshopfamilylist.size());
//                return ppshopfamilylist;
//            }
//        }
//        return null;
//    }
    /***
     * 添加图片和和说明
     */

    /***
     * redes 应用
     */

    /*@Autowired
    StringRedisTemplate stringRedisTemplate;

    @Test
    public void test() {

        // 保存字符串
        stringRedisTemplate.opsForValue().set("aaa", "111");

    }*/

//    @Override
//    public List<ppshopfamilybean> SelectAll(familybean familybean) {
//        if (null != familybean.getName()) {
//            return null;
//
//        } else if (null != familybean.getCardid()) {
//            return null;
//        } else {
//            System.out.println("长度：：：：：：" + familybean.getCardid() + "=====" + familybean.getName());
//            List<ppshopfamilybean> ppshopfamilylist = familyMapper.Getfamilybean();
//            if (null != ppshopfamilylist) {
//                System.out.println("长度：：：：：：" + ppshopfamilylist.size());
//                return ppshopfamilylist;
//            }
//        }
//        return null;
//    }

//    @Override
//    public List<ppshopfamilybean> Getfamilybean() {
//        List<ppshopfamilybean> ppshopfamilylist = familyMapper.Getfamilybean();
//        if (null != ppshopfamilylist) {
//            System.out.println("长度：：：：：：" + ppshopfamilylist.size());
//            return ppshopfamilylist;
//        }
//        return null;
//    }

    @Override
    public List<ppshopfamilybean> Getfamilybean(ppshopfamilybean ppshopfamilybean) {
        System.out.println("：：：：：：" + ppshopfamilybean.getName()+"::::"+ppshopfamilybean.getCardid());
        List<ppshopfamilybean> ppshopfamilylist = familyMapper.Getfamilybean
                (ppshopfamilybean.getCardid(),ppshopfamilybean.getName());
        if (null != ppshopfamilylist) {
            System.out.println("返回长度：：：：：：" + ppshopfamilylist.size());
            return ppshopfamilylist;
        }
        return null;
    }
}

