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
    public PPShopGoodInfoMapper ppShopGoodInfoMapper;

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
        List<PPShopGoodInfoResutl> PPShopGoodInfoResutllist = new ArrayList<PPShopGoodInfoResutl>();

//        不传d递参数查询所有
        if (null == userphone || userphone.equals("")) {
            System.out.print("" + userphone);
            PPShopGoodInfoResutllist = ppShopGoodInfoMapper.selegoodinfobaseall();
        } else {


            PPShopGoodInfoResutllist = ppShopGoodInfoMapper.selegoodinfobase(userphone);
            System.out.print("数据打印长度::::" + PPShopGoodInfoResutllist.size());
        }
        return PPShopGoodInfoResutllist;
    }
    /***
     * 页面上需要的删除 通过id
     */
    @Override
    public List<PPShopGoodInfoResutl> deletebyno(String PuserPhone) {
        List<PPShopGoodInfoResutl> PPShopGoodInfoResutllist = new ArrayList<PPShopGoodInfoResutl>();
        System.out.print("传过来为：=" + PuserPhone);
        if (null == PuserPhone || PuserPhone.equals("")) {
            System.out.print("传过来为空：=" + PuserPhone);
        } else {
            boolean   result= ppShopGoodInfoMapper.deletebyno(PuserPhone);
            if (result){
                System.out.print("传过来为：=" +"删除成功" +result);
                PPShopGoodInfoResutllist = ppShopGoodInfoMapper.selegoodinfobaseall();
                return  PPShopGoodInfoResutllist;
            }else{
                System.out.print("传过来为：=" +"删除失败" );
                System.out.print("数据打印长度::::" + PPShopGoodInfoResutllist.size());
                return null;
            }

        }

        return PPShopGoodInfoResutllist;
    }








}
