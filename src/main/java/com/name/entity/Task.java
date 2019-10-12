package com.name.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "Task")
public class Task {

	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "taskId")
	@SequenceGenerator( name = "taskId", sequenceName = "task_id_seq", allocationSize = 1, initialValue = 1 )
	@Column(name = "id", nullable = false, updatable = false, unique = true)
	private long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idUser")
	private AppUser user;
	
	@Column(name = "title", nullable = false, updatable = false, unique = false)
	private String title;
	
	@Column(name = "description", nullable = false, updatable = false, unique = false)
	private String description;
	
	@Column(name = "done", nullable = false, updatable = false, unique = false)
	private boolean done;
	
	@Column(name = "doneCriteria", nullable = false, updatable = false, unique = false)
	private String doneCriteria;
	
	@Column(name = "dateOfStart", nullable = false, updatable = false, unique = false)
	private Date dateOfStart;
	
	@Column(name = "dateOfEnd", nullable = false, updatable = false, unique = false)
	private String dateOfEnd;
	
	public Task() {
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public AppUser getUser() {
		return user;
	}
	public void setUser(AppUser user) {
		this.user = user;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	public String getDoneCriteria() {
		return doneCriteria;
	}
	public void setDoneCriteria(String doneCriteria) {
		this.doneCriteria = doneCriteria;
	}
	public Date getDateOfStart() {
		return dateOfStart;
	}
	public void setDateOfStart(Date dateOfStart) {
		this.dateOfStart = dateOfStart;
	}
	public String getDateOfEnd() {
		return dateOfEnd;
	}
	public void setDateOfEnd(String dateOfEnd) {
		this.dateOfEnd = dateOfEnd;
	}
	
}
