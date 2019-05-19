package org.liferayasif.backend.service;

import java.util.List;

import org.liferayasif.backend.model.Doctor;

public interface DoctorService {

	public List<Doctor> getAllDoctors();
	
	public Doctor getDoctorById(Integer id);
	
	public Doctor addDoctor(Doctor doctor);
	
	public Doctor updateDoctor(Doctor doctor);
	
	public List<Doctor> findByLastName(String lName);
}
