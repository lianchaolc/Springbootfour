package com.example.demo.service.imple;

import com.example.demo.bean.PPShopGoodInfo;
import com.example.demo.bean.PPShopGoodInfoBase;
import com.example.demo.bean.goodinfolinebean.PPShopGoodInfoResutl;
import com.example.demo.mapper.PPShopGoodInfoMapper;
import com.example.demo.service.PPShopGoodInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PPShopGoodInfoimpl implements PPShopGoodInfoService {
    @Autowired
    public  PPShopGoodInfoMapper ppShopGoodInfoMapper;

//    @Override
//    public PPShopGoodInfo selegoodinfowhere(String Userphone) {
//        PPShopGoodInfo   PPShopGoodInfo = ppShopGoodInfoMapper.selegoodinfowh(Userphone);
//        System.out.print("" + PPShopGoodInfo);
//        return PPShopGoodInfo;
//    }

//    @Override
//    public PPShopGoodInfo selegoodinfowh(String Userphone) {
//        return null;
//    }

    /***
     * 查询两张表整合带啊吗
     * @param userphone
     * @return
     */
    @Override
    public List<PPShopGoodInfoResutl> select(String userphone) {
        List<PPShopGoodInfo>   infolist=new ArrayList<PPShopGoodInfo>();
        List<PPShopGoodInfoBase>   infolistbase=new ArrayList<PPShopGoodInfoBase>();
        List<PPShopGoodInfoResutl>  PPShopGoodInfoResutllist=new ArrayList<PPShopGoodInfoResutl>();
//        infolist = ppShopGoodInfoMapper.selegoodinfowh(userphone);

//        System.out.print("数据打印:" + infolist.size());

//        infolistbase=    ppShopGoodInfoMapper.selegoodinfobase(userphone) ;
        PPShopGoodInfoResutllist=   ppShopGoodInfoMapper.selegoodinfobase(userphone) ;
        System.out.print("数据打印长度::::" +PPShopGoodInfoResutllist.size());

        return PPShopGoodInfoResutllist;
    }
}
