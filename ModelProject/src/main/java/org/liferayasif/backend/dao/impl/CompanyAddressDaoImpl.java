package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.CompanyAddressDao;
import org.liferayasif.backend.model.CompanyAddress;
import org.springframework.stereotype.Repository;

@Repository("companyAddressDao")

public class CompanyAddressDaoImpl extends AbstractDao<Integer , CompanyAddress> implements CompanyAddressDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<CompanyAddress> getAllCompanyAddresses() {
		Criteria criteria = createEntityCriteria();
		return (List<CompanyAddress>) criteria.list();
	}

	@Override
	public CompanyAddress getCompanyAddressById(Integer id) {
		
		return getByKey(id);
	}

	@Override
	public CompanyAddress addCompanyAddress(CompanyAddress companyAddress) {
		persist(companyAddress);
		return companyAddress;
		
	}

	@Override
	public void deleteCompanyAddress(Integer id) {
		Query query = getSession().createSQLQuery("delete from CompnayAddress where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}

	@Override
	public CompanyAddress updateCompanyAddress(CompanyAddress companyAddress) {
		getSession().update(companyAddress);
		return companyAddress;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<CompanyAddress> getCompanyAddressByCompanyId(Integer companyId) {

		Criteria criteria = getSession().createCriteria(CompanyAddress.class);
		criteria.add(Restrictions.eq("companyId" , companyId));
	
		List<CompanyAddress> companyAddressList = criteria.list();
		return companyAddressList;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CompanyAddress> searchCompany(Integer companyId, String city, String country) {
		Criteria criteria = getSession().createCriteria(CompanyAddress.class);
		Criterion cr1 = Restrictions.eq("companyId", companyId);
		Criterion cr2 = Restrictions.eq("city", city);
		Criterion cr3 = Restrictions.eq("country", country);
		criteria.add(Restrictions.or(cr1,cr2,cr3));
		
		List<CompanyAddress> companyAddessList = criteria.list();
		return companyAddessList;
		
	}

	
	
	
	

}
