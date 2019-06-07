package org.liferayasif.front.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.liferayasif.front.constants.URLConstants;
import org.liferayasif.front.dto.DoctorDto;
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
@RequestMapping(value="/doctor")
public class DoctorController {

	
	  @Autowired
	  @Qualifier("doctorValidator") 
	  private Validator validator;
	  
	 
	
	
	  @InitBinder 
	  public void bindingPreparation(WebDataBinder binder) {
		  binder.setValidator(validator); 
	  }
	 
	
	WebRestTemplate webRestTemplate = new WebRestTemplate();

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView view(@ModelAttribute DoctorDto doctorDto){
	
		ModelAndView mav = new ModelAndView("doctor/doctor-list");
		
		String url = URLConstants.contextPath+"/doctor/getAllDoctor";
				
		DoctorDto[] doctorArray = null;
		
		try{
			doctorArray = webRestTemplate.getForObject(url, DoctorDto[].class);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		List<DoctorDto> doctorList = new ArrayList<>();
		
		if(doctorArray!=null && doctorArray.length>0){
			doctorList = Arrays.asList(doctorArray);
		}
		
		mav.addObject("doctorList", doctorList);
		
		return mav;
	}
	
	
	@RequestMapping(value="/addDoctor", method=RequestMethod.GET)
	public ModelAndView toAdd(@ModelAttribute DoctorDto doctorDto){
		
		
		ModelAndView mav = new ModelAndView("doctor/doctor-create");
	
		mav.addObject("doctor", doctorDto);
		
		return mav;
	}
	
	@RequestMapping(value="/addDoctor", method=RequestMethod.POST)
	public ModelAndView add(@Validated @ModelAttribute DoctorDto doctorDto, BindingResult result, Errors errors){
		
		if(result.hasErrors()) {
			ModelAndView mav = new ModelAndView("doctor/doctor-create");
			
			mav.addObject("doctor", doctorDto);
			
			return mav;
		}
		String url = URLConstants.contextPath+"/doctor/addDoctor";
		
		doctorDto = webRestTemplate.postForObject(url, doctorDto, DoctorDto.class);
		System.out.println("doctorDto: "+doctorDto);
	
		return new ModelAndView("redirect:/doctor");
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
