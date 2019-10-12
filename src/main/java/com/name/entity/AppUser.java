package com.name.entity;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "AppUser")
public class AppUser {

	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "appuserId")
	@SequenceGenerator( name = "appuserId", sequenceName = "appuser_id_seq", allocationSize = 1, initialValue = 1 )
	@Column(name = "id", nullable = false, updatable = false, unique = true)
	private long id;
	
	@Column(name = "name", nullable = false, updatable = true, unique = true)
	private String name;
	
	@Column(name = "role", nullable = false, updatable = true, unique = false)
	private String role;
	
	@Column(name = "encryptedPassword", nullable = false, updatable = true, unique = false)
	private String encryptedPassword;
	
	@OneToMany(mappedBy = "user")
	private List<Day> daylist;
	
	@OneToMany(mappedBy = "user")
	private List<AttributeNames> attributeNamesList;
	
	@OneToMany(mappedBy = "user")
	private List<Task> taskList;
	
	public AppUser() {
		 
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEncryptedPassword() {
		return encryptedPassword;
	}
	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}

	public List<Day> getDaylist() {
		return daylist;
	}

	public void setDaylist(List<Day> daylist) {
		this.daylist = daylist;
	}

	public List<AttributeNames> getAttributeNamesList() {
		return attributeNamesList;
	}

	public void setAttributeNamesList(List<AttributeNames> attributeNamesList) {
		this.attributeNamesList = attributeNamesList;
	}

	public List<Task> getTaskList() {
		return taskList;
	}

	public void setTaskList(List<Task> taskList) {
		this.taskList = taskList;
	}
	
	
}
