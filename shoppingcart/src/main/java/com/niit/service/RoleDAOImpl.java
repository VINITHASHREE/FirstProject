package com.niit.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.modal.Role;

@Repository("RoleDAO")
public class RoleDAOImpl implements RoleDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSession()
	{
		return sessionFactory;
		
	}
	public RoleDAOImpl(SessionFactory sessionFactory)
	{
		super();
		this.sessionFactory = sessionFactory;
	}
    public void setSessionFactory(SessionFactory sessionFactory) {
    	
		this.sessionFactory = sessionFactory;
	}


	@Transactional
	public List<Role> getAllRole() {
		return sessionFactory.getCurrentSession().createQuery("from Role").list();
	}

	@Transactional
	public Role getRole(String username) {
		return (Role)sessionFactory.getCurrentSession().createQuery("from Role where un='"+username+"'").uniqueResult();
	}

	@Transactional
	public void insertRole(Role role) {
		sessionFactory.getCurrentSession().saveOrUpdate(role);

	}

	@Transactional
	public void saveorupdateRole(Role role) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public void deleteRole(int id) {
		Role deleteRole=new Role();
		deleteRole.setRoleid(id);
		sessionFactory.getCurrentSession().delete(deleteRole);


	}

	@Transactional
	public void deleteAllRole(Role role) {
		// TODO Auto-generated method stub

	}

}
