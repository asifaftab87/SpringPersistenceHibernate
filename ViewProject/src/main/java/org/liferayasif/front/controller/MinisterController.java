package org.liferayasif.front.controller;

import org.liferayasif.front.constants.Constants;
import org.liferayasif.front.constants.PathConstants;
import org.liferayasif.front.dto.MinisterDto;
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
@RequestMapping(value=Constants.MINISTER)
public class MinisterController {

	@Autowired
	@Qualifier("ministerValidator")
	private Validator validator;
	
	@InitBinder
	public void bindingPreparation(WebDataBinder binder)
	{
		binder.setValidator(validator);
	}
	
	WebRestTemplate webRestTemplate = new WebRestTemplate();
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView getData(@ModelAttribute MinisterDto ministerDto)
	{
		ModelAndView mav  = new ModelAndView("minister-create");
		mav.addObject("ministerDto", ministerDto);
				
		return mav;
	}
	
	
	@RequestMapping(value=PathConstants.UPDATEDB	, method=RequestMethod.POST)
	public ModelAndView inputMinister(@Validated @ModelAttribute MinisterDto ministerDto,BindingResult result, Errors errors ){
		
		ModelAndView mav = new ModelAndView("minister-show");
		if(!result.hasErrors())
		{
			mav.addObject("result" , "form submitted successfully");
		}
		else{
			
			mav= new ModelAndView("minister-create");
		
		}
		mav.addObject("ministerDto", ministerDto);
		
		return mav;
		
	}
	
}
