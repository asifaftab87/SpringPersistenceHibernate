package org.liferayasif.backend.rest.controller;

import org.liferayasif.backend.model.Mobile;
import org.liferayasif.backend.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/mobile")
public class MobileRestController {
	
	@Autowired
	private MobileService mobileService;

	@RequestMapping(value="/getById")
	public Mobile findById(@RequestParam("id") Integer id){
		Mobile mobile = mobileService.getMobileById(id);
		return mobile;
	}

	@RequestMapping(value="/addMobile", method=RequestMethod.POST)
	public Mobile addMobile(@RequestBody Mobile mobile) {
		Mobile mobile2 = mobileService.addMobile(mobile);
		return mobile2;
	}
		
}



