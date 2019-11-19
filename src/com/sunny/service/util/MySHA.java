package com.sunny.service.util;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.tomcat.util.codec.binary.Base64;

public class MySHA {
	MessageDigest sha;

	public byte[] SHA1Encrypt(String msg, int id) {
		byte[] my = null;
		try {
			switch (id) {
			case 1:
				sha = MessageDigest.getInstance("SHA");
				sha.update(msg.getBytes());
				my= sha.digest();
			case 2:
				sha = MessageDigest.getInstance("SHA-1");
				sha.update(msg.getBytes());
				my=  sha.digest();
			case 3:
				sha = MessageDigest.getInstance("SHA-224");
				sha.update(msg.getBytes());
				my= sha.digest();
			case 4:
				MessageDigest sha = MessageDigest.getInstance("SHA-256");
				sha.update(msg.getBytes());
				my= sha.digest();
			case 5:
				sha = MessageDigest.getInstance("SHA-284");
				sha.update(msg.getBytes());
				my= sha.digest();
			case 6:
				sha = MessageDigest.getInstance("SHA-512");
				sha.update(msg.getBytes());
				my= sha.digest();
			}
		} catch (NoSuchAlgorithmException nsa) {

		}
		return my;

	}
    public  byte[] HmacSHA1Encrypt(String encryptText, String encryptKey,int id) {
        byte[] data = null;
        SecretKey secretKey;
        Mac mac;
        byte[] text;
		try {
			switch(id) {
			case 1:
				data = encryptKey.getBytes("UTF-8");
		        // 根据给定的字节数组构造一个密钥,第二参数指定一个密钥算法的名称
		         secretKey = new SecretKeySpec(data, "HmacSHA1");
		        // 生成一个指定 Mac 算法 的 Mac 对象
		         mac = Mac.getInstance("HmacSHA1");
		        // 用给定密钥初始化 Mac 对象
		        mac.init(secretKey);
		       text = encryptText.getBytes("UTF-8");
		        // 完成 Mac 操作
		        return mac.doFinal(text);
			case 2:
				data = encryptKey.getBytes("UTF-8");
		        // 根据给定的字节数组构造一个密钥,第二参数指定一个密钥算法的名称
		         secretKey = new SecretKeySpec(data, "HmacSHA1");
		        // 生成一个指定 Mac 算法 的 Mac 对象
		         mac = Mac.getInstance("HmacSHA224");
		        // 用给定密钥初始化 Mac 对象
		        mac.init(secretKey);
		         text = encryptText.getBytes("UTF-8");
		        // 完成 Mac 操作
		        return mac.doFinal(text);
			case 3:
				data = encryptKey.getBytes("UTF-8");
		        // 根据给定的字节数组构造一个密钥,第二参数指定一个密钥算法的名称
		         secretKey = new SecretKeySpec(data, "HmacSHA1");
		        // 生成一个指定 Mac 算法 的 Mac 对象
		         mac = Mac.getInstance("HmacSHA256");
		        // 用给定密钥初始化 Mac 对象
		        mac.init(secretKey);
		         text = encryptText.getBytes("UTF-8");
		        // 完成 Mac 操作
		        return mac.doFinal(text);
			case 4:
				data = encryptKey.getBytes("UTF-8");
		        // 根据给定的字节数组构造一个密钥,第二参数指定一个密钥算法的名称
		         secretKey = new SecretKeySpec(data, "HmacSHA1");
		        // 生成一个指定 Mac 算法 的 Mac 对象
		         mac = Mac.getInstance("HmacSHA384");
		        // 用给定密钥初始化 Mac 对象
		        mac.init(secretKey);
		        text = encryptText.getBytes("UTF-8");
		        // 完成 Mac 操作
		        return mac.doFinal(text);
			case 5:
				data = encryptKey.getBytes("UTF-8");
		        // 根据给定的字节数组构造一个密钥,第二参数指定一个密钥算法的名称
		         secretKey = new SecretKeySpec(data, "HmacSHA1");
		        // 生成一个指定 Mac 算法 的 Mac 对象
		         mac = Mac.getInstance("HmacSHA512");
		        // 用给定密钥初始化 Mac 对象
		        mac.init(secretKey);
		        text = encryptText.getBytes("UTF-8");
		        // 完成 Mac 操作
		        return mac.doFinal(text);
		    
			}

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;

    }
    //====des====================
    /**
     * @author niunafei
     * @function
     *         des 对称性算法加密 解密工具类 可逆性算法
     * @email niunafei0315@163.com
     * @date 2018/12/12  下午2:05
     */
    private static final String DES="DES";

    /**
     * 公钥  8位以上
     */
    private static final String SECRET_KEY="12345678";

    /**
     * 获取秘钥对象
     * @return
     * @throws Exception
     */
    private static final SecretKey getSecretKeyFactory() throws Exception {
        SecretKeyFactory des = SecretKeyFactory.getInstance(DES);
        SecretKey secretKey = des.generateSecret(new DESKeySpec(SECRET_KEY.getBytes()));
        return secretKey;
    }

    /**
     * 加密
     * @param param
     * @return
     * @throws Exception
     */
    public static final String encryption(String param) throws Exception {
        Cipher cipher = Cipher.getInstance(DES);
        SecretKey secretKey = getSecretKeyFactory();
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        return  new String(Base64.encodeBase64(cipher.doFinal(param.toString().getBytes())));
    }

    /**
     * 解密
     * @param value
     * @return
     * @throws Exception
     */
    public static final String decrypt(String value) throws Exception {
        Cipher cipher = Cipher.getInstance(DES);
        SecretKey secretKey = getSecretKeyFactory();
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        return new String(cipher.doFinal(Base64.decodeBase64(value.getBytes())));
    }
    
    //===============des================
    //======md===========================
    public static String str2MD5(String strs) {
        /*
         * 加密需要使用JDK中提供的类
         */
        StringBuffer sb = new StringBuffer();
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] bs = digest.digest(strs.getBytes());
            /*
             * 加密后的数据是-128 到 127 之间的数字，这个数字也不安全。 
             * 取出每个数组的某些二进制位进行某些运算，得到一个新的加密结果
             * 
             *  0000 0011 0000 0100 0010 0000 0110 0001
             * &0000 0000 0000 0000 0000 0000 1111 1111
             * ---------------------------------------------
             *  0000 0000 0000 0000 0000 0000 0110 0001
             * 
             *  把取出的数据转成十六进制数
             */
            for (byte b : bs) {
                int x = b & 255;
                String s = Integer.toHexString(x);
                if (x < 16) {
                    sb.append("0");
                }
                sb.append(s);
            }

        } catch (Exception e) {
            System.out.println("加密失败");
        }
        return sb.toString();
    }
    //===============md5=======================
}
