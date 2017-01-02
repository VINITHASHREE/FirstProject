package com.niit.modal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "User")
@Component
public class User {
	@Id
	@Column
	@GeneratedValue
	private int userid;


	private String un;

	private String em;
	
	private String password;
	
	private long mm;
	
	private boolean enabled=true;

	private String address;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="userid")
	private Role role;
	public Role getRole() {
		return role;
	}
	public void setRole(Role role)
	{
		this.role=role;
	}

	public boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	

	public int getUserId() {
		return userid;
	}

	public void setUserId(int userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUn() {
		return un;
	}

	public void setUn(String un) {
		this.un = un;
	}

	public String getEm() {
		return em;
	}

	public void setEm(String em) {
		this.em = em;
	}

	public long getMm() {
		return mm;
	}

	public void setMm(long mm) {
		this.mm = mm;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}