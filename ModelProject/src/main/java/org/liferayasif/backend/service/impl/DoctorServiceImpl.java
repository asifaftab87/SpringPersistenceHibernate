package org.liferayasif.backend.service.impl;

import java.util.List;

import org.liferayasif.backend.dao.DoctorDao;
import org.liferayasif.backend.model.Doctor;
import org.liferayasif.backend.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("doctorService")
@Transactional
public class DoctorServiceImpl implements DoctorService{

	@Autowired
	private DoctorDao doctorDao;
	
	@Override
	public List<Doctor> getAllDoctors() {
		List<Doctor> doctorList = doctorDao.getAllDoctors();
		return doctorList;
	}

	@Override
	public Doctor getDoctorById(Integer id) {
		Doctor doctor = doctorDao.getDoctorById(id);
		return doctor;
	}

	@Override
	public Doctor addDoctor(Doctor doctor) {
		return doctorDao.addDoctor(doctor);
	}

	@Override
	public Doctor updateDoctor(Doctor doctor) {
		return doctorDao.updateDoctor(doctor);
	}
	
	@Override
	public List<Doctor> findByLastName(String lName){
		return doctorDao.findByLastName(lName);
	}

}
