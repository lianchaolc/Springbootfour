package com.example.demo.controller;

import com.example.demo.bean.ppshopbean.ppshopfamilybean;
import com.example.demo.domain.Result;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * 创建一个10 年约定的控制类
 * 记录家人中的族谱  对祖先的记录2地点成就  追思   和想要说的话  对子孙后代 想说的话 目标
 * 图片
 * 201911.12
 * lc
 *
 */
public class FamilyController {

    public List<ppshopfamilybean> getAll(){


        return null;
    }

    /****
     * 通过自身的身份证号码和用户名登陆后可以查询自己的家族信息
     */
    @PostMapping("/selectallbyusername")
private String GetAllFamilyResult(String username, String Cardid){
     if(null!=username){

         return "用户名不能为空";
     }
    if(null!=username) {
    }
    return "身份证号码不能是空";
      }

}
