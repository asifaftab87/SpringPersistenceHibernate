package org.liferayasif.front.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.liferayasif.front.constants.URLConstants;
import org.liferayasif.front.dto.RegistrationDto;
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
@RequestMapping(value="/registration")
public class RegistrationController {

	
	  @Autowired
	  @Qualifier("registrationValidator") 
	  private Validator validator;
	 
	
	
	  @InitBinder 
	  public void bindingPreparation(WebDataBinder binder) {
		  binder.setValidator(validator); 
	  }
	 
	
	WebRestTemplate webRestTemplate = new WebRestTemplate();

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView view(@ModelAttribute RegistrationDto registrationDto){
	
		ModelAndView mav = new ModelAndView("registration/registration-list");
		
		String url = URLConstants.contextPath+"/registration/getAllRegistration";
				
		RegistrationDto[] registrationArray = null;
		
		try{
			registrationArray = webRestTemplate.getForObject(url, RegistrationDto[].class);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		List<RegistrationDto> registrationList = new ArrayList<>();
		
		if(registrationArray!=null && registrationArray.length>0){
			registrationList = Arrays.asList(registrationArray);
		}
		
		mav.addObject("registrationList", registrationList);
		
		return mav;
	}
	
	
	@RequestMapping(value="/addRegistration", method=RequestMethod.GET)
	public ModelAndView toAdd(@ModelAttribute RegistrationDto registrationDto){
		
		
		ModelAndView mav = new ModelAndView("registration/registration-create");
	
		mav.addObject("registration", registrationDto);
		
		return mav;
	}
	
	@RequestMapping(value="/addRegistration", method=RequestMethod.POST)
	public ModelAndView add(@Validated @ModelAttribute RegistrationDto registrationDto, BindingResult result, Errors errors){
		
		if(result.hasErrors()) {
			ModelAndView mav = new ModelAndView("registration/registration-create");
			
			mav.addObject("registration", registrationDto);
			
			return mav;
		}
		String url = URLConstants.contextPath+"/registration/addRegistration";
		
		registrationDto = webRestTemplate.postForObject(url, registrationDto, RegistrationDto.class);
		System.out.println("registrationDto: "+registrationDto);
	
		return new ModelAndView("redirect:/registration");
	}
	
	/*
	 * @RequestMapping(value="/addss", method=RequestMethod.POST) public
	 * ModelAndView home(@RequestParam("id") int id, @ModelAttribute CompanyDto
	 * companyDto){
	 * 
	 * ModelAndView mav = new ModelAndView("company-details");
	 * 
	 * String url = URLConstants.contextPath+"/company/findByIdCompany?id="+id;
	 * System.out.println("url: "+url);
	 * 
	 * companyDto = webRestTemplate.getForObject(URLConstants.contextPath+
	 * "/company/findByIdCompany?id="+id, CompanyDto.class);
	 * System.out.println("companyDto: "+companyDto); if(companyDto==null){
	 * companyDto = new CompanyDto(); } mav.addObject("company", companyDto);
	 * 
	 * return mav; }
	 */
}
