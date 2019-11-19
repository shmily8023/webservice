package com.sunny.service.vo.log;

public class Log_BackUp {
//========备份日志 ==============//
	public int ids;//编号
	public int backUpType;// 备份类型 [ 0增量| 1全量]
	public int backUpMethod;// 备份方式 [ 0手动| 1自动]
	public long backUpTime;// 备份时间
	public int fileSize;// 备份文件大小
	public String backUpFilePath;// 备份文件路径
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
