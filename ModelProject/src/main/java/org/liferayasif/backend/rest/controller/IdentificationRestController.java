package org.liferayasif.backend.rest.controller;

import java.util.List;

import org.liferayasif.backend.model.Identification;
import org.liferayasif.backend.service.IdentificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/identification")
public class IdentificationRestController {


	@Autowired
	private IdentificationService identificationService;
	
/*	@RequestMapping(value="/id")
	public Identification sample(@RequestParam("id") int id){
		Identification user = identificationService.getIdentificationById(id);
		System.out.println(user);
		return user;
	}
*/	
	@RequestMapping(value="/identificationList")
	public List<Identification> getAllIdentification(){
		List<Identification> identificationList = identificationService.getAllIdentification();
		return identificationList;
	}
	
/*	
	@RequestMapping(value="/addIdentification", method=RequestMethod.POST)
	public int addIdentification(@RequestBody Identification identification){
		identificationService.addIdentification(identification);
		return 0;
	}
*/	
	
}
