package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.UserAddressDao;
import org.liferayasif.backend.model.UserAddress;
import org.springframework.stereotype.Repository;


@Repository("userAddressDao")
public class UserAddressDaoImpl  extends AbstractDao<Integer, UserAddress> implements UserAddressDao{

	@Override
	@SuppressWarnings("unchecked")
	public List<UserAddress> getAllUserAddresses() {
		Criteria criteria = createEntityCriteria();
		return (List<UserAddress>) criteria.list();
	}

	@Override
	public UserAddress getUserAddressById(Integer id) {
		return getByKey(id);
	}

	@Override
	public void addUserAddress(UserAddress userAddress) {
		persist(userAddress);
	}

	@Override
	public void deleteUserAddress(Integer id) {
		Query query = getSession().createSQLQuery("delete from User where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}

	@Override
	public UserAddress updateUserAddress(UserAddress userAddress) {
		getSession().update(userAddress);
		return userAddress;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<UserAddress> getUserAddressesByUserId(Integer id){
		
		Criteria criteria = getSession().createCriteria(UserAddress.class);
		criteria.add(Restrictions.eq("userId", id));
		
		List<UserAddress> userAddressesList = criteria.list();

		return userAddressesList;				
	}
	
}
