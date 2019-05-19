package org.liferayasif.backend.rest.controller;

import java.util.List;

import org.liferayasif.backend.constants.PathConstants;
import org.liferayasif.backend.model.Hospital;
import org.liferayasif.backend.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = PathConstants.HOSPITAL)
public class HospitalRestController {

	@Autowired
	private HospitalService hospitalService;
	
	@RequestMapping(value=PathConstants.FIND_BY_ID)
	public Hospital findById(@RequestParam("id") int id){
		
		Hospital hospital = hospitalService.getHospitalById(id);
	
		
		return hospital;
	}
	

		
		@RequestMapping(value=PathConstants.FIND_BY_NAME)
		public List<Hospital> findByName(@RequestParam("name") String name){
			
			return hospitalService.findByName(name);
		
			
			
		}
	
	@RequestMapping(value=PathConstants.ADD_HOSPITAL, method=RequestMethod.POST)
	public Hospital add(@RequestBody Hospital hospital){
		
		hospital = hospitalService.addHospital(hospital);
		
		return hospital;
	}
	
	
	@GetMapping(value=PathConstants.GET_ALL_HOSPITAL)
	public List<Hospital> getAllHospitals(){
		return hospitalService.getAllHospitals();
	}
	
}
