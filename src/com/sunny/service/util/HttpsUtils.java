package com.sunny.service.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
 
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
 
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
 
@SuppressWarnings("deprecation")
public class HttpsUtils 
{ 
     private String requstUrl="http://www.kuaidi100.com/query";
     private String requestParmater="type=yuantong&postid=11111111111";
     private String requstUrlAndParameter="http://www.kuaidi100.com/query?type=yuantong&postid=11111111111";
    /**
     * ��HTTPS��ַ����POST����
     * @param reqURL �����ַ
     * @param params �������
     * @return ��Ӧ����
     */ 
    @SuppressWarnings({ "finally", "resource" }) 
    public static String sendSSLPostRequest(String reqURL, Map<String, String> params)
    { 
        long responseLength = 0;                         //��Ӧ���� 
        String responseContent = null;                   //��Ӧ���� 
        HttpClient httpClient = new DefaultHttpClient(); //����Ĭ�ϵ�httpClientʵ�� 
        X509TrustManager xtm = new X509TrustManager()
        {   //����TrustManager 
            public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {} 
            public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {} 
            public X509Certificate[] getAcceptedIssuers() { return null; } 
        }; 
        try 
        { 
            //TLS1.0��SSL3.0������û��̫��Ĳ�𣬿ɴ������ΪTLS��SSL�ļ̳��ߣ�������ʹ�õ�����ͬ��SSLContext 
            SSLContext ctx = SSLContext.getInstance("TLS"); 
             
            //ʹ��TrustManager����ʼ���������ģ�TrustManagerֻ�Ǳ�SSL��Socket��ʹ�� 
            ctx.init(null, new TrustManager[]{xtm}, null); 
             
            //����SSLSocketFactory 
            SSLSocketFactory socketFactory = new SSLSocketFactory(ctx); 
             
            //ͨ��SchemeRegistry��SSLSocketFactoryע�ᵽ���ǵ�HttpClient�� 
            httpClient.getConnectionManager().getSchemeRegistry().register(new Scheme("https", 443, socketFactory)); 
             
            HttpPost httpPost = new HttpPost(reqURL);                        //����HttpPost 
            List<NameValuePair> formParams = new ArrayList<NameValuePair>(); //����POST����ı����� 
            if(params != null)
            {
	            for(Map.Entry<String,String> entry : params.entrySet()){ 
	                formParams.add(new BasicNameValuePair(entry.getKey(), entry.getValue())); 
	            } 
            }
            httpPost.setEntity(new UrlEncodedFormEntity(formParams, "UTF-8")); 
             
            HttpResponse response = httpClient.execute(httpPost); //ִ��POST���� 
            HttpEntity entity = response.getEntity();             //��ȡ��Ӧʵ�� 
             
            if (null != entity) { 
                responseLength = entity.getContentLength(); 
                responseContent = EntityUtils.toString(entity, "UTF-8"); 
                EntityUtils.consume(entity); //Consume response content 
            } 
            System.out.println("�����ַ: " + httpPost.getURI()); 
            System.out.println("��Ӧ״̬: " + response.getStatusLine()); 
            System.out.println("��Ӧ����: " + responseLength); 
            System.out.println("��Ӧ����: " + responseContent); 
        } 
        catch (Exception e) 
        { 
            e.printStackTrace(); 
        } 
        finally 
        { 
            httpClient.getConnectionManager().shutdown(); //�ر�����,�ͷ���Դ 
            return responseContent; 
        } 
    } 
   
    /**
     * ��HTTPS��ַ����POST����
     * @param reqURL �����ַ
     * @param params �������
     * @return ��Ӧ����
     */ 
    @SuppressWarnings({ "finally", "resource" }) 
    public static String sendSSLPostRequest2(String reqURL, Map<String, String> params)
    { 
        long responseLength = 0;                         //��Ӧ���� 
        String responseContent = null;                   //��Ӧ���� 
        HttpClient httpClient = new DefaultHttpClient(); //����Ĭ�ϵ�httpClientʵ�� 
        X509TrustManager xtm = new X509TrustManager()
        {   //����TrustManager 
            public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {} 
            public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {} 
            public X509Certificate[] getAcceptedIssuers() { return null; } 
        }; 
        try 
        { 
            //TLS1.0��SSL3.0������û��̫��Ĳ�𣬿ɴ������ΪTLS��SSL�ļ̳��ߣ�������ʹ�õ�����ͬ��SSLContext 
            SSLContext ctx = SSLContext.getInstance("SSL"); 
             
            //ʹ��TrustManager����ʼ���������ģ�TrustManagerֻ�Ǳ�SSL��Socket��ʹ�� 
            ctx.init(null, new TrustManager[]{xtm}, null); 
             
            //����SSLSocketFactory 
            SSLSocketFactory socketFactory = new SSLSocketFactory(ctx); 
             
            //ͨ��SchemeRegistry��SSLSocketFactoryע�ᵽ���ǵ�HttpClient�� 
            httpClient.getConnectionManager().getSchemeRegistry().register(new Scheme("https", 443, socketFactory)); 
             
            HttpPost httpPost = new HttpPost(reqURL);                        //����HttpPost 
            List<NameValuePair> formParams = new ArrayList<NameValuePair>(); //����POST����ı����� 
            if(params != null)
            {
	            for(Map.Entry<String,String> entry : params.entrySet()){ 
	                formParams.add(new BasicNameValuePair(entry.getKey(), entry.getValue())); 
	            } 
            }
            httpPost.addHeader("Host", "my.12301.cc");
            httpPost.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:67.0) Gecko/20100101 Firefox/67.0");
            httpPost.addHeader("Accept", "application/json, text/javascript, */*; q=0.01");
            httpPost.addHeader("Accept-Language", "zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2");
            httpPost.addHeader("Accept-Encoding", "gzip, deflate, br");
            httpPost.addHeader("Referer", "https://my.12301.cc/dlogin_n.html");
            httpPost.addHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
            httpPost.addHeader("X-Requested-With", "XMLHttpRequest");
            httpPost.addHeader("Connection", "keep-alive");
            httpPost.setEntity(new UrlEncodedFormEntity(formParams, "UTF-8")); 
             
            HttpResponse response = httpClient.execute(httpPost); //ִ��POST���� 
            HttpEntity entity = response.getEntity();             //��ȡ��Ӧʵ�� 
             
            if (null != entity) { 
                responseLength = entity.getContentLength(); 
                responseContent = EntityUtils.toString(entity, "UTF-8"); 
                EntityUtils.consume(entity); //Consume response content 
            } 
            System.out.println("�����ַ: " + httpPost.getURI()); 
            System.out.println("��Ӧ״̬: " + response.getStatusLine()); 
            System.out.println("��Ӧ����: " + responseLength); 
            System.out.println("��Ӧ����: " + responseContent); 
        } 
        catch (Exception e) 
        { 
            e.printStackTrace(); 
        } 
        finally 
        { 
            httpClient.getConnectionManager().shutdown(); //�ر�����,�ͷ���Դ 
            return responseContent; 
        } 
    } 
    
    @SuppressWarnings({ "finally", "resource" })
	public static String sendSSLPostBodyRequest(String reqURL, String bodyStr)
    { 
        long responseLength = 0;                         //��Ӧ���� 
        String responseContent = null;                   //��Ӧ���� 
        HttpClient httpClient = new DefaultHttpClient(); //����Ĭ�ϵ�httpClientʵ�� 
        X509TrustManager xtm = new X509TrustManager()
        {   //����TrustManager 
            public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {} 
            public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {} 
            public X509Certificate[] getAcceptedIssuers() { return null; } 
        }; 
        try 
        { 
            //TLS1.0��SSL3.0������û��̫��Ĳ�𣬿ɴ������ΪTLS��SSL�ļ̳��ߣ�������ʹ�õ�����ͬ��SSLContext 
            SSLContext ctx = SSLContext.getInstance("TLS"); 
             
            //ʹ��TrustManager����ʼ���������ģ�TrustManagerֻ�Ǳ�SSL��Socket��ʹ�� 
            ctx.init(null, new TrustManager[]{xtm}, null); 
             
            //����SSLSocketFactory 
            SSLSocketFactory socketFactory = new SSLSocketFactory(ctx); 
             
            //ͨ��SchemeRegistry��SSLSocketFactoryע�ᵽ���ǵ�HttpClient�� 
            httpClient.getConnectionManager().getSchemeRegistry().register(new Scheme("https", 443, socketFactory)); 
             
            HttpPost httpPost = new HttpPost(reqURL);                        //����HttpPost 
            if(!StringUtils.isBlank(bodyStr))
            {
	            StringEntity requestEntity = new StringEntity(bodyStr, "UTF-8");
	            httpPost.setEntity(requestEntity); 
            }
             
            HttpResponse response = httpClient.execute(httpPost); //ִ��POST���� 
            HttpEntity entity = response.getEntity();             //��ȡ��Ӧʵ�� 
             
            if (null != entity) { 
                responseLength = entity.getContentLength(); 
                responseContent = EntityUtils.toString(entity, "UTF-8"); 
                EntityUtils.consume(entity); //Consume response content 
            } 
            System.out.println("�����ַ: " + httpPost.getURI()); 
            System.out.println("��Ӧ״̬: " + response.getStatusLine()); 
            System.out.println("��Ӧ����: " + responseLength); 
            System.out.println("��Ӧ����: " + responseContent); 
        } 
        catch (Exception e) 
        { 
            e.printStackTrace(); 
        } 
        finally 
        { 
            httpClient.getConnectionManager().shutdown(); //�ر�����,�ͷ���Դ 
            return responseContent; 
        } 
    }
    
    /**
     * ��HTTPS��ַ����GET����
     * @param reqURL �����ַ
     * @param params �������
     * @return ��Ӧ����
     */ 
    @SuppressWarnings({ "finally", "resource" }) 
    public static String sendSSLGetRequest(String reqURL, Map<String, String> params)
    { 
        long responseLength = 0;                         //��Ӧ���� 
        String responseContent = null;                   //��Ӧ���� 
        HttpClient httpClient = new DefaultHttpClient(); //����Ĭ�ϵ�httpClientʵ�� 
        X509TrustManager xtm = new X509TrustManager()
        {   //����TrustManager 
            public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {} 
            public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {} 
            public X509Certificate[] getAcceptedIssuers() { return null; } 
        }; 
        try 
        { 
            //TLS1.0��SSL3.0������û��̫��Ĳ�𣬿ɴ������ΪTLS��SSL�ļ̳��ߣ�������ʹ�õ�����ͬ��SSLContext 
            SSLContext ctx = SSLContext.getInstance("TLS"); 
             
            //ʹ��TrustManager����ʼ���������ģ�TrustManagerֻ�Ǳ�SSL��Socket��ʹ�� 
            ctx.init(null, new TrustManager[]{xtm}, null); 
             
            //����SSLSocketFactory 
            SSLSocketFactory socketFactory = new SSLSocketFactory(ctx); 
             
            //ͨ��SchemeRegistry��SSLSocketFactoryע�ᵽ���ǵ�HttpClient�� 
            httpClient.getConnectionManager().getSchemeRegistry().register(new Scheme("https", 443, socketFactory)); 
             
            HttpGet httpGet = new HttpGet(reqURL);                        //����HttpPost 
            List<NameValuePair> formParams = new ArrayList<NameValuePair>(); //����POST����ı����� 
            if(params != null)
            {
	            for(Map.Entry<String,String> entry : params.entrySet()){ 
	                formParams.add(new BasicNameValuePair(entry.getKey(), entry.getValue())); 
	            } 
            }
            try {
                HttpResponse response = httpClient.execute(httpGet);
                int statusCode = response.getStatusLine().getStatusCode();
     
                System.out.println("ִ��״̬�� : " + statusCode);
     
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    InputStream instream = entity.getContent();
                    responseContent = IOUtils.toString(instream, "UTF-8");
                }
                System.out.println("�����ַ: " + httpGet.getURI()); 
                System.out.println("��Ӧ״̬: " + response.getStatusLine()); 
                System.out.println("��Ӧ����: " + responseLength); 
                System.out.println("��Ӧ����: " + responseContent); 
            } catch (IOException e) {
                e.printStackTrace();
            }
            
        } 
        catch (Exception e) 
        { 
            e.printStackTrace(); 
        } 
        finally 
        { 
            httpClient.getConnectionManager().shutdown(); //�ر�����,�ͷ���Դ 
            return responseContent; 
        } 
    } 
    
    
    /**
     * ��HTTP��ַ����GET����
     * @param reqURL �����ַ
     * @param params �������
     * @return ��Ӧ����
     */ 
    @SuppressWarnings({ "finally", "resource" }) 
    public static String sendGetRequest(String reqURL, Map<String, String> params)
    { 
        try {
            //doctype=xml/json/jsonp
            URL url = new URL(reqURL);
            URLConnection connection = url.openConnection();
            InputStream in = connection.getInputStream();
            InputStreamReader isr = new InputStreamReader(in,"utf-8");
            BufferedReader br = new BufferedReader(isr);
            String line;
            StringBuilder sb = new StringBuilder();
            while((line = br.readLine()) != null)
            {
                sb.append(line);
            }
            br.close();
            isr.close();
            in.close();
            System.out.println("ʹ��GET��ʽ�ã�\n"+sb.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
		return reqURL;
    }

    
    /**
     * ��HTTP��ַ����GET����
     * @param reqURL �����ַ
     * @param params �������
     * @return ��Ӧ����
     */ 
    @SuppressWarnings({ "finally", "resource" }) 
    public static String sendPostRequest(String reqURL, Map<String, String> params)
    { 
        try {
            URL url = new URL(reqURL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.addRequestProperty("encoding", "UTF-8");//�����������
            connection.setDoInput(true);//��������
            connection.setDoOutput(true);//�������
            connection.setRequestMethod("POST");//POST����Ҫ�ڻ�ȡ���������֮ǰ���÷��򱨴�
            //���
            OutputStream os = connection.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write(params.toString());
            bw.flush();

            //����
            InputStream in = connection.getInputStream();
            InputStreamReader isr = new InputStreamReader(in,"UTF-8");
            BufferedReader br = new BufferedReader(isr);

            String line;
            StringBuilder sb = new StringBuilder();
            while((line = br.readLine()) != null)
            {
                sb.append(line);
            }
            bw.close();
            osw.close();
            os.close();
            br.close();
            isr.close();
            in.close();

            System.out.println("ʹ��POST��ʽ�ã�\n"+sb.toString());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
		return reqURL;
    }
    /**
     * ��HTTP��ַ����GET����
     * @param reqURL �����ַ
     * @param params �������
     * @return ��Ӧ����
     */ 
    @SuppressWarnings({ "finally", "resource" }) 
    public static String sendPostRequest2(String reqURL, Map<String, String> params)
    { 
    	String appcode = "7016e92339484570abbef647c137299a";
        try {
            URL url = new URL(reqURL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.addRequestProperty("encoding", "UTF-8");//�����������
            connection.setDoInput(true);//��������
            connection.setDoOutput(true);//�������
            connection.setRequestMethod("POST");//POST����Ҫ�ڻ�ȡ���������֮ǰ���÷��򱨴�
            
            connection.setRequestProperty("Authorization", "APPCODE " + appcode);
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
            //���
            OutputStream os = connection.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write(params.toString());
            bw.flush();

            //����
            InputStream in = connection.getInputStream();
            InputStreamReader isr = new InputStreamReader(in,"UTF-8");
            BufferedReader br = new BufferedReader(isr);

            String line;
            StringBuilder sb = new StringBuilder();
            while((line = br.readLine()) != null)
            {
                sb.append(line);
            }
            bw.close();
            osw.close();
            os.close();
            br.close();
            isr.close();
            in.close();

            System.out.println("ʹ��POST��ʽ�ã�\n"+sb.toString());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
		return reqURL;
    }
    
	class PostRun extends Thread{
	    @Override
	    public void run() {
	        try {
	            URL url = new URL(requstUrl);
	            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	            connection.addRequestProperty("encoding", "UTF-8");//�����������
	            connection.setDoInput(true);//��������
	            connection.setDoOutput(true);//�������
	            connection.setRequestMethod("POST");//POST����Ҫ�ڻ�ȡ���������֮ǰ���÷��򱨴�
	            //���
	            OutputStream os = connection.getOutputStream();
	            OutputStreamWriter osw = new OutputStreamWriter(os);
	            BufferedWriter bw = new BufferedWriter(osw);
	            bw.write(requestParmater);
	            bw.flush();
	
	            //����
	            InputStream in = connection.getInputStream();
	            InputStreamReader isr = new InputStreamReader(in,"UTF-8");
	            BufferedReader br = new BufferedReader(isr);
	
	            String line;
	            StringBuilder sb = new StringBuilder();
	            while((line = br.readLine()) != null)
	            {
	                sb.append(line);
	            }
	            bw.close();
	            osw.close();
	            os.close();
	            br.close();
	            isr.close();
	            in.close();
	
	            System.out.println("ʹ��POST��ʽ�ã�\n"+sb.toString());
	
	        } catch (MalformedURLException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	
	    }
 }
}
