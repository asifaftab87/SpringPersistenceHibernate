package org.liferayasif.front.controller;

import org.liferayasif.front.constants.URLConstants;
import org.liferayasif.front.dto.PersonDto;
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
	
	@RequestMapping(method=RequestMethod.GET)
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
}
