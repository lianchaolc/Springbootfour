package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@EnableSwagger2Doc
@ComponentScan
@ServletComponentScan
@MapperScan(value = "com.example.demo.mapper")
@SpringBootApplication
@ComponentScan("com.example.demo.swagger")
@EnableSwagger2                  /// 启动swagger2 的注解
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

//1总结：返回结果集合返回是一列 对象返回的是全体数据员