package com.sunny.service.vo.log;

public class Log_Balance {
//====零钱记录====//
	// 同时查询openId 下零钱 和纸币 分组汇总 。。
	public int ids;//编号
	public int balanceType;// 金额记录类型 [1 微信充值零钱| 1零钱消费| 2提现| 3退款| 4返纸币| 5饭零钱|零钱转智币|智币转零钱]
	public int type;// 类型 零钱|智币|转换
	public String openId;// 用户
	public double amount;// 金额
	public long time;// 时间
	public String reMark;//备注
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public int getBalanceType() {
		return balanceType;
	}
	public void setBalanceType(int balanceType) {
		this.balanceType = balanceType;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public String getReMark() {
		return reMark;
	}
	public void setReMark(String reMark) {
		this.reMark = reMark;
	}
	
	//
}
