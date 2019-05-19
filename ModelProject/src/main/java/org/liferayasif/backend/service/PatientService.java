package org.liferayasif.backend.service;

import java.util.List;

import org.liferayasif.backend.model.Patient;

public interface PatientService {

	public List<Patient> getAllPatients();
	
	public Patient getPatientById(Integer id);
	
	public Patient addPatient(Patient patient);
	
	public Patient updatePatient(Patient patient);
	
	public List<Patient> findByLastName(String lName);
}
