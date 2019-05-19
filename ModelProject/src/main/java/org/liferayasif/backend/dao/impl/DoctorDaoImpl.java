package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.DoctorDao;
import org.liferayasif.backend.model.Doctor;
import org.springframework.stereotype.Repository;


@Repository("doctorDao")
public class DoctorDaoImpl  extends AbstractDao<Integer, Doctor> implements DoctorDao{

	@Override
	@SuppressWarnings("unchecked")
	public List<Doctor> getAllDoctors() {
		Criteria criteria = createEntityCriteria();
		return (List<Doctor>) criteria.list();
	}

	@Override
	public Doctor getDoctorById(Integer id) {
		return getByKey(id);
	}

	@Override
	public Doctor addDoctor(Doctor doctor) {
		persist(doctor);
		return doctor;
	}


	@Override
	public Doctor updateDoctor(Doctor doctor) {
		getSession().update(doctor);
		return doctor;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Doctor> findByLastName(String lName){
		
		Criteria criteria = getSession().createCriteria(Doctor.class);
		criteria.add(Restrictions.eq("lName", lName));
		
		List<Doctor> doctorList = criteria.list();

		return doctorList;				
	}
	
}
