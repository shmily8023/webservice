package com.sunny.service.vo.log;

public class Log_Token {
//token ��¼
	public int ids;//���
	public int appId;// appid
	public long getTime;// ��ȡʱ��
	public long expireTime;// ����ʱ��
	public long nextTime;// ��һ�λ�ȡʱ��
	public String token;// token ֵ
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public int getAppId() {
		return appId;
	}
	public void setAppId(int appId) {
		this.appId = appId;
	}
	public long getGetTime() {
		return getTime;
	}
	public void setGetTime(long getTime) {
		this.getTime = getTime;
	}
	public long getExpireTime() {
		return expireTime;
	}
	public void setExpireTime(long expireTime) {
		this.expireTime = expireTime;
	}
	public long getNextTime() {
		return nextTime;
	}
	public void setNextTime(long nextTime) {
		this.nextTime = nextTime;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
}
