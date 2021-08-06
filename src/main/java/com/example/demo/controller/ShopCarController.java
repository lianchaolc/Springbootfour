package com.example.demo.controller;

import com.example.demo.bean.shopcarinfoentity;
import com.example.demo.domain.GeneralResult;
import com.example.demo.service.ShopCarInfoAddService;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/***
 * 对购物车的增删改查
 *
 *
 //private int shop_carinfiid;  //  id
 //private int shop_carinfocoutt;   // 单个商品数量
 //private double shop_carinfomoney;//  单个商品钱数
 //private String shop_carinfoname; //  商品名称
 //private String shop_carinfourl; //  商品显示图片
 */
//@EnableAutoConfiguration
@RestController
public class ShopCarController {
    private Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    public ShopCarInfoAddService ShopCarInfoAddService;

    /***
     * 新增购物车
     * @return
     * 传购物车实体类
     */
    @ApiOperation(value = "添加购物车信息")
    @RequestMapping(value = "/addShopCar", method = RequestMethod.POST)
    @ResponseBody
    @ApiImplicitParams({
//            @ApiImplicitParam(name = "shop_carinfiid", value = "id", required = true, paramType = "query", dataType = "int"),
//            @ApiImplicitParam(name = "shop_carinfocoutt", value = "数量", required = true, paramType = "query", dataType = "int"),
//            @ApiImplicitParam(name = "shop_carinfomoney", value = "钱", required = true, paramType = "query", dataType = "double"),
//            @ApiImplicitParam(name = "shop_carinfoname", value = "商品名称", required = true, paramType = "query", dataType = "String"),
//            @ApiImplicitParam(name = "shop_carinfourl", value = "图片", required = true, paramType = "query", dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })
    public GeneralResult addShopCar(shopcarinfoentity shopcarinfoentity) {
        List<shopcarinfoentity> shoplist = null;
        GeneralResult GeneralResult = new GeneralResult();


        shoplist = ShopCarInfoAddService.selectByShopId(shopcarinfoentity.getShopcarinfiid() + "");
        log.info("里面值" + shoplist);

        if (null == shoplist) {
            log.info("里面主键不重复");
            boolean
                    updataResult = ShopCarInfoAddService.add(shopcarinfoentity);
            if (null == shopcarinfoentity || shopcarinfoentity.equals("")) {
                GeneralResult.setMsg("参数不正确失败");
                GeneralResult.setCode(00);
                GeneralResult.setData("");
            } else {
                if (updataResult) {
                    GeneralResult.setMsg("成功");
                    GeneralResult.setCode(200);
                    GeneralResult.setData(updataResult);
                } else {
                    log.info("失败");
                    GeneralResult.setMsg("失败");
                    GeneralResult.setCode(00);
                    GeneralResult.setData("");
                }


            }
        } else {
            for (int i=0; i<shoplist.size(); i++){

                System.out.println(shoplist.get(i).getShopcarinfiid());
            }
            log.info("集合：：：里面主键不重复"+shopcarinfoentity.getShopcarinfiid());
                if (shoplist.contains(shopcarinfoentity.getShopcarinfiid())) {
                    GeneralResult.setMsg("主键重复");
                    GeneralResult.setCode(99);
                    GeneralResult.setData("");
                    return GeneralResult;
                } else {
                    log.info("集合：：：插入数据");
                    boolean
                            updataResult = ShopCarInfoAddService.add(shopcarinfoentity);
                    if (null == shopcarinfoentity || shopcarinfoentity.equals("")) {
                        GeneralResult.setMsg("参数不正确失败");
                        GeneralResult.setCode(00);
                        GeneralResult.setData("");
                    } else {
                        if (updataResult) {
                            GeneralResult.setMsg("成功");
                            GeneralResult.setCode(200);
                            GeneralResult.setData(updataResult);
                        } else {
                            log.info("失败");
                            GeneralResult.setMsg("失败");
                            GeneralResult.setCode(00);
                            GeneralResult.setData("");
                        }
                    }

                }
            }


        return GeneralResult;
    }


    /***
     * 通过单个用户id进行查询  先查寻 再 进行插入数据
     */
    @ApiOperation(value = "查询某一个单个id")
    @RequestMapping(value = "/selectbyshopid", method = RequestMethod.GET)
    @ResponseBody
    @ApiImplicitParams({
            @ApiImplicitParam(name = "shop_carinfiid", value = "shop_carinfiid", required = true, paramType = "query", dataType = "int"),

    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })
    public GeneralResult selectyByShopid(String shop_carinfiid) {
        GeneralResult GeneralResult = new GeneralResult();

        if (null == shop_carinfiid || shop_carinfiid.equals("")) {
            GeneralResult.setMsg("参数不正确失败");
            GeneralResult.setCode(00);
            GeneralResult.setData("");
        } else {
            List<shopcarinfoentity> shoplist = new ArrayList<>();
            shoplist = ShopCarInfoAddService.selectByShopId(shop_carinfiid);

            if (shoplist != null && shoplist.size() > 0) {
                GeneralResult.setMsg("成功");
                GeneralResult.setCode(200);
                GeneralResult.setData(shoplist);
            } else {
                log.info("失败");
                GeneralResult.setMsg("失败");
                GeneralResult.setCode(00);
                GeneralResult.setData("");
            }


        }

        return GeneralResult;
    }


    /***
     * 更新内容
     * @return
     */
    @ApiOperation(value = "通过id进行更新")
    @RequestMapping(value = "/SelectByidUpdata", method = RequestMethod.POST)
    @ResponseBody
    @ApiImplicitParams({
            @ApiImplicitParam(name = "shop_carinfocoutt", value = "数量", required = true, paramType = "query", dataType = "int"),
            @ApiImplicitParam(name = "shop_carinfomoney", value = "钱", required = true, paramType = "query", dataType = "double"),
            @ApiImplicitParam(name = "shop_carinfoname", value = "商品名称", required = true, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "shop_carinfourl", value = "图片", required = true, paramType = "query", dataType = "String")

    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })
    public GeneralResult SelectByidUpdata(shopcarinfoentity shopcarinfoentity) {
        GeneralResult GeneralResult = new GeneralResult();

        if (null == shopcarinfoentity || shopcarinfoentity.equals("")) {
            GeneralResult.setMsg("参数不正确失败");
            GeneralResult.setCode(00);
            GeneralResult.setData("");
        } else {
            List<shopcarinfoentity> shoplist = new ArrayList<>();
            boolean shoplist1 = ShopCarInfoAddService.updatashopinfo(shopcarinfoentity);
            if (shoplist1) {
                GeneralResult.setMsg("成功");
                GeneralResult.setCode(200);
                GeneralResult.setData(shoplist1);
            } else {
                log.info("失败");
                GeneralResult.setMsg("失败");
                GeneralResult.setCode(00);
                GeneralResult.setData("插入失败");
            }


        }

        return GeneralResult;
    }


    /***
     * 删除购登陆人员购物车商品
     *
     * String
     * List<String>
     */

    @ApiOperation(value = "删除购物车")
    @RequestMapping(value = "/DeleteShopInfobyUserid", method = RequestMethod.POST)
    @ResponseBody
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userid", value = "用户id", required = true, paramType = "query", dataType = "int"),
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })
    public GeneralResult DeleteShopInfobyUserid(String userid) {
        GeneralResult GeneralResult = new GeneralResult();

        if (null == userid || userid.equals("")) {
            GeneralResult.setMsg("操作人不能为空");
            GeneralResult.setCode(00);
            GeneralResult.setData("");


        } else {
            boolean shoplist1 = ShopCarInfoAddService.DeleteShopInfo(userid);
            if (shoplist1) {
                GeneralResult.setMsg("成功");
                GeneralResult.setCode(200);
                GeneralResult.setData(shoplist1);
            } else {
                log.info("失败");
                GeneralResult.setMsg("失败");
                GeneralResult.setCode(00);
                GeneralResult.setData("插入失败");
            }


        }

        return GeneralResult;
    }
}
