package org.liferayasif.backend.dao;

import java.util.List;

import org.liferayasif.backend.model.Company;

public interface CompanyDao {
	
	public List<Company> getAllCompanys();
	
	public Company getCompanyById(Integer Id);
	
	public List<Company> getCompanyByNumber(Integer num);
	
	public void addCompany(Company company);
	
	public void deleteCompany(Integer id);
	
	public Company updateCompany(Company company);
	
	public List<Company> findByName(String name);
	
	public List<Company> searchCompany(String email, String name);
	
	public List<Company> searchByEmailName(String email, String name);

}
