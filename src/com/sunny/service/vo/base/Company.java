package com.sunny.service.vo.base;

public class Company {
//公司信息表
	public int firstIndustry;// 一级行业
	public int endIndustry; // 二级行业
	public String legalName;// 法定代表人
	public String legalMobilePhone;// 代表人手机号
	public String legalCardId;// 代表人身份证号
	public String financeName;// 财务联系人
	public String financeMobilePhone;// 财务手机号
	public String financeCardId;// 财务身份证号
	public int openLicenseId;// 开户许可证编号
	public int businessLicense;// 营业许可证编号
	public String openLicenseImgSrc;// 开户许可证图片
	public String buisinessLicenseImgSrc;// 营业执照图片
	public int getFirstIndustry() {
		return firstIndustry;
	}
	public void setFirstIndustry(int firstIndustry) {
		this.firstIndustry = firstIndustry;
	}
	public int getEndIndustry() {
		return endIndustry;
	}
	public void setEndIndustry(int endIndustry) {
		this.endIndustry = endIndustry;
	}
	public String getLegalName() {
		return legalName;
	}
	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}
	public String getLegalMobilePhone() {
		return legalMobilePhone;
	}
	public void setLegalMobilePhone(String legalMobilePhone) {
		this.legalMobilePhone = legalMobilePhone;
	}
	public String getLegalCardId() {
		return legalCardId;
	}
	public void setLegalCardId(String legalCardId) {
		this.legalCardId = legalCardId;
	}
	public String getFinanceName() {
		return financeName;
	}
	public void setFinanceName(String financeName) {
		this.financeName = financeName;
	}
	public String getFinanceMobilePhone() {
		return financeMobilePhone;
	}
	public void setFinanceMobilePhone(String financeMobilePhone) {
		this.financeMobilePhone = financeMobilePhone;
	}
	public String getFinanceCardId() {
		return financeCardId;
	}
	public void setFinanceCardId(String financeCardId) {
		this.financeCardId = financeCardId;
	}
	public int getOpenLicenseId() {
		return openLicenseId;
	}
	public void setOpenLicenseId(int openLicenseId) {
		this.openLicenseId = openLicenseId;
	}
	public int getBusinessLicense() {
		return businessLicense;
	}
	public void setBusinessLicense(int businessLicense) {
		this.businessLicense = businessLicense;
	}
	public String getOpenLicenseImgSrc() {
		return openLicenseImgSrc;
	}
	public void setOpenLicenseImgSrc(String openLicenseImgSrc) {
		this.openLicenseImgSrc = openLicenseImgSrc;
	}
	public String getBuisinessLicenseImgSrc() {
		return buisinessLicenseImgSrc;
	}
	public void setBuisinessLicenseImgSrc(String buisinessLicenseImgSrc) {
		this.buisinessLicenseImgSrc = buisinessLicenseImgSrc;
	}
	
}
