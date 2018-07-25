package org.liferayasif.spring.reference.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.liferayasif.spring.reference.dao.AbstractDao;
import org.liferayasif.spring.reference.dao.UserDao;
import org.liferayasif.spring.reference.model.User;
import org.springframework.stereotype.Repository;


@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao{

	@Override
	@SuppressWarnings("unchecked")
	public List<User> getAllUsers() {
		Criteria criteria = createEntityCriteria();
		return (List<User>) criteria.list();
	}

	@Override
	public User getUser(Integer id) {
		return getByKey(id);
	}

	@Override
	public void addUser(User user) {
		persist(user);
	}

	@Override
	public void deleteUser(Integer id) {
		Query query = getSession().createSQLQuery("delete from Employee where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}

	@Override
	public User updateUser(User user) {
		return null;
	}

	
}
