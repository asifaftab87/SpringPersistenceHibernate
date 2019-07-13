package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.SuppliersDao;
import org.liferayasif.backend.model.Suppliers;
import org.springframework.stereotype.Repository;

@Repository("SuppliersDao")
public class SuppliersDaoImpl extends AbstractDao<Integer , Suppliers> implements SuppliersDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Suppliers> getAllSuppliers() {
		Criteria criteria = createEntityCriteria(); 
		return (List<Suppliers>) criteria.list();
	}

	@Override
	public Suppliers getSupplierById(Integer id) {
		return getByKey(id); 
		
	}
	
	@Override
	public Suppliers addSuppliers(Suppliers suppliers) {
		persist(suppliers); 
		return suppliers;
	}

	
	@Override
	public void deleteSupplierById(Integer id) {
		 
		Query query = getSession().createSQLQuery("delete from Suppliers where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
		 
	}

	@Override
	public Suppliers updateSuppliers(Suppliers suppliers) {
	 
		getSession().update(suppliers);
		return suppliers;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Suppliers> findByName(String name) {
		Criteria criteria = getSession().createCriteria(Suppliers.class);
		criteria.add(Restrictions.eq("name", name));
		List<Suppliers> suppliersList = criteria.list();
		return suppliersList;
	}

	

}
