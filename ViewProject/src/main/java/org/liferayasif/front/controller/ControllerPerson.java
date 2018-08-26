package org.liferayasif.front.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.liferayasif.front.constants.URLConstants;
import org.liferayasif.front.dto.PersonDto;
import org.liferayasif.front.dto.SchoolDto;
import org.liferayasif.front.dto.UserDto;
import org.liferayasif.front.rest.template.WebRestTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/person")
public class ControllerPerson {
	
	WebRestTemplate webRestTemplate = new WebRestTemplate();
	
	@RequestMapping(value="search" , method=RequestMethod.GET)
	public ModelAndView findUser(@ModelAttribute UserDto userDto)
	{
		ModelAndView mav = new ModelAndView("search-user");
		mav.addObject("user", userDto);
		return mav;
	}
	
	@RequestMapping(value="findUserById" , method=RequestMethod.GET)
	public ModelAndView findUserById(@RequestParam("id") int id, @ModelAttribute UserDto userDto)
	{
		userDto = webRestTemplate.getForObject(URLConstants.contextPath+"/user/findById?id="+id, UserDto.class);
		
		ModelAndView mav = new ModelAndView("user-details");
		mav.addObject("user", userDto);
		mav.addObject("userAddressList", userDto.getUserAddressList());
		return mav;
	}
	
	
	@RequestMapping(value="personId" , method=RequestMethod.GET)
	public ModelAndView findPerson(@ModelAttribute PersonDto personDto)
	{
		ModelAndView mav = new ModelAndView("person-search");
		mav.addObject("person", personDto);
		return mav;
	}
	
	
	@RequestMapping(value="/getPerson", method=RequestMethod.GET)
	public ModelAndView personHome(@RequestParam("id") int id, @ModelAttribute PersonDto personDto)
	{
		ModelAndView mav=new ModelAndView("person-detail");
		
		personDto = webRestTemplate.getForObject(URLConstants.contextPath+"/person/getPersonById?id="+id, PersonDto.class);
		
		mav.addObject("person" ,personDto);
		return mav;
	}
	
	@RequestMapping(value="/feeOfSchool", method=RequestMethod.GET)
	public ModelAndView schoolHome(@ModelAttribute SchoolDto schoolDto)
	{
		
		ModelAndView mav = new ModelAndView("school-search");
		mav.addObject("school" , schoolDto);
		
		return mav;
	}
	
	@RequestMapping(value="/schoolDisplay", method=RequestMethod.GET)
	public ModelAndView schoolDisplay(@RequestParam("fees") int fees, @ModelAttribute SchoolDto schoolDto)
	{
		ModelAndView mav = new ModelAndView("school-display");
		SchoolDto[] schoolDtoArray = webRestTemplate.getForObject(URLConstants.contextPath+"/school/getByFees?fees="+fees, SchoolDto[].class);
		
		List<SchoolDto> schoolDtoList = new ArrayList<SchoolDto>();
		
		if(schoolDtoArray !=null && schoolDtoArray.length > 0){
			schoolDtoList = Arrays.asList(schoolDtoArray);
		}
		
		mav.addObject("school", schoolDto);
		mav.addObject("schoolDtoList", schoolDtoList);
		
		return mav;
				
	}
}
