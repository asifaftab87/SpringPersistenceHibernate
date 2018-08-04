package org.liferayasif.backend.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.liferayasif.backend.constants.PathConstants;
import org.liferayasif.backend.constants.PathConstants2;
import org.liferayasif.backend.model.Company;
import org.liferayasif.backend.model.CompanyAddress;
import org.liferayasif.backend.service.CompanyAddressService;
import org.liferayasif.backend.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = PathConstants.COMP)
public class CompanyRestController {
	
	@Autowired
	private CompanyService companyService;
	
	@Autowired
	private CompanyAddressService companyAddressService;
	
	@RequestMapping(value = PathConstants.FIND_BY_ID)
	public Company findById(@RequestParam("id") int id)
	{
		Company company = companyService.getCompanyById(id);
		
		List<CompanyAddress> companyAddressList=new ArrayList<CompanyAddress>();
		if(company !=null)
		{
			companyAddressList = companyAddressService.getCompanyAddressesByCompanyId(id);
			
			if(companyAddressList != null && companyAddressList.size()>0)
			{
				company.setCompanyAddressList(companyAddressList);
			}
		}
		System.out.println(company);
		return company;
		
		
		
	}
	
	@RequestMapping(value=PathConstants.ADD_USER)
	public void add(@RequestBody Company company){
		
		
		companyService.addCompany(company);
		List<CompanyAddress> companyAddressList = company.getCompanyAddressList();
		
		companyAddressService.addCompanyAddressList(companyAddressList);
		
		return;
	}
	
	@RequestMapping(value=PathConstants.USER_ADD)
	public void addUser(@RequestBody Company company)
	{
		companyService.addCompany(company);
		
		 return;
	}
		
	@RequestMapping(value=PathConstants.USER_DEL)
	public void deleteCompany(Integer id) {
		companyService.deleteCompany(id);
		return;
		
	}
		
	
	
	
}
