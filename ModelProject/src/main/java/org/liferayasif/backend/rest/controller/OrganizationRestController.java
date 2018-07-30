package org.liferayasif.backend.rest.controller;

import java.util.ArrayList;
import java.util.List;


import org.liferayasif.backend.model.Organization;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/organization")

public class OrganizationRestController {
	
	@RequestMapping(value="/listOfOrg")
	public List<Organization>listOrg(){
		
		Organization organization1 = new Organization();
		Organization organization2 = new Organization();
		Organization organization3 = new Organization();
		///Organization organization4 = new Organization();
		
		organization1.setUserId(0001);
		organization1.setUserId(900);
		organization1.setName("komla");
		organization1.setAddress("CIT Road");
		organization1.setCountry("India");
		organization1.setCity("Punjab");
		organization1.setState("West Bengal");
		
		
		organization2.setUserId(0002);
		organization2.setUserId(800);
		organization2.setName("kiran");
		organization2.setAddress("lodhi Road");
		organization2.setCountry("france");
		organization2.setCity("hochina");
		organization2.setState("Macao");
		
		organization3.setUserId(0003);
		organization3.setUserId(700);
		organization3.setName("usha");
		organization3.setAddress("mekin streeet");
		organization3.setCountry("Germany");
		organization3.setCity("central city");
		organization3.setState("Holloween Street");
		
		List<Organization> organizationList=new ArrayList<Organization>();
		organizationList.add(organization1);
		organizationList.add(organization2);
		organizationList.add(organization3);
		
		return organizationList;
	}
	

}
