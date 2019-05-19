package org.liferayasif.backend.rest.controller;

import java.util.List;

import org.liferayasif.backend.constants.PathConstants;
import org.liferayasif.backend.model.Patient;
import org.liferayasif.backend.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = PathConstants.PATIENT)
public class PatientRestController {

	@Autowired
	private PatientService patientService;
	
	@RequestMapping(value=PathConstants.FIND_BY_ID)
	public Patient findById(@RequestParam("id") int id){
		
		Patient patient = patientService.getPatientById(id);
	
		
		return patient;
	}
	

		
		@RequestMapping(value=PathConstants.FIND_BY_LNAME)
		public List<Patient> findByLastName(@RequestParam("lName") String lName){
			
			return patientService.findByLastName(lName);
		
			
			
		}
	
	@RequestMapping(value=PathConstants.ADD_PATIENT, method=RequestMethod.POST)
	public Patient add(@RequestBody Patient patient){
		
		patient = patientService.addPatient(patient);
		
		return patient;
	}
	
	
	@GetMapping(value=PathConstants.GET_ALL_PATIENT)
	public List<Patient> getAllPatients(){
		return patientService.getAllPatients();
	}
	
}
