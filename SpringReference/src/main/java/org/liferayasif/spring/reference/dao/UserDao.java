package org.liferayasif.spring.reference.dao;

import java.util.List;

import org.liferayasif.spring.reference.model.User;

public interface UserDao {

	public List<User> getAllUsers();
	
	public User getUser(Integer id);
	
	public void addUser(User user);
	
	public void deleteUser(Integer id);
	
	public User updateUser(User user);
	
}
