package com.mineral.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="orderdetails")
public class OrderDetails {

	@Id
	@Column(name="Id")
	private int id;
	
	@Column(name="OrderId")
	private String orderId;
	
	@Column(name="ShopId")
	private String shopId;
	
	@Column(name="UserId")
	private String userId;
	
	@Column(name="BrandId")
	private String brandId;
	
	@Column(name="Quantity")
	private int quantity;
	
	@Column(name="Discount")
	private double discount;
	
	@Column(name="TotalPrice")
	private double totalprice;
	
	@Column(name="CreatedBy")
	private String createdBy;
	
	@Column(name="CreatedOn")
	private Date createdOn;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getBrandId() {
		return brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
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
		return "OrderDetails [Id=" + id + ", orderId=" + orderId + ", shopId="
				+ shopId + ", userId=" + userId + ", brandId=" + brandId
				+ ", quantity=" + quantity + ", discount=" + discount
				+ ", totalprice=" + totalprice + ", createdBy=" + createdBy
				+ ", createdOn=" + createdOn + "]";
	}
}
