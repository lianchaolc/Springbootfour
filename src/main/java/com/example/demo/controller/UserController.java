package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.bean.ppshopbean.ppshopfamilybean;
import com.example.demo.domain.GeneralResult;
import com.example.demo.domain.PageResult;
import com.example.demo.domain.Result;
import com.example.demo.global.domain.bo.PageBO;
import com.example.demo.mapper.UserMapper;

import com.example.demo.service.UserService;
import com.example.demo.userlistquery.UserListQuery;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController
public class UserController {
    @Autowired
    static Map<Long, User> map = new ConcurrentHashMap<>();
    @Autowired
    private UserService userService;

    @ApiOperation(value = "添加用户信息")
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
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
    public boolean addUser(User user) {
        boolean result = userService.saveUser(user);
        return result;
    }

    @ApiOperation(value = "更新单条的记录")
    @RequestMapping(value = "/updatauser", method = RequestMethod.PUT)
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
    /***
     * 更新单条的记录
     * @param user
     * @return
     */
    public String UpdataUser(User user) {
        GeneralResult GeneralResult = new GeneralResult();
        if (null == user.getUsername()) {
            return "要更新的条目名称不能为空";
        }
        System.out.println("updataResult======" + user.getUsername());
        System.out.println("getUsertype======" + user.getUsertype());
        System.out.println("getUsertest======" + user.getUsertest());
        System.out.println("getUsertel======" + user.getUsertel());
        boolean
                updataResult = userService.update(user);
        System.out.println("updataResult======" + updataResult);
        if (updataResult) {
            return "" + GeneralResult.setMsg("修改成功");
        } else {
            return
                    "" + GeneralResult.setMsg("修改失败");
        }

    }


    /***
     * 通过id查询
     * @param username
     * @return
     *
     */
    @ApiOperation(value = "通过一个用户名查找单条数据")
    @RequestMapping(value = "/selectbyid", method = RequestMethod.PUT)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户", required = true, paramType = "query", dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })
    public List<String> selectbyid(String username) {
        if (null != username && !username.isEmpty()) {
            List<String> list;
            list = userService.selectbyid(username);
            for (int i = 0; i < list.size(); i++) {
                System.out.println("获取数据" + list.get(i));
            }
            return list;
        } else {
            System.out.println("获取数据是空");
        }
        return null;
    }


    /***
     * 查询所有
     */
    @ApiOperation(value = "获取用户列表")
    @RequestMapping(value = "/selectall",method = RequestMethod.GET)
    @ResponseBody
    @ApiImplicitParams({
//            @ApiImplicitParam(name = "phone", value = "手机号码", required = true, paramType = "query", dataType = "String"),
    })
//    @PostMapping("/selectall")
    public GeneralResult selectAll() {
        GeneralResult General = new GeneralResult();
        List<String> list;
        List<User>   userlistall=new ArrayList<>();
        if (null != userService.selectAll()) {
            userlistall = userService.selectAll();
        } else {
            return null;
        }
        General.setMsg("成功");
        General.setData(userlistall);
        return General;
    }

    /***
     * 输入单条姓名进行删除单挑数据
     */

    @PostMapping("/deletebyid")
    public Boolean deletebyusername(String username) {
        System.out.println("usernaeme===" + username);
        boolean
                result = userService.deleteuserbyname(username);
        return result;
    }


    /***
     * 进行分页查询
     */
    @RequestMapping(value = "/selectAllbytype", method = RequestMethod.PUT)
    @ApiImplicitParams({
    })
    @ApiOperation(value = "用户登陆进行查询带分页")
    @ApiResponses({
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })
    @GetMapping
    @PostMapping("/selectAllbytype")
    public Result selectAllbytype(UserListQuery userListQuery) {
        GeneralResult generalResult = new GeneralResult();
        ;
        PageBO<User> systemUserList = userService.selectType(userListQuery);
        generalResult.setData(systemUserList);
        generalResult.setCode(00);
        if (null != systemUserList) {
            return generalResult;
        } else {
            generalResult.setData("数据返回为null");
            generalResult.setCode(99);

            return null;
        }

    }

}
