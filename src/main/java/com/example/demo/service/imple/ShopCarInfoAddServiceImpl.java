package com.example.demo.service.imple;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.bean.shopcarinfoentity;
import com.example.demo.dao.CartDto;
import com.example.demo.mapper.TableShopCarInfoMapper;
import com.example.demo.redes.CartPrefix;
import com.example.demo.service.RedisService;
import com.example.demo.service.ShopCarInfoAddService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

@Service
public class ShopCarInfoAddServiceImpl implements ShopCarInfoAddService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ShopCarInfoAddServiceImpl.class);

    @Autowired
    public TableShopCarInfoMapper tableShopCarInfoMapper;

    @Autowired
    private RedisService redisService;


    @Override
    public boolean add(shopcarinfoentity shopcarinfoentity1) {
        if (null != shopcarinfoentity1 && !shopcarinfoentity1.equals("")) {
            System.out.println("!!!!!!!"+shopcarinfoentity1.getShopcarinfiid());
            int TableShopCar = tableShopCarInfoMapper.addtableShopCarList(shopcarinfoentity1);
            if (TableShopCar > 0) {
                return true;
            } else {
                return false;
            }

        }

        return false;
    }

    /***
     * 查询购物车列表
     * @param shopcarinfoid
     * @return
     */
    @Override
    public List<shopcarinfoentity> selectByShopId(String shopcarinfoid) {
        if(null==shopcarinfoid||shopcarinfoid.equals("")){
        List<shopcarinfoentity> str = tableShopCarInfoMapper.Selectall();
        LOGGER.info("!" + str.toString() + "数量！！！！");
         if (str.isEmpty()) {
            return null;
        } else {

            for (int i = 0; i < str.size(); i++) {
                System.out.println("数量WWWWWW" + str.get(i).getShopcarinfoname());
            }
            return str;
        }
        }else{

            Integer i2 = Integer.parseInt(shopcarinfoid);
            List<shopcarinfoentity> str = tableShopCarInfoMapper.Selectabyid(i2);
            return str;

        }

    }

    @Override
    public boolean updatashopinfo(shopcarinfoentity shopcarinfoentity) {
        int TableShopCar = tableShopCarInfoMapper.updatatablecarlist(shopcarinfoentity);
        if (TableShopCar > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean DeleteShopInfo(String Userid) {
        Integer userid = parseInt(Userid);
        int TableShopCar = tableShopCarInfoMapper.Delete(userid);
        if (TableShopCar > 0) {
            return true;
        } else {
            return false;
        }
    }
}
