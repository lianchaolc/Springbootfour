package com.example.demo.service;

import com.example.demo.bean.ppshopbean.ppshopfamilybean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FamilyService {
    //  查询身份证和用户名的的接口
    List<ppshopfamilybean> Getfamilybean(ppshopfamilybean ppshopfamilybean);
}
