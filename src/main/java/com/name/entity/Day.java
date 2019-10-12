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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "Day")
public class Day {
	
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "dayId")
	@SequenceGenerator( name = "dayId", sequenceName = "day_id_seq", allocationSize = 1, initialValue = 1 )
	@Column(name = "id", nullable = false, updatable = false, unique = true)
	private long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idUser")
	private AppUser user;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "date", nullable = false, updatable = false, unique = false)
	private Date date;
	
	@Column(name = "mood", nullable = false, updatable = false, unique = false)
	private int mood;
	
	@Column(name = "attribute01", nullable = false, updatable = false, unique = false)
	private boolean attribute01;
	
	@Column(name = "attribute02", nullable = false, updatable = false, unique = false)
	private boolean attribute02;
	
	@Column(name = "attribute03", nullable = false, updatable = false, unique = false)
	private boolean attribute03;
	
	@Column(name = "attribute04", nullable = false, updatable = false, unique = false)
	private boolean attribute04;
	
	@Column(name = "attribute05", nullable = false, updatable = false, unique = false)
	private boolean attribute05;
	
	@Column(name = "attribute06", nullable = false, updatable = false, unique = false)
	private boolean attribute06;
	
	@Column(name = "attribute07", nullable = false, updatable = false, unique = false)
	private boolean attribute07;
	
	@Column(name = "attribute08", nullable = false, updatable = false, unique = false)
	private boolean attribute08;
	
	@Column(name = "attribute09", nullable = false, updatable = false, unique = false)
	private boolean attribute09;
	
	@Column(name = "attribute10", nullable = false, updatable = false, unique = false)
	private boolean attribute10;
	

	@Column(name = "report", nullable = false, updatable = false, unique = false)
	private String report;
	
	public Day() {
		
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getMood() {
		return mood;
	}
	public void setMood(int mood) {
		this.mood = mood;
	}
	public boolean isAttribute01() {
		return attribute01;
	}
	public void setAttribute01(boolean attribute01) {
		this.attribute01 = attribute01;
	}
	public boolean isAttribute02() {
		return attribute02;
	}
	public void setAttribute02(boolean attribute02) {
		this.attribute02 = attribute02;
	}
	public boolean isAttribute03() {
		return attribute03;
	}
	public void setAttribute03(boolean attribute03) {
		this.attribute03 = attribute03;
	}
	public boolean isAttribute04() {
		return attribute04;
	}
	public void setAttribute04(boolean attribute04) {
		this.attribute04 = attribute04;
	}
	public boolean isAttribute05() {
		return attribute05;
	}
	public void setAttribute05(boolean attribute05) {
		this.attribute05 = attribute05;
	}
	public boolean isAttribute06() {
		return attribute06;
	}
	public void setAttribute06(boolean attribute06) {
		this.attribute06 = attribute06;
	}
	public boolean isAttribute07() {
		return attribute07;
	}
	public void setAttribute07(boolean attribute07) {
		this.attribute07 = attribute07;
	}
	public boolean isAttribute08() {
		return attribute08;
	}
	public void setAttribute08(boolean attribute08) {
		this.attribute08 = attribute08;
	}
	public boolean isAttribute09() {
		return attribute09;
	}
	public void setAttribute09(boolean attribute09) {
		this.attribute09 = attribute09;
	}
	public boolean isAttribute10() {
		return attribute10;
	}
	public void setAttribute10(boolean attribute10) {
		this.attribute10 = attribute10;
	}
	public String getReport() {
		return report;
	}
	public void setReport(String report) {
		this.report = report;
	}
	
	
}
