package com.sunny.service.test;

import com.sunny.service.util.MySHA;

public class Test {
//������������
	//������֤��
	// ���û���֤��
	
    /**
    ����
    */
   public static void main(String[] args) throws Exception {
	   MySHA m =new MySHA();
       String key="123";
       System.out.println(" key="+key);
       //��� key=123
       String value=MySHA.encryption(key);
       System.out.println("encryption value="+value);
       //��� encryption value=LDiFUdf0iew=
       System.out.println("decrypt key="+MySHA.decrypt(value));
       //��� decrypt key=123

   }
	
}
