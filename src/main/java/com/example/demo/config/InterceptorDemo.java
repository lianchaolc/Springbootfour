package com.example.demo.config;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*****
 * 拦截器
 */
public class InterceptorDemo extends HandlerInterceptorAdapter {

//
//    @Override
//    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
//        StringBuffer requestURL = httpServletRequest.getRequestURL();
//        System.out.println("前置拦截器1 preHandle： 请求的uri为："+requestURL.toString());
//        return true;
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
//        System.out.println("拦截器1 postHandle： ");
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
//        System.out.println("拦截器1 afterCompletion： ");
//    }
//————————————————
//    版权声明：本文为CSDN博主「余生之君」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//    原文链接：https://blog.csdn.net/java_collect/java/article/details/80873686
}
