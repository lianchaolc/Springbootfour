package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.service.TestGoodService;
import io.swagger.annotations.*;

import org.springframework.web.bind.annotation.*;

/***
 * 仅仅测试使用
 */
@RestController
public class TestGoodController {
    private TestGoodService userService;

    @ApiOperation(value = "添加用户信息没有数据库的查询处理无用")
    @RequestMapping(value = "/addUser1", method = RequestMethod.POST)
    @ResponseBody
    @ApiImplicitParams({
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })
    public boolean addUser1(User user) {
        if(null==user.getUsertel()||user.getUsertel().equals("")){
            System.out.println("我是null");

        }else {
//            boolean result = userService.select(user.getUsertel());
//            return result;
        }

        return false;
    }

}
