/**
 * 
 */
package com.sunny.service.vo.log;

/**
 * @author admin
 * ������¼��
 */
public class Log_Entry {
public int ids;//���
public long entryTime;//����ʱ��
public int entryType;//��������
public int entryProductId;//������Ʒ
public int entryId;//�������
public String reMark;//������ע
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
