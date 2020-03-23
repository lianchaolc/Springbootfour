package com.example.demo.swagger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean
    public Docket buildDocket() {
        return  new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())//调用下面apiInfo()方法
                .select()   //加了ApiOperation注解的类，才生成接口文档
                //Controller所在路径
                //包下的类，才生成接口文档
                .apis(RequestHandlerSelectors.basePackage("com.example.demo.controller"))
                .paths(PathSelectors.any())
                .build();

    }

    public ApiInfo apiInfo() {
        return  new ApiInfoBuilder()
                .title("springboot结合swagger2构建Restful API")
                .description("这是一个swagger2小型demo")
                .termsOfServiceUrl("www.baidu.com")
                .contact("bacyang")
                .version("0.0.1")
                .build();

    }
////---------------------
////    作者：流放丶
////    来源：CSDN
////    原文：https://blog.csdn.net/qq_35193093/article/details/80075043
////    版权声明：本文为博主原创文章，转载请附上博
//    网络请求的url
////    http://localhost:8888/swagger-ui.html
}
