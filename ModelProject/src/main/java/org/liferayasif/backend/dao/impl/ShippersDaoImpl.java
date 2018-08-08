package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.ShippersDao;
import org.liferayasif.backend.model.Shippers;
import org.springframework.stereotype.Repository;

@Repository("shippersDao")
public class ShippersDaoImpl extends AbstractDao<Integer, Shippers> implements ShippersDao{
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Shippers> getAllShippers() {
		Criteria criteria = createEntityCriteria();
		return (List<Shippers>) criteria.list();
	}

	@Override
	public Shippers getShippersById(Integer id) {
		return getByKey(id);
	}

	@Override
	public Shippers addShippers(Shippers shippers) {
		persist(shippers);
		return shippers;
	}

	@Override
	public void deleteShippers(Integer id) {
		Query query = getSession().createSQLQuery("delete from User where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}

	@Override
	public Shippers updateShippers(Shippers shippers) {
		getSession().update(shippers);
		return shippers;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Shippers> findByName(String name){
		
		Criteria criteria = getSession().createCriteria(Shippers.class);
		criteria.add(Restrictions.eq("name", name));
		
		List<Shippers> shippersList = criteria.list();

		return shippersList;				
	}
	

}
