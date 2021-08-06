//package com.example.demo;
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONArray;
//import com.alibaba.fastjson.JSONObject;
//import io.jsonwebtoken.*;
//
//import javax.servlet.ServletException;
//import java.util.*;
//public class JwtUtils {
//    final static String base64EncodedSecretKey = "base64EncodedSecretKey";//私钥final
//
//    public static String getToken(String userName, long TOKEN_EXP) {
//        if (TOKEN_EXP == 0) {
//            TOKEN_EXP = 1000 * 60 * 60;
//        }
//        return Jwts.builder()
//                .setSubject(userName)
//                .claim("username", userName)
//                .setIssuedAt(new Date())
//                .setExpiration(new Date(System.currentTimeMillis() + TOKEN_EXP)) /*过期时间*/
//                .signWith(SignatureAlgorithm.HS256, base64EncodedSecretKey)
//                .compact();
//    }
//
//    public static String getTokenByMap(Map<String, Object> var1, Date expDate) {
//        return Jwts.builder()
//                .setClaims(var1)
//                .setIssuedAt(new Date())
//                .setExpiration(expDate) /*过期时间*/
//                .signWith(SignatureAlgorithm.HS256, base64EncodedSecretKey)
//                .compact();
//    }
//
//
//    //解析token
//    public static JSONObject checkToken(String token) throws ServletException {
//        boolean success = false;
//        Claims claims = null;
//        String msg = null;
//        try {
//            // claims  可以得到你额外得到的值
//            claims = Jwts.parser().setSigningKey(base64EncodedSecretKey).parseClaimsJws(token).getBody();
//        } catch (ExpiredJwtException e1) {
//            msg = "token已经过期";
//            e1.printStackTrace();
//        } catch (Exception e) {
//            msg = "无效token";
//            e.printStackTrace();
//        }
//
//        Map<String, Object> reusltMap = new HashMap<>();
//        if (claims != null) {
//            success = true;
//            msg = "解析成功";
//        }
//        reusltMap.put("success", success);
//        reusltMap.put("msg", msg);
//        reusltMap.put("data", claims);
//        return JSONObject.parseObject(JSON.toJSONString(reusltMap));
//    }
////————————————————
////    版权声明：本文为CSDN博主「行人已」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
////    原文链接：https://blog.csdn.net/bei_FengBoby/article/details/98512103
//}
