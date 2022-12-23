package com.example.demo.config;

import com.example.demo.util.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
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
//    国际化
    @Bean
    public ResourceBundleMessageSource messageSource(){
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setUseCodeAsDefaultMessage(true);
        messageSource.setFallbackToSystemLocale(false);
        messageSource.setBasenames("i18n.login");
        messageSource.setDefaultEncoding("UTF-8");
        messageSource.setCacheSeconds(2);
        return messageSource;
    }
//    @Bean//将我们的组件注册到容器中
//    public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
//        return  new WebMvcConfigurerAdapter(){
//            @Override
//            public void addViewControllers(ViewControllerRegistry registry) {
//                registry.addViewController("/").setViewName("login");
//                registry.addViewController("/index.html").setViewName("login");
//            }
//        };
//    }
//    原文链接：https://blog.csdn.net/pshdhx/article/details/110309513
//    @Bean
//    public LocaleResolver localeResolver() {
//        return new MyLocaleResolver();
//
//    }
}
