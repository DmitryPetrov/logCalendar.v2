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
@Table(name = "AttributeNames")
public class AttributeNames {

	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "attributenamesId")
	@SequenceGenerator( name = "attributenamesId", sequenceName = "attributenames_id_seq", allocationSize = 1, initialValue = 1 )
	@Column(name = "id", nullable = false, updatable = false, unique = true)
	private long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idUser")
	private AppUser user;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "date", nullable = false, updatable = false, unique = false)
	private Date date;

	@Column(name = "attribute01", nullable = false, updatable = false, unique = false)
	private String attribute01;
	
	@Column(name = "attribute02", nullable = false, updatable = false, unique = false)
	private String attribute02;
	
	@Column(name = "attribute03", nullable = false, updatable = false, unique = false)
	private String attribute03;
	
	@Column(name = "attribute04", nullable = false, updatable = false, unique = false)
	private String attribute04;
	
	@Column(name = "attribute05", nullable = false, updatable = false, unique = false)
	private String attribute05;
	
	@Column(name = "attribute06", nullable = false, updatable = false, unique = false)
	private String attribute06;
	
	@Column(name = "attribute07", nullable = false, updatable = false, unique = false)
	private String attribute07;
	
	@Column(name = "attribute08", nullable = false, updatable = false, unique = false)
	private String attribute08;
	
	@Column(name = "attribute09", nullable = false, updatable = false, unique = false)
	private String attribute09;
	
	@Column(name = "attribute10", nullable = false, updatable = false, unique = false)
	private String attribute10;
	
	public AttributeNames() {
		
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
	public String getAttribute01() {
		return attribute01;
	}
	public void setAttribute01(String attribute01) {
		this.attribute01 = attribute01;
	}
	public String getAttribute02() {
		return attribute02;
	}
	public void setAttribute02(String attribute02) {
		this.attribute02 = attribute02;
	}
	public String getAttribute03() {
		return attribute03;
	}
	public void setAttribute03(String attribute03) {
		this.attribute03 = attribute03;
	}
	public String getAttribute04() {
		return attribute04;
	}
	public void setAttribute04(String attribute04) {
		this.attribute04 = attribute04;
	}
	public String getAttribute05() {
		return attribute05;
	}
	public void setAttribute05(String attribute05) {
		this.attribute05 = attribute05;
	}
	public String getAttribute06() {
		return attribute06;
	}
	public void setAttribute06(String attribute06) {
		this.attribute06 = attribute06;
	}
	public String getAttribute07() {
		return attribute07;
	}
	public void setAttribute07(String attribute07) {
		this.attribute07 = attribute07;
	}
	public String getAttribute08() {
		return attribute08;
	}
	public void setAttribute08(String attribute08) {
		this.attribute08 = attribute08;
	}
	public String getAttribute09() {
		return attribute09;
	}
	public void setAttribute09(String attribute09) {
		this.attribute09 = attribute09;
	}
	public String getAttribute10() {
		return attribute10;
	}
	public void setAttribute10(String attribute10) {
		this.attribute10 = attribute10;
	}
}
