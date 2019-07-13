package org.liferayasif.backend.dao;

import java.util.List;

import org.liferayasif.backend.model.DoctorAddress;

public interface DoctorAddressDao {

	public List<DoctorAddress> getAllDoctorAddress();
	
	public DoctorAddress getDoctorAddressById(Integer id);
	
	public DoctorAddress addDoctorAddress(DoctorAddress doctorAddress);
	
	public DoctorAddress updateDoctorAddress(DoctorAddress doctorAddress);
	
	public List<DoctorAddress> findByCity(String city);
	
	public DoctorAddress findDoctorAddressByDoctorId(Integer doctorId);
	
}
