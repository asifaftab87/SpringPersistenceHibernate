package org.liferayasif.front.controller;

import org.liferayasif.front.constants.Constants;
import org.liferayasif.front.dto.ActorDto;
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
@RequestMapping(value=Constants.ACTOR)

public class ActorController {
	
	@Autowired
	@Qualifier("actorValidator")
	private Validator validator;
	
	@InitBinder
	public void bindingPreparation(WebDataBinder binder)
	{
		binder.setValidator(validator);
	}
	
	WebRestTemplate webrestTemplate = new WebRestTemplate();
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView getInfo(@ModelAttribute ActorDto actorDto)
	{
		ModelAndView mav = new ModelAndView("actor-create");
		mav.addObject("actorDto", actorDto);
		return mav;
	}
	
	
	@RequestMapping(value=Constants.ADD_INFO, method=RequestMethod.POST)
	public ModelAndView inputActor(@Validated @ModelAttribute ActorDto actorDto , BindingResult result, Errors errors)
	{
		ModelAndView mav = new ModelAndView("actor-display");
		
		if(!result.hasErrors())
		{
			mav.addObject("result" , "form submitted successfully");
		}
		else{
			
			mav= new ModelAndView("actor-create");
		
		}
		mav.addObject("actorDto", actorDto);
		
		return mav;
		
	}
}
