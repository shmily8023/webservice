package com.sunny.service.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
 
public class DateUtil {
    /** 
     * ʱ���ת�������ڸ�ʽ�ַ��� 
     * @param seconds ��ȷ������ַ��� 
     * @param formatStr 
     * @return 
     */  
    public static String timeStamp2Date(String seconds,String format) {  
        if(seconds == null || seconds.isEmpty() || seconds.equals("null")){  
            return "";  
        }  
        if(format == null || format.isEmpty()){
            format = "yyyy-MM-dd HH:mm:ss";
        }   
        SimpleDateFormat sdf = new SimpleDateFormat(format);  
        return sdf.format(new Date(Long.valueOf(seconds+"000")));  
    }  
    /** 
     * ���ڸ�ʽ�ַ���ת����ʱ��� 
     * @param date �ַ������� 
     * @param format �磺yyyy-MM-dd HH:mm:ss 
     * @return 
     */  
    public static String date2TimeStamp(String date_str,String format){  
        try {  
            SimpleDateFormat sdf = new SimpleDateFormat(format);  
            return String.valueOf(sdf.parse(date_str).getTime()/1000);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return "";  
    }  
      
    /** 
     * ȡ�õ�ǰʱ�������ȷ���룩 
     * @return 
     */  
    public static String timeStamp(){  
        long time = System.currentTimeMillis();
        String t = String.valueOf(time/1000);  
        return t;  
    }  
 
    public static void main(String[] args) {  
        String timeStamp = timeStamp();  
        System.out.println("timeStamp="+timeStamp); //�������:timeStamp=1470278082
        System.out.println(System.currentTimeMillis());//�������:1470278082980
        //�÷����������Ƿ��ص�ǰ�ļ����ʱ�䣬ʱ��ı���ʽΪ��ǰ�����ʱ���GMTʱ��(��������ʱ��)1970��1��1��0ʱ0��0������ĺ�����
        
        String date = timeStamp2Date(timeStamp, "yyyy-MM-dd HH:mm:ss");  
        System.out.println("date="+date);//�������:date=2016-08-04 10:34:42
        
        String timeStamp2 = date2TimeStamp(date, "yyyy-MM-dd HH:mm:ss");  
        System.out.println(timeStamp2);  //�������:1470278082
        
        
       System.out.println("======================="); 
       checkBirthday("371327199111126416");
       System.out.println("======================="); 
    } 
    //��ǰʱ����������� һ��
    public static  boolean checkBirthday(String birthday) {
    	long lcurrentTime=System.currentTimeMillis()/1000;
    	String date = timeStamp2Date(""+lcurrentTime, "MMdd");  
    	String birthday2=birthday.substring(10, 14);
    	if(date.equals(birthday2)) {
    		return true;
    	}
    	else {
    		return false;
    	}
		
    }
    //���
    //��Ͷ���� �ּ�����
    //���ּ�����Ͷ��
       //���̶�  ������
    //���ܽ�����
}

