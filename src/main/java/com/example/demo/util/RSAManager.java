package com.example.demo.util;

import org.apache.logging.log4j.LogManager;
import sun.misc.BASE64Encoder;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/****
 * rsa
 * 加密使用
 * RSAManager
 *
 * 2022.12.27
 */
public class RSAManager {

    /**
     * 使用公钥加密
     *
     * @param data
     * @param publicKey
     * @return
     * @throws Exception
     */
    public static byte[] encryptByPublicKey(byte[] data, byte[] publicKey) {
        // 得到公钥对象
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(publicKey);
        KeyFactory keyFactory = null;
        // 加密数据
        Cipher cp = null;
        byte[] byteArr = null;
        try {
            keyFactory = KeyFactory.getInstance("RSA");
            PublicKey pubKey = keyFactory.generatePublic(keySpec);
            // 加密数据
            cp = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cp.init(Cipher.ENCRYPT_MODE, pubKey);
            byteArr = cp.doFinal(data);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException | NoSuchPaddingException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException e) {
            e.printStackTrace();
        }

        return byteArr;
    }

    /**
     * 使用私钥解密
     *
     * @param encrypted
     * @param privateKey
     * @return
     * @throws Exception
     */
    public static byte[] decryptByPrivateKey(byte[] encrypted, byte[] privateKey) {
        // 得到私钥对象
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(privateKey);
        KeyFactory kf = null;
        byte[] byteArr = null;
        try {
            kf = KeyFactory.getInstance("RSA");
            PrivateKey keyPrivate = kf.generatePrivate(keySpec);
            // 解密数据
            Cipher cp = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cp.init(Cipher.DECRYPT_MODE, keyPrivate);
            byteArr = cp.doFinal(encrypted);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException | NoSuchPaddingException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException e) {
            e.printStackTrace();
        }
        return byteArr;
    }

    /**
     * 创建非对称加密RSA秘钥对
     *
     * @param keyLength
     * @return
     * @throws NoSuchAlgorithmException
     */
    public static KeyPair generateRSAKeyPair(int keyLength) {
        KeyPairGenerator kpg = null;
        try {
            kpg = KeyPairGenerator.getInstance("RSA");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        kpg.initialize(keyLength);
        return kpg.genKeyPair();
    }

    /**
     * 获取公钥，打印为48-12613448136942-12272-122-913111503-126115048-12...等等一长串用-拼接的数字
     */
    public static byte[] getPublicKey(KeyPair keyPair) {
        RSAPublicKey rsaPublicKey = (RSAPublicKey) keyPair.getPublic();
        return rsaPublicKey.getEncoded();
    }

    /**
     * 获取私钥，同上
     */
    public static byte[] getPrivateKey(KeyPair keyPair) {
        RSAPrivateKey rsaPrivateKey = (RSAPrivateKey) keyPair.getPrivate();
        return rsaPrivateKey.getEncoded();
    }

//    原文链接：https://blog.csdn.net/NakajimaFN/article/details/125913821

//      使用


    String message = "Trump is yellow hair";

    //创建秘钥对
    KeyPair keyPair = RSAManager.generateRSAKeyPair(2048);
    //获取公钥
    byte[] publicKey = RSAManager.getPublicKey(keyPair);
    //获取私钥
    byte[] privateKey = RSAManager.getPrivateKey(keyPair);
    //公钥base64编码
//            String publicBase64 = Base64.getEncoder().encodeToString(publicKey);
//            String publicBase64 = Base64.encodeToString(publicKey, Base64.DEFAULT);
    BASE64Encoder encoder = new BASE64Encoder();
    String publicBase64 = encoder.encodeBuffer(publicKey).trim();
//        LogManager.d("", "publicBase64*****" + publicBase64);

    //加密
    byte[] encryptResult = RSAManager.encryptByPublicKey(message.getBytes(), publicKey);
    //解密
    byte[] decryptResult = RSAManager.decryptByPrivateKey(encryptResult, privateKey);
//        LogManager.i(TAG, "解密*****" + new String(decryptResult, StandardCharsets.UTF_8))
//    原文链接：https://blog.csdn.net/NakajimaFN/article/details/125913821
}
