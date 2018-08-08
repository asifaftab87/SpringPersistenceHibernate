package org.liferayasif.backend.dao;

import java.util.List;

import org.liferayasif.backend.model.Customers;

public interface CustomersDao {

	public List<Customers> getAllCustomers();
	
	public Customers getCustomersById(Integer id);
	
	public Customers addCustomers(Customers customers);
	
	public void deleteCustomers(Integer id);
	
	public Customers updateCustomers(Customers customers);
	
	public List<Customers> findByName(String name);

}
