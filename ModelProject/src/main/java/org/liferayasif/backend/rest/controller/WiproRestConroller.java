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
		Wipro wipro1=new Wipro();
		Wipro wipro2=new Wipro();
		Wipro wipro3=new Wipro();
		
		
		wipro1.setAvgSalary(35000);
		wipro1.setDepartment("IT");
		wipro1.setLocation("Chennai");
		wipro1.setNoOfEmployee(2500);
		
		wipro2.setAvgSalary(25000);
		wipro2.setDepartment("FMG");
		wipro2.setLocation("Kolkata");
		wipro2.setNoOfEmployee(300);
		
		wipro3.setAvgSalary(18000);
		wipro3.setDepartment("HR");
		wipro3.setLocation("Kolkata");
		wipro3.setNoOfEmployee(250);
		
		
		
		List<Wipro> wiproList=new ArrayList<>();
		wiproList.add(wipro1);
		wiproList.add(wipro2);
		wiproList.add(wipro3);
		
		return wiproList;
		
		
	}

}
