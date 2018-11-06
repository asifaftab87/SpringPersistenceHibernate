package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.WorstDao;
import org.liferayasif.backend.model.Ngo;
import org.liferayasif.backend.model.Worst;
import org.springframework.stereotype.Repository;

@Repository("WorstDao")
public class WorstDaoImpl extends AbstractDao<Integer ,Worst> implements WorstDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Worst> getAllWorst() {
		Criteria criteria=createEntityCriteria();
		return criteria.list();
	}

	@Override
	public Worst findById(Integer id) {
		return getByKey(id);
		
	}

	@Override
	public Worst addWorst(Worst worst) {
		persist(worst);
		return worst;
	}

	@Override
	public Worst updateWorst(Worst worst) {
		getSession().update(worst);
		return worst;
	}

	@Override
	public void deleteById(Integer worstId) {
		Query query = getSession().createSQLQuery("delete from WORST where WORST_ID=:worstId");
		query.setInteger("worstId", worstId);
		query.executeUpdate();
		
	}

	@Override
	public void deletbyEmail(String emailAddress) {
		Query query = getSession().createSQLQuery("delete from WORST where emailAddress=:emailAddress");
		query.setString("emailAddress", emailAddress);
		query.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Worst> findByEmail(String emailAddress) {
		Criteria criteria  =getSession().createCriteria(Worst.class);
		criteria.add(Restrictions.eq("emailAddress", emailAddress));
		List<Worst> worstList=criteria.list();
		return worstList;
	}

}
