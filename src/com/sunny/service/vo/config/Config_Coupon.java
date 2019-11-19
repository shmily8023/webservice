package com.sunny.service.vo.config;

public class Config_Coupon {
//===========优惠券配置===========//
	public String CouponName;	//优惠券名称
	public String Scenes;	//场景:全场 单品
	public int total;	//发行总量
	public int total_person;	//每人可领取总数
	public int isUp;	//是否上架
	public double amount;	//优惠券金额
    public int productId;//单品的产品Id
	public String getCouponName() {
		return CouponName;
	}
	public void setCouponName(String couponName) {
		CouponName = couponName;
	}
	public String getScenes() {
		return Scenes;
	}
	public void setScenes(String scenes) {
		Scenes = scenes;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTotal_person() {
		return total_person;
	}
	public void setTotal_person(int total_person) {
		this.total_person = total_person;
	}
	public int getIsUp() {
		return isUp;
	}
	public void setIsUp(int isUp) {
		this.isUp = isUp;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}





}
