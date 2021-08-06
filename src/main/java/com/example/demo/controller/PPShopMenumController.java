package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.bean.familybean.PPMenumEntity;
import com.example.demo.bean.ppshopmenum;
import com.example.demo.domain.GeneralResult;
import com.example.demo.domain.Result;
import com.example.demo.domain.bo.CommonBO;
import com.example.demo.mapper.PpshopMenumTitleMapper;
import com.example.demo.service.PPShopMenumService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/***
 * 返回菜单加图片文字///
 * 加入代码Autwred 自动执行当前的方法
 */
@RestController
public class PPShopMenumController {

    @Autowired
    private PPShopMenumService ppShopMenumService;


    @ApiOperation(value = "获取菜单列表")
    @RequestMapping(value = "Getmaplist", method = RequestMethod.GET)
    @ResponseBody
    @ApiImplicitParams({
    })
    public GeneralResult Getmaplist() {
        GeneralResult General = new GeneralResult();
        List<Map<String, String>> list_code = new ArrayList<Map<String, String>>();
        list_code.clear();
        list_code = ppShopMenumService.Getmaplist();
        if (null == list_code || list_code.equals("")) {
            System.out.println("空的：：：：" + list_code.toString());
            General.setMsg("请求失败");
            General.setCode(99);
            return General;
        } else {
            System.out.println("contrlo" + list_code.toString());
            String json = JSON.toJSONString(list_code);
            System.out.println("空的json：：：：" + json);
            General.setMsg("Success");
            General.setCode(200);
            General.setData(list_code);
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
        List<String> menuList = new ArrayList<String>();
//        迟永真
        List<Map<String, String>> menuList1 = new ArrayList<>();
        List<String> ssssliststring = new ArrayList<>();
        ssssliststring = ppShopMenumService.classification();
        System.out.println("menuList1==" + ssssliststring);
        General.setData(ssssliststring);
        return General;
    }


    /***
     * 生成token
     *
     */


    /****
     * 获取菜单的顶部信息
     * @return
     */

    @ApiOperation(value = "获取顶部菜单数据")
    @RequestMapping(value = "getResultMenum2", method = RequestMethod.GET)
    @ResponseBody
    @ApiImplicitParams({
            @ApiImplicitParam(name = "strType", value = "需要请求的类型type=0,网络安全，type=1，商品类", required = true, paramType = "query", dataType = "String"),
    })
    public GeneralResult getResultMenum2(String strType) {
        GeneralResult General = new GeneralResult();
        List<PPMenumEntity> PPMenumliststring = new ArrayList<PPMenumEntity>();
        PPMenumliststring = ppShopMenumService.dataget(strType);
        System.out.println("menuList1=========" + PPMenumliststring);
        if (PPMenumliststring == null || PPMenumliststring.equals("")) {
            General.setCode(99);
            General.setMsg("无数据");
            return General;
        } else {
            General.setData(PPMenumliststring);
            General.setCode(00);
            General.setMsg("Success");
        }
        return General;
    }

    /***
     *20200826
     * 实现猜你喜欢的代码
     *
     */
    @ApiOperation(value = "猜你喜欢")
    @RequestMapping(value = "GetLoginLike", method = RequestMethod.GET)
    @ResponseBody
    @ApiImplicitParams({

    })
    public GeneralResult GetLoginLike() {
        GeneralResult General = new GeneralResult();
        List<PPMenumEntity> PPMenumliststring = new ArrayList<PPMenumEntity>();
        PPMenumliststring = ppShopMenumService.listlike();
        if (PPMenumliststring == null || PPMenumliststring.equals("")) {
            General.setCode(99);
            General.setMsg("无数据");
            return General;
        } else {
            General.setData(PPMenumliststring);
            General.setCode(00);
            General.setMsg("Success");
        }
        return General;
    }


}

