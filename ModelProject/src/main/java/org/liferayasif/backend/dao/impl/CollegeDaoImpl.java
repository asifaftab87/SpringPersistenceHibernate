package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.CollegeDao;
import org.liferayasif.backend.model.College;
import org.springframework.stereotype.Repository;

@Repository("CollegeDao")

public class CollegeDaoImpl extends AbstractDao<Integer , College> implements CollegeDao {

	
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<College> getAllCollege() {
		Criteria criteria=createEntityCriteria();
		return criteria.list();
	}

	@Override
	public College getCollegeById(Integer id) {
		return getByKey(id);
	}

	@Override
	public List<College> getCollegeByState(String state) {
		Criteria criteria  =getSession().createCriteria(College.class);
		criteria.add(Restrictions.eqProperty(state, state));
		@SuppressWarnings("unchecked")
		List<College> collegeList=criteria.list();
		return collegeList;
	}

	@Override
	public College addCollege(College college) {
		persist(college);
		return college;
	}

	@Override
	public College updateCollege(College college) {
		getSession().update(college);
		return college;
	}

	@Override
	public void deleteCollegeById(Integer id) {
		Query query = getSession().createSQLQuery("delete from College where id:id");
		query.setInteger("id", id);
		query.executeUpdate();
		
	}

}
