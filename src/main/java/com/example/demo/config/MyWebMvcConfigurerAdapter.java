package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//https://gitee.com/yangyouqi/upload_picture_test/blob/master/src/main/java/com/yangyouqi/imgdemo/config/MyWebMvcConfigurerAdapter.java

@Configuration
public class  MyWebMvcConfigurerAdapter extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        //指向外部目录
        registry.addResourceHandler("img//**").addResourceLocations("file:D:/img/");
        super.addResourceHandlers(registry);
    }
}
