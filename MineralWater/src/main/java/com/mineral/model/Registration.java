package com.mineral.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="registration")
public class Registration {

	@Id
	@Column(name="Id")
	private int id;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="ContactNumber")
	private String contactNumber;
	
	@Column(name="Password")
	private String password;
	
	@Column(name="Role")
	private String role;
	
	@Column(name="CreatedBy")
	private String createdBy;
	
	@Column(name="CreatedOn")
	private Date createdOn;
	
	@Column(name="UpdatedBy")
	private String updatedBy;
	
	@Column(name="UpdatedOn")
	private Date updatedOn;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id=id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	@Override
	public String toString() {
		return "Registration [Id=" + id + ", email=" + email
				+ ", contactNumber=" + contactNumber + ", password=" + password
				+ ", role=" + role + ", createdBy=" + createdBy
				+ ", createdOn=" + createdOn + ", updatedBy=" + updatedBy
				+ ", updatedOn=" + updatedOn + "]";
	}
	
}
