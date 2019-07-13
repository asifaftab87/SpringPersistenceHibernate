package org.liferayasif.backend.rest.controller;

import java.util.List;

import org.liferayasif.backend.constants.PathConstants;
import org.liferayasif.backend.model.DoctorAddress;
import org.liferayasif.backend.model.Doctor;
import org.liferayasif.backend.service.DoctorAddressService;
import org.liferayasif.backend.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = PathConstants.DOCTOR_ADDRESS)
public class DoctorAddressRestController {

	@Autowired
	private DoctorAddressService doctorAddressService;
	
	@Autowired
	private DoctorService doctorService;
	
	@RequestMapping(value=PathConstants.FIND_BY_ID)
	public DoctorAddress findById(@RequestParam("id") int id){
		
		DoctorAddress doctorAddress = doctorAddressService.getDoctorAddressById(id);
	
		if(doctorAddress!=null) {
			Doctor doctor = doctorService.getDoctorById(id);
			doctorAddress.setDoctor(doctor);
		}
		
		return doctorAddress;
	}

		@RequestMapping(value=PathConstants.FIND_BY_CITY)
		public List<DoctorAddress> findByLastName(@RequestParam("city") String city){
			
			return doctorAddressService.findByCity(city);
		
		}
	
	@RequestMapping(value=PathConstants.ADD_DOCTOR_ADDRESS, method=RequestMethod.POST)
	public DoctorAddress add(@RequestBody DoctorAddress doctorAddress){
		
		doctorAddress = doctorAddressService.addDoctorAddress(doctorAddress);
		
		return doctorAddress;
	}
	
	@GetMapping(value=PathConstants.GET_ALL_DOCTOR_ADDRESS)
	public List<DoctorAddress> getAllDoctorAddress(){
		return doctorAddressService.getAllDoctorAddress();
	}
	
}
