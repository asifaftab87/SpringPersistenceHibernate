package org.liferayasif.backend.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.liferayasif.backend.model.Wipro;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/wipro")



public class WiproRestConroller {

	@RequestMapping(value="/listWipro")
	
	public List<Wipro> getAllWipro()
	{
		Wipro wipro=new Wipro();
		wipro.getAvgSalary();
		wipro.getDepartment();
		wipro.getlocation();
		wipro.getNoOfEmployee();
		
		List<Wipro> wiproList=new ArrayList<>();
		wiproList.add(wipro);
		
		return wiproList;
		
		
	}

}
