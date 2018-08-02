package org.liferayasif.backend.service;

import java.util.List;

import org.liferayasif.backend.model.Company;

public interface CompanyService {

	
	
		public List<Company> getAllCompanys();
		
		public Company getCompanyById(Integer Id);
		
		public void addCompany(Company company);
		
		public void deleteCompany(Integer id);
		
		public Company updateCompany(Company company);
		
		public List<Company> findByName(String name);


}
