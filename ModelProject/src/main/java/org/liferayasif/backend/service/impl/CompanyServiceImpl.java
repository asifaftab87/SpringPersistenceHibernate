package org.liferayasif.backend.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.liferayasif.backend.dao.CompanyDao;
import org.liferayasif.backend.model.Company;
import org.liferayasif.backend.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("companyService")
@Transactional
public class CompanyServiceImpl implements CompanyService{

	@Autowired
	private CompanyDao companyDao;
	
	@Override
	public List<Company> getAllCompanys() {
		List<Company> companyList=companyDao.getAllCompanys();
		return companyList;
	}

	@Override
	public Company getCompanyById(Integer Id) {
		Company company=companyDao.getCompanyById(Id);
		return company;
	}

	@Override
	public Company addCompany(Company company) {
		companyDao.addCompany(company);
		return company;
		
	}

	@Override
	public void deleteCompany(Integer id) {
		companyDao.deleteCompany(id);
		
	}

	@Override
	public Company updateCompany(Company company) {
		return companyDao.updateCompany(company);
		
	}

	@Override
	public List<Company> findByName(String name) {
		
		return companyDao.findByName(name);
	}
	
	public List<Company> searchCompany(String email, String name){
		List<Company> companyList = companyDao.searchCompany(email, name);
		return companyList;
	}

	@Override
	public List<Company> searchByEmailName(String email, String name) {
		List<Company> companyList = companyDao.searchByEmailName(email, name);
		return companyList;
	}
	

}
