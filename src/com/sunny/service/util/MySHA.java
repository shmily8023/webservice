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
		        // ���ݸ������ֽ����鹹��һ����Կ,�ڶ�����ָ��һ����Կ�㷨������
		         secretKey = new SecretKeySpec(data, "HmacSHA1");
		        // ����һ��ָ�� Mac �㷨 �� Mac ����
		         mac = Mac.getInstance("HmacSHA1");
		        // �ø�����Կ��ʼ�� Mac ����
		        mac.init(secretKey);
		       text = encryptText.getBytes("UTF-8");
		        // ��� Mac ����
		        return mac.doFinal(text);
			case 2:
				data = encryptKey.getBytes("UTF-8");
		        // ���ݸ������ֽ����鹹��һ����Կ,�ڶ�����ָ��һ����Կ�㷨������
		         secretKey = new SecretKeySpec(data, "HmacSHA1");
		        // ����һ��ָ�� Mac �㷨 �� Mac ����
		         mac = Mac.getInstance("HmacSHA224");
		        // �ø�����Կ��ʼ�� Mac ����
		        mac.init(secretKey);
		         text = encryptText.getBytes("UTF-8");
		        // ��� Mac ����
		        return mac.doFinal(text);
			case 3:
				data = encryptKey.getBytes("UTF-8");
		        // ���ݸ������ֽ����鹹��һ����Կ,�ڶ�����ָ��һ����Կ�㷨������
		         secretKey = new SecretKeySpec(data, "HmacSHA1");
		        // ����һ��ָ�� Mac �㷨 �� Mac ����
		         mac = Mac.getInstance("HmacSHA256");
		        // �ø�����Կ��ʼ�� Mac ����
		        mac.init(secretKey);
		         text = encryptText.getBytes("UTF-8");
		        // ��� Mac ����
		        return mac.doFinal(text);
			case 4:
				data = encryptKey.getBytes("UTF-8");
		        // ���ݸ������ֽ����鹹��һ����Կ,�ڶ�����ָ��һ����Կ�㷨������
		         secretKey = new SecretKeySpec(data, "HmacSHA1");
		        // ����һ��ָ�� Mac �㷨 �� Mac ����
		         mac = Mac.getInstance("HmacSHA384");
		        // �ø�����Կ��ʼ�� Mac ����
		        mac.init(secretKey);
		        text = encryptText.getBytes("UTF-8");
		        // ��� Mac ����
		        return mac.doFinal(text);
			case 5:
				data = encryptKey.getBytes("UTF-8");
		        // ���ݸ������ֽ����鹹��һ����Կ,�ڶ�����ָ��һ����Կ�㷨������
		         secretKey = new SecretKeySpec(data, "HmacSHA1");
		        // ����һ��ָ�� Mac �㷨 �� Mac ����
		         mac = Mac.getInstance("HmacSHA512");
		        // �ø�����Կ��ʼ�� Mac ����
		        mac.init(secretKey);
		        text = encryptText.getBytes("UTF-8");
		        // ��� Mac ����
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
     *         des �Գ����㷨���� ���ܹ����� �������㷨
     * @email niunafei0315@163.com
     * @date 2018/12/12  ����2:05
     */
    private static final String DES="DES";

    /**
     * ��Կ  8λ����
     */
    private static final String SECRET_KEY="12345678";

    /**
     * ��ȡ��Կ����
     * @return
     * @throws Exception
     */
    private static final SecretKey getSecretKeyFactory() throws Exception {
        SecretKeyFactory des = SecretKeyFactory.getInstance(DES);
        SecretKey secretKey = des.generateSecret(new DESKeySpec(SECRET_KEY.getBytes()));
        return secretKey;
    }

    /**
     * ����
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
     * ����
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
         * ������Ҫʹ��JDK���ṩ����
         */
        StringBuffer sb = new StringBuffer();
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] bs = digest.digest(strs.getBytes());
            /*
             * ���ܺ��������-128 �� 127 ֮������֣��������Ҳ����ȫ�� 
             * ȡ��ÿ�������ĳЩ������λ����ĳЩ���㣬�õ�һ���µļ��ܽ��
             * 
             *  0000 0011 0000 0100 0010 0000 0110 0001
             * &0000 0000 0000 0000 0000 0000 1111 1111
             * ---------------------------------------------
             *  0000 0000 0000 0000 0000 0000 0110 0001
             * 
             *  ��ȡ��������ת��ʮ��������
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
            System.out.println("����ʧ��");
        }
        return sb.toString();
    }
    //===============md5=======================
}
