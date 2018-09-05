package org.liferayasif.front.controller;

import org.liferayasif.front.constants.URLConstants;
import org.liferayasif.front.dto.NgoDto;
import org.liferayasif.front.rest.template.WebRestTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/ngo")
public class NgoController {

	WebRestTemplate webRestTemplate = new WebRestTemplate();
	
	@RequestMapping(value="/addNgo", method=RequestMethod.GET)
	public ModelAndView inputNgo(@ModelAttribute NgoDto ngoDto){
		
		ModelAndView mav = new ModelAndView("ngo-create");
		mav.addObject("ngo",ngoDto);
		return mav;
		
		
	}
	
	@RequestMapping(value="/displayNgo", method=RequestMethod.POST)
	public ModelAndView addNgo(@ModelAttribute NgoDto ngoDto){
		
		ModelAndView mav = new ModelAndView("ngo-result");
		
		try{
			ngoDto=webRestTemplate.postForObject(URLConstants.contextPath+"/ngo/addObj", ngoDto, NgoDto.class);
			mav.addObject("result", "Thank you, form submitted sucessfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			mav.addObject("result","Unable to process your request....!! please try again.");
		}
	
		mav.addObject("ngo",ngoDto);
		return mav;
		
		
	}
}
