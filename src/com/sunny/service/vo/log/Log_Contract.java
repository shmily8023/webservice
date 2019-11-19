package com.sunny.service.vo.log;


public class Log_Contract {
//合同记录表 --计划任务
	public int ids;// 编号
	public int ContractId;// 合同编号
	public String crycle; // 结账周期 7 30 90 180 365
	public int supplyId;// //供应商
	public int proxyId;// //代理商
	public long createTime;// 创建时间
	public String createUser;// 创建用户
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public int getContractId() {
		return ContractId;
	}
	public void setContractId(int contractId) {
		ContractId = contractId;
	}
	public String getCrycle() {
		return crycle;
	}
	public void setCrycle(String crycle) {
		this.crycle = crycle;
	}

	public int getSupplyId() {
		return supplyId;
	}
	public void setSupplyId(int supplyId) {
		this.supplyId = supplyId;
	}
	public int getProxyId() {
		return proxyId;
	}
	public void setProxyId(int proxyId) {
		this.proxyId = proxyId;
	}
	public long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	
}
