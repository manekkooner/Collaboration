package com.collaboration.java.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COLLABORATION_PROJECT")
public class CollaborationProjectDTO implements Serializable {


	@Id
	@GeneratedValue
	private long project_id;
	
	private static final long serialVersionUID = 1L;
	private String name;
	private String description;
	private long user_id;
	private long first_workflow_id;
	
	public long getProject_id() {
		return project_id;
	}
	public void setProject_id(long project_id) {
		this.project_id = project_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public long getFirst_workflow_id() {
		return first_workflow_id;
	}
	public void setFirst_workflow_id(long first_workflow_id) {
		this.first_workflow_id = first_workflow_id;
	}

	
	
	

}
