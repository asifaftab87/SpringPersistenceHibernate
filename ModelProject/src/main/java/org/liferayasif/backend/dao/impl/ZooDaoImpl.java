package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.ZooDao;
import org.liferayasif.backend.model.Zoo;
import org.springframework.stereotype.Repository;

@Repository("ZooDao")
public  class  ZooDaoImpl extends AbstractDao<Integer, Zoo> implements ZooDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Zoo> getAllZoos() {
		Criteria criteria = createEntityCriteria();
		return (List<Zoo>) criteria.list();
	}

	@Override
	public Zoo getZooById(Integer id) {
		return getByKey(id);
	}

	@Override
	public void addZoo(Zoo zoo) {
		persist(zoo);
		
	}

	@Override
	public void deleteZooById(Integer id) {
		Query query = getSession().createSQLQuery("delete from Zoo where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}

	@Override
	public Zoo updateZoo(Zoo zoo) {
		getSession().update(zoo);
		return zoo;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Zoo> findByName(String name) {
		Criteria criteria  = getSession().createCriteria(Zoo.class);
		criteria.add(Restrictions.eq("name", name));
		List<Zoo> zooList = criteria.list();
		return zooList;
	}
	
	
	
	
	
	
	
	
	
	

}
