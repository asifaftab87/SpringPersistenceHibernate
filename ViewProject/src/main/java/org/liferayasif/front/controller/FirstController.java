package org.liferayasif.front.controller;

import java.util.Arrays;
import java.util.List;

import org.liferayasif.front.constants.URLConstants;
import org.liferayasif.front.dto.User;
import org.liferayasif.front.rest.template.WebRestTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView home(@ModelAttribute User user){
	
		ModelAndView mav = new ModelAndView("view");
		
		mav.addObject("user", user);
		
		return mav;
	}
	
	
	@RequestMapping(value="/addUser", method=RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute User user){
	
		ModelAndView mav = new ModelAndView("view");
		
		WebRestTemplate webRestTemplate = new WebRestTemplate();
		
		int i = webRestTemplate.postForObject(URLConstants.contextPath+"/begin/addUser", user, Integer.class);
		
		System.out.println("id: "+i);
		mav.addObject("user", user);
		
		return mav;
	}
	
	
	
	@RequestMapping(value="/user", method=RequestMethod.GET)
	public ModelAndView userById(@RequestParam("id") int id){
		
		WebRestTemplate webRestTemplate = new WebRestTemplate();
		
		ModelAndView mav = new ModelAndView("view");
		User user = webRestTemplate.getForObject(URLConstants.contextPath+"/begin/first?id="+id, User.class);
		System.out.println(user);
		
		return mav;
	}
	
	@RequestMapping(value="allUsers")
	public ModelAndView getAllUsers(){
		
		ModelAndView mav = new ModelAndView("view");
		
		WebRestTemplate webRestTemplate = new WebRestTemplate();
		
		User[] userArray = webRestTemplate.getForObject(URLConstants.contextPath+"/begin/getAllUsers", User[].class);
		
		List<User> userList = Arrays.asList(userArray);
		
		for(User user : userList)
			System.out.println(user);
		return mav;
	}
	
}
