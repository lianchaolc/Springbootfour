//package com.example.demo.API;
//
//import com.alibaba.fastjson.JSONObject;
//import com.example.demo.bean.PShopUser;
//import com.example.demo.service.PpshopLoginService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("api")
//public class UserApi {
//    @Autowired
//    PpshopLoginService PpshopLoginService;
//
//    @Autowired
////    TokenService tokenService;
//    //登录
//    @PostMapping("/login")
//    public Object login(@RequestBody PShopUser PShopUser) {
//        JSONObject jsonObject = new JSONObject();
//        PShopUser userForBase = PpshopLoginService.findByUsername(PShopUser);
//        if (userForBase == null) {
//            jsonObject.put("message", "登录失败,用户不存在");
//            return jsonObject;
//        } else {
//            if (!PShopUser.getUserpassword().equals(PShopUser.getUserpassword())) {
//                jsonObject.put("message", "登录失败,密码错误");
//                return jsonObject;
//            } else {
//                String token = PpshopLoginService.getToken(userForBase);
//                jsonObject.put("token", token);
//                jsonObject.put("user", userForBase);
//                return jsonObject;
//            }
//        }
//    }
//
////    @UserLoginToken
////    @GetMapping("/getMessage")
////    public String getMessage() {
////        return "你已通过验证";
////    }
//}