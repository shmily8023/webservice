package com.sunny.service.vo.log;
//砍价序号表
public class Log_BargainProductSerial {

	public int ids;//编号
	public int createUser;//创建砍价人
	public int creatTime;//创建砍价时间
	public int bargainProductId;//砍价产品id
	//砍价时间是付款后的24小时之内噢
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}

	public int getCreateUser() {
		return createUser;
	}
	public void setCreateUser(int createUser) {
		this.createUser = createUser;
	}


	
	//统计砍价结果
	
	
}
