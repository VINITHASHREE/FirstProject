package com.niit.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.modal.Category;

@Repository("CategoryDAO")

public class CategoryDAOImpl implements CategoryDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSession()
	{
		return sessionFactory;
		
	}
	public CategoryDAOImpl(SessionFactory sessionFactory)
	{
		super();
		this.sessionFactory = sessionFactory;
	}


	@Transactional
	public List<Category> getAllCategory() {
		
		return sessionFactory.getCurrentSession().createQuery("from Category").list();
    
	}

	@Transactional
	public Category getCategory(int categoryid) {
		
		return (Category)sessionFactory.getCurrentSession().get(Category.class, categoryid);
		
	}

	@Transactional
	public void insertCategory(Category category) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(category);

	}
	
	@Transactional
	public void deleteCategory(int id) {
		Category deleteCategory=new Category();
		deleteCategory.setCid(id);
		sessionFactory.getCurrentSession().delete(deleteCategory);
	}
@Transactional
	public void updateCategory(Category category) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(category);

	}

	

	public void deleteAllCategory(Category category) {
		// TODO Auto-generated method stub

	}

}
