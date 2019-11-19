/**
 * 
 */
package com.sunny.service.vo.log;

/**
 * @author admin
 * 报名记录表
 */
public class Log_Entry {
public int ids;//编号
public long entryTime;//报名时间
public int entryType;//报名类型
public int entryProductId;//报名产品
public int entryId;//报名编号
public String reMark;//报名备注
public int getIds() {
	return ids;
}
public void setIds(int ids) {
	this.ids = ids;
}
public long getEntryTime() {
	return entryTime;
}
public void setEntryTime(long entryTime) {
	this.entryTime = entryTime;
}
public int getEntryType() {
	return entryType;
}
public void setEntryType(int entryType) {
	this.entryType = entryType;
}
public int getEntryProductId() {
	return entryProductId;
}
public void setEntryProductId(int entryProductId) {
	this.entryProductId = entryProductId;
}
public int getEntryId() {
	return entryId;
}
public void setEntryId(int entryId) {
	this.entryId = entryId;
}
public String getReMark() {
	return reMark;
}
public void setReMark(String reMark) {
	this.reMark = reMark;
}

}
