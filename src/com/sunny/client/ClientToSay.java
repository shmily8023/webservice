package com.sunny.client;

import com.sunny.client.config.SayHello;
import com.sunny.client.config.SayHelloService;

public class ClientToSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//wsimport -s E:\diigo\WebService\src -p com.sunny.client.config -keep http://localhost:9091/service/hello?wsdl
		// .\wsimport -s E:\diigo\WebService\src -p com.sunny.client.config -keep http://localhost:9091/service/hello?wsdl
		
		
	    SayHello sayHello = new SayHelloService().getSayHelloPort();
        //����SayHello�ӿڵ�say����
        String result = sayHello.say("Sunny02");
       // sayHello.
        //�����������
        System.out.println(result);
	}

}
