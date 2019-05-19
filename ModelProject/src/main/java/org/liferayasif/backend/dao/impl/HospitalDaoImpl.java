package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.HospitalDao;
import org.liferayasif.backend.model.Hospital;
import org.springframework.stereotype.Repository;


@Repository("hospitalDao")
public class HospitalDaoImpl  extends AbstractDao<Integer, Hospital> implements HospitalDao{

	@Override
	@SuppressWarnings("unchecked")
	public List<Hospital> getAllHospitals() {
		Criteria criteria = createEntityCriteria();
		return (List<Hospital>) criteria.list();
	}

	@Override
	public Hospital getHospitalById(Integer id) {
		return getByKey(id);
	}

	@Override
	public Hospital addHospital(Hospital hospital) {
		persist(hospital);
		return hospital;
	}


	@Override
	public Hospital updateHospital(Hospital hospital) {
		getSession().update(hospital);
		return hospital;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Hospital> findByName(String name){
		
		Criteria criteria = getSession().createCriteria(Hospital.class);
		criteria.add(Restrictions.like("name", name, MatchMode.ANYWHERE));
		
		List<Hospital> hospitalList = criteria.list();

		return hospitalList;				
	}
	
}
