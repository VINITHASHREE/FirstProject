package com.niit.service;

import java.util.List;

import com.niit.modal.User;

public interface UserDAO {

	   public List<User> getAllUser();
	   public User getUser(int userid);
	   public void insertUser(User user);
	   public void updateUser(User user);
	   public void deleteUser(int id);
	   public void deleteAllUser(User user);
}
