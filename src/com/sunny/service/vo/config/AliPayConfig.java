package com.sunny.service.vo.config;

public class AliPayConfig {
//========支付宝配置===========//
	public int account; // 账户
	public int pid; // PID
	public String key; // KEY
	public String partnerPrivateKey; // 合作者私钥
	public String publicPublicKey; // 支付宝公钥
	public int proxyId;//代理商id
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getPartnerPrivateKey() {
		return partnerPrivateKey;
	}
	public void setPartnerPrivateKey(String partnerPrivateKey) {
		this.partnerPrivateKey = partnerPrivateKey;
	}
	public String getPublicPublicKey() {
		return publicPublicKey;
	}
	public void setPublicPublicKey(String publicPublicKey) {
		this.publicPublicKey = publicPublicKey;
	}
	public int getProxyId() {
		return proxyId;
	}
	public void setProxyId(int proxyId) {
		this.proxyId = proxyId;
	}

}
