package com.sunny.service.vo.user;

public class UserBind {
//用户绑定信息=== 微信与用户绑定 --实名与绑定信息
	public int ids;//编号
	public String openId; // openid openId 唯一标识
	public String account;// //账号
	public String password;// //密码
	public String salt;// 加盐
	public String realName;// 姓名
	public int sex;// 性别
	public String cardId;// 身份证号
	public String birthDay;// 出生日期
	public String mz;// 民族
	public String jg;// 籍贯
	public String address; // 地址
	public String issue;// 签发机关
	public String vaildDate; // 有效期
	public String tel; // 电话
	public int isCheck; // 是否核验
	public int checkPerson; // 核验人
	public int checkTime; // 核验日期
	public int pcLastLoginTime; // pc 最后登录
	public int wapLastLoginTime; // wap 最后一次登录
	public int appLastLoginTime; // app 最后一次登录
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public String getMz() {
		return mz;
	}
	public void setMz(String mz) {
		this.mz = mz;
	}
	public String getJg() {
		return jg;
	}
	public void setJg(String jg) {
		this.jg = jg;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public String getVaildDate() {
		return vaildDate;
	}
	public void setVaildDate(String vaildDate) {
		this.vaildDate = vaildDate;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getIsCheck() {
		return isCheck;
	}
	public void setIsCheck(int isCheck) {
		this.isCheck = isCheck;
	}
	public int getCheckPerson() {
		return checkPerson;
	}
	public void setCheckPerson(int checkPerson) {
		this.checkPerson = checkPerson;
	}
	public int getCheckTime() {
		return checkTime;
	}
	public void setCheckTime(int checkTime) {
		this.checkTime = checkTime;
	}
	public int getPcLastLoginTime() {
		return pcLastLoginTime;
	}
	public void setPcLastLoginTime(int pcLastLoginTime) {
		this.pcLastLoginTime = pcLastLoginTime;
	}
	public int getWapLastLoginTime() {
		return wapLastLoginTime;
	}
	public void setWapLastLoginTime(int wapLastLoginTime) {
		this.wapLastLoginTime = wapLastLoginTime;
	}
	public int getAppLastLoginTime() {
		return appLastLoginTime;
	}
	public void setAppLastLoginTime(int appLastLoginTime) {
		this.appLastLoginTime = appLastLoginTime;
	}

}
