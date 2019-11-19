package com.sunny.service.vo.user;

public class ProxyUser {
	public String proxyName; // 代理商名字
	public int companyId; // 代理商公司信息
	public String account;// 账号
	public String password;// 密码
	public int isStop; // 是否停用
	public int area;// 代理商区域
	public String areaPhone;// 代理商区域联系方式
	public String areaName;// 代理商区域姓名
	public int marginAmount;//保证金金额
	public String proxyRemark;// 代理商备注
	
	
	public String getProxyName() {
		return proxyName;
	}
	public void setProxyName(String proxyName) {
		this.proxyName = proxyName;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getIsStop() {
		return isStop;
	}
	public void setIsStop(int isStop) {
		this.isStop = isStop;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public String getAreaPhone() {
		return areaPhone;
	}
	public void setAreaPhone(String areaPhone) {
		this.areaPhone = areaPhone;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	
	public int getMarginAmount() {
		return marginAmount;
	}
	public void setMarginAmount(int marginAmount) {
		this.marginAmount = marginAmount;
	}
	public String getProxyRemark() {
		return proxyRemark;
	}
	public void setProxyRemark(String proxyRemark) {
		this.proxyRemark = proxyRemark;
	}


}
