package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.CompanyDao;
import org.liferayasif.backend.model.Company;
import org.springframework.stereotype.Repository;

@Repository("companyDao")

public class CompanyDaoImpl extends AbstractDao<Integer ,Company> implements CompanyDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Company> getAllCompanys() {
		Criteria criteria = createEntityCriteria();
		return  (List<Company>) criteria.list();
	}

	@Override
	public Company getCompanyById(Integer id) {
		 
		return getByKey(id);
	}

	@Override
	public void addCompany(Company company) {
		persist(company);
		
	}

	@Override
	public void deleteCompany(Integer id) {
		Query query = getSession().createSQLQuery("delete from Company where id=:id");
		query.setInteger("id", id);
		query.executeUpdate();
	}

	@Override
	public Company updateCompany(Company company) {
		getSession().update(company);
		return company;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Company> findByName(String name) {
		Criteria criteria = getSession().createCriteria(Company.class);
		criteria.add(Restrictions.eq("name", name));
		List<Company> companyList = criteria.list();
		return companyList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Company> searchCompany(String email, String name) {
		Criteria criteria = getSession().createCriteria(Company.class);
		Criterion cr1 = Restrictions.eq("name", name);
		Criterion cr2 = Restrictions.eq("email", email);
		criteria.add(Restrictions.or(cr1, cr2));

		List<Company> companyList = criteria.list();
		return companyList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Company> searchByEmailName(String email, String name) {
		Criteria criteria = getSession().createCriteria(Company.class);
		Criterion cr1 = Restrictions.eq("email", email);
		Criterion cr2 = Restrictions.eq("name", name);
		criteria.add(Restrictions.and(cr1, cr2));
		
		
		List<Company> companyList = criteria.list();
		
		return companyList;
	}

	
}
