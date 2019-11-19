package com.sunny.service.vo.base;

public class Student {
	public int ids;//编号
	public String name;	//姓名
	public String xh;		//学号
	public String profession;		//专业
	public String cardId;		//身份证号
	public long vaildDate;		//有效期
	public int mobilePhone;		//手机号
	public String imgSrc;		//图片存储路径
	public long checkTime;		//校验时间
	public String checkUser;		//校验人
	public int isCheck;//是否校验
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
	public String getXh() {
		return xh;
	}
	public void setXh(String xh) {
		this.xh = xh;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public long getVaildDate() {
		return vaildDate;
	}
	public void setVaildDate(long vaildDate) {
		this.vaildDate = vaildDate;
	}
	public int getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(int mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getImgSrc() {
		return imgSrc;
	}
	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}
	public long getCheckTime() {
		return checkTime;
	}
	public void setCheckTime(long checkTime) {
		this.checkTime = checkTime;
	}
	public String getCheckUser() {
		return checkUser;
	}
	public void setCheckUser(String checkUser) {
		this.checkUser = checkUser;
	}
	public int getIsCheck() {
		return isCheck;
	}
	public void setIsCheck(int isCheck) {
		this.isCheck = isCheck;
	}



}
