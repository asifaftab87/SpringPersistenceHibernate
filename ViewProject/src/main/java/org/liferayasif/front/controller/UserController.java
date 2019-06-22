package org.liferayasif.front.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.liferayasif.front.client.ClientUtil;
import org.liferayasif.front.constants.URLConstants;
import org.liferayasif.front.dto.CompanyDto;
import org.liferayasif.front.dto.UserDto;
import org.liferayasif.front.rest.template.WebRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

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

	@RequestMapping(method=RequestMethod.GET, value="/something")
	public ModelAndView view2(@ModelAttribute UserDto userDto){
		ModelAndView mav = new ModelAndView("user/user-list");
	
		String theUrl = "http://localhost:8080/user/gg";
		
		RestTemplate restTemplate = new RestTemplate();
		
		try {
	        HttpHeaders headers = ClientUtil.getHeaders("jawed","test");
	        HttpEntity<String> entity = new HttpEntity<String>(headers);
	        restTemplate.postForObject(theUrl,  entity, UserDto.class);
	        ResponseEntity<UserDto> response = restTemplate.exchange(theUrl, HttpMethod.GET, entity, UserDto.class);
	        
	        System.out.println("Result - status ("+ response.getStatusCode() + ") has body: " + response.hasBody());
	        
	   
	    }
	    catch (Exception eek) {
	        System.out.println("** Exception: "+ eek.getMessage());
	        eek.printStackTrace();
	    }
		
		return mav;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView view(@ModelAttribute UserDto userDto){
	
		ModelAndView mav = new ModelAndView("user/user-list");
		
		String url = URLConstants.contextPath+"/user/getAllUser";
				
		UserDto[] userArray = null;
		
		try{
			userArray = webRestTemplate.getForObject(url, UserDto[].class);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		List<UserDto> userList = new ArrayList<>();
		
		if(userArray!=null && userArray.length>0){
			userList = Arrays.asList(userArray);
		}
		
		mav.addObject("userList", userList);
		mav.addObject("userDto", userDto);
		
		return mav;
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ModelAndView add(@Validated @ModelAttribute UserDto userDto, BindingResult result, Errors errors){
		
		System.out.println("errors: "+result.hasErrors());
		ModelAndView mav = new ModelAndView("user-result");
		
		if(!result.hasErrors()){
			//oepration here
			//add rest controller
		}
		else{
			mav = new ModelAndView("user-create");
		}
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
