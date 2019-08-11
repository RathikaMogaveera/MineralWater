package com.mineral.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shopimages")
public class ShopImages {

	@Id
	@Column(name="Id")
	private int id;
	
	@Column(name="ShopId")
	private String shopId;
	
	@Column(name="ImageType")
	private String imageType;
	
	@Column(name="Path")
	private String path;
	
	@Column(name="ActiveStatus")
	private char activeStatus;
	
	@Column(name="CreatedBy")
	private String createdBy;
	
	@Column(name="CreatedOn")
	private Date createdOn;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id=id;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getImageType() {
		return imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
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
		return "ShopImages [Id=" + id + ", shopId=" + shopId + ", imageType="
				+ imageType + ", path=" + path + ", activeStatus="
				+ activeStatus + ", createdBy=" + createdBy + ", createdOn="
				+ createdOn + "]";
	}
	
}
