package com.sunny.service.vo.config;

public class Config_Sms {
// 短信配置 
public String appId;//appid
public String appKey;//
public String sign;//签名
public String content;//发送短信内容
public String tempId;//模板变量
public String sms_type;//短信类型 
public String getAppId() {
	return appId;
}
public void setAppId(String appId) {
	this.appId = appId;
}
public String getAppKey() {
	return appKey;
}
public void setAppKey(String appKey) {
	this.appKey = appKey;
}
public String getSign() {
	return sign;
}
public void setSign(String sign) {
	this.sign = sign;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public String getTempId() {
	return tempId;
}
public void setTempId(String tempId) {
	this.tempId = tempId;
}
public String getSms_type() {
	return sms_type;
}
public void setSms_type(String sms_type) {
	this.sms_type = sms_type;
}

}
