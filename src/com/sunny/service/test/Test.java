package com.sunny.service.test;

import com.sunny.service.util.MySHA;

public class Test {
//发送重置密码
	//发送验证码
	// 绑定用户验证码
	
    /**
    测试
    */
   public static void main(String[] args) throws Exception {
	   MySHA m =new MySHA();
       String key="123";
       System.out.println(" key="+key);
       //输出 key=123
       String value=MySHA.encryption(key);
       System.out.println("encryption value="+value);
       //输出 encryption value=LDiFUdf0iew=
       System.out.println("decrypt key="+MySHA.decrypt(value));
       //输出 decrypt key=123

   }
	
}
