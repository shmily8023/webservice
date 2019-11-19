package com.sunny.service.vo.log;

public class Log_SysOpt {
//==========系统操作日志==============
	public int ids;//编号
	public int mcc;
	public int mnc;
	public int lac;
	public int cid;
	public String ip;
	public double[] LangLat;
	public String browser;// //UA 抽取的浏览器
	public String ua;
	public int OperationSystem;// //操作系统 IOS ANDROID WP WINDOWS LINUX
	public int imei1; // IMEI
	public int imei2; // IMEI2
	public int meid;// MEID
	public String operationSystemVersion;// //操作系统版本
	public String operationUser;// 操作用户 而非操作系统用户
	public long operationTime;// 操作时间
	public String logLevel;// //日志级别 WARNING INFO...
	public String optType;// 操作类型
	/*
	 * 菜单 创建 删除 查询
群发消息 新增临时 新增永久 获取临时 获取永久 删除永久 修改永久图文 获取素材总数 获取素材列表 
获取用户基本信息 用户打标签 用户打分组 用户拉黑用户取消拉黑 获取用户列表 设置用户备注
	 */
	public String reMark;//备注
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
