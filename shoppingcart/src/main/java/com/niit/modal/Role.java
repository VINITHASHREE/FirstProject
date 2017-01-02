package com.niit.modal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.springframework.stereotype.Component;

@Entity 
@Table(name = "Role")
@Component
public class Role {
	
	@Id
	@Column
	@GeneratedValue
private int roleid;
	
	@Column
private String role;
	@Column
private String un;
	public String getUn() {
		return un;
	}


	public void setUn(String un) {
		this.un = un;
	}


	@Column
private String password;
	@Column
private boolean enabled;


@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="userid")
private User user;





public int getRoleid() {
	return roleid;
}


public void setRoleid(int roleid) {
	this.roleid = roleid;
}


public String getRole() {
	return role;
}


public void setRole(String role) {
	this.role = role;
}




public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}



public User getUser() {
	return user;
}


public void setUser(User user) {
	this.user = user;
}
public boolean getEnabled() {
	return enabled;
}


public void setEnabled(boolean enabled) {
	this.enabled = enabled;
}



}
