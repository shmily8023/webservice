package com.sunny.service.vo.log;


public class Log_Contract {
//��ͬ��¼�� --�ƻ�����
	public int ids;// ���
	public int ContractId;// ��ͬ���
	public String crycle; // �������� 7 30 90 180 365
	public int supplyId;// //��Ӧ��
	public int proxyId;// //������
	public long createTime;// ����ʱ��
	public String createUser;// �����û�
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
