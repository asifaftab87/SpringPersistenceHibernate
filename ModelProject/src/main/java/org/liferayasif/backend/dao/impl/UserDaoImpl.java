package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.UserDao;
import org.liferayasif.backend.model.User;
import org.springframework.stereotype.Repository;


@Repository("userDao")
public class UserDaoImpl  extends AbstractDao<Integer, User> implements UserDao{

	@Override
	@SuppressWarnings("unchecked")
	public List<User> getAllUsers() {
		Criteria criteria = createEntityCriteria();
		return (List<User>) criteria.list();
	}

	@Override
	public User getUserById(Integer id) {
		return getByKey(id);
	}

	@Override
	public void addUser(User user) {
		persist(user);
	}

	@Override
	public void deleteUser(Integer id) {
		Query query = getSession().createSQLQuery("delete from User where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}

	@Override
	public User updateUser(User user) {
		getSession().update(user);
		return user;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<User> findByName(String name){
		
		Criteria criteria = getSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("name", name));
		
		List<User> userList = criteria.list();

		return userList;				
	}
	
}
