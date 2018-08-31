package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.PurseDao;
import org.liferayasif.backend.model.Purse;
import org.springframework.stereotype.Repository;

@Repository("PurseDao")
public class PurseDaoImpl extends AbstractDao<Integer , Purse> implements PurseDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Purse> getAllPurse() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public Purse getPurseById(Integer id) {
		return getByKey(id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Purse> getPurseByPrice(Integer price) {
		Criteria criteria = getSession().createCriteria(Purse.class);
		criteria.add(Restrictions.eq("price", price));
		List<Purse> purseList = criteria.list();
		return purseList;
	}

	@Override
	public Purse addPurse(Purse purse) {
		 persist(purse);
		 return purse;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Purse> findByName(String name) {
		Criteria criteria = getSession().createCriteria(Purse.class);
		criteria.add(Restrictions.eq("name", name));
		List<Purse> purseList = criteria.list();
		return purseList;
	}

	@Override
	public void deletePurseById(Integer id) {
		Query query =getSession().createSQLQuery("delete from Purse where id :id");
		query.setInteger("Id", id);
		query.executeUpdate();
		
	}

	@Override
	public void deletePurseByPrice(Integer price) {
		Query query =getSession().createSQLQuery("delete from Purse where price :price");
		query.setInteger("Price", price);
		query.executeUpdate();
		
	}

}
