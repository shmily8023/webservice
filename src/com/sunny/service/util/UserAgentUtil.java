package com.sunny.service.util;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eu.bitwalker.useragentutils.Application;
import eu.bitwalker.useragentutils.Browser;
import eu.bitwalker.useragentutils.OperatingSystem;
import eu.bitwalker.useragentutils.UserAgent;
import eu.bitwalker.useragentutils.Version;


/**
 *	UserAgent获取和解析工具类,jdk1.7及以上版本支持  
 */
public class UserAgentUtil {

	public static void main(String[] args) {

		String a="Mozilla/5.0 (Linux; U; Android 8.1.0; zh-cn; BLA-AL00 Build/HUAWEIBLA-AL00) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/57.0.2987.132 MQQBrowser/8.9 Mobile Safari/537.36";
		UserAgent u = new UserAgent();
		u.parseUserAgentString(a);
		Version z=u.getBrowserVersion();
		System.out.println(z.getVersion());
		//boolean status=checkMobileOrPC(a);
	//	System.out.print(status);
	}	
}

