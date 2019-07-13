package org.liferayasif.front.controller;

import org.liferayasif.front.constants.PathConstants;
import org.liferayasif.front.dto.BoxDto;
import org.liferayasif.front.rest.template.WebRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value=PathConstants.BOX)
public class BoxController {
	
	@Autowired
	@Qualifier("boxValidator")
	private Validator validator;
	
	@InitBinder
	public void bidingPreparation(WebDataBinder binder){
		binder.setValidator(validator);
		//binder.registerCustomEditor(Integer.class, null, new CustomNumberEditor(Integer.class, true));
		
	}
	
	WebRestTemplate webRestTemplate = new WebRestTemplate();
	
	@RequestMapping(value=PathConstants.INSERT_BOX , method=RequestMethod.GET)
	public ModelAndView inputBox(@ModelAttribute BoxDto boxDto){
	
		ModelAndView mav= new ModelAndView("box-create");
		mav.addObject("boxDto" , boxDto);
		return mav;
	}
	
	
	@RequestMapping(value=PathConstants.UPDATEDB , method=RequestMethod.POST)
	public ModelAndView updateWorld(@Validated @ModelAttribute BoxDto boxDto , BindingResult result, Errors errors){
		
		ModelAndView mav = new ModelAndView("box-outcome");
		
		if(!result.hasErrors())
		{
		//collegeDto=webRestTemplate.postForObject(URLConstants.contextPath+"/college/addObj", collegeDto, CollegeDto.class);
		mav.addObject("result" , "form submitted successfully");
		
		}
		else{
			
			mav= new ModelAndView("box-create");
		
		}
		
		mav.addObject("box" , boxDto);
		
		
		
		return mav;
		
		
		
		
	}
	
	
	

}
