package org.liferayasif.backend.service;

import java.util.Date;
import java.util.List;

import org.liferayasif.backend.model.Registration;

public interface RegistrationService {

	public List<Registration> getAllRegistration();
	
	public Registration getRegistrationById(Integer id);
	
	public Registration addRegistration(Registration registration);
	
	public List<Registration> findRegistrationByPatientId(Integer pId);
	
	public List<Registration> searchRegistration(Integer id, Integer hId, Integer drId, Integer pId, Date dor, String outpatient);
	
}
