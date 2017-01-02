package com.niit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.modal.User;

@Repository("UserDAO")
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSession() {
		return sessionFactory;

	}

	public UserDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<User> getAllUser() {

		return sessionFactory.getCurrentSession().createQuery("from User").list();
	}

	@Transactional
	public User getUser(int userid) {
		/*User user = (User) sessionFactory.getCurrentSession().createQuery("from User where un='" + username + "'")
				.uniqueResult();
		return user;*/
		return(User)sessionFactory.getCurrentSession().get(User.class, userid);

	}

	@Transactional
	public void insertUser(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);

	}

	@Transactional
	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public void deleteUser(int id) {
		User deleteUser = new User();
		deleteUser.setUserId(id);
		sessionFactory.getCurrentSession().delete(deleteUser);

	}

	public void deleteAllUser(User user) {
		// TODO Auto-generated method stub

	}

	
}
