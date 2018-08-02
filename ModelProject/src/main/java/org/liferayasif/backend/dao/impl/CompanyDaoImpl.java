package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
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
	public Company getCompnayById(Integer id) {
		 
		return getByKey(id);
	}

	@Override
	public void addCompany(Company company) {
		persist(company);
		
	}

	@Override
	public void deleteCompany(Integer id) {
		Query query = getSession().createSQLQuery("delte from Company where id=:id");
		query.setInteger("id", id);
		query.executeUpdate();
	}

	@Override
	public Company updateCompany(Company company) {
		getSession().update(company);
		return company;
	}

	@Override
	public List<Company> findByName(String name) {
		Criteria criteria = getSession().createCriteria(Company.class);
		criteria.add(Restrictions.eq("name", name));
		List<Company> companyList = criteria.list();
				return companyList;
	}

	
}
