package com.sunny.service.vo.product;

public class ProductComment {

//=======产品评论=============//
	public int ids;// 评论表编号
	public int productId;// 产品编号
	public int productType;// 产品类型 区域 联合。。。
	public int orderId;// 订单Id //抽取 下单时间 完成时间 等信息
	public int commentUserId;// 评论用户Id
	public int commentTime;// 评论时间
	public double commentRank;// 评论星级
	public int isContainsPic;// 是否包含图片
	public String commentContent;// 评论内容
	public String[] commentPicUrl;// 评论图片路径
	
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
