package org.liferayasif.front.controller;

import org.liferayasif.front.constants.URLConstants;
import org.liferayasif.front.dto.PurseDto;
import org.liferayasif.front.rest.template.WebRestTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/purse")
public class PurseController {
	
	WebRestTemplate webRestTemplate = new WebRestTemplate();
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView addhome(@ModelAttribute PurseDto purseDto)
	{
		ModelAndView mav = new ModelAndView("purse-data");
		mav.addObject("purse",purseDto);
		return mav;
			
	}
	
	@RequestMapping(value="/resultPurse",  method=RequestMethod.POST)
	public ModelAndView resultPurse(@ModelAttribute PurseDto purseDto)
	{
		ModelAndView mav = new ModelAndView("purse-result");
		try{
			purseDto = webRestTemplate.postForObject(URLConstants.contextPath+"/purse/addObj",purseDto, PurseDto.class);
			mav.addObject("result", "form submitted sucessfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			mav.addObject("result", "Unable to process your request");
		}
		mav.addObject("purseDto", purseDto);
		
		return mav;
	}
}
 