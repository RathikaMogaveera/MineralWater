package com.mineral.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="merchant")
public class Merchant {
	@Id
	@Column(name="Id")
	private int id;
	
	@Column(name="ShopId")
	private String shopId;
	
	@Column(name="ShopName")
	private String shopName;
	
	@Column(name="Address")
	private String address;
	
	@Column(name="EmailId")
	private String emailId;
	
	@Column(name="ActiveStatus")
	private char activeStatus;
	
	@Column(name="CreatedBy")
	private String createdBy;
	
	@Column(name="CreatedOn")
	private Date createdOn;

	public int getBrandId() {
		return id;
	}

	public void setBrandId(int brandId) {
		this.id = brandId;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public char getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(char activeStatus) {
		this.activeStatus = activeStatus;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Override
	public String toString() {
		return "BrandDetails [brandId=" + id + ", shopId=" + shopId
				+ ", shopName=" + shopName + ", address=" + address
				+ ", emailId=" + emailId + ", activeStatus=" + activeStatus
				+ ", createdBy=" + createdBy + ", createdOn=" + createdOn + "]";
	}
}
