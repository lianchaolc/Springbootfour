package com.example.demo.service.imple;

import com.example.demo.bean.ppshopbean.ppshopfamilybean;
import com.example.demo.global.domain.bo.PageBO;
import com.example.demo.mapper.FamilyMapper;
import com.example.demo.query.PatrolplaceListQuery;
import com.example.demo.service.FamilyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.global.domain.query.PageQuery.*;

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
        List<ppshopfamilybean> ppshopfamilylist =
                familyMapper.Getfamilybean
                (ppshopfamilybean.getCardid(),ppshopfamilybean.getName());
        if (null != ppshopfamilylist) {
            for (int j=0; j<ppshopfamilylist.size(); j++){
                System.out.println("返回长度：：：：：：" + ppshopfamilylist.get(j));
                System.out.println("返回长度：：：：：：" + ppshopfamilylist.get(j).getEndDATE());
                System.out.println("返回长度：：：：：：" + ppshopfamilylist.get(j).getImagerurl());

            }

            return ppshopfamilylist;
        }
        return null;
    }

    /***
     *  分页查询
     * @param
     * @param
     * @return
     *
     * 传递  页数和当前m每页显示条数     */


    @Override
    public PageBO<ppshopfamilybean> page(PatrolplaceListQuery patrolplaceListQuery) {
        if (patrolplaceListQuery.getPage() != null && patrolplaceListQuery.getLimit() != null) {
            PageHelper.startPage(patrolplaceListQuery.getPage(), patrolplaceListQuery.getLimit(),true,false,true);
        }
        List<ppshopfamilybean> ppshopfamilylist =
                familyMapper.page
                        (patrolplaceListQuery);
        PageInfo page = new PageInfo<>(ppshopfamilylist);
        boolean flag = ppshopfamilylist.size() > 0;
        PageBO<ppshopfamilybean> pageBO = new PageBO<>();
        pageBO.setFlag(flag);
        if (flag) {
            pageBO.setCount(page.getTotal());
            pageBO.setData(ppshopfamilylist);
            return pageBO;
        }
        pageBO.setMsg("暂无数据");
        return null;
    }
}

