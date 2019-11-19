package com.sunny.service.util;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import sun.net.util.IPAddressUtil;

public class Util {
//�˽�߲���
	// �Ż�ȯ������
	// ǩ������
	// �Զ��¼�[��治��/����/���߶���]
	// �Զ��ϼ�: [����Ҫ���Զ��ϼ�/���Զ��ϼ�] ��ӿ��ʱ �ж��Ƿ� �Զ��ϼ� �� ����0 �Զ��ϼ�
//&t=ʱ��  &lid ��������� &hash����ֵ ��˴���ǰ�� ---
	// JZ HXZ JID TXZ TBZ VSA OTH GID JLZ 11 hvz JZ1 SBZ HKB JGZ TSZ
	// ���������� ��֤��
	// ��Ӧ������ ��֤��
	// ��Ȿ���
	// :md5 Сд
	// ������¼��
	// ���۲����¼��
	// �������
	// ��� ��� β��Ϊ1 ��һ�ⵥ ������ ���;�����Ʊ
	// ��ӵ�Ĳ�Ʒ����¼
	// ������Ӵ����̺� ��Ӧ�̺�
	// ��ؽӿڵĲ�ѯ����
	// �ӿ����----����ӿ� ---ʵ�ֽӿ�
	// ����dao �������� ���ݲ���
	// ��Ӻ�ͬ ��ͬ��ر�
	// �ж�ua
	// ���񱣴��
	// ����ת�� ת��״̬ ת��ʱ�� ת���û�
	// Ʊ��ͨ �������
	// �ؼ��ʿ�
	// �ϴ�����
	// ������� ���֤��Ԫ�� �ֻ�����Ԫ��
	// �Ƿ��ת�� ��Ӧ�̺� �����̺�
	// �жϾ�γ���Ƿ��ڴ˷�Χ
	// ��������
	// ������������
	// �ֶ� person user UserId OpenId Account
	// name ProductName ������Ʒ����
	// ѡ����Ա[�Ӱ�|�½����֤��|....] �жϿ�Ʊ���� ---��������Ʊ������
	// no number code Id Amount ��number ���� Id��� Code����
	// apply ?add
	// check set get?
	// comment remark ��Сд
	// num number
	// ��ʱ��Ȩ���ʽӿ� ��Ȩ��
	// ������ͼ �洢����
	// բ������ gateConfig ��Ӧ��Ա��
	// �����ע ���ں� ������ά�� ��עʱ���ⵥ �ʽ���������
	// �ӿڵ���Ƶ�� ��ֹƵ������
	// ���Խӿ������������ ѹ��
	// �ַ����� ���� ���ݷ��� ���� sql�Ż�
	// �ֶ����� �ֶ����� ����ʹ��Ӣ��verify ö���й� ��int
	// ids ����Ϊ����
	// 1.��һ����������
	// 2. �ڶ�����������
	// 3.��������ֶ�
	// 4.��������
	// ����ֶ��� ע��ʱ��ǿ�ư���Ϣ
	//ʣ������δ��õı��Լ� user��ر� ����Ϊ�ı�. �ٴμ������  �������� �������
	//
	/**
	 * ʮ�����ƴ�ӡ�ֽ�����
	 * 
	 * @param b byte[]
	 */
	public static void printBytes(byte[] b) {
		for (int i = 0; i < b.length; i++) {
			System.out.printf("%02X", b[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Util a = new Util();
		MySHA my = new MySHA();
		HttpsUtils hu = new HttpsUtils();
		// a.getPostRequest("a", "m", "QGXPxhFROq0=", "init");
		// a.getRandTicketNumber();
		//a.spitTicketNumber(a.getRandTicketNumber());
		//a.checkDisConfig("2", "5", "30");
		String s=a.parseMacAddress("00-01-6C-06-A6-29");
		System.out.print(s);
		// a.checkSign("1");
//	printBytes(my.SHA1Encrypt("test", 1));
		// printBytes(my.HmacSHA1Encrypt("test", "sha",3));
		// .System.out.print(my.depy("test", 1));
		// get("09:35:00");
		
		
		
		 String ipv4 = "1.1.1.1";
	        String ipv6 = "ABCD:EF01:2345:6789:ABCD:EF01:2345:67890";
	        
	        boolean iptest1 = ipTest(ipv4);
	        System.out.println(iptest1);//true
	 
	        boolean iptest2 = ipTest(ipv6);
	        System.out.println(iptest2);//tru
		
		a.getIpInfo("112.8.48.97");
		
		
	}

//
	public void checkMethod(String method) {
		// �����������
		if (method == null || method.equals("")) {
			System.out.print("����Ϊ��");
		}
		// A&B A|B A&C A|C B&C B|C A&B&C A|B|C
		else if (method.endsWith("A&B")) {
			System.out.print("���������ܵ��ӽ��ȫ����---ÿ�����굥��� ���ϸı�ȼ�");
		} else if (method.endsWith("A|B")) {
			System.out.print("���������ܵ��ӽ��������һ");

		} else if (method.endsWith("A&C")) {
			System.out.print("�������͵�����ȫ����");
		} else if (method.endsWith("A|C")) {
			System.out.print("�������͵�����������һ");
		} else if (method.endsWith("B&C")) {

		} else if (method.endsWith("B|C")) {

		} else if (method.endsWith("A&B&C")) {

		} else if (method.endsWith("A|B|C")) {

		} else {

		}
	}

//�������ʱ������� ��������
	public static void get(String nowStr) {
		String nowYmd = new SimpleDateFormat("yyyy-MM-dd").format(new Date()).toString();
		nowStr = nowYmd + " " + nowStr;
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String endStr = nowStr.substring(0, nowStr.indexOf(" ")) + " 23:59:59";
		try {
			long sec = (dateFormat.parse(endStr).getTime() - dateFormat.parse(nowStr).getTime()) / 1000;
			System.out.println("����������" + sec);
			System.out.println("�Ѿ���������" + (86400 - sec));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			// 15264994843
			e.printStackTrace();
		}

	}

	public String getPostRequest(String req, String t, String hash, String method) {
		if (req == null || req.equals("") || t == null | t.equals("") || hash == null || hash.equals("")) {

			System.out.print("�������Ϊ��,����");
		} else {
			// 1 ����У��hash�Ƿ���ȷ
			MySHA my = new MySHA();
			try {
				String hashs = my.encryption(req + ":" + t);
				// System.out.print(hashs);
				// ���ø�ʽУ�鷽�� ����״ֵ̬
				if (hashs.equals(hash)) {
					System.out.print("HASHһ�� ��ʼ�ж��Ƿ�json");
					if (2 == 2) {
						// req Ϊjson
						System.out.print("�������� parseMethod");
						if (3 == 3) {
							// �ж� ʱ�� �Ƿ��������Ҫ��
							parseMethod();

						} else {
							System.out.print("ʱ�䲻����Ҫ��");
						}
					}

					else {
						System.out.print("json ��ʽ����");
					}
					// ��ʽ��ȷ //�ж��Ƿ�Ϊjson �ǽ�����һ�� ���� �����ʽ����
				} else {
					System.out.print("��������������ȷ��");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		// ��ȡ���������
		return hash;
	}

//΢�� getsign   ת��xml ���Խӿ���֤ �Ȳ����Ƿ���Ȩ�޵�
	public String createNoneStr() {
		return null;
		// ΢�Ŵ��� nonestr
	}

	public void parseMethod() {
		// ��������
	}

	public String getRandTicketNumber() {
		// ����Ʊ����֤��
		String randomStr = "";
		for (int i = 0; i < 9; i++) {
			int random = (int) (Math.random() * 9);
			if (randomStr.indexOf(random + "") != -1) {
				i = i - 1;
			} else {
				randomStr += random;
			}
		}
		// System.out.println(randomStr);
		return randomStr;

	}

	public String spitTicketNumber(String str) {
		String s1 = str.substring(0, 3);
		String s2 = str.substring(3, 6);
		String s3 = str.substring(6, 9);
		System.out.print(s1 + " " + s2 + " " + s3);
		return str;

	}

	public boolean checkTicketNumberIsExit() {
		return false;
		// ���Ʊ����֤���Ƿ����
	}

	public void checkUa() {
		// �����
		// ������汾
		// ����ϵͳ
		// ����ϵͳ�ں�
		// ���������

	}

	public int getIsFirstSubscribe(String openId) {
		// �ж��Ƿ��״ι�ע
		int status = -1;
		if (1 == 1) {
			// �ж����ݿ��Ƿ���ڼ�¼ ����
			System.out.print("�Ѿ���ע");
			if (2 == 2) {
				//
				// ��ȡ΢���û��Ļ�����Ϣ ��עʱ�� ��ƥ��
				System.out.print("ʱ��һ�� �Ƕ��ι�ע[ȡ���ٹ�]");
				status = 1;
			} else {
				System.out.print("ʱ�䲻һ�� ���ι�ע[ȡ���ٹ�]");
				status = 0;
			}
		} else {
			System.out.print("δ��ע");
			status = -1;
		}
		return 0;
	}

	public void getImgTicket(String ticket) {
		// �洢���泡����ά��
		URL url = null;
		try {
			// �����·��
			String qrUrl = "https://mp.weixin.qq.com/cgi-bin/showqrcode?ticket=" + ticket;
			url = new URL(qrUrl);
			DataInputStream dataInputStream = new DataInputStream(url.openStream());

			FileOutputStream fileOutputStream = new FileOutputStream(new File("d:\\test.jpg"));// ���ص�λ�ü��ļ���
			ByteArrayOutputStream output = new ByteArrayOutputStream();

			byte[] buffer = new byte[1024];
			int length;

			while ((length = dataInputStream.read(buffer)) > 0) {
				output.write(buffer, 0, length);
			}
			fileOutputStream.write(output.toByteArray());
			dataInputStream.close();
			fileOutputStream.close();
		} catch (MalformedURLException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}

	}

	public String getTicket() {
		// wx ticket
		return null;

	}

	public void checkDisConfig(String dis1, String dis2, String dis3) {
		if (dis1 == null || dis2 == null || dis3 == null) {
			System.out.print("ֵΪ��1");
		}
		if (dis1.equals("") || dis2.equals("") || dis3.equals("")) {
			System.out.print("ֵΪ��2");
		}
		else {
			checkPersentVal(parsePersentVal(dis1));
		}
		// ����ֵ�Ƿ����1-100
	}

	public int parsePersentVal(String val) {
		// ���󷵻�-1 ��ȷ���ش��ڵ���0����
		int inval;
		int returnVal;
		try {
			inval = Integer.parseInt(val);
			returnVal = inval;
		} catch (NumberFormatException e) {
			returnVal = -1;
		}
		return returnVal;

		// ����ֵ�Ƿ���0-100
	}

	public void checkPersentVal(int val) {
		if (val >= 0 && val <= 100) {
			System.out.print(val);
		}
		else {
			System.out.print("ת�����ֵ����ȷ");
		}
	}
	public int calcPersentVal(int val1,int val2, int val3) {
		int status;
		int calcVal=val1+val2+val3;
		if(calcVal==100) {
			return 0;
		}
		else {
			return 100-calcVal;
		}
		//����֮��ĺ� ���=100 ����0|���� ����100֮��Ĳ�
	}
	
	public String parseMacAddress(String mac) {
		//ͳһ��ʽ��mac��ַ
		String cd=mac.replaceAll("([:])","");
		String cd2=cd.replaceAll("([-])","");
	  //  System.out.println(mac.replaceAll(c,"")); //$1ȡ������ĵ�1��
		return cd2.toUpperCase();
		
	}
	
	public static  boolean ipTest(String ipStr){
		//���ipv4����ipv6
        boolean iPv4LiteralAddress = IPAddressUtil.isIPv4LiteralAddress(ipStr);
        boolean iPv6LiteralAddress = IPAddressUtil.isIPv6LiteralAddress(ipStr);
        //ip�п�����v4,Ҳ�п�����v6,�M���κ�һ�ֶ��ǺϷ���ip
        if (!(iPv4LiteralAddress||iPv6LiteralAddress)){
            return false;
        }
        return true;
    }
public String getIpInfo(String ip) {
	String returnStr=HttpsUtils.sendGetRequest("http://ip.taobao.com/service/getIpInfo.php?ip="+ip, null);
	return returnStr;
	
}
}
