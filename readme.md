zheshi 这是一个服务端代码myappdata

<!--http://localhost:8988/index.html-->

element  项目
https://www.php.cn/vuejs/487076.html


很好的管理项目、
https://eladmin.vip/demo/#/monitor/online
2022.12.1 下午
https://www.gxlsystem.com/qianduan-2693.html
https://v2.cn.vuejs.org/v2/guide/installation.html
npm install vue




api 文件是存放后台请求接口
common文件是存放公共样式、字体文件、工具类JS
components文件是项目使用的组件
route文件是路由器
store文件是vuex文件
web文件是项目各个主页面
App.vue是入口文件
element.js用来element-ui按需引入组件一个汇总的地方
main.js我觉得没啥好说,大家都懂的

https://github.com/dengguochao23/share
https://github.com/vuejs/devtools/tree/main/packages






vue
idea 运行vue项目
https://blog.csdn.net/m0_62808124/article/details/125776300

本地路径
D:\Cenlent_Code\vue

2022.12.7 
简书sprinboot 实现国际化

2022.12.14 国际化没做出来  不知道哪里出现问题
vue 页面不知道咋用


**2022.12.23 可以通过这个实现**  狂神说java 实现思路类似雨步骤

https://bareth.blog.csdn.net/article/details/108934414?spm=1001.2101.3001.6650.12&utm_medium=distribute.pc_relevant.none-task-blog-2%7Edefault%7ECTRLIST%7ERate-12-108934414-blog-124560872.pc_relevant_default&depth_1-utm_source=distribute.pc_relevant.none-task-blog-2%7Edefault%7ECTRLIST%7ERate-12-108934414-blog-124560872.pc_relevant_default&utm_relevant_index=12


**v2使用到的注解不懂的地方**
***@Configuration(proxyBeanMethods = false) 详解***

proxyBeanMethods = false 是lite模式

不带@Configuration的类叫Lite配置类

ConfigurationClassUtils 

https://blog.csdn.net/yunxing323/article/details/108655250

***V3 设置国际化***
https://github.com/finddreams/AndroidMultiLanguage/tree/master/app_start/src/main



RSA——非对称加密，会产生公钥和私钥，公钥在客户端，私钥在服务端。公钥用于加密，私钥用于解密。

得到当前类的名称
mainactivyt.class.getSimplename()
2023.2.7
作者：纯洁的微笑
出处：http://www.ityouknow.com/
public interface UserMapper {

    @Select("SELECT * FROM users")
    @Results({
        @Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
        @Result(property = "nickName", column = "nick_name")
    })
    List<UserEntity> getAll();

    @Select("SELECT * FROM users WHERE id = #{id}")
    @Results({
        @Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
        @Result(property = "nickName", column = "nick_name")
    })
    UserEntity getOne(Long id);

    @Insert("INSERT INTO users(userName,passWord,user_sex) VALUES(#{userName}, #{passWord}, #{userSex})")
    void insert(UserEntity user);

    @Update("UPDATE users SET userName=#{userName},nick_name=#{nickName} WHERE id =#{id}")
    void update(UserEntity user);

    @Delete("DELETE FROM users WHERE id =#{id}")
    void delete(Long id);

}
————————————————
版权声明：本文为CSDN博主「微笑很纯洁」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/ityouknow/article/details/53063404

// This example creates a prepared statement, something like select * from teacher where name = ?;
@Select("Select * from teacher where name = #{name}")
Teacher selectTeachForGivenName(@Param("name") String name);

// This example creates n inlined statement, something like select * from teacher where name = 'someName';
@Select("Select * from teacher where name = '${name}'")
Teacher selectTeachForGivenName(@Param("name") String name);
————————————————
版权声明：本文为CSDN博主「微笑很纯洁」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/ityouknow/article/details/53063404


foreach 的使用

https://blog.csdn.net/weixin_38192427/article/details/121443045


**2023.2.7  v2**
项目地址
https://gitee.com/aun/Timo/blob/master/admin/src/main/java/com/linln/admin/system/controller/LoginController.java





android 的判断sdk 版本  显示
SYSTEM_UI_FLAG_LOW_PROFILE
- SYSTEM_UI_FLAG_HIDE_NAVIGATION
- SYSTEM_UI_FLAG_FULLSCREEN
- SYSTEM_UI_FLAG_LAYOUT_STABLE
- SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
- SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
- SYSTEM_UI_FLAG_IMMERSIVE
- SYSTEM_UI_FLAG_IMMERSIVE_STICKY
————————————————
版权声明：本文为CSDN博主「QQxiaoqiang1573」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/QQxiaoqiang1573/article/details/79867127


****问题***
国际化不生效
传统拼接需要用''来进行普通字符串和表达式的拼接，Thymeleaf中进行了简化，只需将拼接的内容块使用||包裹即可：
<span th:text="|欢迎您，${user.name}|">九月</span>

①因为html里会将<和>符号进行解析，所以不能直接使用，但是如果在{}内使用，是不需要转换的

>	      gt    即greater than，大于
<         lt    即less than，小于
>=        ge    即greater equal，大于等于
<=        le    即less equal，小于等于



gittoger  提交代码