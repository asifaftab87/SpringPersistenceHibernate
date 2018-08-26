package org.liferayasif.front.controller;

import org.liferayasif.front.constants.URLConstants;
import org.liferayasif.front.dto.CompanyDto;
import org.liferayasif.front.rest.template.WebRestTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/company")
public class CompanyController {

	
WebRestTemplate webRestTemplate = new WebRestTemplate();
	
	

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView view(@ModelAttribute CompanyDto companyDto){
	
		ModelAndView mav = new ModelAndView("search-company");
		
		mav.addObject("company", companyDto);
		
		return mav;
	}
	
	@RequestMapping(value="/search", method=RequestMethod.GET)
	public ModelAndView home(@RequestParam("id") int id, @ModelAttribute CompanyDto companyDto){
	
		
		ModelAndView mav = new ModelAndView("company-details");
		
		//Integer id = userDto.getId();
		String url = URLConstants.contextPath+"/company/findByIdCompany?id="+id;
		System.out.println("url: "+url);
		
		companyDto = webRestTemplate.getForObject(URLConstants.contextPath+"/company/findByIdCompany?id="+id, CompanyDto.class);
		System.out.println("companyDto: "+companyDto);
		
		mav.addObject("company", companyDto);
		
		return mav;
	}
}
