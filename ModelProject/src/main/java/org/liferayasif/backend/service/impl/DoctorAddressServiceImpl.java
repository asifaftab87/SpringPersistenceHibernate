package org.liferayasif.backend.service.impl;

import java.util.List;

import org.liferayasif.backend.dao.DoctorAddressDao;
import org.liferayasif.backend.model.DoctorAddress;
import org.liferayasif.backend.service.DoctorAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("doctorAddressService")
@Transactional
public class DoctorAddressServiceImpl implements DoctorAddressService{

	@Autowired
	private DoctorAddressDao doctorAddressDao;
	
	@Override
	public List<DoctorAddress> getAllDoctorAddress() {
		List<DoctorAddress> doctorAddressList = doctorAddressDao.getAllDoctorAddress();
		return doctorAddressList;
	}

	@Override
	public DoctorAddress getDoctorAddressById(Integer id) {
		DoctorAddress doctorAddress = doctorAddressDao.getDoctorAddressById(id);
		return doctorAddress;
	}

	@Override
	public DoctorAddress addDoctorAddress(DoctorAddress doctorAddress) {
		return doctorAddressDao.addDoctorAddress(doctorAddress);
	}

	@Override
	public DoctorAddress updateDoctorAddress(DoctorAddress doctorAddress) {
		return doctorAddressDao.updateDoctorAddress(doctorAddress);
	}
	
	@Override
	public List<DoctorAddress> findByCity(String city){
		return doctorAddressDao.findByCity(city);
	}

	@Override
	public DoctorAddress findDoctorAddressByDoctorId(Integer doctorId) {
		return doctorAddressDao.findDoctorAddressByDoctorId(doctorId); 
	}

}
