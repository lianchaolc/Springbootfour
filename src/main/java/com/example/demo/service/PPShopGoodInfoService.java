package com.example.demo.service;

import com.example.demo.bean.PPShopGoodInfo;
import com.example.demo.bean.goodinfolinebean.PPShopGoodInfoResutl;

import java.util.List;
public interface PPShopGoodInfoService {
    //查询 快递到了那里
    public  List<PPShopGoodInfoResutl> select(String userphone);
}
