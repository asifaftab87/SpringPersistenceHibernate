package org.liferayasif.backend.rest.controller;

import org.liferayasif.backend.constants.PathConstants;
import org.liferayasif.backend.model.College;
import org.liferayasif.backend.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value=PathConstants.COLLEGE)
public class CollegeRestController {
	
	@Autowired
	private CollegeService collegeService;
	
	
	@RequestMapping(value=PathConstants.ADD_OBJ , method=RequestMethod.POST)
	public College addCollegeObj(@RequestBody College college)
	{
		
		return collegeService.addCollege(college);
		
			
	}
	
	

}
