package com.sunny.service.vo.log;

public class Log_Ad {
	public int ids;// ���
	public int useAdType;// ʹ�ù������[0-CPC|1-CPM]
	public int toAd; // Ͷ�ŵĹ��Ͷ����
	public int optUser;// �����û�
	public long optTime;// ����ʱ��
	public int adType;// ��� [0��ҳ/ 1 ��Ʒҳ/2 ��֤ҳ/ 3֧�����ҳ]
	public String reMark;//��ע
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public int getUseAdType() {
		return useAdType;
	}
	public void setUseAdType(int useAdType) {
		this.useAdType = useAdType;
	}
	public int getToAd() {
		return toAd;
	}
	public void setToAd(int toAd) {
		this.toAd = toAd;
	}
	public int getOptUser() {
		return optUser;
	}
	public void setOptUser(int optUser) {
		this.optUser = optUser;
	}
	public long getOptTime() {
		return optTime;
	}
	public void setOptTime(long optTime) {
		this.optTime = optTime;
	}
	public int getAdType() {
		return adType;
	}
	public void setAdType(int adType) {
		this.adType = adType;
	}
	public String getReMark() {
		return reMark;
	}
	public void setReMark(String reMark) {
		this.reMark = reMark;
	}
	
}
