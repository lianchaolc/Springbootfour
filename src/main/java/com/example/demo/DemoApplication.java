package com.example.demo;

import com.example.demo.service.RedisService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@ComponentScan
@ServletComponentScan
@MapperScan(value = "com.example.demo.mapper")
@SpringBootApplication
@ComponentScan("com.example.demo.swagger")
@ComponentScan(basePackages = {"com.example.demo.swagger"},
        excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {RedisService.class}))// c重名了类需要忽略一个
@EnableSwagger2
/// 启动swagger2 的注解
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

//1总结：返回结果集合返回是一列 对象返回的是全体数据员