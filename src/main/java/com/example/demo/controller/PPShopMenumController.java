package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.bean.ppshopmenum;
import com.example.demo.domain.GeneralResult;
import com.example.demo.service.PPShopMenumService;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/***
 * 返回菜单加图片文字///
 */
@RestController
public class PPShopMenumController {
    //    @Autowired
//    private Map<Long, User> map = new ConcurrentHashMap<>();
    @Autowired
    private PPShopMenumService ppShopMenumService;

    @ApiOperation(value = "获取菜单列表")
    @RequestMapping(value = "Getmaplist", method = RequestMethod.GET)
    @ResponseBody
    @ApiImplicitParams({
//            @ApiImplicitParam(name = "phone", value = "手机号码", required = true, paramType = "query", dataType = "String"),
    })
    public GeneralResult Getmaplist() {
        GeneralResult General = new GeneralResult();
        List<Map<String, String>> list_code = new ArrayList<Map<String, String>>();
        List<Map<String, String>> list_code2 = new ArrayList<Map<String, String>>();
        list_code.clear();
        if (null != ppShopMenumService.Getmaplist()) {
            list_code = ppShopMenumService.Getmaplist();
            System.out.println("contrlo" + list_code.toString());

//            for (int i = 0; i < list_code.size(); i++) {
//                Map<String, String> str_code = new HashMap<>();
//                str_code.put("ppshopmenumnae", list_code.get(i).get("ppshopmenumnae"));
//                str_code.put("ppshopmenumimage", list_code.get(i).get("ppshopmenumimage"));
//                list_code2.add(str_code);
//                System.out.println("空的：：：：" + list_code.get(i).get("ppshopmenumimage"));
//            }
            List<ppshopmenum> list = new ArrayList<>();
            String json = JSON.toJSONString(list_code);
            System.out.println("空的json：：：：" + json);
            General.setMsg("Success");
            General.setCode(200);
            General.setData(list_code);
            return General;
        } else {
            System.out.println("空的：：：：" + list_code.toString());
            return General;
        }
    }

    /***
     * 获取菜单的分类
     * @return
     */

    @ApiOperation(value = "获取菜单分类")
    @RequestMapping(value = "getResultMenum", method = RequestMethod.GET)
    @ResponseBody
    @ApiImplicitParams({
//            @ApiImplicitParam(name = "无", value = "无", required = true, paramType = "query", dataType = "String"),
    })
    public GeneralResult getResultMenum() {
        GeneralResult General = new GeneralResult();
        List<String>  menuList=new ArrayList<String>();
//        迟永真
        Map<String,String>  map= new  HashMap<String,String>();
        List<Map<String,String>>  menuList1=new ArrayList<>();

        List<String  >  ssssliststring=new ArrayList<>();
        ssssliststring=ppShopMenumService.classification();
        System.out.println("menuList1=="+ssssliststring);
        General.setData(ssssliststring);
        return General;
    }


    /***
     * 生成token
     *
     */


}

