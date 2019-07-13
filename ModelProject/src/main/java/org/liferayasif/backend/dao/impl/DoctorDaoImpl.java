package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
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
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Doctor> searchDoctor(String name, String spec, String email) {
		Session session = getSession();
		
		StringBuilder hql = new StringBuilder(" select d from Doctor d where 1=1 ");
		
		if(name!=null && !name.isEmpty()) {
			hql.append(" and d.fName like :name ");
		}
		
		if(spec!=null && !spec.isEmpty()) {
			hql.append(" and d.specialization=:spec ");
		}
		
		if(email!=null && !email.isEmpty()) {
			hql.append(" and d.email=:email ");
		}
		
		Query query = session.createQuery(new String(hql));
		
		if(name!=null && !name.isEmpty()) {
			query.setParameter("name", "%"+name+"%");
		}
		
		if(spec!=null && !spec.isEmpty()) {
			query.setParameter("spec", spec);
		}
		
		if(email!=null && !email.isEmpty()) {
			query.setParameter("email", email);
		}
		List<Doctor> doctorList = query.list();
		
		return doctorList;
	}
 

	@SuppressWarnings("unchecked")
	@Override
	public List<Doctor> findDoctorByHospitalId(Integer HospitalId) {
		Criteria criteria = getSession().createCriteria(Doctor.class);
		criteria.add(Restrictions.eq("hospitalId", HospitalId));
		List<Doctor> doctorList = criteria.list();
		return doctorList;
	}
	
	@Override
	public List<Integer> getDoctorIdList() {
	
		Session session = getSession();
		
		String hql = " select d.id from Doctor d ";
		
		Query query = session.createQuery(new String(hql));
		
		List<Integer> doctorIdList = query.list();
		return doctorIdList;
	}
	
}
