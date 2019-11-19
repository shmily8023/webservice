package com.sunny.service.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpUtils;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import com.sunny.service.util.HttpsUtils;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List a=readFile011();
	//String tesStr=execute("371327199310126429","��˧��","18206397851");
	String tesStr2=post("371327199111276416","���ζ�","18769930824");
	//for(int i=0;i<a.size();i++) {
		//post("371327199310126429","��˧��","18206397851");
		// System.out.println(a.get(i).toString());
		//System.out.println(post("371327199310126429","��˧��",a.get(i).toString()));
	//}
	//System.out.println(tesStr2);
	}
	
	public static String  execute(String idNo,String name,String phonNo) {
		
		HttpsUtils h=new HttpsUtils();
		Map<String, String> params = new HashMap<String, String>();
		params.put("idNo", idNo);
		params.put("name", name);
		params.put("phoneNo", phonNo);
		String returnstr = HttpsUtils.sendPostRequest2("http://phonecheck.market.alicloudapi.com/phoneAuthentication", params);
		return phonNo;


	}
	public static String post(String idNo,String name,String phonNo) {
		 
		         HttpClient client = new DefaultHttpClient();
		         HttpPost post = new HttpPost("http://phonecheck.market.alicloudapi.com/phoneAuthentication");
		         String appcode = "7016e92339484570abbef647c137299a";
		         post.setHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
		         post.addHeader("Authorization", "APPCODE " + appcode);
		         String result = "";
		        
		         try {
		 
		        	 List<NameValuePair> pairs = new ArrayList<NameValuePair>();  

		        	 NameValuePair pair1 = new BasicNameValuePair("idNo", idNo);  

		        	 NameValuePair pair2 = new BasicNameValuePair("name", name);  

		        	 NameValuePair pair3 = new BasicNameValuePair("phoneNo", phonNo);  

		        	 pairs.add(pair1);  

		        	 pairs.add(pair2);  

		        	 pairs.add(pair3);  

		        	 post.setEntity(new UrlEncodedFormEntity(pairs, "UTF-8"));
		             //post.setEntity(s);
		 
		           // ��������
		            HttpResponse httpResponse = client.execute(post);
		
		            // ��ȡ��Ӧ������
		            InputStream inStream = httpResponse.getEntity().getContent();
		            BufferedReader reader = new BufferedReader(new InputStreamReader(
		                    inStream, "utf-8"));
		             StringBuilder strber = new StringBuilder();
		            String line = null;
	           while ((line = reader.readLine()) != null)
	                strber.append(line + "\n");
		             inStream.close();
		
		           result = strber.toString();
		             //System.out.println(result);
		           appendInfoToFile("D:/phone.txt",result);
		             if (httpResponse.getStatusLine().getStatusCode() == 200) {
		                
		                     System.out.print(":����������ɹ�������Ӧ����");
		                 
		            } else {
		                 
		                System.out.print(":��������ʧ��");
		                 
		             }
		             
		 
		        } catch (Exception e) {
		             System.out.print(":�����쳣");
		            throw new RuntimeException(e);
		        }
		
		        return result;
		    }
		 
		
	
//һ��һ�ж�ȡ�ļ�
	/**
     * һ��һ�ж�ȡ�ļ����ʺ��ַ���ȡ������ȡ�����ַ�ʱ���������
     * 
     * ���Ĺر�˳���ȴ򿪵ĺ�أ���򿪵��ȹأ�
     *       �����п��ܳ���java.io.IOException: Stream closed�쳣
     * 
     * @throws IOException 
     */
    public static void readFile01() throws IOException {
        FileReader fr=new FileReader("C:/Users/admin/Desktop/phone.txt");
        BufferedReader br=new BufferedReader(fr);
        String line="";
        String[] arrs=null;
        while ((line=br.readLine())!=null) {
            //arrs=line.split(",");
           // System.out.println(arrs[0] + " : " + arrs[1] + " : " + arrs[2]);
            System.out.println(line);
        }
        br.close();
        fr.close();
    }
	/**
     * һ��һ�ж�ȡ�ļ����ʺ��ַ���ȡ������ȡ�����ַ�ʱ���������
     * 
     * ���Ĺر�˳���ȴ򿪵ĺ�أ���򿪵��ȹأ�
     *       �����п��ܳ���java.io.IOException: Stream closed�쳣
     * 
     * @throws IOException 
     */
    public static List readFile011() {
        FileReader fr = null;
        BufferedReader br = null;
        String line="";
        String[] arrs=null;
        ArrayList <String> arrayS= new ArrayList<String>();
		try {
			fr = new FileReader("C:/Users/admin/Desktop/phone.txt");
	
	        br=new BufferedReader(fr);
	        while ((line=br.readLine())!=null) {
	            //arrs=line.split(",");
	           // System.out.println(arrs[0] + " : " + arrs[1] + " : " + arrs[2]);
	        	arrayS.add(line);
	           // System.out.println(line);
	        }
	    
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    try {
				br.close();
			    fr.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		return arrayS;
    }
 
    /**
     * һ��һ�ж�ȡ�ļ��������ȡ�����ַ�ʱ��������
     * 
     * ���Ĺر�˳���ȴ򿪵ĺ�أ���򿪵��ȹأ�
     *       �����п��ܳ���java.io.IOException: Stream closed�쳣
     * 
     * @throws IOException 
     */
    public void readFile02() throws IOException {
        FileInputStream fis=new FileInputStream("E:/phsftp/evdokey/evdokey_201103221556.txt");
        InputStreamReader isr=new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);
        //��д����
        //BufferedReader br = new BufferedReader(new InputStreamReader(
        //        new FileInputStream("E:/phsftp/evdokey/evdokey_201103221556.txt"), "UTF-8"));
        String line="";
        String[] arrs=null;
        while ((line=br.readLine())!=null) {
            arrs=line.split(",");
            System.out.println(arrs[0] + " : " + arrs[1] + " : " + arrs[2]);
        }
        br.close();
        isr.close();
        fis.close();
    }
 
    /**
     * һ��һ��д���ļ����ʺ��ַ�д�룬��д�������ַ�ʱ���������
     * 
     * ���Ĺر�˳���ȴ򿪵ĺ�أ���򿪵��ȹأ�
     *       �����п��ܳ���java.io.IOException: Stream closed�쳣
     * 
     * @throws IOException 
     */
    public void writeFile01() throws IOException {
        String[] arrs={
            "zhangsan,23,FuJian",
            "lisi,30,ShangHai",
            "wangwu,43,BeiJing",
            "laolin,21,ChongQing",
            "ximenqing,67,GuiZhou"
        };
        FileWriter fw=new FileWriter(new File("E:/phsftp/evdokey/evdokey_201103221556.txt"));
        //д�������ַ�ʱ���������
        BufferedWriter  bw=new BufferedWriter(fw);
        //BufferedWriter  bw=new BufferedWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("E:/phsftp/evdokey/evdokey_201103221556.txt")), "UTF-8")));
 
        for(String arr:arrs){
            bw.write(arr+"\t\n");
        }
        bw.close();
        fw.close();
    }
 
    /**
     * һ��һ��д���ļ������д�������ַ�ʱ��������
     * 
     * ���Ĺر�˳���ȴ򿪵ĺ�أ���򿪵��ȹأ�
     *       �����п��ܳ���java.io.IOException: Stream closed�쳣
     * 
     * @throws IOException 
     */
    public void writeFile02() throws IOException {
        String[] arrs={
                "zhangsan,23,����",
                "lisi,30,�Ϻ�",
                "wangwu,43,����",
                "laolin,21,����",
                "ximenqing,67,����"
        };
        //д�������ַ�ʱ���������������
        FileOutputStream fos=new FileOutputStream(new File("E:/phsftp/evdokey/evdokey_201103221556.txt"));
        OutputStreamWriter osw=new OutputStreamWriter(fos, "UTF-8");
        BufferedWriter  bw=new BufferedWriter(osw);
        //��д���£�
        //BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
        //        new FileOutputStream(new File("E:/phsftp/evdokey/evdokey_201103221556.txt")), "UTF-8"));
 
        for(String arr:arrs){
            bw.write(arr+"\t\n");
        }
 
        //ע��رյ��Ⱥ�˳���ȴ򿪵ĺ�رգ���򿪵��ȹر�
        bw.close();
        osw.close();
        fos.close();
    }
    public static void appendInfoToFile(String fileName, String info) {
        File file =new File(fileName);
        try {
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter fileWriter =new FileWriter(file, true);
            info =info +System.getProperty("line.separator");
            fileWriter.write(info);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
