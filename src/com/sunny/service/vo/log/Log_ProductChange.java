package com.sunny.service.vo.log;

public class Log_ProductChange {
	// ��Ʒ�䶯��¼======= ���޸�//
	public int ids;// ���
	public int changeProductId;// //�䶯��Ʒ
	public int changeType;// �䶯���� ���Ӽ۸� ���ټ۸� �޸���Ϣ
	public String changeContent;// �䶯 ���� �۸� ��Ч�ڡ�����
	public double changeTime;// �䶯ʱ��
	public String changeUser;// �޸��û�
	
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public int getChangeProductId() {
		return changeProductId;
	}
	public void setChangeProductId(int changeProductId) {
		this.changeProductId = changeProductId;
	}
	public int getChangeType() {
		return changeType;
	}
	public void setChangeType(int changeType) {
		this.changeType = changeType;
	}
	public String getChangeContent() {
		return changeContent;
	}
	public void setChangeContent(String changeContent) {
		this.changeContent = changeContent;
	}
	public double getChangeTime() {
		return changeTime;
	}
	public void setChangeTime(double changeTime) {
		this.changeTime = changeTime;
	}
	public String getChangeUser() {
		return changeUser;
	}
	public void setChangeUser(String changeUser) {
		this.changeUser = changeUser;
	}
	
}
