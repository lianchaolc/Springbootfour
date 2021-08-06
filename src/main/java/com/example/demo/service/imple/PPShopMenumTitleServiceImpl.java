package com.example.demo.service.imple;

import com.example.demo.bean.familybean.PPMenumEntity;

import com.example.demo.mapper.PpshopMenumTitleMapper;
import com.example.demo.service.PpshopMenumTitleService;
import org.mortbay.log.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 如果找不到mapper就让mapper 的sql语句写在外面     @select  *from 的方法
 */
@Service
public class PPShopMenumTitleServiceImpl implements PpshopMenumTitleService {

    @Autowired
    private PpshopMenumTitleMapper pMenumTitleMapper;

    /***
     * 返回顶部的菜单数据
     * @return
     */
    @Override
    public List<PPMenumEntity> getTitleMenumdata(String type) {
        List<PPMenumEntity> ppshopTitlteList = new ArrayList<PPMenumEntity>();
        ppshopTitlteList.clear();
        Log.info("PPShopMenumTitleServiceImpl=", type);
        Log.info("PPShopMenumTitleServiceImpl============", pMenumTitleMapper);
        ppshopTitlteList = pMenumTitleMapper.getTitleMenumdata(type);
        for (int i = 0; i < ppshopTitlteList.size(); i++) {
            Log.info(ppshopTitlteList.get(i).getPp_menum_state());
        }
        int resutl = ppshopTitlteList.size();
        if (resutl > 0) {
            return ppshopTitlteList;
        }
        return null;
    }
}
