package com.niit.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity 
@Table(name = "Card")
@Component

public class Card {
	
	@Id
	@Column
	@GeneratedValue

	private int cardid ;
	@Column
	private String cardholdername;
	@Column
	private int cardnumber ; 
	@Column
	private int cvvnumber ;
	@Column
	private String cardtype;
	
	    public int getCardId() {
		 return cardid;
		}
		public void setCardId(int cardid) {
		 this.cardid = cardid;
		}
	    public String getCardHolderName() {
		 return cardholdername;
		}
		public void setCardHolderName(String cardholdername) {
		 this.cardholdername = cardholdername;
		}
		public int getCardNumber() {
		 return cardnumber;
		}
		public void setCardNumber(int cardnumber) {
		 this.cardnumber = cardnumber;
		}
		public int getCvvNumber() {
		 return cvvnumber;
		}
		public void setcvvnumber(int cvvnumber) {
		 this.cvvnumber = cvvnumber;
		}
		
		public String getCardType() {
			 return cardtype;
		}
		public void setCardType(String cardtype) {
		 this.cardtype = cardtype;
		}
}
