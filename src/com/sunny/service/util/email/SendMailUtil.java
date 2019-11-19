package com.sunny.service.util.email;

import java.io.IOException;
import java.util.*;

import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class SendMailUtil {

    static String HOST = ""; // smtp������
    static String FROM = ""; // �����˵�ַ
    static String TO = ""; // �ռ��˵�ַ
    static String AFFIX = ""; // ������ַ
    static String AFFIXNAME = ""; // ��������
    static String USER = ""; // �û���
    static String PWD = ""; // 163����Ȩ��
    static String SUBJECT = ""; // �ʼ�����
    static String[] TOS = null;
    
    static {
        try {
            Properties props = new Properties(); 
            props.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties"));//���Զ��������ļ���ȡ��ز���
            HOST=props.getProperty("host");
            FROM=props.getProperty("from");
            TO=props.getProperty("to");
            TOS=TO.split(",");
            AFFIX=props.getProperty("affix");
            AFFIXNAME=props.getProperty("affixName");
            USER=props.getProperty("user");
            PWD=props.getProperty("pwd");
            SUBJECT=props.getProperty("subject");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * �����ʼ�
     * @param host
     * @param user
     * @param pwd
     */
    public static void send(String context) {
        Properties props = new Properties();
        props.put("mail.smtp.host", HOST);//���÷����ʼ����ʼ������������ԣ�����ʹ�����׵�smtp��������
        props.put("mail.smtp.auth", "true");  //��Ҫ������Ȩ��Ҳ�����л����������У�飬��������ͨ����֤��һ��Ҫ����һ����
        Session session = Session.getDefaultInstance(props);//��props���󹹽�һ��session
        session.setDebug(true);
        MimeMessage message = new MimeMessage(session);//��sessionΪ����������Ϣ����
        try {
            message.setFrom(new InternetAddress(FROM));// ���ط����˵�ַ
            InternetAddress[] sendTo = new InternetAddress[TOS.length]; // �����ռ��˵�ַ
            for (int i = 0; i < TOS.length; i++) {  
                sendTo[i] = new InternetAddress(TOS[i]);  
            }
            message.addRecipients(Message.RecipientType.TO,sendTo);
            message.addRecipients(MimeMessage.RecipientType.CC, InternetAddress.parse(FROM));//�����ڷ��͸�������֮ǰ���Լ������ͷ�������һ�ݣ���Ȼ�ᱻ���������ʼ�����554��
            message.setSubject(SUBJECT);//���ر���
            Multipart multipart = new MimeMultipart();//��multipart����������ʼ��ĸ����������ݣ������ı����ݺ͸���
            BodyPart contentPart = new MimeBodyPart();//�����ʼ����ı�����
            contentPart.setText(context);
            multipart.addBodyPart(contentPart);
            if(!AFFIX.isEmpty()){//��Ӹ���
                 BodyPart messageBodyPart = new MimeBodyPart();
                 DataSource source = new FileDataSource(AFFIX);
                 messageBodyPart.setDataHandler(new DataHandler(source));//��Ӹ���������
                 sun.misc.BASE64Encoder enc = new sun.misc.BASE64Encoder();//��Ӹ����ı���
                 messageBodyPart.setFileName("=?GBK?B?"+ enc.encode(AFFIXNAME.getBytes()) + "?=");
                 multipart.addBodyPart(messageBodyPart);
            }
            message.setContent(multipart);//��multipart����ŵ�message��
            message.saveChanges(); //�����ʼ�
            Transport transport = session.getTransport("smtp");//�����ʼ�
            transport.connect(HOST, USER, PWD);//���ӷ�����������
            transport.sendMessage(message, message.getAllRecipients());//���ʼ����ͳ�ȥ
            transport.close();//�ر�����
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

//    public static void main(String[] args) {
//        send("����");
//    }
    
}