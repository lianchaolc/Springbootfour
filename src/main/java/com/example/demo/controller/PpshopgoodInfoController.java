package com.example.demo.controller;

import com.example.demo.bean.PPShopGoodInfo;
import com.example.demo.bean.goodinfolinebean.PPShopGoodInfoResutl;
import com.example.demo.domain.GeneralResult;
import com.example.demo.service.PPShopGoodInfoService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 2021.3.18  快递到哪了 后台数据代码
 * 同一个Controller中，所有的方法 要么全是以public 开头 ，要么全部以private开头 否则就会产生错误。。。

 不知道什么原因。。。

 今天就遇到了这个问题 

 在当前的Controller中所有的方法全是以public 开头  只有这个是以private开头 访问自动注入的属性时一直报空指针异常

 private改成public后正常了
 ————————————————
 版权声明：本文为CSDN博主「liuxiaochang_2011」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 原文链接：https://blog.csdn.net/liuxiaochang_2011/article/details/80680878
 */
@RestController
public class PpshopgoodInfoController {
    @Autowired
    public PPShopGoodInfoService servicegoodinfo;

    @ApiOperation(value = "通过电话好查询数据")
    @RequestMapping(value = "/selectLIneInfo", method = {RequestMethod.GET, RequestMethod.PUT})
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userphone", value = "电话", required = true, paramType = "query", dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })

    public GeneralResult selectLIneInfo(String userphone) {
        com.example.demo.domain.GeneralResult GeneralResult = new com.example.demo.domain.GeneralResult();
        servicegoodinfo.select(userphone);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!===userphone"+userphone);
        List<PPShopGoodInfoResutl> select = servicegoodinfo.select(userphone);

        if(select!=null)    {
            GeneralResult.setCode(00);
            GeneralResult.setMsg("成功");
            GeneralResult.setData(select);
            return GeneralResult;
        }else{
            GeneralResult.setCode(99);
            GeneralResult.setMsg("失败");
            GeneralResult.setData(null);
            System.out.println("获取数据是空");
            return GeneralResult;
        }

    }


    /****
     * 删除索引
     */


    @ApiOperation(value = "通过电话号码删除数据")
    @RequestMapping(value = "/Deletebyuserphone", method = {RequestMethod.GET, RequestMethod.PUT})
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userphone", value = "电话", required = true, paramType = "query", dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })

    public GeneralResult Deletebyuserphone(String userphone) {
        com.example.demo.domain.GeneralResult GeneralResult = new com.example.demo.domain.GeneralResult();
        servicegoodinfo.select(userphone);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!===userphone"+userphone);
        List<PPShopGoodInfoResutl> select = servicegoodinfo.deletebyno(userphone);

        if(select!=null)    {
            GeneralResult.setCode(00);
            GeneralResult.setMsg("成功");
            GeneralResult.setData(select);
            return GeneralResult;
        }else{
            GeneralResult.setCode(99);
            GeneralResult.setMsg("失败");
            GeneralResult.setData(null);
            System.out.println("获取数据是空");
            return GeneralResult;
        }

    }

}
