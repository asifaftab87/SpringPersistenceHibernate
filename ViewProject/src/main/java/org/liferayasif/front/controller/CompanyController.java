package org.liferayasif.front.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
	
	
	@RequestMapping(value="/searchByNum", method=RequestMethod.GET)
	public ModelAndView viewNum(@ModelAttribute CompanyDto companyDto){
	
		ModelAndView mav = new ModelAndView("company-search-number");
		
		mav.addObject("company", companyDto);
		
		return mav;
	}
	
	
	@RequestMapping(value="/companyDisplay", method=RequestMethod.GET)
	public ModelAndView schoolDisplay(@RequestParam("num") int num, @ModelAttribute CompanyDto companyDto)
	{
		ModelAndView mav = new ModelAndView("company-display");
		CompanyDto[] companyDtoArray = webRestTemplate.getForObject(URLConstants.contextPath+"/company/searchByNum?num="+num, CompanyDto[].class);
		
		List<CompanyDto> companyDtoList = new ArrayList<CompanyDto>();
		
		if(companyDtoArray !=null && companyDtoArray.length>0){
			companyDtoList = Arrays.asList(companyDtoArray);
		}
		
		mav.addObject("company" , companyDto);
		mav.addObject("companyDtoList" , companyDtoList);
		
		return mav;
				
	}
//	why this method is post?
//			because i need to post the value in backend(db) from browser
//			from this method u r only redirecting to the company-create page not posting any date 
//			so it should be get only 
	
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView add(@ModelAttribute CompanyDto companyDto){
		
		ModelAndView mav = new ModelAndView("company-create");
		
		mav.addObject("company", companyDto);
		
		return mav;
	}
	@RequestMapping(value="/adds", method=RequestMethod.POST)
	public ModelAndView adds(@ModelAttribute CompanyDto companyDto){
		
		ModelAndView mav = new ModelAndView("company-result");
		
		try {
		companyDto = webRestTemplate.postForObject(URLConstants.contextPath+"/company/addCompany",companyDto, CompanyDto.class);
		mav.addObject("result","success");
		}
		catch(Exception e) {
			e.printStackTrace();
			mav.addObject("result","unsucces");
		}
		
		mav.addObject("companyDto", companyDto);
		
		return mav;
	}
}
