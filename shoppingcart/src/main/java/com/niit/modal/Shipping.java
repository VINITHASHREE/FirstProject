package com.niit.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity 
@Table(name = "Shipping")
@Component
public class Shipping {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int shippingid;
	@Column
	private String username; 
	@Column
	private String emailid;  
	@Column
	private int price; 
	@Column
	private String address;
	@Column
	private int mobilenumber; 
	@Column
	private String city;
	@Column
	private int zipcode;
	
	public int getShippingId() {
		 return shippingid;
		}
		public void setShippingId(int shippingid) {
			this.shippingid = shippingid;
		}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(int mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	
}
