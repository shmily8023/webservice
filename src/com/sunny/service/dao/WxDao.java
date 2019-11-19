package com.sunny.service.dao;

//΢�Žӿ� ���ýӿ�
public interface WxDao {
	public int addWxConfig(); // ���

	public int modifyWxConfig(); // �޸�

	public int delWxConfig(); // ɾ��

	public int testWxConfig();// ����΢�Žӿ��Ƿ���Ч

	public int getUserTag();// ��ȡ�û���ǩ

	public int getUserGroup();// ��ȡ�û�����

	public int setUserTag();// �����û���ǩ

	public int setUserGroup();// �����û�����

	public int getUserList();// ��ȡ�û��б�

	public int getUserDetail();// ��ȡ�û�����

	public int sendSubscribeMessage();// ���͹�ע��Ϣ

	public int sendNoSubscribeMessage();// ����δ������Ϣ

	public int sendKeyWordMessage();// ���͹ؼ�����Ϣ

	public int uploadPic();//�ϴ�ͼƬ

	public int uploadVideo();//�ϴ���Ƶ

	public int uploadAudio();//�ϴ���Ƶ

	public int sendGroupTextMessage();//Ⱥ���ı���Ϣ

	public int sendGroupPicMessage();//Ⱥ��ͼƬ��Ϣ

	public int sendGroupVideoMessage();//Ⱥ����Ƶ��Ϣ

	public int sendGroupAudioMessage();//Ⱥ����Ƶ��Ϣ

	public int createMenu();//�����˵�

	public int getMenu();//��ȡ�˵�

	public int delMenu();//ɾ���˵�

	public int setUserRemark();// �����û���ע

	public int getBlockUserList();// ��ȡ�������б�

	public int setBlockUser();// �����û�

	public int transToShortUrl();//������ת������

	public int getUserSummary();// ��ȡ�û��������� 7
								// https://api.weixin.qq.com/datacube/getusersummary?access_token=ACCESS_TOKEN

	public int getUserCumulate();// ��ȡ�ۼ��û����� 7
									// https://api.weixin.qq.com/datacube/getusercumulate?access_token=ACCESS_TOKEN

	public int getArticleSummary();// ��ȡͼ��Ⱥ��ÿ������ 1
									// https://api.weixin.qq.com/datacube/getarticlesummary?access_token=ACCESS_TOKEN

	public int getArticleTotal();// ��ȡͼ��Ⱥ�������� 1
									// https://api.weixin.qq.com/datacube/getarticletotal?access_token=ACCESS_TOKEN

	public int getUserRead();// ��ȡͼ��ͳ������ 3
								// https://api.weixin.qq.com/datacube/getuserread?access_token=ACCESS_TOKEN

	public int getUserReadHour();// ��ȡͼ��ͳ�Ʒ�ʱ���� 1
									// https://api.weixin.qq.com/datacube/getuserreadhour?access_token=ACCESS_TOKEN

	public int getUserShare();// ��ȡͼ�ķ���ת������ 7
								// https://api.weixin.qq.com/datacube/getusershare?access_token=ACCESS_TOKEN

	public int getUserShareHour();// ��ȡͼ�ķ���ת����ʱ���� 1
									// https://api.weixin.qq.com/datacube/getusersharehour?access_token=ACCESS_TOKEN
//������֤�¼�
//============

	public int getInterfaceSummary();// ��ȡ�ӿڷ������� 30
										// https://api.weixin.qq.com/datacube/getinterfacesummary?access_token=ACCESS_TOKEN

	public int getInterfaceSummaryHour();// ��ȡ�ӿڷ�����ʱ���� 1
											// https://api.weixin.qq.com/datacube/getinterfacesummaryhour?access_token=ACCESS_TOKEN
//{ 
	// "begin_date": "2014-12-07",
//    "end_date": "2014-12-07"
//}
//============

}
