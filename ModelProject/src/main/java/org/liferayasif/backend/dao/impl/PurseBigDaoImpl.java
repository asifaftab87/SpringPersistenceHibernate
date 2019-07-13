package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.PurseBigDao;
import org.liferayasif.backend.model.PurseBig;
import org.springframework.stereotype.Repository;

@Repository("PurseBigDao")
public class PurseBigDaoImpl extends AbstractDao<Integer , PurseBig> implements PurseBigDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<PurseBig> getAllPurseBig() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public PurseBig getPurseBigById(Integer id) {
		return getByKey(id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PurseBig> getPurseBigByPrice(Integer price) {
		Criteria criteria = getSession().createCriteria(PurseBig.class);
		criteria.add(Restrictions.eq("price", price));
		List<PurseBig> purseBigList = criteria.list();
		return purseBigList;
	}

	@Override
	public void addPurse(PurseBig purseBig) {
		 persist(purseBig);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PurseBig> findByName(String name) {
		Criteria criteria = getSession().createCriteria(PurseBig.class);
		criteria.add(Restrictions.eq("name", name));
		List<PurseBig> purseBigList = criteria.list();
		return purseBigList;
	}

	@Override
	public void deletePurseBigById(Integer id) {
		Query query =getSession().createSQLQuery("delete from PurseBig where id :id");
		query.setInteger("Id", id);
		query.executeUpdate();
	}

	@Override
	public void deletePurseBigByPrice(Integer price) {
		Query query =getSession().createSQLQuery("delete from Purse where price :price");
		query.setInteger("Price", price);
		query.executeUpdate();
		
	}
	

}
