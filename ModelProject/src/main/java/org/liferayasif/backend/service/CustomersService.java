package org.liferayasif.backend.service;

import java.util.List;

import org.liferayasif.backend.model.Customers;

public interface CustomersService {

	public List<Customers> getAllCustomers();
	
	public Customers getCustomersById(Integer customers);
	
	public Customers addCustomers(Customers customers);
	
	public void deleteCustomers(Integer id);
	
	public Customers updateCustomers(Customers customers);
	
	public List<Customers> findByName(String name);

}
