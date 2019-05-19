package org.liferayasif.backend.dao;

import java.util.List;

import org.liferayasif.backend.model.Patient;

public interface PatientDao {

	public List<Patient> getAllPatients();
	
	public Patient getPatientById(Integer id);
	
	public Patient addPatient(Patient patient);
	
	public Patient updatePatient(Patient patient);
	
	public List<Patient> findByLastName(String lName);
	
}
