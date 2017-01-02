package com.niit.service;

import java.util.List;

import com.niit.modal.Card;

public interface CardDAO {
	

	 public List<Card> getAllCard();
	   public Card getCard(int cardid);
	   public void insertCard(Card card);
	   public void saveorupdateCard(Card card);
	   public void deleteCard(int id);
	   public void deleteAllCard(Card card);
	

}
