package com.sunny.service;

import com.sunny.service.service.impl.MyUserService;
import com.sunny.service.util.JsonData;
import com.sunny.service.vo.user.WxUser;

public class Test {
public static void main(String[] args) {
	MyUserService my=new MyUserService();
	my.addUser();
}
}
