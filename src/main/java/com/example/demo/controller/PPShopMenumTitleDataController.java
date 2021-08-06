package com.example.demo.controller;

import com.example.demo.bean.familybean.PPMenumEntity;
import com.example.demo.domain.GeneralResult;
import com.example.demo.service.PpshopMenumTitleService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/***
 * 返回菜单加图片文字///
 */
@RestController
public class PPShopMenumTitleDataController {
    private Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private PpshopMenumTitleService ppshopMenumTitleService;

    /***
     *返回菜单页面的顶部数据
     */
    @ApiOperation(value = "获取菜单顶部的数据  0或者1,3")
    @RequestMapping(value = "getTitleMenumdata", method = RequestMethod.GET)
    @ResponseBody
    public GeneralResult getTitleMenumdata(String type) {
        GeneralResult General = new GeneralResult();
        List<PPMenumEntity> titlemenu = new ArrayList<PPMenumEntity>();
        if (type.equals("") || type == null) {
            System.out.print("null" + titlemenu);
            return General;
        } else {
            log.info("PPShopMenumTitleDataController" + type);
            titlemenu = ppshopMenumTitleService.getTitleMenumdata(type);
            General.setData(titlemenu);
            General.setMsg("Success");
            General.setCode(200);
        }
        return General;
    }

    /****************
     *实现web页面的分页
     */


}

