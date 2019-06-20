package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.MobileDao;
import org.liferayasif.backend.model.Mobile;
import org.springframework.stereotype.Repository;

@Repository("mobileDao")
public class MobileDaoImpl extends AbstractDao<Integer , Mobile> implements MobileDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Mobile> getAllMobiles() {
		Criteria criteria=createEntityCriteria();
		return criteria.list();
	}

	@Override
	public Mobile getMobileById(Integer id) {
		return getByKey(id);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Mobile> findByName(String name) {
		Criteria criteria = getSession().createCriteria(Mobile.class);
		criteria.add(Restrictions.eqProperty("name", name));
		List<Mobile> mobileList = criteria.list();
		return mobileList;
	}

	@Override
	public Mobile addMobile(Mobile mobile) {
		persist(mobile);
		return mobile;
	}

	@Override
	public Mobile updateMobile(Mobile mobile) {
		getSession().update(mobile);
		return mobile;
	}

	@Override
	public void deleteMobile(Integer id) {
		Query query = getSession().createSQLQuery("delete from Mobile where id=:id");
		query.setInteger("id", id);
		query.executeUpdate();
		
	}

}
