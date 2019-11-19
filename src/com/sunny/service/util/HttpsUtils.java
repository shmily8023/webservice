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
     * 向HTTPS地址发送POST请求
     * @param reqURL 请求地址
     * @param params 请求参数
     * @return 响应内容
     */ 
    @SuppressWarnings({ "finally", "resource" }) 
    public static String sendSSLPostRequest(String reqURL, Map<String, String> params)
    { 
        long responseLength = 0;                         //响应长度 
        String responseContent = null;                   //响应内容 
        HttpClient httpClient = new DefaultHttpClient(); //创建默认的httpClient实例 
        X509TrustManager xtm = new X509TrustManager()
        {   //创建TrustManager 
            public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {} 
            public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {} 
            public X509Certificate[] getAcceptedIssuers() { return null; } 
        }; 
        try 
        { 
            //TLS1.0与SSL3.0基本上没有太大的差别，可粗略理解为TLS是SSL的继承者，但它们使用的是相同的SSLContext 
            SSLContext ctx = SSLContext.getInstance("TLS"); 
             
            //使用TrustManager来初始化该上下文，TrustManager只是被SSL的Socket所使用 
            ctx.init(null, new TrustManager[]{xtm}, null); 
             
            //创建SSLSocketFactory 
            SSLSocketFactory socketFactory = new SSLSocketFactory(ctx); 
             
            //通过SchemeRegistry将SSLSocketFactory注册到我们的HttpClient上 
            httpClient.getConnectionManager().getSchemeRegistry().register(new Scheme("https", 443, socketFactory)); 
             
            HttpPost httpPost = new HttpPost(reqURL);                        //创建HttpPost 
            List<NameValuePair> formParams = new ArrayList<NameValuePair>(); //构建POST请求的表单参数 
            if(params != null)
            {
	            for(Map.Entry<String,String> entry : params.entrySet()){ 
	                formParams.add(new BasicNameValuePair(entry.getKey(), entry.getValue())); 
	            } 
            }
            httpPost.setEntity(new UrlEncodedFormEntity(formParams, "UTF-8")); 
             
            HttpResponse response = httpClient.execute(httpPost); //执行POST请求 
            HttpEntity entity = response.getEntity();             //获取响应实体 
             
            if (null != entity) { 
                responseLength = entity.getContentLength(); 
                responseContent = EntityUtils.toString(entity, "UTF-8"); 
                EntityUtils.consume(entity); //Consume response content 
            } 
            System.out.println("请求地址: " + httpPost.getURI()); 
            System.out.println("响应状态: " + response.getStatusLine()); 
            System.out.println("响应长度: " + responseLength); 
            System.out.println("响应内容: " + responseContent); 
        } 
        catch (Exception e) 
        { 
            e.printStackTrace(); 
        } 
        finally 
        { 
            httpClient.getConnectionManager().shutdown(); //关闭连接,释放资源 
            return responseContent; 
        } 
    } 
   
    /**
     * 向HTTPS地址发送POST请求
     * @param reqURL 请求地址
     * @param params 请求参数
     * @return 响应内容
     */ 
    @SuppressWarnings({ "finally", "resource" }) 
    public static String sendSSLPostRequest2(String reqURL, Map<String, String> params)
    { 
        long responseLength = 0;                         //响应长度 
        String responseContent = null;                   //响应内容 
        HttpClient httpClient = new DefaultHttpClient(); //创建默认的httpClient实例 
        X509TrustManager xtm = new X509TrustManager()
        {   //创建TrustManager 
            public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {} 
            public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {} 
            public X509Certificate[] getAcceptedIssuers() { return null; } 
        }; 
        try 
        { 
            //TLS1.0与SSL3.0基本上没有太大的差别，可粗略理解为TLS是SSL的继承者，但它们使用的是相同的SSLContext 
            SSLContext ctx = SSLContext.getInstance("SSL"); 
             
            //使用TrustManager来初始化该上下文，TrustManager只是被SSL的Socket所使用 
            ctx.init(null, new TrustManager[]{xtm}, null); 
             
            //创建SSLSocketFactory 
            SSLSocketFactory socketFactory = new SSLSocketFactory(ctx); 
             
            //通过SchemeRegistry将SSLSocketFactory注册到我们的HttpClient上 
            httpClient.getConnectionManager().getSchemeRegistry().register(new Scheme("https", 443, socketFactory)); 
             
            HttpPost httpPost = new HttpPost(reqURL);                        //创建HttpPost 
            List<NameValuePair> formParams = new ArrayList<NameValuePair>(); //构建POST请求的表单参数 
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
             
            HttpResponse response = httpClient.execute(httpPost); //执行POST请求 
            HttpEntity entity = response.getEntity();             //获取响应实体 
             
            if (null != entity) { 
                responseLength = entity.getContentLength(); 
                responseContent = EntityUtils.toString(entity, "UTF-8"); 
                EntityUtils.consume(entity); //Consume response content 
            } 
            System.out.println("请求地址: " + httpPost.getURI()); 
            System.out.println("响应状态: " + response.getStatusLine()); 
            System.out.println("响应长度: " + responseLength); 
            System.out.println("响应内容: " + responseContent); 
        } 
        catch (Exception e) 
        { 
            e.printStackTrace(); 
        } 
        finally 
        { 
            httpClient.getConnectionManager().shutdown(); //关闭连接,释放资源 
            return responseContent; 
        } 
    } 
    
    @SuppressWarnings({ "finally", "resource" })
	public static String sendSSLPostBodyRequest(String reqURL, String bodyStr)
    { 
        long responseLength = 0;                         //响应长度 
        String responseContent = null;                   //响应内容 
        HttpClient httpClient = new DefaultHttpClient(); //创建默认的httpClient实例 
        X509TrustManager xtm = new X509TrustManager()
        {   //创建TrustManager 
            public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {} 
            public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {} 
            public X509Certificate[] getAcceptedIssuers() { return null; } 
        }; 
        try 
        { 
            //TLS1.0与SSL3.0基本上没有太大的差别，可粗略理解为TLS是SSL的继承者，但它们使用的是相同的SSLContext 
            SSLContext ctx = SSLContext.getInstance("TLS"); 
             
            //使用TrustManager来初始化该上下文，TrustManager只是被SSL的Socket所使用 
            ctx.init(null, new TrustManager[]{xtm}, null); 
             
            //创建SSLSocketFactory 
            SSLSocketFactory socketFactory = new SSLSocketFactory(ctx); 
             
            //通过SchemeRegistry将SSLSocketFactory注册到我们的HttpClient上 
            httpClient.getConnectionManager().getSchemeRegistry().register(new Scheme("https", 443, socketFactory)); 
             
            HttpPost httpPost = new HttpPost(reqURL);                        //创建HttpPost 
            if(!StringUtils.isBlank(bodyStr))
            {
	            StringEntity requestEntity = new StringEntity(bodyStr, "UTF-8");
	            httpPost.setEntity(requestEntity); 
            }
             
            HttpResponse response = httpClient.execute(httpPost); //执行POST请求 
            HttpEntity entity = response.getEntity();             //获取响应实体 
             
            if (null != entity) { 
                responseLength = entity.getContentLength(); 
                responseContent = EntityUtils.toString(entity, "UTF-8"); 
                EntityUtils.consume(entity); //Consume response content 
            } 
            System.out.println("请求地址: " + httpPost.getURI()); 
            System.out.println("响应状态: " + response.getStatusLine()); 
            System.out.println("响应长度: " + responseLength); 
            System.out.println("响应内容: " + responseContent); 
        } 
        catch (Exception e) 
        { 
            e.printStackTrace(); 
        } 
        finally 
        { 
            httpClient.getConnectionManager().shutdown(); //关闭连接,释放资源 
            return responseContent; 
        } 
    }
    
    /**
     * 向HTTPS地址发送GET请求
     * @param reqURL 请求地址
     * @param params 请求参数
     * @return 响应内容
     */ 
    @SuppressWarnings({ "finally", "resource" }) 
    public static String sendSSLGetRequest(String reqURL, Map<String, String> params)
    { 
        long responseLength = 0;                         //响应长度 
        String responseContent = null;                   //响应内容 
        HttpClient httpClient = new DefaultHttpClient(); //创建默认的httpClient实例 
        X509TrustManager xtm = new X509TrustManager()
        {   //创建TrustManager 
            public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {} 
            public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {} 
            public X509Certificate[] getAcceptedIssuers() { return null; } 
        }; 
        try 
        { 
            //TLS1.0与SSL3.0基本上没有太大的差别，可粗略理解为TLS是SSL的继承者，但它们使用的是相同的SSLContext 
            SSLContext ctx = SSLContext.getInstance("TLS"); 
             
            //使用TrustManager来初始化该上下文，TrustManager只是被SSL的Socket所使用 
            ctx.init(null, new TrustManager[]{xtm}, null); 
             
            //创建SSLSocketFactory 
            SSLSocketFactory socketFactory = new SSLSocketFactory(ctx); 
             
            //通过SchemeRegistry将SSLSocketFactory注册到我们的HttpClient上 
            httpClient.getConnectionManager().getSchemeRegistry().register(new Scheme("https", 443, socketFactory)); 
             
            HttpGet httpGet = new HttpGet(reqURL);                        //创建HttpPost 
            List<NameValuePair> formParams = new ArrayList<NameValuePair>(); //构建POST请求的表单参数 
            if(params != null)
            {
	            for(Map.Entry<String,String> entry : params.entrySet()){ 
	                formParams.add(new BasicNameValuePair(entry.getKey(), entry.getValue())); 
	            } 
            }
            try {
                HttpResponse response = httpClient.execute(httpGet);
                int statusCode = response.getStatusLine().getStatusCode();
     
                System.out.println("执行状态码 : " + statusCode);
     
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    InputStream instream = entity.getContent();
                    responseContent = IOUtils.toString(instream, "UTF-8");
                }
                System.out.println("请求地址: " + httpGet.getURI()); 
                System.out.println("响应状态: " + response.getStatusLine()); 
                System.out.println("响应长度: " + responseLength); 
                System.out.println("响应内容: " + responseContent); 
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
            httpClient.getConnectionManager().shutdown(); //关闭连接,释放资源 
            return responseContent; 
        } 
    } 
    
    
    /**
     * 向HTTP地址发送GET请求
     * @param reqURL 请求地址
     * @param params 请求参数
     * @return 响应内容
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
            System.out.println("使用GET方式得：\n"+sb.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
		return reqURL;
    }

    
    /**
     * 向HTTP地址发送GET请求
     * @param reqURL 请求地址
     * @param params 请求参数
     * @return 响应内容
     */ 
    @SuppressWarnings({ "finally", "resource" }) 
    public static String sendPostRequest(String reqURL, Map<String, String> params)
    { 
        try {
            URL url = new URL(reqURL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.addRequestProperty("encoding", "UTF-8");//添加请求属性
            connection.setDoInput(true);//允许输入
            connection.setDoOutput(true);//允许输出
            connection.setRequestMethod("POST");//POST请求要在获取输入输出流之前设置否则报错
            //输出
            OutputStream os = connection.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write(params.toString());
            bw.flush();

            //输入
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

            System.out.println("使用POST方式得：\n"+sb.toString());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
		return reqURL;
    }
    /**
     * 向HTTP地址发送GET请求
     * @param reqURL 请求地址
     * @param params 请求参数
     * @return 响应内容
     */ 
    @SuppressWarnings({ "finally", "resource" }) 
    public static String sendPostRequest2(String reqURL, Map<String, String> params)
    { 
    	String appcode = "7016e92339484570abbef647c137299a";
        try {
            URL url = new URL(reqURL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.addRequestProperty("encoding", "UTF-8");//添加请求属性
            connection.setDoInput(true);//允许输入
            connection.setDoOutput(true);//允许输出
            connection.setRequestMethod("POST");//POST请求要在获取输入输出流之前设置否则报错
            
            connection.setRequestProperty("Authorization", "APPCODE " + appcode);
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
            //输出
            OutputStream os = connection.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write(params.toString());
            bw.flush();

            //输入
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

            System.out.println("使用POST方式得：\n"+sb.toString());

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
	            connection.addRequestProperty("encoding", "UTF-8");//添加请求属性
	            connection.setDoInput(true);//允许输入
	            connection.setDoOutput(true);//允许输出
	            connection.setRequestMethod("POST");//POST请求要在获取输入输出流之前设置否则报错
	            //输出
	            OutputStream os = connection.getOutputStream();
	            OutputStreamWriter osw = new OutputStreamWriter(os);
	            BufferedWriter bw = new BufferedWriter(osw);
	            bw.write(requestParmater);
	            bw.flush();
	
	            //输入
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
	
	            System.out.println("使用POST方式得：\n"+sb.toString());
	
	        } catch (MalformedURLException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	
	    }
 }
}
