package com.sunny.service.vo.log;

public class Log_Order {
	public int ids;//���
	public int orderId;// ������  
	public long createTime;// �µ�ʱ��
	public long orderVaidDate;// ������Ч��
	public long verifyVaildDate;// ��֤��Ч��
	public int productId;// ��Ʒ��Ϣid
	public int productAttrId;// ��Ʒ����Id
	public int buyType;// ����ʽ ��h5 ΢�� app miniapp pc
	public int buyType3;// ���� �ֽ�
	public int buyApi;// ����ӿ���Ϣ
	public int payStatus;//֧��״̬:δ֧�� ��֧��
	public int status;// ����״̬ ȫ��������δ�������ѷ��������ջ��������У������ �Ź�����Ч �Ź���Ч
	public int isreal;// �Ƿ�ʵ�� �������ݱ��޸� �û�һ�������������ݵ���״̬
	public int orderAddresss;// �µ���ַ ---���ϣ�
	public int orderUserId;// �µ��û� ���ϣ�
	public int userAddress;// �µ��û����ڵ�ַ
	public int subOrderType;// �µ���ʽ ��̨�����µ�
								// ��̨��Ӧ���µ�[��ѯ�û�[openid]|���֤��ѯ[�󶨲ſ���]-�Զ��µ����轻��]��΢��ǰ̨�����µ�,С�����µ���H5�µ���app�µ�
	public int comment;// �µ���ע
	public double expressPrice;// ����֧���Ŀ�ݷ�
	public double orderAmount;// �µ����
	public int orderNum;// �µ�����
	public double yhq;// �Ż�ȯ������
	public double zb;// �ǱҼ�����
	public int yhqid;// �Ż�ȯid
	public int zbid;// �ǱҼ�����㷽ʽ �Ǳ�����һ����� 
	public double paySxf;// ֧��������
	public double ewx;// �����շ���
	public double otherFee;//�������� �Ź���
	public int orderFlag;//������� �ⵥ|�ۿۣ�
	public String reMark;//��ע
	public String realName;//����
    public String realCardId;//�ֻ��� �µ��ֻ���
    public String realPhoneNumber;//���֤��
    public int isAccidentInsurance;//�Ƿ�Ͷ������
    public int isAccidentInsuranceCompany;//Ͷ���ı��չ�˾
    public int isAccidentInsuranceNumber;//Ͷ���ı��յ���
    //
    public int groupId;	//�Ź����
 //���Ź���ű� �������� �ﵽ���ڶ���������Ź���� ����״̬ �Ź���Ч��  ���ﵽ �����Ź���Ų��йض��� ���ݶ���ִ���˿�
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}
	public long getOrderVaidDate() {
		return orderVaidDate;
	}
	public void setOrderVaidDate(long orderVaidDate) {
		this.orderVaidDate = orderVaidDate;
	}
	public long getVerifyVaildDate() {
		return verifyVaildDate;
	}
	public void setVerifyVaildDate(long verifyVaildDate) {
		this.verifyVaildDate = verifyVaildDate;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getProductAttrId() {
		return productAttrId;
	}
	public void setProductAttrId(int productAttrId) {
		this.productAttrId = productAttrId;
	}
	public int getBuyType() {
		return buyType;
	}
	public void setBuyType(int buyType) {
		this.buyType = buyType;
	}
	public int getBuyApi() {
		return buyApi;
	}
	public void setBuyApi(int buyApi) {
		this.buyApi = buyApi;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getIsreal() {
		return isreal;
	}
	public void setIsreal(int isreal) {
		this.isreal = isreal;
	}
	public int getOrderAddresss() {
		return orderAddresss;
	}
	public void setOrderAddresss(int orderAddresss) {
		this.orderAddresss = orderAddresss;
	}
	public int getOrderUserId() {
		return orderUserId;
	}
	public void setOrderUserId(int orderUserId) {
		this.orderUserId = orderUserId;
	}
	public int getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(int userAddress) {
		this.userAddress = userAddress;
	}
	public int getSubOrderType() {
		return subOrderType;
	}
	public void setSubOrderType(int subOrderType) {
		this.subOrderType = subOrderType;
	}
	public int getComment() {
		return comment;
	}
	public void setComment(int comment) {
		this.comment = comment;
	}
	public double getExpressPrice() {
		return expressPrice;
	}
	public void setExpressPrice(double expressPrice) {
		this.expressPrice = expressPrice;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	public double getYhq() {
		return yhq;
	}
	public void setYhq(double yhq) {
		this.yhq = yhq;
	}
	public double getZb() {
		return zb;
	}
	public void setZb(double zb) {
		this.zb = zb;
	}
	public int getYhqid() {
		return yhqid;
	}
	public void setYhqid(int yhqid) {
		this.yhqid = yhqid;
	}
	public int getZbid() {
		return zbid;
	}
	public void setZbid(int zbid) {
		this.zbid = zbid;
	}
	public double getPaySxf() {
		return paySxf;
	}
	public void setPaySxf(double paySxf) {
		this.paySxf = paySxf;
	}
	public double getEwx() {
		return ewx;
	}
	public void setEwx(double ewx) {
		this.ewx = ewx;
	}
	public String getReMark() {
		return reMark;
	}
	public void setReMark(String reMark) {
		this.reMark = reMark;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getRealCardId() {
		return realCardId;
	}
	public void setRealCardId(String realCardId) {
		this.realCardId = realCardId;
	}
	public String getRealPhoneNumber() {
		return realPhoneNumber;
	}
	public void setRealPhoneNumber(String realPhoneNumber) {
		this.realPhoneNumber = realPhoneNumber;
	}
	public int getIsAccidentInsurance() {
		return isAccidentInsurance;
	}
	public void setIsAccidentInsurance(int isAccidentInsurance) {
		this.isAccidentInsurance = isAccidentInsurance;
	}
	public int getIsAccidentInsuranceCompany() {
		return isAccidentInsuranceCompany;
	}
	public void setIsAccidentInsuranceCompany(int isAccidentInsuranceCompany) {
		this.isAccidentInsuranceCompany = isAccidentInsuranceCompany;
	}
	public int getIsAccidentInsuranceNumber() {
		return isAccidentInsuranceNumber;
	}
	public void setIsAccidentInsuranceNumber(int isAccidentInsuranceNumber) {
		this.isAccidentInsuranceNumber = isAccidentInsuranceNumber;
	}
	
}
