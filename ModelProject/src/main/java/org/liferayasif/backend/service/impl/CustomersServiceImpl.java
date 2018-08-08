package org.liferayasif.backend.service.impl;

import java.util.List;

import org.liferayasif.backend.dao.CustomersDao;
import org.liferayasif.backend.model.Customers;
import org.liferayasif.backend.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("customersService")
@Transactional
public class CustomersServiceImpl implements CustomersService{

	@Autowired
	private CustomersDao customersDao;
	
	@Override
	public List<Customers> getAllCustomers() {
		List<Customers> customersList = customersDao.getAllCustomers();
		return customersList;
	}

	@Override
	public Customers getCustomersById(Integer id) {
		Customers customers = customersDao.getCustomersById(id);
		return customers;
	}

	@Override
	public Customers addCustomers(Customers customers) {
		return customersDao.addCustomers(customers);
	}

	@Override
	public void deleteCustomers(Integer id) {
		customersDao.deleteCustomers(id);
	}

	@Override
	public Customers updateCustomers(Customers customers) {
		return customersDao.updateCustomers(customers);
	}
	
	@Override
	public List<Customers> findByName(String name){
		return customersDao.findByName(name);
	}


}
