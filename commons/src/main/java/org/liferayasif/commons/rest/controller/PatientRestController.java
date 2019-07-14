package org.liferayasif.commons.rest.controller;

import org.liferayasif.commons.client.RestClient;
import org.liferayasif.commons.model.Patient;
import org.liferayasif.commons.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/patient")
public class PatientRestController extends RestClient {

	@Autowired
	private PatientService patientService;
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public void add(@RequestBody Patient patient) {
		patientService.add(patient);
	}
	
	@RequestMapping(value = "/find/Id/{id}")
	public Patient findyId(@PathVariable("id") Integer id) {
		return patientService.findById(id);
	}
	
	@RequestMapping(value = "/findAll")
	public Iterable<Patient> findAll(){
		return patientService.findAll();
	}
	
}
