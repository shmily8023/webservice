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
//了解高并发
	// 优惠券？？？
	// 签到？？
	// 自动下架[库存不足/过期/两者都有]
	// 自动上架: [符合要求自动上架/不自动上架] 添加库存时 判断是否 自动上架 是 大于0 自动上架
//&t=时间  &lid 随机生成数 &hash加密值 后端传给前端 ---
	// JZ HXZ JID TXZ TBZ VSA OTH GID JLZ 11 hvz JZ1 SBZ HKB JGZ TSZ
	// 代理商配置 保证金
	// 供应商配置 保证金
	// 检测本年度
	// :md5 小写
	// 报名记录表
	// 砍价参与记录表
	// 资质审核
	// 红包 随机 尾数为1 周一免单 。。。 赠送景区门票
	// 分拥的产品金额记录
	// 表中添加代理商号 供应商号
	// 相关接口的查询方法
	// 接口添加----整理接口 ---实现接口
	// 修正dao 返回类型 传递参数
	// 添加合同 合同相关表
	// 判断ua
	// 事务保存点
	// 订单转增 转增状态 转增时间 转增用户
	// 票付通 调用类库
	// 关键词库
	// 上传保险
	// 核验身份 身份证二元素 手机号三元素
	// 是否可转增 供应商号 代理商号
	// 判断经纬度是否在此范围
	// 景区评级
	// 订单评分评级
	// 字段 person user UserId OpenId Account
	// name ProductName 其他产品名字
	// 选择人员[从绑定|新建身份证号|....] 判断卡票类型 ---无需输入票种类型
	// no number code Id Amount ：number 人数 Id序号 Code代码
	// apply ?add
	// check set get?
	// comment remark 大小写
	// num number
	// 临时授权访问接口 授权人
	// 创建视图 存储过程
	// 闸机配置 gateConfig 供应商员工
	// 邀请关注 公众号 场景二维码 关注时间免单 资金从哪里出的
	// 接口调用频率 防止频繁调用
	// 测试接口请求接受数据 压缩
	// 分服务器 缓存 数据分区 索引 sql优化
	// 字段命名 字段排序 核销使用英文verify 枚举有关 用int
	// ids 设置为主键
	// 1.第一波修正类型
	// 2. 第二波修正类型
	// 3.检测设置字段
	// 4.设置主键
	// 检测字段名 注册时候强制绑定信息
	//剩余两个未想好的表以及 user相关表 类型为改变. 再次检查类型  检查变量名 检查主键
	//
	/**
	 * 十六进制打印字节数组
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
		// 检查满足条件
		if (method == null || method.equals("")) {
			System.out.print("方法为空");
		}
		// A&B A|B A&C A|C B&C B|C A&B&C A|B|C
		else if (method.endsWith("A&B")) {
			System.out.print("单子数和总单子金额全满足---每次下完单检查 符合改变等级");
		} else if (method.endsWith("A|B")) {
			System.out.print("单子数和总单子金额满足其一");

		} else if (method.endsWith("A&C")) {
			System.out.print("单子数和单项金额全满足");
		} else if (method.endsWith("A|C")) {
			System.out.print("单子数和单项金额满足其一");
		} else if (method.endsWith("B&C")) {

		} else if (method.endsWith("B|C")) {

		} else if (method.endsWith("A&B&C")) {

		} else if (method.endsWith("A|B|C")) {

		} else {

		}
	}

//从零点零时零分零秒 计算秒数
	public static void get(String nowStr) {
		String nowYmd = new SimpleDateFormat("yyyy-MM-dd").format(new Date()).toString();
		nowStr = nowYmd + " " + nowStr;
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String endStr = nowStr.substring(0, nowStr.indexOf(" ")) + " 23:59:59";
		try {
			long sec = (dateFormat.parse(endStr).getTime() - dateFormat.parse(nowStr).getTime()) / 1000;
			System.out.println("相差的秒数：" + sec);
			System.out.println("已经过秒数：" + (86400 - sec));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			// 15264994843
			e.printStackTrace();
		}

	}

	public String getPostRequest(String req, String t, String hash, String method) {
		if (req == null || req.equals("") || t == null | t.equals("") || hash == null || hash.equals("")) {

			System.out.print("请求参数为空,请检查");
		} else {
			// 1 首先校验hash是否正确
			MySHA my = new MySHA();
			try {
				String hashs = my.encryption(req + ":" + t);
				// System.out.print(hashs);
				// 调用格式校验方法 返回状态值
				if (hashs.equals(hash)) {
					System.out.print("HASH一致 开始判断是否json");
					if (2 == 2) {
						// req 为json
						System.out.print("处理请求 parseMethod");
						if (3 == 3) {
							// 判断 时间 是否符合区间要求
							parseMethod();

						} else {
							System.out.print("时间不符合要求");
						}
					}

					else {
						System.out.print("json 格式错误");
					}
					// 格式正确 //判断是否为json 是进行下一步 否则 输出格式操作
				} else {
					System.out.print("请求数据有误，请确认");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		// 获取请求的数据
		return hash;
	}

//微信 getsign   转换xml 测试接口验证 等操作是否有权限等
	public String createNoneStr() {
		return null;
		// 微信创建 nonestr
	}

	public void parseMethod() {
		// 处理请求
	}

	public String getRandTicketNumber() {
		// 生成票务验证码
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
		// 检测票务验证码是否存在
	}

	public void checkUa() {
		// 浏览器
		// 浏览器版本
		// 操作系统
		// 操作系统内核
		// 浏览器语言

	}

	public int getIsFirstSubscribe(String openId) {
		// 判断是否首次关注
		int status = -1;
		if (1 == 1) {
			// 判断数据库是否存在记录 存在
			System.out.print("已经关注");
			if (2 == 2) {
				//
				// 获取微信用户的基本信息 关注时间 做匹配
				System.out.print("时间一致 非二次关注[取消再关]");
				status = 1;
			} else {
				System.out.print("时间不一致 二次关注[取消再关]");
				status = 0;
			}
		} else {
			System.out.print("未关注");
			status = -1;
		}
		return 0;
	}

	public void getImgTicket(String ticket) {
		// 存储保存场景二维码
		URL url = null;
		try {
			// 请求的路径
			String qrUrl = "https://mp.weixin.qq.com/cgi-bin/showqrcode?ticket=" + ticket;
			url = new URL(qrUrl);
			DataInputStream dataInputStream = new DataInputStream(url.openStream());

			FileOutputStream fileOutputStream = new FileOutputStream(new File("d:\\test.jpg"));// 下载的位置及文件名
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
			System.out.print("值为空1");
		}
		if (dis1.equals("") || dis2.equals("") || dis3.equals("")) {
			System.out.print("值为空2");
		}
		else {
			checkPersentVal(parsePersentVal(dis1));
		}
		// 解析值是否介于1-100
	}

	public int parsePersentVal(String val) {
		// 错误返回-1 正确返回大于等于0的数
		int inval;
		int returnVal;
		try {
			inval = Integer.parseInt(val);
			returnVal = inval;
		} catch (NumberFormatException e) {
			returnVal = -1;
		}
		return returnVal;

		// 解析值是否在0-100
	}

	public void checkPersentVal(int val) {
		if (val >= 0 && val <= 100) {
			System.out.print(val);
		}
		else {
			System.out.print("转换后的值不正确");
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
		//计算之后的和 如果=100 返回0|否则 返回100之间的差
	}
	
	public String parseMacAddress(String mac) {
		//统一格式化mac地址
		String cd=mac.replaceAll("([:])","");
		String cd2=cd.replaceAll("([-])","");
	  //  System.out.println(mac.replaceAll(c,"")); //$1取出保存的第1个
		return cd2.toUpperCase();
		
	}
	
	public static  boolean ipTest(String ipStr){
		//检测ipv4还是ipv6
        boolean iPv4LiteralAddress = IPAddressUtil.isIPv4LiteralAddress(ipStr);
        boolean iPv6LiteralAddress = IPAddressUtil.isIPv6LiteralAddress(ipStr);
        //ip有可能是v4,也有可能是v6,滿足任何一种都是合法的ip
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
