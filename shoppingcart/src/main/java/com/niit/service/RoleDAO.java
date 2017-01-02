package com.niit.service;

import java.util.List;

import com.niit.modal.Role;

public interface RoleDAO {

	   public List<Role> getAllRole();
	   public Role getRole(String username);
	   public void insertRole(Role role);
	   public void saveorupdateRole(Role role);
	   public void deleteRole(int id);
	   public void deleteAllRole(Role role);
	
}
