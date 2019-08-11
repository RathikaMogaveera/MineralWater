package com.mineral.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="branddetails")
public class BrandDetails {

	@Id
	@Column(name="BrandId")
	private int brandId;
	
	@Column(name="ShopId")
	private String shopId;
	
	@Column(name="BrandName")
	private String brandName;
	
	@Column(name="BrandImage")
	private String brandImage;
	
	@Column(name="BottleSize")
	private float bottleSize;
	
	@Column(name="Price")
	private double price;
	
	@Column(name="CreatedBy")
	private String createdBy;
	
	@Column(name="CreatedOn")
	private Date createdOn;

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandImage() {
		return brandImage;
	}

	public void setBrandImage(String brandImage) {
		this.brandImage = brandImage;
	}

	public float getBottleSize() {
		return bottleSize;
	}

	public void setBottleSize(float bottleSize) {
		this.bottleSize = bottleSize;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
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
		return "BrandDetails [brandId=" + brandId + ", shopId=" + shopId
				+ ", brandName=" + brandName + ", brandImage=" + brandImage
				+ ", bottleSize=" + bottleSize + ", price=" + price
				+ ", createdBy=" + createdBy + ", createdOn=" + createdOn + "]";
	}

}
