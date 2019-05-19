package org.liferayasif.backend.rest.controller;

import java.util.List;

import org.liferayasif.backend.constants.PathConstants;
import org.liferayasif.backend.model.Doctor;
import org.liferayasif.backend.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = PathConstants.DOCTOR)
public class DoctorRestController {

	@Autowired
	private DoctorService doctorService;
	
	@RequestMapping(value=PathConstants.FIND_BY_ID)
	public Doctor findById(@RequestParam("id") int id){
		
		Doctor doctor = doctorService.getDoctorById(id);
	
		
		return doctor;
	}
	

		
		@RequestMapping(value=PathConstants.FIND_BY_LNAME)
		public List<Doctor> findByLastName(@RequestParam("lName") String lName){
			
			return doctorService.findByLastName(lName);
		
			
			
		}
	
	@RequestMapping(value=PathConstants.ADD_DOCTOR, method=RequestMethod.POST)
	public Doctor add(@RequestBody Doctor doctor){
		
		doctor = doctorService.addDoctor(doctor);
		
		return doctor;
	}
	
	
	@GetMapping(value=PathConstants.GET_ALL_DOCTOR)
	public List<Doctor> getAllPatients(){
		return doctorService.getAllDoctors();
	}
	
}
