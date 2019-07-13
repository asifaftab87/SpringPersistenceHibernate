package org.liferayasif.front.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.liferayasif.front.constants.URLConstants;
import org.liferayasif.front.dto.PatientDto;
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
@RequestMapping(value="/patient")
public class PatientController {

	
	  @Autowired
	  @Qualifier("patientValidator") 
	  private Validator validator;
	 
	
	
	  @InitBinder 
	  public void bindingPreparation(WebDataBinder binder) {
		  binder.setValidator(validator); 
	  }
	 
	
	WebRestTemplate webRestTemplate = new WebRestTemplate();

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView view(@ModelAttribute PatientDto patientDto){
	
		ModelAndView mav = new ModelAndView("patient/patient-list");
		
		String url = URLConstants.contextPath+"/patient/getAllPatient";
				
		PatientDto[] patientArray = null;
		
		try{
			patientArray = webRestTemplate.getForObject(url, PatientDto[].class);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		List<PatientDto> patientList = new ArrayList<>();
		
		if(patientArray!=null && patientArray.length>0){
			patientList = Arrays.asList(patientArray);
		}
		
		mav.addObject("patientList", patientList);
		
		return mav;
	}
	
	
	@RequestMapping(value="/addPatient", method=RequestMethod.GET)
	public ModelAndView toAdd(@ModelAttribute PatientDto patientDto){
		
		
		ModelAndView mav = new ModelAndView("patient/patient-create");
	
		mav.addObject("patient", patientDto);
		
		return mav;
	}
	
	@RequestMapping(value="/addPatient", method=RequestMethod.POST)
	public ModelAndView add(@Validated @ModelAttribute PatientDto patientDto, BindingResult result, Errors errors){
		
		if(result.hasErrors()) {
			ModelAndView mav = new ModelAndView("patient/patient-create");
			
			mav.addObject("patient", patientDto);
			
			return mav;
		}
		String url = URLConstants.contextPath+"/patient/addPatient";
		
		patientDto = webRestTemplate.postForObject(url, patientDto, PatientDto.class);
		System.out.println("patientDto: "+patientDto);
	
		return new ModelAndView("redirect:/patient");
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
