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
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })

    public String dosomething() {
        return "你做了什么";
    }
}