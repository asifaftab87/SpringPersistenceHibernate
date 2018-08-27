package org.liferayasif.front.controller;

import org.liferayasif.front.constants.URLConstants;
import org.liferayasif.front.dto.CompanyDto;
import org.liferayasif.front.dto.UserDto;
import org.liferayasif.front.rest.template.WebRestTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.WebDataBinder;

@Controller
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	@Qualifier("userValidator")
    private Validator validator;
	
	@InitBinder
	public void bindingPreparation(WebDataBinder binder) {
		binder.setValidator(validator);
	}
	
	WebRestTemplate webRestTemplate = new WebRestTemplate();

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView view(@ModelAttribute UserDto userDto){
	
		ModelAndView mav = new ModelAndView("user-create");
		
		mav.addObject("userDto", userDto);
		
		return mav;
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ModelAndView add(@Validated @ModelAttribute UserDto userDto, BindingResult result, Errors errors){
		
		System.out.println("errors: "+result.hasErrors());
		ModelAndView mav = new ModelAndView("user-create");
		
		mav.addObject("userDto", userDto);
		
		return mav;
	}
	
	@RequestMapping(value="/addss", method=RequestMethod.POST)
	public ModelAndView home(@RequestParam("id") int id, @ModelAttribute CompanyDto companyDto){
	
		ModelAndView mav = new ModelAndView("company-details");
		
		String url = URLConstants.contextPath+"/company/findByIdCompany?id="+id;
		System.out.println("url: "+url);
		
		companyDto = webRestTemplate.getForObject(URLConstants.contextPath+"/company/findByIdCompany?id="+id, CompanyDto.class);
		System.out.println("companyDto: "+companyDto);
		if(companyDto==null){
			companyDto = new CompanyDto();
		}
		mav.addObject("company", companyDto);
		
		return mav;
	}
}
