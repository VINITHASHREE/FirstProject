package com.niit.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity 
@Table(name = "Cart")
@Component
public class Cart {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int cartid;
	
	@Column
	private String username;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Column
	private int userid;
	@Column
	private int id;
	@Column
	private int quantity;
	@Column
	private int price ; 
	@Column
	private String pn;
	
	public String getPn() {
		return pn;
	}
	public void setPn(String pn) {
		this.pn = pn;
	}
	public int getCartId() {
		 return cartid;
		}
		public void setCartId(int cartid) {
			this.cartid = cartid;
		}
	public int getUserId() {
		 return userid;
		}
		public void setUserId(int userid) {
			this.userid = userid;
		}
	
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getQuantity() {
			 return quantity;
			}
			public void setQuantity(int quantity) {
				this.quantity = quantity;
			}
			public int getPrice() {
				 return price;
				}
				public void setPrice(int price) {
					this.price = price;
				}
}
