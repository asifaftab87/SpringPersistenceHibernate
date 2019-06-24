package org.liferayasif.backend.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.PatientDao;
import org.liferayasif.backend.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
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

	@SuppressWarnings("unchecked")
	@Override
	public List<Patient> findByLastName(String lName){
		
		Criteria criteria = getSession().createCriteria(Patient.class);
		criteria.add(Restrictions.like("lName", lName, MatchMode.ANYWHERE));
		
		List<Patient> patientList = criteria.list();

		return patientList;				
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Patient> findPatientByDoctorId(Integer doctorId) {
		Criteria criteria = getSession().createCriteria(Patient.class);
		criteria.add(Restrictions.eq("doctorId", doctorId));
		List<Patient> patientList = criteria.list();
		return patientList;	
	}

	@Override
	public List<Integer> getPatientIdList() {
	
		Session session = getSession();
		
		String hql = " select p.id from Patient p ";
		
		Query query = session.createQuery(new String(hql));
		
		List<Integer> patientIdList = query.list();
		return patientIdList;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Patient> searchPatient(String fName, String lName, String email, Date dob, Date doe, Date dor) {
		Session session = getSession();
		
		StringBuilder hql = new StringBuilder(" select p from Patient p where 1=1 ");
		
		if(fName!=null && !fName.isEmpty()) {
			hql.append(" and p.fName like :fName ");
		}
		
		if(lName!=null && !lName.isEmpty()) {
			hql.append(" and p.lName like :lName ");
		}
		
		if(email!=null && !email.isEmpty()) {
			hql.append(" and p.email=:email ");
		}
		
		if(dob!=null) {
			hql.append(" and p.dob=:dob ");
		}
		
		if(doe!=null) {
			hql.append(" and p.doe=:doe ");
		}
		
		if(dor!=null) {
			hql.append(" and p.dor=:dor ");
		}
		
		Query query = session.createQuery(new String(hql));
		
		if(fName!=null && !fName.isEmpty()) {
			query.setParameter("fName", "%"+fName+"%");
		}
		
		if(lName!=null && !lName.isEmpty()) {
			query.setParameter("lName", "%"+lName+"%");
		}
		
		if(email!=null && !email.isEmpty()) {
			query.setParameter("email", email);
		}
		
		if(dob!=null) {
			query.setParameter("dob", dob);
		}
		
		if(doe!=null) {
			query.setParameter("doe", doe);
		}
		
		if(dor!=null) {
			query.setParameter("dor", dor);
		}
		
		
		List<Patient> patientList = query.list();
		
		return patientList;
	}

	@Override
	public int releaseById(Integer id, Date dor) {
		
		int result;
		try {
			Session session = getSession();
			
			String hql = " UPDATE Patient p  set p.dor= :dor , p.c= 'Y' where id= :id ";
			
			Query query = session.createQuery(hql);
			
			query.setParameter("dor", dor);
			query.setParameter("id", id);
			
			result = query.executeUpdate();
			System.out.println("Rows affected: " + result);
		}
		catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
		
		return result;

	}
	
	@Autowired
    public JavaMailSender emailSender;
	
	@Override
	public void sendSimpleMessage(String to, String subject, String text) {
		SimpleMailMessage message = new SimpleMailMessage(); 
		message.setTo(to); 
		message.setSubject(subject); 
		message.setText(text);
		
		emailSender.send(message);
	}
	
}
