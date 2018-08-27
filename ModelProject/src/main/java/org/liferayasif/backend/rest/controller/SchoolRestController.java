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
@RequestMapping(value="/school")
public class SchoolRestController {
	
	@Autowired
	private SchoolService schoolService;
	
	@RequestMapping(value="first")
	public School sample(@RequestParam("id") int id)
	{
		School school=schoolService.getSchoolById(id);
		return school;
	}
	
	@RequestMapping(value="getSchoolByFees")
	public List<School> schoolListFees(@RequestParam("fees") double fees)
	{
		List<School> schoolList = schoolService.getSchoolByFees(fees);
		return schoolList;
	}
	
	@RequestMapping(value="/getAllSchools")
	public List<School>getAllSchool()
	{
		List<School> schoolList= schoolService.getAllSchools();
		return schoolList;
	}
	
	
	@RequestMapping(value="/addSchool" , method=RequestMethod.POST)
	public int addSchol(@RequestBody School school)
	{
		schoolService.addSchool(school);
		return 0;
	}
	
	
	@RequestMapping(value="/addSchools" , method=RequestMethod.POST)
	public int addScools(@RequestBody List<School> schoolList)
	{
		for(School school : schoolList){
			schoolService.addSchool(school);
		}
		return 0;
	}
	
	
	
	
	
	
	
	
	
	

}
