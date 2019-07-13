package org.liferayasif.spring.reference.web;

import org.liferayasif.spring.reference.dto.User;
import org.liferayasif.spring.reference.rest.template.WebRestTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home(){
		return "view";
	}
	
	@RequestMapping(value="/next", method=RequestMethod.GET)
	public String next(){
		
		WebRestTemplate webRestTemplate = new WebRestTemplate();
		
		User user = webRestTemplate.getForObject("http://localhost:8888/SecRef/begin/getUser/1", User.class);
		System.out.println(user);
		return "next";
	}
	
	
}
