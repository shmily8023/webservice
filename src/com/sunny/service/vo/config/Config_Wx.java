package com.sunny.service.vo.config;

public class Config_Wx {
//微信基本配置
	public String appId;	//appid
	public String appKey;//appkey
	public String wxName;	//微信号
	public String gh_id;		//原始号码
	public String mpName;	//公众号名
	public int supplyId;//供应商id
	public int proxyId;//代理商Id
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
	public String getWxName() {
		return wxName;
	}
	public void setWxName(String wxName) {
		this.wxName = wxName;
	}
	public String getGh_id() {
		return gh_id;
	}
	public void setGh_id(String gh_id) {
		this.gh_id = gh_id;
	}
	public String getMpName() {
		return mpName;
	}
	public void setMpName(String mpName) {
		this.mpName = mpName;
	}
	public int getSupplyId() {
		return supplyId;
	}
	public void setSupplyId(int supplyId) {
		this.supplyId = supplyId;
	}
	public int getProxyId() {
		return proxyId;
	}
	public void setProxyId(int proxyId) {
		this.proxyId = proxyId;
	}

}
