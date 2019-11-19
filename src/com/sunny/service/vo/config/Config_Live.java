package com.sunny.service.vo.config;

public class Config_Live {

//==========直播配置==========//
	public String liveTitle;// 直播标题
	public String liveWebSite;// 直播网址
	public int liveStatus;// 直播状态 开启关闭
	public int isHidden;// 直播隐藏
	public String liveFlag;// 标志 如南门
	public int supplyId;//供应商Id
	public String getLiveTitle() {
		return liveTitle;
	}
	public void setLiveTitle(String liveTitle) {
		this.liveTitle = liveTitle;
	}
	public String getLiveWebSite() {
		return liveWebSite;
	}
	public void setLiveWebSite(String liveWebSite) {
		this.liveWebSite = liveWebSite;
	}
	public int getLiveStatus() {
		return liveStatus;
	}
	public void setLiveStatus(int liveStatus) {
		this.liveStatus = liveStatus;
	}
	public int getIsHidden() {
		return isHidden;
	}
	public void setIsHidden(int isHidden) {
		this.isHidden = isHidden;
	}
	public String getLiveFlag() {
		return liveFlag;
	}
	public void setLiveFlag(String liveFlag) {
		this.liveFlag = liveFlag;
	}
	public int getSupplyId() {
		return supplyId;
	}
	public void setSupplyId(int supplyId) {
		this.supplyId = supplyId;
	}
	
}
