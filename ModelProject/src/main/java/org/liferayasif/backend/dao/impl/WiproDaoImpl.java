package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.WiproDao;
import org.liferayasif.backend.model.Wipro;
import org.springframework.stereotype.Repository;



@Repository("wiproDao")
public class WiproDaoImpl  extends AbstractDao<Integer, Wipro> implements WiproDao{

	
	@Override
	@SuppressWarnings("unchecked")
	public List<Wipro> getAllWipros() {
		Criteria criteria = createEntityCriteria();
		return (List<Wipro>) criteria.list();
	}

	@Override
	public Wipro getWiproById(Integer id) {
		return getByKey(id);
	}

	@Override
	public void adddWipro(Wipro wipro) {
		persist(wipro);
	}

	@Override
	public void deleteWipro(Integer id) {
		Query query = getSession().createSQLQuery("delete from WIPRO where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Wipro> getWiproByAvgSalary(double avgSalary) {
		
		Criteria criteria = getSession().createCriteria(Wipro.class);
		criteria.add(Restrictions.eq("avgSalary", avgSalary));
		List<Wipro> wiproList = criteria.list();
		return wiproList;
	}

	

	
	
}
