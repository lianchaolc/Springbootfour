package com.example.demo.controller;

import com.example.demo.bean.ppshopbean.ppshopfamilybean;
import com.example.demo.domain.GeneralResult;
import com.example.demo.service.FamilyService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个10 年约定的控制类
 * 记录家人中的族谱  对祖先的记录2地点成就  追思   和想要说的话  对子孙后代 想说的话 目标
 * 图片
 * 201911.12
 * lc
 */
@RestController
public class FamilyController {

    @Autowired
    private FamilyService familyService;
    /****
     * 通过自身的身份证号码和用户名登陆后可以查询自己的家族信息
     */
    @ApiOperation(value = "通过一个用户名查找单条数据")
    @RequestMapping(value = "/selectallbyusername", method = RequestMethod.PUT)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名称", required = true, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "Cardid", value = "用户Cardid", required = true, paramType = "query", dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })
    private GeneralResult GetAllFamilyResult(String username, String Cardid) {
        GeneralResult General = new GeneralResult();
        System.out.println("username----" + username + "--------Cardid--" + Cardid);
        List<ppshopfamilybean> ppsfbeanlist = new ArrayList<ppshopfamilybean>();
        if (null == username || username.equals("")) {
            System.out.println("用户名不能为空");
            General.setMsg("用户名不能为空");
            General.setCode(99);
            return General;
        } else {
            if (null == Cardid || Cardid.equals("")) {
                System.out.println("身份证号码不能是空");
                General.setMsg("身份证号码不能是空");
                General.setCode(99);
                return General;

            } else {
                System.out.println("----username==="+username + "-----Cardid---"+Cardid);
                ppshopfamilybean  ppshopfamily=new ppshopfamilybean();
                ppshopfamily.setCardid(Cardid);
                ppshopfamily.setName(username);

                ppsfbeanlist = familyService.Getfamilybean(ppshopfamily);

                General.setMsg("Success");
                General.setCode(00);
                General.setData(ppshopfamily);
                for (int i = 0; i < ppsfbeanlist.size(); i++) {
                    System.out.println(ppsfbeanlist.get(i) + "--------");
                }
                return General;
            }
        }
    }


    /*****
     * 分页显  和逐条返回
     */

    public    GeneralResult  selectReturnData(String paper,String papershow){
        GeneralResult  generalResult=new GeneralResult();;

        return generalResult;
    }

}