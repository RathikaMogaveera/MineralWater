package com.mineral.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orderStatus")
public class OrderStatus {

	@Id
	@Column(name="Id")
	private int id;
	
	@Column(name="OrderId")
	private String orderId;
	
	@Column(name="Status")
	private String status;
	
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

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
		return "OrderStatus [Id=" + id + ", orderId=" + orderId + ", status="
				+ status + ", createdBy=" + createdBy + ", createdOn="
				+ createdOn + "]";
	}
}
