package com.sunny.service.vo.log;

public class Log_SysOpt {
//==========ϵͳ������־==============
	public int ids;//���
	public int mcc;
	public int mnc;
	public int lac;
	public int cid;
	public String ip;
	public double[] LangLat;
	public String browser;// //UA ��ȡ�������
	public String ua;
	public int OperationSystem;// //����ϵͳ IOS ANDROID WP WINDOWS LINUX
	public int imei1; // IMEI
	public int imei2; // IMEI2
	public int meid;// MEID
	public String operationSystemVersion;// //����ϵͳ�汾
	public String operationUser;// �����û� ���ǲ���ϵͳ�û�
	public long operationTime;// ����ʱ��
	public String logLevel;// //��־���� WARNING INFO...
	public String optType;// ��������
	/*
	 * �˵� ���� ɾ�� ��ѯ
Ⱥ����Ϣ ������ʱ �������� ��ȡ��ʱ ��ȡ���� ɾ������ �޸�����ͼ�� ��ȡ�ز����� ��ȡ�ز��б� 
��ȡ�û�������Ϣ �û����ǩ �û������ �û������û�ȡ������ ��ȡ�û��б� �����û���ע
	 */
	public String reMark;//��ע
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public int getMcc() {
		return mcc;
	}
	public void setMcc(int mcc) {
		this.mcc = mcc;
	}
	public int getMnc() {
		return mnc;
	}
	public void setMnc(int mnc) {
		this.mnc = mnc;
	}
	public int getLac() {
		return lac;
	}
	public void setLac(int lac) {
		this.lac = lac;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public double[] getLangLat() {
		return LangLat;
	}
	public void setLangLat(double[] langLat) {
		LangLat = langLat;
	}
	public String getBrowser() {
		return browser;
	}
	public void setBrowser(String browser) {
		this.browser = browser;
	}
	public String getUa() {
		return ua;
	}
	public void setUa(String ua) {
		this.ua = ua;
	}
	public int getOperationSystem() {
		return OperationSystem;
	}
	public void setOperationSystem(int operationSystem) {
		OperationSystem = operationSystem;
	}
	public int getImei1() {
		return imei1;
	}
	public void setImei1(int imei1) {
		this.imei1 = imei1;
	}
	public int getImei2() {
		return imei2;
	}
	public void setImei2(int imei2) {
		this.imei2 = imei2;
	}
	public int getMeid() {
		return meid;
	}
	public void setMeid(int meid) {
		this.meid = meid;
	}
	public String getOperationSystemVersion() {
		return operationSystemVersion;
	}
	public void setOperationSystemVersion(String operationSystemVersion) {
		this.operationSystemVersion = operationSystemVersion;
	}
	public String getOperationUser() {
		return operationUser;
	}
	public void setOperationUser(String operationUser) {
		this.operationUser = operationUser;
	}
	public long getOperationTime() {
		return operationTime;
	}
	public void setOperationTime(long operationTime) {
		this.operationTime = operationTime;
	}
	public String getLogLevel() {
		return logLevel;
	}
	public void setLogLevel(String logLevel) {
		this.logLevel = logLevel;
	}
	public String getOptType() {
		return optType;
	}
	public void setOptType(String optType) {
		this.optType = optType;
	}
	public String getReMark() {
		return reMark;
	}
	public void setReMark(String reMark) {
		this.reMark = reMark;
	}
	
}
