package org.liferayasif.front.controller;

import org.liferayasif.front.dto.User;
import org.liferayasif.front.rest.template.WebRestTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FirstController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home(){
		
		WebRestTemplate webRestTemplate = new WebRestTemplate();
		//User user = webRestTemplate.getForObject("http://localhost:8888/SecRef/begin/getUser/1", User.class);
		String s = webRestTemplate.getForObject("http://localhost:8181/model/begin/first", String.class);
		//System.out.println(user);
		System.out.println(s);
		return "view";
	}
}
