package com.sunny.service.vo.log;

public class Log_BackUp {
//========������־ ==============//
	public int ids;//���
	public int backUpType;// �������� [ 0����| 1ȫ��]
	public int backUpMethod;// ���ݷ�ʽ [ 0�ֶ�| 1�Զ�]
	public long backUpTime;// ����ʱ��
	public int fileSize;// �����ļ���С
	public String backUpFilePath;// �����ļ�·��
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public int getBackUpType() {
		return backUpType;
	}
	public void setBackUpType(int backUpType) {
		this.backUpType = backUpType;
	}
	public int getBackUpMethod() {
		return backUpMethod;
	}
	public void setBackUpMethod(int backUpMethod) {
		this.backUpMethod = backUpMethod;
	}
	public long getBackUpTime() {
		return backUpTime;
	}
	public void setBackUpTime(long backUpTime) {
		this.backUpTime = backUpTime;
	}
	public int getFileSize() {
		return fileSize;
	}
	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}
	public String getBackUpFilePath() {
		return backUpFilePath;
	}
	public void setBackUpFilePath(String backUpFilePath) {
		this.backUpFilePath = backUpFilePath;
	}
	
}
