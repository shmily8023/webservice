package com.sunny.service.dao;

import java.util.List;

//��˾��Ϣ
public interface CompanyInfoDao {
	public int addCompanyInfo(String s); // ��ӹ�˾��Ϣ

	public int updateCompanyInfo(String s); // �޸Ĺ�˾��Ϣ

	public int delCompanyInfo(int id);// //ɾ����˾��Ϣ

	public List queryCompanyInfoListAll();// �鿴��˾�б�

	public String queryCompanyInfoDetail(int id);// �鿴��˾��ϸ��Ϣ

}
