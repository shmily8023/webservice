package com.zpply.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpUtils;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List a=readFile011();
	
	}
	
	public static void execute(String idNo,String name,String phonNo) {
	    String host = "https://phonecheck.market.alicloudapi.com";
	    String path = "/phoneAuthentication";
	    String method = "POST";
	    String appcode = "7016e92339484570abbef647c137299a";
	    Map<String, String> headers = new HashMap<String, String>();
	    //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
	    headers.put("Authorization", "APPCODE " + appcode);
	    //根据API的要求，定义相对应的Content-Type
	    headers.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
	    Map<String, String> querys = new HashMap<String, String>();
	    Map<String, String> bodys = new HashMap<String, String>();
	    bodys.put("idNo", idNo);
	    bodys.put("name", name);
	    bodys.put("phoneNo", phonNo);


	    try {
	    	/**
	    	* 重要提示如下:
	    	* HttpUtils请从
	    	* https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
	    	* 下载
	    	*
	    	* 相应的依赖请参照
	    	* https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
	    	*/
	    	//HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
	    	//System.out.println(response.toString());
	    	//获取response的body
	    	//System.out.println(EntityUtils.toString(response.getEntity()));
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	}
//一行一行读取文件
	/**
     * 一行一行读取文件，适合字符读取，若读取中文字符时会出现乱码
     * 
     * 流的关闭顺序：先打开的后关，后打开的先关，
     *       否则有可能出现java.io.IOException: Stream closed异常
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
     * 一行一行读取文件，适合字符读取，若读取中文字符时会出现乱码
     * 
     * 流的关闭顺序：先打开的后关，后打开的先关，
     *       否则有可能出现java.io.IOException: Stream closed异常
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
     * 一行一行读取文件，解决读取中文字符时出现乱码
     * 
     * 流的关闭顺序：先打开的后关，后打开的先关，
     *       否则有可能出现java.io.IOException: Stream closed异常
     * 
     * @throws IOException 
     */
    public void readFile02() throws IOException {
        FileInputStream fis=new FileInputStream("E:/phsftp/evdokey/evdokey_201103221556.txt");
        InputStreamReader isr=new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);
        //简写如下
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
     * 一行一行写入文件，适合字符写入，若写入中文字符时会出现乱码
     * 
     * 流的关闭顺序：先打开的后关，后打开的先关，
     *       否则有可能出现java.io.IOException: Stream closed异常
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
        //写入中文字符时会出现乱码
        BufferedWriter  bw=new BufferedWriter(fw);
        //BufferedWriter  bw=new BufferedWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("E:/phsftp/evdokey/evdokey_201103221556.txt")), "UTF-8")));
 
        for(String arr:arrs){
            bw.write(arr+"\t\n");
        }
        bw.close();
        fw.close();
    }
 
    /**
     * 一行一行写入文件，解决写入中文字符时出现乱码
     * 
     * 流的关闭顺序：先打开的后关，后打开的先关，
     *       否则有可能出现java.io.IOException: Stream closed异常
     * 
     * @throws IOException 
     */
    public void writeFile02() throws IOException {
        String[] arrs={
                "zhangsan,23,福建",
                "lisi,30,上海",
                "wangwu,43,北京",
                "laolin,21,重庆",
                "ximenqing,67,贵州"
        };
        //写入中文字符时解决中文乱码问题
        FileOutputStream fos=new FileOutputStream(new File("E:/phsftp/evdokey/evdokey_201103221556.txt"));
        OutputStreamWriter osw=new OutputStreamWriter(fos, "UTF-8");
        BufferedWriter  bw=new BufferedWriter(osw);
        //简写如下：
        //BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
        //        new FileOutputStream(new File("E:/phsftp/evdokey/evdokey_201103221556.txt")), "UTF-8"));
 
        for(String arr:arrs){
            bw.write(arr+"\t\n");
        }
 
        //注意关闭的先后顺序，先打开的后关闭，后打开的先关闭
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
