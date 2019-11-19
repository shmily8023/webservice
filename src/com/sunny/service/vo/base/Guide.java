package com.sunny.service.vo.base;

public class Guide {
	public int ids;// 编号
	public String name;// 姓名
	public long vaildDate;// 有效期
	public String cardId;// 身份证号
	public String mobilePhone;// 手机号
	public String imgSrc; // 图片路径
	public int isCheck; // 是否校验
	public String checkUser;// 校验人
	public long checkTime;// 校验时间
	public String guideCardId;// 导游证号
	public String language;// 导游语种
	public String org;// 机构
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getVaildDate() {
		return vaildDate;
	}
	public void setVaildDate(long vaildDate) {
		this.vaildDate = vaildDate;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getImgSrc() {
		return imgSrc;
	}
	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}
	public int getIsCheck() {
		return isCheck;
	}
	public void setIsCheck(int isCheck) {
		this.isCheck = isCheck;
	}
	public String getCheckUser() {
		return checkUser;
	}
	public void setCheckUser(String checkUser) {
		this.checkUser = checkUser;
	}
	public long getCheckTime() {
		return checkTime;
	}
	public void setCheckTime(long checkTime) {
		this.checkTime = checkTime;
	}
	public String getGuideCardId() {
		return guideCardId;
	}
	public void setGuideCardId(String guideCardId) {
		this.guideCardId = guideCardId;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getOrg() {
		return org;
	}
	public void setOrg(String org) {
		this.org = org;
	}

}
