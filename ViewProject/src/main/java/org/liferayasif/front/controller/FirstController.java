package org.liferayasif.front.controller;

import org.liferayasif.front.constants.URLConstants;
import org.liferayasif.front.dto.CustomersDto;
import org.liferayasif.front.dto.UserDto;
import org.liferayasif.front.rest.template.WebRestTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/first")
public class FirstController {

	WebRestTemplate webRestTemplate = new WebRestTemplate();
	
	

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView view(@ModelAttribute UserDto userDto){
	
		ModelAndView mav = new ModelAndView("search");
		
		mav.addObject("user", userDto);
		
		return mav;
	}
	
	@RequestMapping(value="/search", method=RequestMethod.GET)
	public ModelAndView home(@RequestParam("id") int id, @ModelAttribute UserDto userDto){
	
		
		ModelAndView mav = new ModelAndView("user-details");
		
		//Integer id = userDto.getId();
		String url = URLConstants.contextPath+"/begin/first?id="+id;
		System.out.println("url: "+url);
		
		userDto = webRestTemplate.getForObject(URLConstants.contextPath+"/begin/first?id="+id, UserDto.class);
		System.out.println("userDto: "+userDto);
		
		mav.addObject("user", userDto);
		
		return mav;
	}
	
	
	
	//this is not understood i want to know aftr submittign id how it displying resultlt
	  @RequestMapping(value="/cust", method=RequestMethod.GET)
	public ModelAndView view(@ModelAttribute CustomersDto customersDto){
	
		ModelAndView mav = new ModelAndView("cust-search");
		
		mav.addObject("customers", customersDto);
		
		return mav;
	}
	 
	@RequestMapping(value="/custSearchId", method=RequestMethod.GET)
	public ModelAndView custSearchId(@RequestParam("id") int id, @ModelAttribute CustomersDto customersDto){
	
		
		ModelAndView mav = new ModelAndView("cust-details");
		
		//Integer id = userDto.getId();
		String url = URLConstants.contextPath+"/customers/getById?id="+id;
		System.out.println("url: "+url);
		
		customersDto = webRestTemplate.getForObject(URLConstants.contextPath+"/customers/getById?id="+id, CustomersDto.class);
		System.out.println("CustomersDto: "+customersDto);
		
		mav.addObject("customers", customersDto);
		
		return mav;
	}
	
	/*@RequestMapping(method=RequestMethod.POST)
	public ModelAndView addUdfasdser(@ModelAttribute UserDto user){
	
		ModelAndView mav = new ModelAndView("view");
		
		int i = webRestTemplate.postForObject(URLConstants.contextPath+"/begin/addUser", user, Integer.class);
		
		System.out.println("id: "+i);
		mav.addObject("user", user);
		
		return mav;
	}
	
	
	@RequestMapping(value="/addUser", method=RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute UserDto user){
	
		ModelAndView mav = new ModelAndView("view");
		
		
	//	int i = webRestTemplate.postForObject(URLConstants.contextPath+"/begin/addUser", user, Integer.class);
		
		System.out.println("id: POST");
		mav.addObject("user", user);
		
		return mav;
	}
	
	
	@RequestMapping(value="/addUser", method=RequestMethod.GET)
	public ModelAndView addUsedasdr(@ModelAttribute User user){
	
		ModelAndView mav = new ModelAndView("view");
		
		//WebRestTemplate webRestTemplate = new WebRestTemplate();
		
		//int i = webRestTemplate.postForObject(URLConstants.contextPath+"/begin/addUser", user, Integer.class);
		
		System.out.println("id: GET ");
		mav.addObject("user", user);
		
		return mav;
	}
	
	
	@RequestMapping(value="/user", method=RequestMethod.GET)
	public ModelAndView userById(@RequestParam("id") int id){
		
		
		ModelAndView mav = new ModelAndView("view");
		User user = webRestTemplate.getForObject(URLConstants.contextPath+"/begin/first?id="+id, User.class);
		System.out.println(user);
		
		return mav;
	}
	
	@RequestMapping(value="allUsers")
	public ModelAndView getAllUsers(){
		
		ModelAndView mav = new ModelAndView("view");
		
		User[] userArray = webRestTemplate.getForObject(URLConstants.contextPath+"/begin/getAllUsers", User[].class);
		
		List<User> userList = Arrays.asList(userArray);
		
		for(User user : userList)
			System.out.println(user);
		return mav;
	}*/
	
}
