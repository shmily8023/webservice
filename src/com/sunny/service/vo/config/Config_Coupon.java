package com.sunny.service.vo.config;

public class Config_Coupon {
//===========�Ż�ȯ����===========//
	public String CouponName;	//�Ż�ȯ����
	public String Scenes;	//����:ȫ�� ��Ʒ
	public int total;	//��������
	public int total_person;	//ÿ�˿���ȡ����
	public int isUp;	//�Ƿ��ϼ�
	public double amount;	//�Ż�ȯ���
    public int productId;//��Ʒ�Ĳ�ƷId
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
