package com.sunny.service.vo.config;

public class Config_Post {
//========邮费配置============//
	public int startArea; // 起始地区
	public int endArea; // 结束地区
	public int postAge; // 邮费
	public int getStartArea() {
		return startArea;
	}
	public void setStartArea(int startArea) {
		this.startArea = startArea;
	}
	public int getEndArea() {
		return endArea;
	}
	public void setEndArea(int endArea) {
		this.endArea = endArea;
	}
	public int getPostAge() {
		return postAge;
	}
	public void setPostAge(int postAge) {
		this.postAge = postAge;
	}

}
