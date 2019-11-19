package com.sunny.service.vo.config;

public class Config_WxPay {
//==========微信支付配置=============//
	public String appId; // appid
	public String mchId; // mchid
	public String appSec; // appsec
	public String key; // key
	public int proxyId;//代理商id
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getMchId() {
		return mchId;
	}
	public void setMchId(String mchId) {
		this.mchId = mchId;
	}
	public String getAppSec() {
		return appSec;
	}
	public void setAppSec(String appSec) {
		this.appSec = appSec;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public int getProxyId() {
		return proxyId;
	}
	public void setProxyId(int proxyId) {
		this.proxyId = proxyId;
	}

}
