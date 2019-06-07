package org.liferayasif.backend.dao;

import java.util.List;

import org.liferayasif.backend.model.Hospital;

public interface HospitalDao {

	public List<Hospital> getAllHospitals();
	
	public Hospital getHospitalById(Integer id);
	
	public Hospital addHospital(Hospital hospital);
	
	public Hospital updateHospital(Hospital hospital);
	
	public List<Hospital> findByName(String lName);
	
	public List<Integer> getHospitalIdList();
	
}
