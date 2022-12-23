package com.example.demo.controller;

import com.example.demo.bean.ppshopbean.ppshopfamilybean;
import com.example.demo.domain.GeneralResult;
import com.example.demo.domain.Result;
import com.example.demo.global.domain.bo.PageBO;
import com.example.demo.query.PatrolplaceListQuery;
import com.example.demo.service.FamilyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.xml.internal.ws.transport.http.ResourceLoader;
import io.swagger.annotations.*;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * 创建一个10 年约定的控制类
 * 记录家人中的族谱  对祖先的记录2地点成就  追思   和想要说的话  对子孙后代 想说的话 目标
 * 图片
 * 201911.12
 * lc
 * <p>
 * https://github.com/ddxygq/spring-boot-learn springboot 学习  的网址
 */
@RestController
public class FamilyController {
    private Logger log = LoggerFactory.getLogger(this.getClass());
    private final ResourceLoader resourceLoader;
    @Autowired
    private FamilyService familyService;

    public FamilyController() {
        resourceLoader = null;
    }

    /****
     * 通过自身的身份证号码和用户名登陆后可以查询自己的家族信息
     */
    @ApiOperation(value = "通过一个用户名查找单条数据")
    @RequestMapping(value = "/GetAllFamilyResult", method = RequestMethod.PUT)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名称", required = true, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "Cardid", value = "用户Cardid", required = true, paramType = "query", dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })
    private GeneralResult GetAllFamilyResult(String username, String Cardid) {
        GeneralResult General = new GeneralResult();
        System.out.println("username----" + username + "--------Cardid--" + Cardid);
        List<ppshopfamilybean> ppsfbeanlist = new ArrayList<ppshopfamilybean>();
        if (null == username || username.equals("")) {
            System.out.println("用户名不能为空");
            General.setMsg("用户名不能为空");
            General.setCode(99);
            return General;
        } else {
            if (null == Cardid || Cardid.equals("")) {
                System.out.println("身份证号码不能是空");
                General.setMsg("身份证号码不能是空");
                General.setCode(99);
                return General;

            } else {
                System.out.println("----username===" + username + "-----Cardid---" + Cardid);
                ppshopfamilybean ppshopfamily = new ppshopfamilybean();
                ppshopfamily.setCardid(Cardid);
                ppshopfamily.setName(username);
                ppsfbeanlist = familyService.Getfamilybean(ppshopfamily);
                General.setMsg("Success");
                General.setCode(00);
                General.setData(ppsfbeanlist);
                for (int i = 0; i < ppsfbeanlist.size(); i++) {
                    System.out.println(ppsfbeanlist.get(i) + "--------");
                }
                return General;
            }
        }
    }


    /*****
     * 分页显  和逐条返回
     *
     */
    @RequestMapping(value = "/selectReturnData", method = RequestMethod.PUT)
    @ApiImplicitParams({
    })
    @ApiOperation(value = "获得所有巡更计划列表并带分页")
    @ApiResponses({
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })
    @GetMapping
    public Result selectReturnData(PatrolplaceListQuery patrolplaceListQuery) {
        GeneralResult generalResult = new GeneralResult();
        PageBO<ppshopfamilybean> systemUserList = familyService.page(patrolplaceListQuery);
        generalResult.setData(systemUserList);
        generalResult.setCode(00);
        return generalResult;
    }

    /***
     *
     * @param file
     * @param realpath
     * @param fileName
     * @return
     */
//    public static String writeUploadFile(MultipartFile file, String realpath, String fileName) {
//        File fileDir = new File(realpath);
//        if (!fileDir.exists())
//            fileDir.mkdirs();
//
//        InputStream input = null;
//        FileOutputStream fos = null;
//        try {
//            input = file.getInputStream();
//            fos = new FileOutputStream(realpath + "/" + fileName);
//            IOUtils.copy(input, fos);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        } finally {
//            IOUtils.closeQuietly(input);
//            IOUtils.closeQuietly(fos);
//        }
//        return fileName;
//    }
////————————————————
////    版权声明：本文为CSDN博主「网络改变中国」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
////    原文链接：https://blog.csdn.net/hehe520347/java/article/details/85166088
//
//
//    @CrossOrigin    //实现跨域请求
//    //下面是编写接口名和请求方式
//    @RequestMapping(value = "/uploadimg", method = RequestMethod.POST)
//    //注意参数的类型和第一个参数的"file",之后会用到的
//    public String uploadImg(@RequestParam("file") MultipartFile file, HttpServletRequest request, HttpServletResponse response)
//            throws IllegalStateException, IOException {
//
//        //设置文件的保存路径
//        //把接口放到服务器上面的话，就改成指定的目录下面
//        String path = "D:biancheng/Image/";
////        D:\biancheng\tjquancuncompany\lianxiceshi
//        System.out.println("：：：：path===" + path);
//
//        //文件命名  我这里上传之后的图片就使用了原图
//        String originalFilename = file.getOriginalFilename();
//        String originalFilename1=originalFilename.replace("\\", "/");
//        System.out.println("::::::originalFilename==" + originalFilename);
//        log.info(":::::originalFilename1==" + originalFilename1);
//        //获取文件的后缀名
//        String extendName = originalFilename.substring(originalFilename.lastIndexOf("."), originalFilename.length());
//        String location=extendName.replace("\\", "/");
//        //判断文件是否是图片
//        Map<String, String> map = new HashMap<>();
//        String[] imagType = {".jpg", ".png", ".bmp", ".gif"};
//        List<String> imageTyepLists = Arrays.asList(imagType);
//        if (imageTyepLists.contains(location)) {
//            File dir = new File(path, originalFilename1);
//            //并接图片路径
//            String ImgPath = path + originalFilename1;
//            log.info(":::::ImgPath==" + ImgPath);
//            File filepath = new File(path);
//            log.info(":::::filepath==" + filepath);
//            //创建存放图片的文件夹
//            if (!filepath.exists()) {
//                filepath.mkdirs();
//            }
//            log.info(":::::dir==" + dir);
//            log.info(":::::file==" + file);
//            //把图片放进文件夹中
//            try {
//                file.transferTo(dir);
//            } catch (Exception e) {
//                log.info("异常：：：：：" + e);
//            }
//
//            //把图片的路径写入数据库
////            imageService.addImagePath(ImgPath);
//            log.info("路径：：：：：：：：：：ImgPath===" + ImgPath);
//            return "99";
//        }
//        return "400";
//    }
//————————————————
//    版权声明：本文为CSDN博主「追逐蓦然」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//    原文链接：https://blog.csdn.net/qq_35905501/java/article/details/86669779

    // 设备未就绪 问题是路径不正确
    //2 java路径和windos  的路径是不一样的  https://blog.csdn.net/weixin_45689081/article/details/103409972

//    AppData\Local\Temp\tomcat.1778875212606322478.8888\work\Tomcat\localhost\ROOT  java新建的临时文件
}