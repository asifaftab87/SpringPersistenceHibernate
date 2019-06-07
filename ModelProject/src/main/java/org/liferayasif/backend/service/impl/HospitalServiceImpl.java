package org.liferayasif.backend.service.impl;

import java.util.List;

import org.liferayasif.backend.dao.HospitalDao;
import org.liferayasif.backend.model.Hospital;
import org.liferayasif.backend.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("hospitalService")
@Transactional
public class HospitalServiceImpl implements HospitalService{

	@Autowired
	private HospitalDao hospitalDao;
	
	@Override
	public List<Hospital> getAllHospitals() {
		List<Hospital> hospitalList = hospitalDao.getAllHospitals();
		return hospitalList;
	}

	@Override
	public Hospital getHospitalById(Integer id) {
		Hospital hospital = hospitalDao.getHospitalById(id);
		return hospital;
	}

	@Override
	public Hospital addHospital(Hospital hospital) {
		return hospitalDao.addHospital(hospital);
	}

	@Override
	public Hospital updateHospital(Hospital hospital) {
		return hospitalDao.updateHospital(hospital);
	}
	
	@Override
	public List<Hospital> findByName(String name){
		return hospitalDao.findByName(name);
	}
	
	@Override
	public List<Integer> getHospitalIdList(){
		return hospitalDao.getHospitalIdList();
	}

}
