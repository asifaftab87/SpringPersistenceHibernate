package org.liferayasif.backend.rest.controller;


import java.util.Date;
import java.util.List;

import org.liferayasif.backend.constants.PathConstants;
import org.liferayasif.backend.model.Patient;
import org.liferayasif.backend.model.Registration;
import org.liferayasif.backend.service.PatientService;
import org.liferayasif.backend.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = PathConstants.REGISTRATION)
public class RegistrationRestController {

	@Autowired
	private RegistrationService registrationService;
	
	@Autowired
	private PatientService patientService;
	
	@RequestMapping(value=PathConstants.FIND_BY_ID)
	public Registration findById(@RequestParam("id") int id){
		
		Registration registration = registrationService.getRegistrationById(id);
		
		if(registration!=null) {
			Patient patient = patientService.getPatientById(registration.getPatientId());
			if(patient!=null) {
				registration.setPatient(patient);
			}
		}
		
		return registration;
	}
	

	
	@RequestMapping(value=PathConstants.ADD_REGISTRATION, method=RequestMethod.POST)
	public Registration add(@RequestBody Registration registration){
		
		registration = registrationService.addRegistration(registration);
		
		return registration;
	}
	
	
	@GetMapping(value=PathConstants.GET_ALL_REGISTRATION)
	public List<Registration> getAllRegistration(){
		return registrationService.getAllRegistration();
	}
	
	@RequestMapping(value=PathConstants.SEARCH_REGISTRATION)
	public @ResponseBody List<Registration> searchRegistration(@RequestParam("id") Integer id, @RequestParam("hId") Integer hId, @RequestParam("drId") Integer drId, @RequestParam("pId") Integer pId, @RequestParam("dor") @DateTimeFormat(pattern="yyyy-MM-dd") Date dor, @RequestParam("outpatient")  String outpatient){
		
		List<Registration> registrationList = registrationService.searchRegistration(id, hId, drId, pId, dor, outpatient);
		return registrationList;
	}
	
	

}
