package com.sunny.service.vo.log;

public class Log_UserAccess {
//�û�������ʼ�¼
	public int ids;//���
	public int oderId;//��������Id
	public int accessType;//��ȡ��ʽ:���֤��ȡ������ά��ɨ������������
	public int accessTag;//��֤��ʽ[������/���֤/����]
	public int userType;//��Ա���� �����̶���Ա��ƽ̨������Ա����ʱ������Ա
	//��ʱ�û��б�
	public long revVerifyTime;//����ʱ��
	public int reVerifyNum;//��������:����/����
	public int reVerifyUser;//�����û�
	//����볡��
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public int getOderId() {
		return oderId;
	}
	public void setOderId(int oderId) {
		this.oderId = oderId;
	}
	public int getAccessType() {
		return accessType;
	}
	public void setAccessType(int accessType) {
		this.accessType = accessType;
	}
	public int getAccessTag() {
		return accessTag;
	}
	public void setAccessTag(int accessTag) {
		this.accessTag = accessTag;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public long getRevVerifyTime() {
		return revVerifyTime;
	}
	public void setRevVerifyTime(long revVerifyTime) {
		this.revVerifyTime = revVerifyTime;
	}
	public int getReVerifyNum() {
		return reVerifyNum;
	}
	public void setReVerifyNum(int reVerifyNum) {
		this.reVerifyNum = reVerifyNum;
	}
	public int getReVerifyUser() {
		return reVerifyUser;
	}
	public void setReVerifyUser(int reVerifyUser) {
		this.reVerifyUser = reVerifyUser;
	}
	
}
