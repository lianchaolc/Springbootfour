package com.example.demo.controller;

import com.example.demo.domain.FileUtils;
import com.example.demo.global.domain.result.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/****


作废
 * 图片上传或者下载
 *
 *
 * https://blog.csdn.net/Coding13/article/details/54577076
 */
@RestController
@RequestMapping("/img")
public class ImageUPandLoadController {
    @PostMapping("/imgUpLoad")
    public MdResult imgUpLoad(@RequestParam(value = "editormd-image-file", required = false) MultipartFile file) {

        // 配置存储的路径
        String rootPath = "D:\\biancheng\\Image\\";
        String path = rootPath + file.getOriginalFilename();
        System.out.print("!!!!!!!===="+path);
        try {
            file.transferTo(new File(path));


        } catch (IOException e) {
            e.printStackTrace();
            System.out.print("!!!!!!!"+e);
        }

        return new MdResult(1, "上传成功",file.getOriginalFilename());
    }

    //MdResult的返回类型，注意返回的格式success，message，url
    public class MdResult {
        public Integer success;

        public String message;

        public String url;

        public MdResult(Integer success, String message, String url) {
            this.success = success;
            this.message = message;
            this.url = url;
        }
    }
/***
 * 图片添加签名
 */
/***
 * 定时任务
 * ScheduledExecutorService
 */
    @PostMapping("/tasktime")
    public void tasktime() {

            ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
            // 参数：1、任务体 2、首次执行的延时时间
            //      3、任务执行间隔 4、间隔时间单位
            service.scheduleAtFixedRate(()->System.out.println("task ScheduledExecutorService "+new Date()), 0, 3, TimeUnit.SECONDS);

            System.out.print("!!!!!!!===="+"启动定时任务");
        }

}
