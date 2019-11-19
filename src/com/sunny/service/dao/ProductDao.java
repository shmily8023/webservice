package com.sunny.service.dao;

public interface ProductDao {
	public int setProductSwitch(int productId, int productType, int productSwitch);// ���ò�Ʒ���¼�״̬

	public String getProductSwitch(int productId, int productType);// ��ȡ��Ʒ���¼�״̬

	public int purchaseProduct_Costomer(String s);// �����߹���

	public int purchaseProduct_Supply(String s);// ��Ӧ�̹���

	public int purchaseProductLs_Customer(String s);// ��������ʳ����
	public int addProductLs(String s);// ��ʳ��Ʒ���
	public int addProductStandTicket(String s);// ��ͨ��Ʊ��Ʒ���

	public int addProductBargain(String s);// ���۲�Ʒ���

	public int addProductIntegral(String s);// ���ֲ�Ʒ���

	public int addProductGroup(String s);// ƴ�Ų�Ʒ���

	public int addProductLimit(String s);// ��ʱ��Ʒ���

	public int addProductPft(String s);// Ʊ��ͨ��Ʒ���

	public int addProductUnion(String s);// ���ϲ�Ʒ���

	public int addProductArea(String s);// �����Ʒ���
	public int modifyProductLs(int ids,String productName,String productPrice);// ��ʳ��Ʒ�޸�
	public int modifyProductStandTicket(String s);// ��ͨ��Ʊ��Ʒ�޸�

	public int modifyProductBargain(String s);// ���۲�Ʒ�޸�

	public int modifyProductIntegral(String s);// ���ֲ�Ʒ�޸�

	public int modifyProductGroup(String s);// ƴ�Ų�Ʒ�޸�

	public int modifyProductLimit(String s);// ��ʱ��Ʒ�޸�

	public int modifyProductPft(String s);// Ʊ��ͨ��Ʒ�޸�

	public int modifyProductUnion(String s);// ���ϲ�Ʒ�޸�

	public int modifyProductArea(String s);// �����Ʒ�޸�
	public int delProductLs(int id);// ��ʳ��Ʒɾ��
	public int delProductStandTicket(int id);// ��ͨ��Ʊ��Ʒɾ��

	public int delProductBargain(int id);// ���۲�Ʒɾ��

	public int delProductIntegral(int id);// ���ֲ�Ʒɾ��

	public int delProductGroup(int id);// ƴ�Ų�Ʒɾ��

	public int delProductLimit(int id);// ��ʱ��Ʒɾ��

	public int delProductPft(int id);// Ʊ��ͨ��Ʒɾ��

	public int delProductUnion(int id);// ���ϲ�Ʒɾ��

	public int delProductArea(int id);// �����Ʒɾ��

	public int queryProduct();// ��Ʒ��ѯ����
	public int queryProductLs(String s);// ����ָ��������ѯ��Ʒ��ʳ ���ؼ۸� ��λ
	public int queryProduct(String s);// ����ָ��������ѯ��Ʒ

	public int queryProductAttr(int productId);// ��ѯ��Ʒ����������

	public int queryProductCatalog(int productId);// ���ݲ�Ʒ ��ѯ����

	public int queryProductByCatalog(int catalogId);// ��ѯ�����µĲ�Ʒ

	public int addProductCatalog(String s);// ��Ӳ�Ʒ����

	public int addProductAttr(String s);// ��Ӳ�Ʒ����

	public int delProductCatalog(int id);// ɾ����Ʒ����

	public int delProductAttr(int id);// ɾ����Ʒ����

	public int modifyProductCatalog(String s);// �޸Ĳ�Ʒ����

	public int modifyProductAttr(String s);// �޸Ĳ�Ʒ����

	public int addProductStock(String s);// ��Ʒ�������

	public int addProductComments(String s);// ��Ʒ����

	public int setProductCommentsHidden(boolean hidden);// ������������

	public int addProduct_SimpleProduct(String s);// ����Ŀ����

	public int modifyProduct_SimpleProduct(String s);// ����Ŀ�޸� ������Ϣ ��Ʊ��Ա����

	public int delProduct_SimpleProduct(int id);// ����Ŀɾ��
	
}
