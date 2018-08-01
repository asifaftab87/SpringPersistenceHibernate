package org.liferayasif.backend.service;

import java.util.List;

import org.liferayasif.backend.model.User;

public interface UserService {

	public List<User> getAllUsers();
	
	public User getUserById(Integer id);
	
	public void addUser(User user);
	
	public void deleteUser(Integer id);
	
	public User updateUser(User user);
	
}
