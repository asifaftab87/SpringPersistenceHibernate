package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.CustomersDao;
import org.liferayasif.backend.model.Customers;
import org.springframework.stereotype.Repository;

@Repository("customerDao")
public class CustomersDaoImpl extends AbstractDao<Integer, Customers> implements CustomersDao{

	@Override
	@SuppressWarnings("unchecked")
	public List<Customers> getAllCustomers() {
		Criteria criteria = createEntityCriteria();
		return (List<Customers>) criteria.list();
	}
	
	@Override
	public Customers getCustomersById(Integer id) {
		return getByKey(id);
	}

	@Override
	public Customers addCustomers(Customers customers) {
		persist(customers);
		return customers;
	}

	@Override
	public void deleteCustomers(Integer id) {
		Query query = getSession().createSQLQuery("delete from Customer where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
		
	}

	@Override
	public Customers updateCustomers(Customers customers) {
		getSession().update(customers);
		return customers;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Customers> findByName(String name){
		
		Criteria criteria = getSession().createCriteria(Customers.class);
		criteria.add(Restrictions.eq("name", name));
		
		List<Customers> customerList = criteria.list();

		return customerList;				
	}


}
