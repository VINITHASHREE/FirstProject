package com.niit.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity 
@Table(name = "OrderConfirmation")
@Component 

public class OrderConfirmation {
	
	@Column
	private int userid ;
	@Column
	private int cartid;
	@Column
	private int billingid; 
	@Column
	private int shippingid;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	public int getBillingid() {
		return billingid;
	}
	public void setBillingid(int billingid) {
		this.billingid = billingid;
	}
	public int getShippingid() {
		return shippingid;
	}
	public void setShippingid(int shippingid) {
		this.shippingid = shippingid;
	}
	
	
}
