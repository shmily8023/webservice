package com.sunny.service.util;

public class LocationUtil {
	//http://ditu.amap.com/service/regeo?longitude=121.04925573429551&latitude=31.315590522490712 获取经纬度以及附近建筑物名
	//http://ip.taobao.com/service/getIpInfo.php?ip=63.223.108.42 ip接口
	//http://cache.video.iqiyi.com/jp/avlist/202861101/1/?callback=jsonp9 爱奇艺接口
	//http://www.kuaidi100.com/query?type=快递公司代号&postid=快递单号 
	
	/*http://op.juhe.cn/idcard/query?key=您申请的KEY&idcard=&realname= 实名认证 返回 
	 * 请求 	
	 * idcard	是	string	身份证号码
 	   realname	是	string	姓名(需utf8编码的urlencode)
 	   key	是	string	在个人中心->我的数据,接口名称上方查看 
 	   返回：
 	   {
    "reason": "成功",
    "result": {
        "realname": "***",//真实姓名
        "idcard": "******************",//身份证号码
        "res": 1 //1：匹配 2：不匹配
    },
    "error_code": 0
}

/*
 * 银行卡二元素 
 * http://v.juhe.cn/verifybankcard/query?key=&realname=%E8%91%A3%E5%A5%BD&bankcard=6217003180000902
 * 返回：
 * {
    "reason": "成功1",
    "result": {
        "realname": "董好",//真实姓名
        "bankcard": "62222*********",//银行卡号码
        "res": 1 //1：匹配 2：不匹配
    },
    "error_code": 0 //返回值为0才计费
}
 */
	/*
	 * 停车场实时数据 
	 * http://apis.juhe.cn/parking/parkList?key=您申请的appkey&cityName=苏州市&currentPage=1&pageSize=10
	 * 	error_code	int	状态码，成功时返回0
 	reason	string	状态信息
 	result	object	返回结果集
 	parkInfoList	array<object>	停车场信息列表
 	parkId	int	停车场Id
 	parkUUId	string	停车场UUID
 	name	string	停车场名称
 	parkType	string	停车场类型
 	provinceName	string	省份名
 	cityName	string	城市名
 	areaName	string	区域名
 	address	string	地址
 	longitude	double	经度
 	latitude	double	纬度
 	total	int	总车位数
 	leftNum	int	剩余车位数
 	price	double	价格
 	priceUnit	string	价格单位
 	priceDesc	string	收费描述
 	picUrlList	array	停车场图片列表
 	isDestine	string	是否可预订，1-可预订，2-不可预订
 	reservePrice	double	预订价格
 	page	object	分页对象
 	currentPage	int	当前页码
 	pageSize	int	分页大小
 	totalCount	int	总记录数
 	
	 * 返回：
	 * {
  "reason": "查询成功",
  "result": {
    "parkInfoList": [
      {
        "parkId": 136548,
        "parkUUId": "ff80808147ba04020147ba69feb5213f",
        "name": "江宙路停车场",
        "parkType": "商业",
        "provinceName": "江苏省",
        "cityName": "苏州市",
        "areaName": "吴中区",
        "address": "江苏省苏州市吴中区新苏路18号",
        "longitude": 120.655068,
        "latitude": 31.340772999999999,
        "total": 66,
        "leftNum": 3,
        "price": 6,
        "priceUnit": "元/首小时",
        "priceDesc": "10分钟内免费，首小时6元，后每小时4元。最高34元。",
        "picUrlList": [
          
        ],
        "isDestine": "2",
        "reservePrice": null
      },
      {
        "parkId": 136649,
        "parkUUId": "ff80808147ba04020147ba6a02a22209",
        "name": "苏州海宁皮革城地下停车场",
        "parkType": "商业",
        "provinceName": "江苏省",
        "cityName": "苏州市",
        "areaName": "吴中区",
        "address": "江苏省苏州市吴中区糖坊湾支路",
        "longitude": 120.648968,
        "latitude": 31.334844,
        "total": 125,
        "leftNum": 10,
        "price": 6,
        "priceUnit": "元/首小时",
        "priceDesc": "半小时内免费，首小时6元，后每小时4元，最高34元。",
        "picUrlList": [
          "http://api.soargift.com:8998/photo/park/ff80808146f680790146fae491602116.jpg",
          "http://api.soargift.com:8998/photo/park/ff80808146f680790146fb6858f13b99.jpg"
        ],
        "isDestine": "2",
        "reservePrice": null
      }
    ],
    "page": {
      "currentPage": 1,
      "pageSize": 2,
      "totalCount": 1365
    }
  },
  "error_code": 0
}
/*
 * 银行卡类别
 * http://bankcardsilk.api.juhe.cn/bankcardsilk/query.php?num=6228480402564890018
 * 返回:
 * {
    "reason": "success",
    "result": {
        "bank": "中国农业银行",
        "type": "金穗通宝卡(银联卡)",
        "tel": "95599",
        "logo": "1067.jpg" //需要加http://images.juheapi.com/banklogo/
    },
    "error_code": 0
}
/*手机号信息 归属地..
 * https://tcc.taobao.com/cc/json/mobile_tel_segment.htm?tel=18769930824
 */

 
	 
	 
	/*
	 * 快递公司编码:申通=“shentong” EMS=“ems” 顺丰=“shunfeng” 圆通=“yuantong” 中通=“zhongtong” 
	 * 韵达=“yunda” 天天=“tiantian” 汇通=“huitongkuaidi” 全峰=“quanfengkuaidi” 德邦=“debangwuliu” 宅急送=“zhaijisong”
	 */
	//https://suggest.taobao.com/sug?code=utf-8&q=%E7%BE%BD%E7%BB%92%E6%9C%8D&callback=cb 搜索建议 taobao
	//获取停车场信息
	
	public void cellIdToLnglat() {
		
		//基站转经纬度以及具体地址
		//http://www.cellmap.cn/cellmap_android_api/Cell2Gps_freelimit.aspx?deviceid=861951042674814&mcc=460&mnc=0&lac=5459&cell=60402
	}
    /**
     * 赤道半径
     */
    private static double EARTH_RADIUS = 6378.137;

    private static double rad(double d) {
        return d * Math.PI / 180.0;
    }

    /**
     * Description : 通过经纬度获取距离(单位：米)
     * Group :
     *
     * @param origin      出发点
     * @param destination 目的地
     * @return double
     * @author honghh
     * @date 2019/2/13 0013 15:50
     */
    public static double getDistance(String origin, String destination) {
        if (origin == null) {
            //log.error("出发点 经纬度不可以为空！");
            return 0;
        }
        if (destination == null) {
           // log.error("目的地 经纬度不可以为空！");
            return 0;
        }
        String[] temp = origin.split(",");
        String[] temp2 = destination.split(",");

        double radLat1 = rad(Double.parseDouble(temp[1]));
        double radLat2 = rad(Double.parseDouble(temp2[1]));
        double a = radLat1 - radLat2;
        double b = rad(Double.parseDouble(temp[0])) - rad(Double.parseDouble(temp2[0]));
        double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2)
                + Math.cos(radLat1) * Math.cos(radLat2)
                * Math.pow(Math.sin(b / 2), 2)));
        s = s * EARTH_RADIUS;
        // 保留两位小数
        s = Math.round(s * 100d) / 100d;
        s = s * 1000;
        return s;
    }

    /**
     * Description : 通过经纬度获取距离(单位：米)
     * Group :
     *
     * @param originLon      出发点经度
     * @param originLat      出发点纬度
     * @param destinationLon 目的地经度
     * @param destinationLat 目的地纬度
     * @return double
     * @author honghh
     * @date 2019/2/15 0015 9:14
     */
    public static double getDistance(String originLon, String originLat, String destinationLon, String destinationLat) {
    	/*
        if (StringUtil.isEmpty(originLon)) {
            log.error("出发点 经度不可以为空！");
            return 0;
        }
        if (StringUtil.isEmpty(originLat)) {
            log.error("出发点 纬度不可以为空！");
            return 0;
        }
        if (StringUtil.isEmpty(destinationLon)) {
            log.error("目的地 经度不可以为空！");
            return 0;
        }
        if (StringUtil.isEmpty(destinationLat)) {
            log.error("目的地 纬度不可以为空！");
            return 0;
        }
*/
        double radLat1 = rad(Double.parseDouble(originLat));
        double radLat2 = rad(Double.parseDouble(destinationLat));
        double a = radLat1 - radLat2;
        double b = rad(Double.parseDouble(originLon)) - rad(Double.parseDouble(destinationLon));
        double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2)
                + Math.cos(radLat1) * Math.cos(radLat2)
                * Math.pow(Math.sin(b / 2), 2)));
        s = s * EARTH_RADIUS;
        // 保留两位小数
        s = Math.round(s * 100d) / 100d;
        s = s * 1000;
        return s;
    }
    public static double[] GetAround(double lat, double lon, int raidus)
    {

        double latitude = lat;
        double longitude = lon;

        double degree = (24901 * 1609) / 360.0;
        double raidusMile = raidus;

        double dpmLat = 1 / degree;
        double radiusLat = dpmLat * raidusMile;
        double minLat = latitude - radiusLat;
        double maxLat = latitude + radiusLat;

        double mpdLng = degree * Math.cos(latitude * (3.1415926 / 180));
        double dpmLng = 1 / mpdLng;
        double radiusLng = dpmLng * raidusMile;
        double minLng = longitude - radiusLng;
        double maxLng = longitude + radiusLng;
        return new double[] { minLat, minLng, maxLat, maxLng };
    }
}
