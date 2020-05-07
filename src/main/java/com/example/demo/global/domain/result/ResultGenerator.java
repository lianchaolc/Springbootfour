package com.example.demo.global.domain.result;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 响应结果生成工具
 */
@RestController
public class ResultGenerator {
    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";

    private static String encryptionCodec;//公钥
    private static String apptype;//app接口是否加密y:是  n:否

//    @Value("${app.encryption.codec}")
//    public  void setEncryptionCodec(String encryptionCodec) {
//        this.encryptionCodec = encryptionCodec;
//    }

//    @Value("${app.encryption.type}")
//    public  void setApptype(String apptype) {
//        this.apptype = apptype;
//    }

    /**
     * 一般返回结果
     *
     * @return
     */
    public static Result genSuccessResult() {
        return new GeneralResult()
                .setCode(ResultCode.SUCCESS)
                .setMsg(DEFAULT_SUCCESS_MESSAGE);
    }

    /**
     * 数据导入失败的返回结果
     *
     * @return
     */
    public static Result genImportFailResult(Object data, String msg) {
        return new GeneralResult()
                .setCode(ResultCode.FAIL)
                .setData(data)
                .setMsg(msg);
    }

    public static Result genFailResult(Object data) {
        return new GeneralResult()
                .setCode(ResultCode.FAIL)
                .setData(data);
    }

    public static Result genSuccessResult(Object data) {
        return new GeneralResult()
                .setCode(ResultCode.SUCCESS)
                .setMsg(DEFAULT_SUCCESS_MESSAGE)
                .setData(data);
    }

    public static Result genFailResult(String message) {
        return new GeneralResult()
                .setCode(ResultCode.FAIL)
                .setMsg(message);
    }

    /**
     * layui的table响应结果封装 返回结果
     *
     * @return
     */
    public static Result genSuccessTableResult(long count, Object data) {
        return new TableResult()
                .setCode(ResultCode.SUCCESS)
                .setMsg(DEFAULT_SUCCESS_MESSAGE)
                .setCount(count)
                .setData(data);
    }

    public static Result genFailTableResult(String msg) {
        return new TableResult()
                .setCode(ResultCode.NO_DATA)
                .setMsg(msg);
    }

    /**
     * 登录的返回结果
     *
     * @return
     */
//    public static Result genSuccessLoginResult(TokenBO tokenBO) {
//        return new LoginResult()
//                .setCode(ResultCode.SUCCESS)
//                .setMsg(DEFAULT_SUCCESS_MESSAGE)
//                .setErrorNum(0)
//                .setToken(tokenBO.getToken())
//                .setTokenExpiryTime(tokenBO.getTokenExpiryTime())
//                .setRefreshToken(tokenBO.getRefreshToken())
//                .setRefreshTokenExpiryTime(tokenBO.getRefreshTokenExpiryTime());
//    }

    public static Result genFailLoginResult(String msg, int errorNum) {
        return new LoginResult()
                .setCode(ResultCode.UNAUTHORIZED)
                .setMsg(msg)
                .setErrorNum(errorNum);
    }

    public static Result genFailLoginResult(String msg) {
        return new LoginResult()
                .setCode(ResultCode.UNAUTHORIZED)
                .setMsg(msg);
    }

    public static Result genSuccessVehicleLoginResult(String msg,Object data) {
        return new TableResult()
                .setCode(ResultCode.SUCCESS)
                .setMsg(msg)
                .setData(data);
    }

    public static Result genFailVehicleLoginResult(String msg) {
        return new TableResult()
                .setCode(ResultCode.UNAUTHORIZED)
                .setMsg(msg);
    }

    public static Result genSuccessTableResult(long count, Object data,HttpServletRequest request) {
        /*System.out.println("是否加密："+apptype);
        System.out.println("公钥加密2："+encryptionCodec);*/
        String clientType = request.getHeader("clientType");
        if(!"pc".equals(clientType)&&"y".equals(apptype)){
//            DataEncryption encryption = new SM2Encryption(encryptionCodec);
            try {
                if(data!=null){
                    //JSONArray parse = (JSONArray) JSONArray.parse(JSON.toJSONString(data, SerializerFeature.WriteMapNullValue));
                    //JSONArray parse = (JSONArray) JSONArray.parse(JSON.toJSONString(data, SerializerFeature.DisableCircularReferenceDetect));
                    //System.out.println(parse.toString());
                    //String ciphertext = encryption.encrypt( parse.toString() );
                    //String parse = JSON.toJSONString(data, SerializerFeature.WriteMapNullValue);
                    String parse = JSON.toJSONStringWithDateFormat(data, "yyyy-MM-dd HH:mm:ss", SerializerFeature.WriteMapNullValue);
                    //System.out.println(parse);
//                    String ciphertext = encryption.encrypt( parse.toString() );
//                    return new TableResult()
//                            .setCode(ResultCode.SUCCESS)
//                            .setMsg(DEFAULT_SUCCESS_MESSAGE)
//                            .setCount(count)
//                            .setData("null".equals(ciphertext)?null:ciphertext);
            }
                return new TableResult()
                        .setCode(ResultCode.SUCCESS)
                        .setMsg(DEFAULT_SUCCESS_MESSAGE)
                        .setCount(count)
                        .setData(data);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            return new TableResult()
                    .setCode(ResultCode.SUCCESS)
                    .setMsg(DEFAULT_SUCCESS_MESSAGE)
                    .setCount(count)
                    .setData(data);
        }
        return new TableResult()
                .setCode(ResultCode.SUCCESS)
                .setMsg(DEFAULT_SUCCESS_MESSAGE)
                .setCount(0)
                .setData(null);
    }

    public static Result genSuccessResult(Object data,HttpServletRequest request) {
        /*System.out.println("是否加密："+apptype);
        System.out.println("公钥加密1："+encryptionCodec);*/
        String clientType = request.getHeader("clientType");
        if(!"pc".equals(clientType)&&"y".equals(apptype)){
//            DataEncryption encryption = new SM2Encryption(encryptionCodec);
            try {
                if(data!=null){
                    //String parse = JSON.toJSONString(data, SerializerFeature.WriteMapNullValue);
                    String parse = JSON.toJSONStringWithDateFormat(data, "yyyy-MM-dd HH:mm:ss", SerializerFeature.WriteMapNullValue);
                    //System.out.println(parse);
//                    String ciphertext = encryption.encrypt( parse );
//                    return new GeneralResult()
//                            .setCode(ResultCode.SUCCESS)
//                            .setMsg(DEFAULT_SUCCESS_MESSAGE)
//                            .setData("null".equals(ciphertext)?null:ciphertext);
                }
                return new GeneralResult()
                        .setCode(ResultCode.SUCCESS)
                        .setMsg(DEFAULT_SUCCESS_MESSAGE)
                        .setData(data);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            return new GeneralResult()
                    .setCode(ResultCode.SUCCESS)
                    .setMsg(DEFAULT_SUCCESS_MESSAGE)
                    .setData(data);
        }
        return new GeneralResult()
                .setCode(ResultCode.SUCCESS)
                .setMsg(DEFAULT_SUCCESS_MESSAGE)
                .setData(null);
    }

}
