package com.sunny.service.util;

public class SignUtil {
//ǩ������
	
	public boolean getIsConSign(String id) {
		return true;
//�ж��Ƿ�����ǩ��
	}

	public int getSign(String id) {
		return 3;
		// �����û� ��ȡ��ǰ��ǩ������
	}

	public int getConSign(int myid) {
		//��ȡ�Ѿ�����ǩ���������ȡ�Ļ���ֵ
		int mys=0;
		switch (myid) {
		case 1:
			mys = 1;
			// System.out.println("test:"+1);
			break;
		case 2:
			mys = 2;
			// System.out.println("test:"+2);
			 break;
		case 3:
			mys = 3;
			// System.out.println("test:"+3);
			 break;
		case 4:
			mys = 4;
			 //System.out.println("test:"+4);
			 break;
		case 5:
			mys = 5;
			// System.out.println("test:"+5);
			 break;
		case 6:
			mys = 6;
			// System.out.println("test:"+6);
			 break;
		case 7:
			mys = 7;
			// System.out.println("test:"+7);
			 break;
		case 8:
			mys = 8;
			// System.out.println("test:"+8);
			 break;
		}
		return mys;
		// ��ȡ��ǩ������
	}

	public void checkSign(String id) {

		int m = getSign(id);
		if (m <= 1) {
			// ��һ��ǩ�� ��¼ǩ��
			System.out.print(m);
		} else {
			boolean isCon = getIsConSign("1");// �ж��Ƿ�����ǩ��
			if (isCon == true) {
				int a = 3;// �Ѿ�ǩ��������
 int myc=getConSign(a);
 System.out.println("���⽱��:"+myc);
				// ��ȡ�Ѿ�����ǩ��������
				// ��ȡ��ǩ���Ķ��⽱��
			} else {
				// ������ǩ������ ���¼���ǩ�� ����ǩ������Ϊ0

			}
			// ����Ƿ�����ǩ��
			//System.out.print("else:" + m);
		}
	}
}
