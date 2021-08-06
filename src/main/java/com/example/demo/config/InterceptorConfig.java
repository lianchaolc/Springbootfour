package com.example.demo.config;

import com.example.demo.config.InterceptorDemo;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
//public class InterceptorConfig implements WebMvcConfigurer {
//
//    /**
//     * 注册自定义拦截器
//     */
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//
////        registry.addInterceptor(new InterceptorDemo2()).addPathPatterns("/**");
//        registry.addInterceptor(new InterceptorDemo()).addPathPatterns("/**");
//    }
//}
//————————————————
//        版权声明：本文为CSDN博主「余生之君」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//        原文链接：https://blog.csdn.net/java_collect/java/article/details/80873686