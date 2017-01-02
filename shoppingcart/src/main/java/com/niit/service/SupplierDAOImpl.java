package com.niit.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.modal.Supplier;


@Repository("SupplierDAO")
public class SupplierDAOImpl implements SupplierDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSession()
	{
		return sessionFactory;
		
	}
	public SupplierDAOImpl(SessionFactory sessionFactory)
	{
		super();
		this.sessionFactory = sessionFactory;
	}


	@Transactional
	public List<Supplier> getAllSupplier() {
		return sessionFactory.getCurrentSession().createQuery("from Supplier").list();
	}


	@Transactional
	public Supplier getSupplier(int supplierid) {
		return (Supplier)sessionFactory.getCurrentSession().get(Supplier.class, supplierid);
	}

	@Transactional
	public void insertSupplier(Supplier supplier) {
		sessionFactory.getCurrentSession().saveOrUpdate(supplier);

	}
	
	@Transactional
	public void deleteSupplier(int id) {
		Supplier deleteSupplier=new Supplier();
		deleteSupplier.setSid(id);
		sessionFactory.getCurrentSession().delete(deleteSupplier);
	}

@Transactional
	public void updateSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(supplier);

	}

	

	public void deleteAllSupplier(Supplier supplier) {
		// TODO Auto-generated method stub

	}


	

}
