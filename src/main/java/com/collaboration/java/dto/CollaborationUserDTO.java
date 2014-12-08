package com.collaboration.java.dto;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class CollaborationUserDTO {
	
	@Id
	@GeneratedValue
	private long user_id;
	
	private static final long serialVersionUID = 1L;
	
	private String first_name;
	private String last_name;
	private Date created_datetime;
	private Date updated_datetime;
	private boolean active;
	private long user_type_id;
	private long user_work_id;
	private long user_education_id;
	private String email_id;	
	
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public Date getCreated_datetime() {
		return created_datetime;
	}
	public void setCreated_datetime(Date created_datetime) {
		this.created_datetime = created_datetime;
	}
	public Date getUpdated_datetime() {
		return updated_datetime;
	}
	public void setUpdated_datetime(Date updated_datetime) {
		this.updated_datetime = updated_datetime;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public long getUser_type_id() {
		return user_type_id;
	}
	public void setUser_type_id(long user_type_id) {
		this.user_type_id = user_type_id;
	}
	public long getUser_work_id() {
		return user_work_id;
	}
	public void setUser_work_id(long user_work_id) {
		this.user_work_id = user_work_id;
	}
	public long getUser_education_id() {
		return user_education_id;
	}
	public void setUser_education_id(long user_education_id) {
		this.user_education_id = user_education_id;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	

	
}
