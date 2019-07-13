package org.liferayasif.backend.rest.controller;

import java.util.List;

import org.liferayasif.backend.constants.PathConstants;
import org.liferayasif.backend.model.Customers;
import org.liferayasif.backend.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value=PathConstants.CUSTOMERS)
public class CustomersRestController {
	
	@Autowired
	private CustomersService customersService;
	
	@RequestMapping(value=PathConstants.ADDCUSTOMERS, method=RequestMethod.POST)
	public int addCustomers(@RequestBody Customers customers)
	{
		customersService.addCustomers(customers);
		return 0;
	}	
	
	@RequestMapping(value=PathConstants.GETBYID)
	public Customers sample(@RequestParam("id") int id){
		Customers customers = customersService.getCustomersById(id);
//		System.out.println(customers);
		return customers;
	}	
	
	@RequestMapping(value="/GETALLBUILDING")
	public List<Customers> getAllCustomers(){
		List<Customers> customersList = customersService.getAllCustomers();
		return customersList;
	}
}
