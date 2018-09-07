package org.liferayasif.front.controller;

import org.liferayasif.front.constants.PathConstants;
import org.liferayasif.front.constants.URLConstants;
import org.liferayasif.front.dto.FormDto;
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
@RequestMapping(value = PathConstants.FORM)
public class FormController {

	@Autowired
	@Qualifier("userValidator")
    private Validator validator;
	
	@InitBinder
	public void bindingPreparation(WebDataBinder binder) {
		binder.setValidator(validator);
	}
	
	WebRestTemplate webRestTemplate = new WebRestTemplate();
	
	@RequestMapping(value= PathConstants.ADD_FORM, method=RequestMethod.GET)
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
	
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ModelAndView add(@Validated @ModelAttribute FormDto formDto, BindingResult result, Errors errors){
		
		System.out.println("errors: "+result.hasErrors());
		ModelAndView mav = new ModelAndView("user-result");
		
		if(!result.hasErrors()){
			//oepration here
			//add rest controller
		}
		else{
			mav = new ModelAndView("form-create-2");
		}
		mav.addObject("formDto", formDto);
		
		return mav;
	}
	

}
