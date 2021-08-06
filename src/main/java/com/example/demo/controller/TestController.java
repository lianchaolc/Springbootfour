package com.example.demo.controller;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {
    @ApiOperation(value = "没有操作代码")
    @GetMapping({"/", ""})
    @ResponseBody
    @ApiImplicitParams({
//            @ApiImplicitParam(name = "usertype", value = "用户类型", required = true, paramType = "query", dataType = "String"),
//            @ApiImplicitParam(name = "usertest", value = "手机测试", required = true, paramType = "query", dataType = "String"),
//            @ApiImplicitParam(name = "usertel", value = "手机号码", required = true, paramType = "query", dataType = "String"),
//            @ApiImplicitParam(name = "username", value = "用户名称", required = true, paramType = "query", dataType = "String"),
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })

    public String dosomething() {
        return "你做了什么";
    }
}