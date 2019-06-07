package org.liferayasif.backend.service.impl;

import java.util.Date;
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
	public List<Patient> findByLastName(String lName){
		return patientDao.findByLastName(lName);
	}

	@Override
	public List<Patient> findPatientByDoctorId(Integer drId) {
		return patientDao.findPatientByDoctorId(drId); 
	}
	
	@Override
	public List<Patient> searchPatient(String fName, String lName, String email, Date dob, Date doe, Date dor) {
		return patientDao.searchPatient(fName, lName, email, dob, doe, dor);
	}

	@Override
	public int releaseById(Integer id, Date dor) {
		int result = patientDao.releaseById(id, dor);
		return result;
	}

	@Override
	public List<Integer> getPatientIdList(){
		return patientDao.getPatientIdList();
	}
}
