package com.example.demo.service.imple;

import com.example.demo.bean.familybean.PPMenumEntity;

import com.example.demo.mapper.PpshopMenumTitleMapper;
import com.example.demo.service.PpshopMenumTitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PPShopMenumTitleServiceImpl implements PpshopMenumTitleService {

    @Autowired
    private PpshopMenumTitleMapper TitleMapper;
    /***
     * 返回顶部的菜单数据
     * @return
     */
    @Override
    public List<PPMenumEntity> getTitleMenumdata(String statetype) {
        statetype="0";
        List<PPMenumEntity>  ppshopTitlteList=new ArrayList<PPMenumEntity>();
        ppshopTitlteList.clear();
        ppshopTitlteList = TitleMapper.getTitleMenumdata(statetype);
        int resutl=ppshopTitlteList.size();
        if(resutl>0){
            return ppshopTitlteList;
        }
        return null;
    }
}
