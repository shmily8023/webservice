package com.sunny.service.vo.config;

public class Config_Dist {
//������Ϊ����
	public int DistNum; // ������
	public int DistAmount; // �ܵ��ӽ��
	public int DistSimpleAmount; // ����ӽ����ڶ���
	public int FulfilRequirements;// A&B A|B A&C A|C B&C B|C A&B&C A|B|C
	public int getDistNum() {
		return DistNum;
	}
	public void setDistNum(int distNum) {
		DistNum = distNum;
	}
	public int getDistAmount() {
		return DistAmount;
	}
	public void setDistAmount(int distAmount) {
		DistAmount = distAmount;
	}
	public int getDistSimpleAmount() {
		return DistSimpleAmount;
	}
	public void setDistSimpleAmount(int distSimpleAmount) {
		DistSimpleAmount = distSimpleAmount;
	}
	public int getFulfilRequirements() {
		return FulfilRequirements;
	}
	public void setFulfilRequirements(int fulfilRequirements) {
		FulfilRequirements = fulfilRequirements;
	}
	
}
