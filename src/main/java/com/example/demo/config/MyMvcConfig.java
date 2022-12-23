package com.example.demo.config;

/***
 *  属于拦截
 *  到此我们的登录功能实现完毕，但是有一个很大的问题，浏览器的url暴露了用户的用户名和密码，这在实际开发中可是重大的漏洞，泄露了用户信息，因此我们需要编写一个映射

 我们在自定义的配置类MyMvcConfig中加一句代码
 registry.addViewController("/main.html").setViewName("dashboard");
 */
public class MyMvcConfig {
//    registry.addViewController("/main.html").setViewName("dashboard");
}
