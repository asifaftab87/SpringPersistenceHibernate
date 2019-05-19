package org.liferayasif.backend.service.impl;

import java.util.List;

import org.liferayasif.backend.dao.PatientDao;
import org.liferayasif.backend.model.Patient;
import org.liferayasif.backend.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("patientService")
@Transactional
public class PatientServiceImpl implements PatientService{

	@Autowired
	private PatientDao patientDao;
	
	@Override
	public List<Patient> getAllPatients() {
		List<Patient> patientList = patientDao.getAllPatients();
		return patientList;
	}

	@Override
	public Patient getPatientById(Integer id) {
		Patient patient = patientDao.getPatientById(id);
		return patient;
	}

	@Override
	public Patient addPatient(Patient patient) {
		return patientDao.addPatient(patient);
	}

	@Override
	public Patient updatePatient(Patient patient) {
		return patientDao.updatePatient(patient);
	}
	
	@Override
	public List<Patient> findByLastName(String lName){
		return patientDao.findByLastName(lName);
	}

}
