package com.sunny.service.vo.log;

public class Log_Ad {
	public int ids;// 编号
	public int useAdType;// 使用广告类型[0-CPC|1-CPM]
	public int toAd; // 投放的广告投入商
	public int optUser;// 操作用户
	public long optTime;// 操作时间
	public int adType;// 广告 [0首页/ 1 产品页/2 验证页/ 3支付结果页]
	public String reMark;//备注
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public int getUseAdType() {
		return useAdType;
	}
	public void setUseAdType(int useAdType) {
		this.useAdType = useAdType;
	}
	public int getToAd() {
		return toAd;
	}
	public void setToAd(int toAd) {
		this.toAd = toAd;
	}
	public int getOptUser() {
		return optUser;
	}
	public void setOptUser(int optUser) {
		this.optUser = optUser;
	}
	public long getOptTime() {
		return optTime;
	}
	public void setOptTime(long optTime) {
		this.optTime = optTime;
	}
	public int getAdType() {
		return adType;
	}
	public void setAdType(int adType) {
		this.adType = adType;
	}
	public String getReMark() {
		return reMark;
	}
	public void setReMark(String reMark) {
		this.reMark = reMark;
	}
	
}
