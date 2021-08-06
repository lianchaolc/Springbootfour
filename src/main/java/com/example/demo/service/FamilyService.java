package com.example.demo.service;

import com.example.demo.bean.ppshopbean.ppshopfamilybean;
import com.example.demo.global.domain.bo.PageBO;
import com.example.demo.query.PatrolplaceListQuery;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public interface FamilyService {
    //  查询身份证和用户名的的接口
    List<ppshopfamilybean> Getfamilybean(ppshopfamilybean ppshopfamilybean);
    /// 分页返回代码

//   public  pageBO<ppshopfamilybean> page(int pageNum, int pageSize);
    PageBO<ppshopfamilybean> page(PatrolplaceListQuery patrolplaceListQuery);
}