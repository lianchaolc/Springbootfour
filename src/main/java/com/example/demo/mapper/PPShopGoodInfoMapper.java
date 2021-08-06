package com.example.demo.mapper;
import com.example.demo.bean.PPShopGoodInfo;
import com.example.demo.bean.PPShopGoodInfoBase;
import com.example.demo.bean.goodinfolinebean.PPShopGoodInfoResutl;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * mapper
 */
@Repository
public interface PPShopGoodInfoMapper {
     public    List<PPShopGoodInfo>  selegoodinfowh(String Userphone);//  查询所有

//     public  List<PPShopGoodInfoBase> selegoodinfobase(String Userphone);

     public  List<PPShopGoodInfoResutl>  selegoodinfobase(String Userphone);

}
