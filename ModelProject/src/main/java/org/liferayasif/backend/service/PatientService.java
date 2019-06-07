package org.liferayasif.backend.service;

import java.util.Date;
import java.util.List;

import org.liferayasif.backend.model.Patient;

public interface PatientService {

	public List<Patient> getAllPatients();
	
	public Patient getPatientById(Integer id);
	
	public Patient addPatient(Patient patient);
	
	public List<Patient> findByLastName(String lName);
	
	public List<Patient> findPatientByDoctorId(Integer drId);
	
	public List<Patient> searchPatient(String fName, String lName, String email, Date dob, Date doe, Date dor);
	
	public int releaseById(Integer id, Date dor); 
	
	public List<Integer> getPatientIdList();
}
