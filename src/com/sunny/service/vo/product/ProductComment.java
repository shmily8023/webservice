package com.sunny.service.vo.product;

public class ProductComment {

//=======��Ʒ����=============//
	public int ids;// ���۱���
	public int productId;// ��Ʒ���
	public int productType;// ��Ʒ���� ���� ���ϡ�����
	public int orderId;// ����Id //��ȡ �µ�ʱ�� ���ʱ�� ����Ϣ
	public int commentUserId;// �����û�Id
	public int commentTime;// ����ʱ��
	public double commentRank;// �����Ǽ�
	public int isContainsPic;// �Ƿ����ͼƬ
	public String commentContent;// ��������
	public String[] commentPicUrl;// ����ͼƬ·��
	
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getProductType() {
		return productType;
	}
	public void setProductType(int productType) {
		this.productType = productType;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCommentUserId() {
		return commentUserId;
	}
	public void setCommentUserId(int commentUserId) {
		this.commentUserId = commentUserId;
	}
	public int getCommentTime() {
		return commentTime;
	}
	public void setCommentTime(int commentTime) {
		this.commentTime = commentTime;
	}
	public double getCommentRank() {
		return commentRank;
	}
	public void setCommentRank(double commentRank) {
		this.commentRank = commentRank;
	}
	public int getIsContainsPic() {
		return isContainsPic;
	}
	public void setIsContainsPic(int isContainsPic) {
		this.isContainsPic = isContainsPic;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public String[] getCommentPicUrl() {
		return commentPicUrl;
	}
	public void setCommentPicUrl(String[] commentPicUrl) {
		this.commentPicUrl = commentPicUrl;
	}
	
}
