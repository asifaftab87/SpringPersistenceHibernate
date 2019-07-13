package org.liferayasif.backend.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.RegistrationDao;
import org.liferayasif.backend.model.Registration;
import org.springframework.stereotype.Repository;


@Repository("registrationDao")
public class RegistrationDaoImpl  extends AbstractDao<Integer, Registration> implements RegistrationDao{

	@Override
	@SuppressWarnings("unchecked")
	public List<Registration> getAllRegistration() {
		Criteria criteria = createEntityCriteria();
		return (List<Registration>) criteria.list();
	}

	@Override
	public Registration getRegistrationById(Integer id) {
		return getByKey(id);
	}

	@Override
	public Registration addRegistration(Registration registration) {
		persist(registration);
		return registration;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Registration> findRegistrationByPatientId(Integer pId) {
		Criteria criteria = getSession().createCriteria(Registration.class);
		criteria.add(Restrictions.eq("patientId", pId));
		List<Registration> registrationList = criteria.list();
		return registrationList;	
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Registration> searchRegistration(Integer id, Integer hId, Integer drId, Integer pId, Date dor, String outpatient) {
		Session session = getSession();
		
		StringBuilder hql = new StringBuilder(" select r from Registration r where 1=1 ");
		
		if(id!=null) {
			hql.append(" and r.id like :id ");
		}
		
		if(hId!=null) {
			hql.append(" and r.hId like :hId ");
		}
		
		if(drId!=null) {
			hql.append(" and r.drId=:drId ");
		}
		
		if(pId!=null) {
			hql.append(" and r.pId=:pId ");
		}
		
		if(dor!=null) {
			hql.append(" and r.dor=:dor ");
		}
		
		if(outpatient!=null && !outpatient.isEmpty()) {
			hql.append(" and r.outpatient=:outpatient ");
		}
		
		Query query = session.createQuery(new String(hql));
		
		if(id!=null) {
			query.setParameter("id", "%"+id+"%");
		}
		
		if(hId!=null) {
			query.setParameter("hospitalId", hId);
		}
		
		if(drId!=null) {
			query.setParameter("doctorId", drId);
		}
		
		if(pId!=null) {
			query.setParameter("patientId", pId);
		}
		
		if(dor!=null) {
			query.setParameter("dor", dor);
		}
		
		if(outpatient!=null && !outpatient.isEmpty()) {
			query.setParameter("outpatient", outpatient);
		}
		
		
		List<Registration> registrationList = query.list();
		
		return registrationList;
	}

	
	
}
