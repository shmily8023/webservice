package com.sunny.service.vo.config;

public class AliPayConfig {
//========֧��������===========//
	public int account; // �˻�
	public int pid; // PID
	public String key; // KEY
	public String partnerPrivateKey; // ������˽Կ
	public String publicPublicKey; // ֧������Կ
	public int proxyId;//������id
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
