package org.liferayasif.front.controller;

import org.liferayasif.front.constants.PathConstants;
import org.liferayasif.front.dto.WorldDto;
import org.liferayasif.front.rest.template.WebRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
@RequestMapping(value=PathConstants.WORLD)
public class WorldController {
	
	@Autowired
	@Qualifier("worldValidator")
	private Validator validator;
	
	@InitBinder
	public void bindingPreparation(WebDataBinder binder){
		binder.setValidator(validator);
	}
	
	
	WebRestTemplate webRestTemplate = new WebRestTemplate();
	
	@RequestMapping(value=PathConstants.ADD_FORM , method=RequestMethod.GET )
	public ModelAndView inputWorld(@ModelAttribute WorldDto worldDto){
		
		ModelAndView mav=new ModelAndView("world-create");
		mav.addObject("worldDto", worldDto);
					
		return mav;
	}
	

	
	@RequestMapping(value=PathConstants.UPDATEDB , method=RequestMethod.POST )
	public ModelAndView updateWorld(@Validated @ModelAttribute WorldDto worldDto  , BindingResult result, Errors errors){
		
		ModelAndView mav=new ModelAndView("world-result");
		
				
		if(!result.hasErrors())
		{
		//collegeDto=webRestTemplate.postForObject(URLConstants.contextPath+"/college/addObj", collegeDto, CollegeDto.class);
		mav.addObject("result" , "form submitted successfully");
		
		}
		else{
			
			mav= new ModelAndView("world-create");
		
		}
		
		mav.addObject("world" , worldDto);
		
		
		
		
		System.out.println(""+worldDto.getName());
		System.out.println(""+worldDto.getFatherName());
		System.out.println(""+worldDto.getGender());
		System.out.println(""+worldDto.getDob());
		
		return mav;
	}
	
	

}
