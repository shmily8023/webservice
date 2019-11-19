package com.sunny.service.vo.base;

public class Group {
//===========团队信息表=============//
	public int noneType;// 免票种类
	public int applyReson;// 申请事由
	public int applyOrg;// 申请组织
	public long applyTime;// 申请时间
	public long outTime;// 出发时间
	public int applyRemark;// 申请备注
	public int outPerson;// 出发人数
	public double amout;//// 审批过的团队金额
	public int groupStatus;//状态 检票审核 财务审核 经理 
	public String ticketPerson; // 检票审核人
	public String finacePerson;// 财务审核人
	public String managerPerson;// 经理审核人
	public long ticketPersonTime; // 检票审核时间
	public long finacePersonTime;// 财务审核时间
	public long managerPersonTime;// 经理审核时间
	public int supplyId;//供应商编号 --景区编号
	public int proxyId;//代理商编号

	public int getNoneType() {
		return noneType;
	}
	public void setNoneType(int noneType) {
		this.noneType = noneType;
	}
	public int getApplyReson() {
		return applyReson;
	}
	public void setApplyReson(int applyReson) {
		this.applyReson = applyReson;
	}
	public int getApplyOrg() {
		return applyOrg;
	}
	public void setApplyOrg(int applyOrg) {
		this.applyOrg = applyOrg;
	}
	public long getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(long applyTime) {
		this.applyTime = applyTime;
	}
	public long getOutTime() {
		return outTime;
	}
	public void setOutTime(long outTime) {
		this.outTime = outTime;
	}
	public int getApplyRemark() {
		return applyRemark;
	}
	public void setApplyRemark(int applyRemark) {
		this.applyRemark = applyRemark;
	}
	public int getOutPerson() {
		return outPerson;
	}
	public void setOutPerson(int outPerson) {
		this.outPerson = outPerson;
	}
	public double getAmout() {
		return amout;
	}
	public void setAmout(double amout) {
		this.amout = amout;
	}
	public int getGroupStatus() {
		return groupStatus;
	}
	public void setGroupStatus(int groupStatus) {
		this.groupStatus = groupStatus;
	}
	public String getTicketPerson() {
		return ticketPerson;
	}
	public void setTicketPerson(String ticketPerson) {
		this.ticketPerson = ticketPerson;
	}
	public String getFinacePerson() {
		return finacePerson;
	}
	public void setFinacePerson(String finacePerson) {
		this.finacePerson = finacePerson;
	}
	public String getManagerPerson() {
		return managerPerson;
	}
	public void setManagerPerson(String managerPerson) {
		this.managerPerson = managerPerson;
	}
	public long getTicketPersonTime() {
		return ticketPersonTime;
	}
	public void setTicketPersonTime(long ticketPersonTime) {
		this.ticketPersonTime = ticketPersonTime;
	}
	public long getFinacePersonTime() {
		return finacePersonTime;
	}
	public void setFinacePersonTime(long finacePersonTime) {
		this.finacePersonTime = finacePersonTime;
	}
	public long getManagerPersonTime() {
		return managerPersonTime;
	}
	public void setManagerPersonTime(long managerPersonTime) {
		this.managerPersonTime = managerPersonTime;
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


}
