package com.sunny.service.vo.log;

public class Log_DistUser {
//============�����û���===============/
	public int ids;//���
	public int userId;//�����û����
	public int subId;//�¼��û�id
	public int level;//����
	//select ids,level from distuserLog where userId='' order by limit 1  ����ids
	//select sid from disuserlog where level=level+1 and ids=(���ص�ids); //����sid����
	//select userId from disuerlog where subid='';// sid Ϊ����
	//=======================
//����OpenId���� ���� �������� �����ܶ����� �ܶ������
	//���ݵ���openId ���ҿ������� ��ѯ������ϸ
	//����openId ��ѯ������Ϣ
	/////////////////////////
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getSubId() {
		return subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}

	
}
