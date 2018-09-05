package org.liferayasif.backend.rest.controller;

import org.liferayasif.backend.constants.PathConstants;
import org.liferayasif.backend.model.Ngo;
import org.liferayasif.backend.service.NgoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value=PathConstants.NGO)
public class NgoRestController {
	
	@Autowired
	private NgoService ngoService;
	
	
	/*@RequestMapping(value=PathConstants.FIND_BY_PARAMETER, method=RequestMethod.GET)
    public List<Ngo> getNgoByState(@RequestParam("state") String state) {
       List<Ngo> ngoList = ngoService.getNgoByState(state);
       return ngoList;
    }*/
	
	
	@RequestMapping(value=PathConstants.ADD_OBJ	, method=RequestMethod.POST)
	public Ngo addNgoObj(@RequestBody Ngo ngo)
	{
		/*if(ngo.getFullName()||ngo.getFatherName()||ngo.ge)*/
		
		return ngoService.addNgo(ngo);
	}
	

}
