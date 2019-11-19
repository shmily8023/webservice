package com.sunny.service.dao;

public interface LogDao {
//��־�йؽӿ� --��ز�ѯ��
	public int addAccidentInsurance(String s);// ���������

	public int queryAccidentInsuranceList();// ����һ���û�������������

	public int queryAccidentInsuranceListDetail();// ����һ���û����������յ���ϸ��Ϣ

	public int addAccountsListLog(String s);// ���˼�¼���

	public int queryAccountsListLog(String s);// ָ���������Ҷ��˼�¼

	public int addBalanceLog(String s);// ��Ǯ�ǱҼ�¼ ���

	public int queryBalanceLog(String s);// ��Ǯ�ǱҼ�¼ ��������

	public int queryBalanceLogAll();// ��Ǯ�ǱҼ�����

	public int applyCashLog(String s);// ��������

	public int queryCashLog(String s);// ���Ҵ����ֵ��б�

	public int queryCashLogDetail();// ����ָ�������������ϸ��Ϣ

	public int checkCashLog(int id);// �������

	public int addContract(String s);// ��Ӻ�ͬ

	public int receiveCoupon(String s);// �Ż�ȯ��ȡ ��ȡ�Ż�ȯ��

	public int addDealLog(String s);// ���׼�¼���

	public int queryDealLogAll();// ���׼�¼��ѯ����

	public int queryDealLog(String s);// ����ָ��������ѯ

	public int updateDealLog(int id); // ���׼�¼ ֧��״̬�޸�

	public int addExpressLog();// ��ӿ����Ϣ

	public int queryExpressLog();// ��ѯ���п�ݼ�¼

	public int queryExpressLog(String s);// ����ָ��������ѯ��ݼ�¼

	public int queryExpressStatus(String com, String num);// ��ѯ��ݵ�ǰ״̬ com:��ݹ�˾ num ����

	public int addFeedbackLogSuggest();// �������-����

	public int queryFeedbackLog();// ��ѯ������������б�

	public int queryFeedbackLog(String s);// ����������ѯ��������б�

	public int addFeedbackLogReply();// �������-�ش𣺸���id �鿴�ش�

	public int queryFeedbackLogReply();// ����id �鿴�ش�

	public int addSearchLog();// ������¼

	public int getHotSearch();// ��ȡ��������

	public int addSendLog();// ���ͼ�¼ ���� ģ��

	public int addSysOptLog();// ϵͳ��־���

	public int getSysOptLog();// ������������ϵͳ��־

	public int addTokenLog();// token ��־��¼

	public int getTokenLog();// ��ȡtoken��Ϣ ʱ�� token

	public int addUserAccessLog();// �û����ʼ�¼

}
