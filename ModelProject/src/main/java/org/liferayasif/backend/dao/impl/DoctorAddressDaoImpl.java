package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.DoctorAddressDao;
import org.liferayasif.backend.model.DoctorAddress;
import org.springframework.stereotype.Repository;

@Repository("doctorAddressDao")
public class DoctorAddressDaoImpl  extends AbstractDao<Integer, DoctorAddress> implements DoctorAddressDao{

	@Override
	@SuppressWarnings("unchecked")
	public List<DoctorAddress> getAllDoctorAddress() {
		Criteria criteria = createEntityCriteria();
		return (List<DoctorAddress>) criteria.list();
	}

	@Override
	public DoctorAddress getDoctorAddressById(Integer id) {
		return getByKey(id);
	}

	@Override
	public DoctorAddress addDoctorAddress(DoctorAddress doctorAddress) {
		persist(doctorAddress);
		return doctorAddress;
	}

	@Override
	public DoctorAddress updateDoctorAddress(DoctorAddress doctorAddress) {
		getSession().update(doctorAddress);
		return doctorAddress;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<DoctorAddress> findByCity(String city){
		
		Criteria criteria = getSession().createCriteria(DoctorAddress.class);
		criteria.add(Restrictions.eq("city", city));
		
		List<DoctorAddress> doctorAddressList = criteria.list();

		return doctorAddressList;				
	}

	@SuppressWarnings("unchecked")
	@Override
	public DoctorAddress findDoctorAddressByDoctorId(Integer doctorId) {
		Criteria criteria = getSession().createCriteria(DoctorAddress.class);
		criteria.add(Restrictions.eq("doctorId", doctorId));
		DoctorAddress doctorAddress = (DoctorAddress) criteria.list();
		return doctorAddress;
	}
	
}
