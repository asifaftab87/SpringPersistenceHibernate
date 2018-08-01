package org.liferayasif.backend.rest.controller;

import java.util.List;

import org.liferayasif.backend.model.School;
import org.liferayasif.backend.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/beginn")
public class SchoolRestController {
	
	@Autowired
	private SchoolService schoolService;
	
	@RequestMapping(value="first")
	public School sample(@RequestParam("id") int id)
	{
		School school=schoolService.getSchoolById(id);
		return school;
	}
	
	@RequestMapping(value="/getAllSchools")
	public List<School>getAllSchool()
	{
		List<School> schoolList= schoolService.getAllSchools();
		return schoolList;
	}
	
	
	@RequestMapping(value="/addSchhol" , method=RequestMethod.POST)
	public int addSchol(@RequestBody School school)
	{
		schoolService.addSchool(school);
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	

}
