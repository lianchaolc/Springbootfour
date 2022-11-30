package com.example.demo.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/***
 * 创建的工具 类
 * //    原文链接：https://blog.csdn.net/m0_52433668/article/details/125172352
 *
 */
public class SetSessionUtil {

    public static void setSession(HttpServletRequest request, String SessionName, String SessionValue) {
        HttpSession session = request.getSession();
        session.setAttribute(SessionName, SessionValue);
    }

    /**
     * session后台的获取，工具类代码如下：
     */
//获取session
    public static String getSession(HttpServletRequest request, String sessionName) {
        HttpSession session = request.getSession();
        String sessionValue = (String) session.getAttribute(sessionName);


        session.invalidate();
        return sessionValue;
    }
//    原文链接：https://blog.csdn.net/m0_52433668/article/details/125172352

    /***
     * sesstion 清除
     */


    public static void   sessionClean() {
//        HttpSession session = HttpServletRequest.getSession();
//        session.invalidate();
    }

}
