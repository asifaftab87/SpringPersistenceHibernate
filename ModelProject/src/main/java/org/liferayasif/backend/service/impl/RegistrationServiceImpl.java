package org.liferayasif.backend.service.impl;

import java.util.Date;
import java.util.List;

import org.liferayasif.backend.dao.RegistrationDao;
import org.liferayasif.backend.model.Registration;
import org.liferayasif.backend.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("registrationService")
@Transactional
public class RegistrationServiceImpl implements RegistrationService{

	@Autowired
	private RegistrationDao registrationDao;
	
	@Override
	public List<Registration> getAllRegistration() {
		List<Registration> registrationList = registrationDao.getAllRegistration();
		return registrationList;
	}

	@Override
	public Registration getRegistrationById(Integer id) {
		Registration registration = registrationDao.getRegistrationById(id);
		return registration;
	}

	@Override
	public Registration addRegistration(Registration registration) {
		return registrationDao.addRegistration(registration);
	}

	@Override
	public List<Registration> findRegistrationByPatientId(Integer pId) {
		return registrationDao.findRegistrationByPatientId(pId); 
	}
	
	@Override
	public List<Registration> searchRegistration(Integer id, Integer hId, Integer drId, Integer pId, Date dor, String outpatient) {
		return registrationDao.searchRegistration(id, hId, drId, pId, dor, outpatient);
	}

}
