package com.sunny.service.vo.log;

public class Log_GroupProductSerial {
	public int ids;//���
	public int groupSerialId;//���id
	public long createTime;//����ʱ��
	public int openGroupUser;//������
	public int thisGroupUser;//��ǰ��������
	public String reMark;//��ע
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public int getGroupSerialId() {
		return groupSerialId;
	}
	public void setGroupSerialId(int groupSerialId) {
		this.groupSerialId = groupSerialId;
	}
	public long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}
	public int getOpenGroupUser() {
		return openGroupUser;
	}
	public void setOpenGroupUser(int openGroupUser) {
		this.openGroupUser = openGroupUser;
	}
	public int getThisGroupUser() {
		return thisGroupUser;
	}
	public void setThisGroupUser(int thisGroupUser) {
		this.thisGroupUser = thisGroupUser;
	}
	public String getReMark() {
		return reMark;
	}
	public void setReMark(String reMark) {
		this.reMark = reMark;
	}
	
}
