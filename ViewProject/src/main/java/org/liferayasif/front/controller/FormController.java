package org.liferayasif.front.controller;

import org.liferayasif.front.constants.PathConstants;
import org.liferayasif.front.constants.URLConstants;
import org.liferayasif.front.dto.FormDto;
import org.liferayasif.front.rest.template.WebRestTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = PathConstants.FORM)
public class FormController {
	
	WebRestTemplate webRestTemplate = new WebRestTemplate();
	
	@RequestMapping(value="/addForm", method=RequestMethod.GET)
	public ModelAndView add(@ModelAttribute FormDto formDto)
	{
		ModelAndView mav = new ModelAndView("form-input");
		mav.addObject("form",formDto);
		return mav;
			
	}
	
	@RequestMapping(value= PathConstants.RESULT_FORM,  method=RequestMethod.POST)
	public ModelAndView result(@ModelAttribute FormDto formDto)
	{
		ModelAndView mav = new ModelAndView("form-result");
		try{
			formDto = webRestTemplate.postForObject(URLConstants.contextPath+"/form/add",formDto, FormDto.class);
			mav.addObject("result", "form submitted sucessfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			mav.addObject("result", "Unable to process your request");
		}
		mav.addObject("formDto", formDto);
		
		return mav;
	}
	

}
