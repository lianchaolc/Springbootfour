package com.example.demo.service.imple;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.bean.ppshopbean.Lay;
import com.example.demo.bean.ppshopbean.ShopMenumbase;
import com.example.demo.bean.ppshopbean.ShopMenunData;
import com.example.demo.mapper.PpshopMenumMapper;
import com.example.demo.service.PPShopMenumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PPShopMenumServiceImpl implements PPShopMenumService {
    @Autowired
    private PpshopMenumMapper ppshopMenumMapper;

    @Override
    public List<Map<String, String>> Getmaplist() {
        Map<String, String> map = new HashMap<>();
        List<Map<String, String>> listmap = new ArrayList<Map<String, String>>();
        List<Map<String, String>> listmap1 = new ArrayList<Map<String, String>>();
        listmap = ppshopMenumMapper.resultlist();
        map.put("", "");
        map.put("", "");
        listmap1.add(map);
        System.out.println("我是空的结果" + listmap.toString());
        System.out.println(listmap.size() + "长度：：：：：");
        if (listmap.size() > 0) {
            System.out.println("我是" + listmap.size());
            System.out.println("我是" + listmap.toString());
            return listmap;
        } else {
            System.out.println("我是空的");
            return null;
        }
    }

    /***
     * 一次性获取所有的数据
     * https://tool.oschina.net/codeformat/json
     * @return
     */
    @Override
    public List<String> classification() {
        List<String> resultdata01 = new ArrayList<>();
        Map<String, String> selectdata = new HashMap<>();
        List<Map<String, String>> resultdata = new ArrayList<Map<String, String>>();
        List<Map<String, String>> resultoutdata = new ArrayList<Map<String, String>>();
        System.out.println("resultdata" + resultdata);
        List<ShopMenunData> listdata = new ArrayList<>();
        List<ShopMenumbase> listmenubase = new ArrayList<ShopMenumbase>();
        listdata = ppshopMenumMapper.resultclasslist();
        listmenubase = ppshopMenumMapper.ShopMenumbase();
        System.out.println("listdata===============" + listdata.size());
        System.out.println("listmenubase===============" + listmenubase.size());
        JSONObject jsonobject2 = new JSONObject();
        JSONArray jsonArray1 = new JSONArray();
        JSONArray jsonArray3 = new JSONArray();
        for (int l = 0; l < listdata.size(); l++) {
            for (int i = 0; i < listmenubase.size(); i++) {
                System.out.println("listmenubase===============" + listmenubase.get(i).getId());
                JSONObject jsonobject1 = new JSONObject();
                jsonobject1.put("id", listmenubase.get(i).getId());
                jsonobject1.put("desc", listmenubase.get(i).getDesc());
                jsonobject1.put("type", listmenubase.get(i).getType());
                jsonobject1.put("title", listmenubase.get(i).getTitle());
                jsonobject1.put("imagURL", listmenubase.get(i).getImgURL());
                jsonArray1.add(jsonobject1);
            }
            jsonobject2.put("datalist", jsonArray1);
            jsonobject2.put("type", listdata.get(l).getType());
            jsonobject2.put("moreIcon", listdata.get(l).getMoreIcon());
            jsonobject2.put("moduleTitle", listdata.get(l).getModuleTitle());
            jsonobject2.put("moreLinkType", listdata.get(l).getMoreLinkType());

        }
        resultdata01.add(jsonobject2.toString());
        System.out.println("resultoutdata" + resultoutdata);
        return resultdata01;
    }

//    @Override
//    public Lay getSysDepts(SysDept SysDept, Integer page, Integer limit) {
//        return null;
//    }

    /***
     * 创建分页类
     */


}
