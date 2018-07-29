package org.liferayasif.backend.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.liferayasif.backend.model.Address;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/address")
public class AddressRestController {

	@RequestMapping(value="/listOfAddress")
	public List<Address> AddressList(){
		List<Address> addressList = new ArrayList<Address>();
		Address address = new Address();

		
		address.setAdd1("Rifle Range Road");
		address.setAdd2("Tiljala Road");
		address.setAdd3("Shamshul huda Road");

		addressList.add(address);
		
		
		return addressList;
	}
	
	
}
