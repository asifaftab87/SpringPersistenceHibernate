package org.liferayasif.backend.service.impl;

import java.util.List;

import org.liferayasif.backend.dao.UserDao;
import org.liferayasif.backend.model.User;
import org.liferayasif.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> getAllUsers() {
		List<User> userList = userDao.getAllUsers();
		return userList;
	}

	@Override
	public User getUserById(Integer id) {
		User user = userDao.getUserById(id);
		return user;
	}

	@Override
	public void addUser(User user) {
		userDao.addUser(user);
	}

	@Override
	public void deleteUser(Integer id) {
		userDao.deleteUser(id);
	}

	@Override
	public User updateUser(User user) {
		return null;
	}

}
