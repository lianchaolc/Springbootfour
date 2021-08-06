 package com.example.demo.configutils;

import org.hibernate.dialect.MySQL5Dialect;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/***
 * 实现html分页的sqlconfig
 *
 * 由于hibernate自动建表字符集为latin不能插入中文，故需要在application.properties中指定：spring.jpa.properties.hibernate.dialect=com.ikeguang.paging.config.MysqlConfig。
 MysqlConfig.java代码：

 https://www.cnblogs.com/data-magnifier/p/11511404.html
 */
@EnableJpaRepositories(basePackages = "com.example.demo.mapper")
@Configuration
public class MysqlConfig extends MySQL5Dialect {

        @Override
        public String getTableTypeString() {
            return "ENGINE=InnoDB DEFAULT CHARSET=utf8";
        }
}
