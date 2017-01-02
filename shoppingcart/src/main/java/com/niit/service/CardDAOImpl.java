package com.niit.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.modal.Card;


@Repository("CardDAO")
public class CardDAOImpl implements CardDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSession()
	{
		return sessionFactory;
		
	}
	public CardDAOImpl(SessionFactory sessionFactory)
	{
		super();
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<Card> getAllCard() {
		return sessionFactory.getCurrentSession().createQuery("from Card").list();
	}

	@Transactional
	public Card getCard(int cardid) {
        return (Card)sessionFactory.getCurrentSession().get(Card.class, cardid);
	}

	@Transactional
	public void insertCard(Card card) {
		sessionFactory.getCurrentSession().saveOrUpdate(card);
		
	}

	@Transactional
	public void saveorupdateCard(Card card) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public void deleteCard(int id) {
		Card deleteCard=new Card();
		deleteCard.setCardId(id);
		sessionFactory.getCurrentSession().delete(deleteCard);


	}

	public void deleteAllCard(Card card) {
		// TODO Auto-generated method stub

	}

}
