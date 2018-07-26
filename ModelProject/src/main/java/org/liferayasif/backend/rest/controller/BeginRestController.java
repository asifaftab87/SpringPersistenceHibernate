package org.liferayasif.backend.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/begin")
public class BeginRestController {

	@RequestMapping(value="/first")
	public String sample(){
		return "hi";
	}
	
}
