package com.niit.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.modal.Shipping;


@Repository("ShippingDAO")

public class ShippingDAOImpl implements ShippingDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSession()
	{
		return sessionFactory;
		
	}
	public ShippingDAOImpl(SessionFactory sessionFactory)
	{
		super();
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<Shipping> getAllShipping() {
		return sessionFactory.getCurrentSession().createQuery("from Shipping").list();
	}

	@Transactional
	public Shipping getShipping(int shippingid) {
		return (Shipping)sessionFactory.getCurrentSession().get(Shipping.class, shippingid);
	}

	@Transactional
	public void insertShipping(Shipping shipping) {
	    sessionFactory.getCurrentSession().saveOrUpdate(shipping);
		
	}

	@Transactional
	public void updateShipping(Shipping shipping) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public void deleteShipping(int id)  {
		Shipping deleteShipping=new Shipping();
		deleteShipping.setShippingId(id);
		sessionFactory.getCurrentSession().delete(deleteShipping);


	}

	@Transactional
	public void deleteAllShipping(Shipping shipping) {
		// TODO Auto-generated method stub

	}

}
