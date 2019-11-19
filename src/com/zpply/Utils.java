package com.zpply;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.google.gson.Gson;


public class Utils {

	public  int[] StringtoIntArray(String code) {
		// 字符串获取整型数组
		int lengths = code.length();
		int m[] = new int[lengths];
		for (int i = 0; i < lengths; i++) {
			m[i] = Integer.parseInt(code.substring(i, i + 1));
		}
		return m;
	}

	public  String getCheckSum(String code) {
		// 一串数字 获取校验码
		String test = code.substring(code.length() - 4, code.length());
		//System.out.println(test);
		return code.substring(code.length() - 4, code.length());

	}

	public  String getHxNum(String code) {
		// 一串数字 获取核销码
		String test2 = code.substring(1, code.length() - 4);
		return code.substring(1, code.length() - 4);

	}

	public int[] StringToInt(String[] arrs) {

		int[] ints = new int[arrs.length];

		for (int i = 0; i < arrs.length; i++) {

			ints[i] = Integer.parseInt(arrs[i]);

		}

		return ints;

	}



	public  String getCalcCheckSum(String code) {
		// 计算校验码
		String a = getHxNum(code);
		int mz[] = StringtoIntArray(a);
		int newCheckSum[] = new int[4];
		int totalsum = 0;
		int sum = 0;
		for (int i = 0; i < mz.length; i++) {

			sum = mz[i] * (i + 1);
			// System.out.println(sum);
			totalsum = sum + totalsum;
			// System.out.println(mz[i]);
		}
	//	System.out.println(totalsum);
		return "" + totalsum;
	}

	public  String getRemainComplete(String code) {
		// 补全校验码
		String test = getCalcCheckSum(code);
		String bz = "";
		int ltest = test.length();
		if (ltest < 2) {
			bz = "000" + test;

		} else if (ltest < 3) {
			bz = "00" + test;

		} else if (ltest < 4) {
			bz = "0" + test;

		}
		//System.out.println(bz);
		// return null;
		return bz;

	}

	

	public  String getDeviceInfo(String id) {
		//查询订单
			ResultSet rs= DBHelper.getResultSet("select * from eb_deviceInfo where deviceId='"+id+"'");
			
//			ResultSet rs=DBHelper.getResultSet("select * from deviceInfo where deviceId like '?'", new Object[] {"D05391111"});
			try {
				while  (rs.next()) {
					//处理结果
					//System.out.print(rs.getString(2));
					String m= "{"+"\"errorCode\":"+"0"+","+"\"spotId\":\""+rs.getString(3)+"\","+"\"cleckId\":\""+rs.getString(4)+"\""+","+"\"checkNum\":\""+rs.getString(5)+"\",\"verifyNum\":\""+rs.getString(6)+"\"}";
					//System.out.println(m);
					return m;
					//System.out.println(rs.getString(2)+"，");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return "";
			
		}



		public String exeHx3(String ticketer_id,String data) {
			//取出兑票员信息 与参数包括对比 包含 执行 不包含 输出错误信息
			HttpRequest hr=new HttpRequest();
			String urls="https://wx.zpply.cn/weixinpl/shopQR/data_android.php?customer_id=";
			String par="ticketer_id="+ticketer_id+"&data="+data+"&op=status";
			//String ttt=hr.sendPost(urls, "ticketer_id="+ticketer_id+"&data="+"&op=status");
			//String tttt="{\"res\":true,\"msg\":\"\u5151\u6362\u6210\u529f\",\"data\":{\"product_name\":\"\u4e34\u6c82\u51e4\u51f0\u6b22\u4e50\u6c34\u4e16\u754c\u95e8\u7968\",\"rcount\":\"3\",\"totalprice\":\"45\",\"prvstr\":\"\u513f\u7ae5\u7968  \",\"encrypcode\":\"4000046268242117052352295\",\"shortcode\":\"788506\",\"qrtime\":1567063632}}";
			long m=System.currentTimeMillis();
			String tz=hr.sendPostSSL(urls, par);
			String returnString;
			Gson g = new Gson();
			String msgObj = g.toJson(tz);
			//JSONObject jb = JSON.parseObject(tz);
			//boolean status=jb.getBoolean("res");
			/*
			if(status==true) {
				JSONObject jb2 = jb.getJSONObject("data");
				String num=jb2.getString("rcount");
				System.out.println("数量:"+num);
			//数量转整型
				int num2=Integer.parseInt(num);
				if(num2==1) {
					returnString="{\"Msg\":\"心跳接受成功最后一次[初次]-无需心跳包\",\"CorrectTime\":\""+m+"\",\"ResultCode\":\"1\",\"ActIndex\":\"1\"}";
					//处理
					//returnString="{\"Msg\":\"无需心跳包\",\"CorrectTime\":\""+m+"\",\"ResultCode\":\"1\"}";
				}
				else {
					System.out.println("更新数据库 心跳检测"+(num2-1));
					int ab=DBHelper.ExecSql("update deviceInfo set checkNum='"+data+"',verifyNum='"+(num2-1)+"' where deviceId='D053911'");
			
					if(ab==1) {
						returnString="{\"Msg\":\"数量减一 成功\",\"CorrectTime\":\""+m+"\",\"ResultCode\":\"1\",\"ActIndex\":\"1\"}";
						//System.out.println("{\"Msg\":\"心跳接受成功最后一次\",\"CorrectTime\":\""+m+"\",\"ResultCode\":\"1\",\"ActIndex\":\"1\"}");
						//System.out.println("更新成功");	
					}
					else {
				
						//插入数量 减一
			
						returnString="{\"Msg\":\"数量减一 失败\",\"CorrectTime\":\""+m+"\",\"ResultCode\":\"0\"}";
						//System.out.println("{\"Msg\":\"数量减一失败\",\"CorrectTime\":\""+m+"\",\"ResultCode\":\"0\"}");
						//System.out.println("更新失败");	
					}
				}
			}
			*/
			/*
			else {
				String msg=jb.getString("msg");
				//订单未找到
				//未到核销时间
				if(msg.equals("订单已核销,请勿重复核销")) {
					returnString="{\"Msg\":\"订单已验证\",\"CorrectTime\":\""+m+"\",\"ResultCode\":\"0\"}";	
				}
				else if(msg.equals("订单未找到")) {
					returnString="{\"Msg\":\"查无此单\",\"CorrectTime\":\""+m+"\",\"ResultCode\":\"0\"}";	
				}
				else if(msg.equals("未到核销时间")) {
					returnString="{\"Msg\":\"验证时间未到\",\"CorrectTime\":\""+m+"\",\"ResultCode\":\"0\"}";	
				}
				else {
					System.out.print(msg);
					returnString="{\"Msg\":\"验证核销-失败\",\"CorrectTime\":\""+m+"\",\"ResultCode\":\"0\"}";
				}
			
				
			}
			return returnString;
			*/
			return msgObj;
		}
		
		public int uploadLogs(String scode,String deviceid,String times,String timeid) {
			//System.out.println("111111");
			DBHelper d=new DBHelper();
			String m="insert into orderlist (scode,deviceid,times,timeid) value('"+scode+"','"+deviceid+"','"+times+"','"+timeid+"');";
			int returnid=d.ExecSql(m);
			
			//System.out.println(m);
			return returnid;
		
		}
	public String getBatchCode(String code) {
		int lenths=code.length();
		if(lenths==6) {
			//票付通 
		}
		else if(lenths==12) {
			//美团
		}
		else {
			ResultSet rs= DBHelper.getResultSet("select order_id from eb_store_order where qrcode='"+code+"' limit 1 ");
//			ResultSet rs=DBHelper.getResultSet("select * from deviceInfo where deviceId like '?'", new Object[] {"D05391111"});
			try {
				while  (rs.next()) {
					String m= rs.getString(1);
					//System.out.println(m);
					return m;
					//System.out.println(rs.getString(2)+"，");
					//数据记录为空 处理？
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return "";
		}
		return code;

	}
	public String getOrderInfo(String order_id) {
		ResultSet rs= DBHelper.getResultSet("select * from eb_store_order where qrcode='"+order_id+"' limit 1 ");
//		ResultSet rs=DBHelper.getResultSet("select * from deviceInfo where deviceId like '?'", new Object[] {"D05391111"});
		try {
			while  (rs.next()) {
				//处理结果
				//System.out.print(rs.getString(2));
				
				String cz="{"
						+ "\"id\":\""+rs.getString("id")+"\","
						+ "\"order_id\":\""+rs.getString("order_id")+"\","
						+ "\"uid\":\""+rs.getString("uid")+"\","
						+ "\"realName\":\""+rs.getString("real_name")+"\","
						+ "\"user_phone\":\""+rs.getString("user_phone")+"\","
						+ "\"total_num\":\""+rs.getString("total_num")+"\","
						+ "\"total_price\":\""+rs.getString("total_price")+"\","
						+ "\"pay_price\":\""+rs.getString("pay_price")+"\","
						+ "\"pay_time\":\""+rs.getString("pay_time")+"\","
						+ "\"pay_type\":\""+rs.getString("pay_type")+"\","
						+ "\"add_time\":\""+rs.getString("add_time")+"\","
						+ "\"status\":\""+rs.getString("status")+"\","
						+ "\"refund_status\":\""+rs.getString("refund_status")+"\","
						+ "\"gain_intergal\":\""+rs.getString("gain_integral")+"\","
						+ "\"use_intergal\":\""+rs.getString("use_integral")+"\","
						+ "\"is_piao\":\""+rs.getString("is_piao")+"\""
						+ "}";
				String m= rs.getString(4);
				//System.out.println(m);
				return cz;
				//System.out.println(rs.getString(2)+"，");
			}
		} catch (SQLException e) {
			return "{\"no\":\"ok\",\"return\":1,\"msg\":\"sql error\"}";
			//e.printStackTrace();
			//返佣 饭钱  三级分销
		}
		return "";
	}
}
