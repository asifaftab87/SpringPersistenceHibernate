package org.liferayasif.backend.rest.controller;

import java.util.List;

import org.liferayasif.backend.constants.PathConstants;
import org.liferayasif.backend.model.Company;
import org.liferayasif.backend.model.CompanyAddress;
import org.liferayasif.backend.service.CompanyAddressService;
import org.liferayasif.backend.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = PathConstants.COMPANY_ADD)
public class CompanyAddressRestController{
	
	@Autowired
	private CompanyAddressService companyAddressService;
	
	@Autowired 
	private CompanyService companyService;
	
	
	@RequestMapping(value = PathConstants.FIND_BY_ID_COMPANY)
	public List<CompanyAddress> findByID(@RequestParam ("id") int id) throws Exception
	{
		Company company = companyService.getCompanyById(id);
		
		if(company==null)
		{
			throw new Exception("The Id doesnt have any data to reflect"+id);
		}
		
		List<CompanyAddress> companyAddressList = companyAddressService.getCompanyAddressesByCompanyId(id);
		
		return companyAddressList;
	}
	
	
	

}
