package com.sunny.service.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

public class PftUtils {
//票付通实用工具类
	// 模拟登录 重新测试
	public static String getCookies(String passport, String password) {
		String md5Password = MySHA.str2MD5(password);
		Map<String, String> params = new HashMap<String, String>();
		params.put("passport", "9490873");
		params.put("password", md5Password);
		params.put("yzm", "");

		String returnstr = HttpsUtils.sendGetRequest("http://www.12301.cc/dlogin.php", params);
		System.out.print(returnstr);
		return returnstr;

		// 调用http 工具类获取cookies
	}
public static void main(String[] args) {
	getCookies("13280590002","");
}
}
