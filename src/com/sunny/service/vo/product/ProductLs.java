package com.sunny.service.vo.product;

//零食产品
public class ProductLs {
	public int ids;//// 产品编号
	public String productName; // 产品名称
	public String productDw; // 产品单位
	public double productPrice; // 产品价格
	public long addTime; // 添加时间
	public String addUser; // 添加用户
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDw() {
		return productDw;
	}
	public void setProductDw(String productDw) {
		this.productDw = productDw;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public long getAddTime() {
		return addTime;
	}
	public void setAddTime(long addTime) {
		this.addTime = addTime;
	}
	public String getAddUser() {
		return addUser;
	}
	public void setAddUser(String addUser) {
		this.addUser = addUser;
	}

}
