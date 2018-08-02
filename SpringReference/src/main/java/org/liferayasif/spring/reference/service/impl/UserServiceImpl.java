package org.liferayasif.spring.reference.service.impl;

import java.util.List;

import org.liferayasif.spring.reference.dao.UserDao;
import org.liferayasif.spring.reference.model.User;
import org.liferayasif.spring.reference.service.UserService;
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
	public User getUser(Integer id) {
		User user = userDao.getUser(id);
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
		return userDao.updateUser(user);
	}

}
