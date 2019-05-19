package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.PatientDao;
import org.liferayasif.backend.model.Patient;
import org.springframework.stereotype.Repository;


@Repository("patientDao")
public class PatientDaoImpl  extends AbstractDao<Integer, Patient> implements PatientDao{

	@Override
	@SuppressWarnings("unchecked")
	public List<Patient> getAllPatients() {
		Criteria criteria = createEntityCriteria();
		return (List<Patient>) criteria.list();
	}

	@Override
	public Patient getPatientById(Integer id) {
		return getByKey(id);
	}

	@Override
	public Patient addPatient(Patient patient) {
		persist(patient);
		return patient;
	}


	@Override
	public Patient updatePatient(Patient patient) {
		getSession().update(patient);
		return patient;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Patient> findByLastName(String lName){
		
		Criteria criteria = getSession().createCriteria(Patient.class);
		criteria.add(Restrictions.like("lName", lName, MatchMode.ANYWHERE));
		
		List<Patient> patientList = criteria.list();

		return patientList;				
	}
	
}
