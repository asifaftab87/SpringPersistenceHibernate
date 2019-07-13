package org.liferayasif.backend.rest.controller;

import org.liferayasif.backend.constants.PathConstants;
import org.liferayasif.backend.model.Form;
import org.liferayasif.backend.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value=PathConstants.FORM)
public class FormRestController {
	

	@Autowired
	private FormService formService;

	@RequestMapping(value=PathConstants.ADD, method=RequestMethod.POST)
	public Form add(@RequestBody Form form) throws Exception
	{
		String name = form.getName();
		String fatherName = form.getFatherName();
		String number = form.getNumber();
		String email = form.getEmail();
		String password = form.getPassword();
		String dob = form.getDob();
		String state = form.getState();
		String country = form.getCountry();
					
		if(name==null || name.isEmpty() || fatherName==null || fatherName.isEmpty() || email==null || email.isEmpty() || password==null || password.isEmpty() || dob==null || dob.isEmpty() || state==null || state.isEmpty() || country==null || country.isEmpty() || number==null || email.isEmpty())
		{
			throw new Exception ("the field cannot be empty");
		}
		
		form = formService.addForm(form);
		
		return form;
	}



}
