package com.sunny.service.util;

public class LocationUtil {
	//http://ditu.amap.com/service/regeo?longitude=121.04925573429551&latitude=31.315590522490712 ��ȡ��γ���Լ�������������
	//http://ip.taobao.com/service/getIpInfo.php?ip=63.223.108.42 ip�ӿ�
	//http://cache.video.iqiyi.com/jp/avlist/202861101/1/?callback=jsonp9 �����սӿ�
	//http://www.kuaidi100.com/query?type=��ݹ�˾����&postid=��ݵ��� 
	
	/*http://op.juhe.cn/idcard/query?key=�������KEY&idcard=&realname= ʵ����֤ ���� 
	 * ���� 	
	 * idcard	��	string	���֤����
 	   realname	��	string	����(��utf8�����urlencode)
 	   key	��	string	�ڸ�������->�ҵ�����,�ӿ������Ϸ��鿴 
 	   ���أ�
 	   {
    "reason": "�ɹ�",
    "result": {
        "realname": "***",//��ʵ����
        "idcard": "******************",//���֤����
        "res": 1 //1��ƥ�� 2����ƥ��
    },
    "error_code": 0
}

/*
 * ���п���Ԫ�� 
 * http://v.juhe.cn/verifybankcard/query?key=&realname=%E8%91%A3%E5%A5%BD&bankcard=6217003180000902
 * ���أ�
 * {
    "reason": "�ɹ�1",
    "result": {
        "realname": "����",//��ʵ����
        "bankcard": "62222*********",//���п�����
        "res": 1 //1��ƥ�� 2����ƥ��
    },
    "error_code": 0 //����ֵΪ0�żƷ�
}
 */
	/*
	 * ͣ����ʵʱ���� 
	 * http://apis.juhe.cn/parking/parkList?key=�������appkey&cityName=������&currentPage=1&pageSize=10
	 * 	error_code	int	״̬�룬�ɹ�ʱ����0
 	reason	string	״̬��Ϣ
 	result	object	���ؽ����
 	parkInfoList	array<object>	ͣ������Ϣ�б�
 	parkId	int	ͣ����Id
 	parkUUId	string	ͣ����UUID
 	name	string	ͣ��������
 	parkType	string	ͣ��������
 	provinceName	string	ʡ����
 	cityName	string	������
 	areaName	string	������
 	address	string	��ַ
 	longitude	double	����
 	latitude	double	γ��
 	total	int	�ܳ�λ��
 	leftNum	int	ʣ�೵λ��
 	price	double	�۸�
 	priceUnit	string	�۸�λ
 	priceDesc	string	�շ�����
 	picUrlList	array	ͣ����ͼƬ�б�
 	isDestine	string	�Ƿ��Ԥ����1-��Ԥ����2-����Ԥ��
 	reservePrice	double	Ԥ���۸�
 	page	object	��ҳ����
 	currentPage	int	��ǰҳ��
 	pageSize	int	��ҳ��С
 	totalCount	int	�ܼ�¼��
 	
	 * ���أ�
	 * {
  "reason": "��ѯ�ɹ�",
  "result": {
    "parkInfoList": [
      {
        "parkId": 136548,
        "parkUUId": "ff80808147ba04020147ba69feb5213f",
        "name": "����·ͣ����",
        "parkType": "��ҵ",
        "provinceName": "����ʡ",
        "cityName": "������",
        "areaName": "������",
        "address": "����ʡ����������������·18��",
        "longitude": 120.655068,
        "latitude": 31.340772999999999,
        "total": 66,
        "leftNum": 3,
        "price": 6,
        "priceUnit": "Ԫ/��Сʱ",
        "priceDesc": "10��������ѣ���Сʱ6Ԫ����ÿСʱ4Ԫ�����34Ԫ��",
        "picUrlList": [
          
        ],
        "isDestine": "2",
        "reservePrice": null
      },
      {
        "parkId": 136649,
        "parkUUId": "ff80808147ba04020147ba6a02a22209",
        "name": "���ݺ���Ƥ��ǵ���ͣ����",
        "parkType": "��ҵ",
        "provinceName": "����ʡ",
        "cityName": "������",
        "areaName": "������",
        "address": "����ʡ�������������Ƿ���֧·",
        "longitude": 120.648968,
        "latitude": 31.334844,
        "total": 125,
        "leftNum": 10,
        "price": 6,
        "priceUnit": "Ԫ/��Сʱ",
        "priceDesc": "��Сʱ����ѣ���Сʱ6Ԫ����ÿСʱ4Ԫ�����34Ԫ��",
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
 * ���п����
 * http://bankcardsilk.api.juhe.cn/bankcardsilk/query.php?num=6228480402564890018
 * ����:
 * {
    "reason": "success",
    "result": {
        "bank": "�й�ũҵ����",
        "type": "����ͨ����(������)",
        "tel": "95599",
        "logo": "1067.jpg" //��Ҫ��http://images.juheapi.com/banklogo/
    },
    "error_code": 0
}
/*�ֻ�����Ϣ ������..
 * https://tcc.taobao.com/cc/json/mobile_tel_segment.htm?tel=18769930824
 */

 
	 
	 
	/*
	 * ��ݹ�˾����:��ͨ=��shentong�� EMS=��ems�� ˳��=��shunfeng�� Բͨ=��yuantong�� ��ͨ=��zhongtong�� 
	 * �ϴ�=��yunda�� ����=��tiantian�� ��ͨ=��huitongkuaidi�� ȫ��=��quanfengkuaidi�� �°�=��debangwuliu�� լ����=��zhaijisong��
	 */
	//https://suggest.taobao.com/sug?code=utf-8&q=%E7%BE%BD%E7%BB%92%E6%9C%8D&callback=cb �������� taobao
	//��ȡͣ������Ϣ
	
	public void cellIdToLnglat() {
		
		//��վת��γ���Լ������ַ
		//http://www.cellmap.cn/cellmap_android_api/Cell2Gps_freelimit.aspx?deviceid=861951042674814&mcc=460&mnc=0&lac=5459&cell=60402
	}
    /**
     * ����뾶
     */
    private static double EARTH_RADIUS = 6378.137;

    private static double rad(double d) {
        return d * Math.PI / 180.0;
    }

    /**
     * Description : ͨ����γ�Ȼ�ȡ����(��λ����)
     * Group :
     *
     * @param origin      ������
     * @param destination Ŀ�ĵ�
     * @return double
     * @author honghh
     * @date 2019/2/13 0013 15:50
     */
    public static double getDistance(String origin, String destination) {
        if (origin == null) {
            //log.error("������ ��γ�Ȳ�����Ϊ�գ�");
            return 0;
        }
        if (destination == null) {
           // log.error("Ŀ�ĵ� ��γ�Ȳ�����Ϊ�գ�");
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
        // ������λС��
        s = Math.round(s * 100d) / 100d;
        s = s * 1000;
        return s;
    }

    /**
     * Description : ͨ����γ�Ȼ�ȡ����(��λ����)
     * Group :
     *
     * @param originLon      �����㾭��
     * @param originLat      ������γ��
     * @param destinationLon Ŀ�ĵؾ���
     * @param destinationLat Ŀ�ĵ�γ��
     * @return double
     * @author honghh
     * @date 2019/2/15 0015 9:14
     */
    public static double getDistance(String originLon, String originLat, String destinationLon, String destinationLat) {
    	/*
        if (StringUtil.isEmpty(originLon)) {
            log.error("������ ���Ȳ�����Ϊ�գ�");
            return 0;
        }
        if (StringUtil.isEmpty(originLat)) {
            log.error("������ γ�Ȳ�����Ϊ�գ�");
            return 0;
        }
        if (StringUtil.isEmpty(destinationLon)) {
            log.error("Ŀ�ĵ� ���Ȳ�����Ϊ�գ�");
            return 0;
        }
        if (StringUtil.isEmpty(destinationLat)) {
            log.error("Ŀ�ĵ� γ�Ȳ�����Ϊ�գ�");
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
        // ������λС��
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
