package org.liferayasif.backend.service;

import java.util.List;

import org.liferayasif.backend.model.Hospital;

public interface HospitalService {

	public List<Hospital> getAllHospitals();
	
	public Hospital getHospitalById(Integer id);
	
	public Hospital addHospital(Hospital hospital);
	
	public Hospital updateHospital(Hospital hospital);
	
	public List<Hospital> findByName(String name);
	
	
}
