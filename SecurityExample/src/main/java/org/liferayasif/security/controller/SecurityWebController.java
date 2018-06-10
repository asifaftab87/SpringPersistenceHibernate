package org.liferayasif.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SecurityWebController {

	@RequestMapping(method=RequestMethod.GET, value="/login")
	public String home() {
		return "view";
	}
}
