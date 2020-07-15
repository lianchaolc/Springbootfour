package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/***
 * lainchao
 * 20200324
 * 配置拦截器
 */
public class AuthConfig implements WebMvcConfigurer {

//    @Bean
//    public AuthInterceptor initAuthInterceptor(){
//        return new AuthInterceptor();
//    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(initAuthInterceptor()).addPathPatterns("/test/**").excludePathPatterns("/login/**");
    }

}
