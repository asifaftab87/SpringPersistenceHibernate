package org.liferayasif.backend.rest.controller;

import java.util.List;

import org.liferayasif.backend.constants.PathConstants;
import org.liferayasif.backend.model.Doctor;
import org.liferayasif.backend.model.Patient;
import org.liferayasif.backend.service.DoctorService;
import org.liferayasif.backend.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = PathConstants.DROPDOWN)
public class DropDownRestController {

	@Autowired
	private DoctorService doctorService;
	
	@Autowired
	private PatientService patientService;
	

	
	@GetMapping(value=PathConstants.GET_ALL_DOCTOR)
	public List<Doctor> getAllDoctors(){
		return doctorService.getAllDoctors();
	}
	
	
	
}
