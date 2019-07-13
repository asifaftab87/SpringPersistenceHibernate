package org.liferayasif.backend.rest.controller;

import org.liferayasif.backend.constants.PathConstants;
import org.liferayasif.backend.model.Best;
import org.liferayasif.backend.service.BestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value=PathConstants.BEST)
public class BestRestController{
	
	@Autowired
	private BestService bestService;
	
	@RequestMapping(value=PathConstants.ADD_OBJ , method=RequestMethod.POST)
	public Best addBestObj(@RequestBody Best best)
	{
		System.out.println("hit this method");
		return bestService.addBest(best);
	}

	
	@RequestMapping(value=PathConstants.TEST , method=RequestMethod.GET)
	public void addBestObj()
	{
		System.out.println("its working fine no issue");
		System.out.println("hit this method");
		
		
		
	}
	

}
