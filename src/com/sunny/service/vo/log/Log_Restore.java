package com.sunny.service.vo.log;

public class Log_Restore {

//========数据恢复日志========//
	// 不可操作恢复 在备份里面操作恢复 此类仅仅记录恢复记录
	public int ids;//编号
	public int restoreType;// //恢复类型 ：全量 增量
	public long restoreTime;// 恢复开始时间
	public String retoreUser;// 恢复用户
	public int restoreStatus;// 恢复状态
	public long restoreEndTime;// 恢复结束时间
	public String reMark;//备注
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public int getRestoreType() {
		return restoreType;
	}
	public void setRestoreType(int restoreType) {
		this.restoreType = restoreType;
	}
	public long getRestoreTime() {
		return restoreTime;
	}
	public void setRestoreTime(long restoreTime) {
		this.restoreTime = restoreTime;
	}
	public String getRetoreUser() {
		return retoreUser;
	}
	public void setRetoreUser(String retoreUser) {
		this.retoreUser = retoreUser;
	}
	public int getRestoreStatus() {
		return restoreStatus;
	}
	public void setRestoreStatus(int restoreStatus) {
		this.restoreStatus = restoreStatus;
	}
	public long getRestoreEndTime() {
		return restoreEndTime;
	}
	public void setRestoreEndTime(long restoreEndTime) {
		this.restoreEndTime = restoreEndTime;
	}
	public String getReMark() {
		return reMark;
	}
	public void setReMark(String reMark) {
		this.reMark = reMark;
	}
	

}
