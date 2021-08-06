package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.service.TestGoodService;
import io.swagger.annotations.*;

import org.springframework.web.bind.annotation.*;
@RestController
public class TestGoodController {
    private TestGoodService userService;

    @ApiOperation(value = "添加用户信息")
    @RequestMapping(value = "/addUser1", method = RequestMethod.POST)
    @ResponseBody
    @ApiImplicitParams({
            @ApiImplicitParam(name = "usertype", value = "用户类型", required = true, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "usertest", value = "手机测试", required = true, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "usertel", value = "手机号码", required = true, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "username", value = "用户名称", required = true, paramType = "query", dataType = "String"),
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })
    public boolean addUser1(User user) {
        boolean result = userService.select("1");
        return result;
    }

}
