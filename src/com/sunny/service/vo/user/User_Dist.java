package com.sunny.service.vo.user;

public class User_Dist {

//�����û���--�̶�
	public String userOpenId; // �û� OpenId
	public int level; // ����
	public int registerTime; // �Ǽ�ʱ��
	public int parentId; // �����û�Id ��һ��Ϊ��
	public String getUserOpenId() {
		return userOpenId;
	}
	public void setUserOpenId(String userOpenId) {
		this.userOpenId = userOpenId;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(int registerTime) {
		this.registerTime = registerTime;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	
}
