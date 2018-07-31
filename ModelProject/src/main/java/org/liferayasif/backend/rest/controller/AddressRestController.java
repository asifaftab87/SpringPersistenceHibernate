package org.liferayasif.backend.rest.controller;

import java.util.List;

import org.liferayasif.backend.model.Address;
import org.liferayasif.backend.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/address")
public class AddressRestController {
	
	
	@Autowired
	private AddressService addressService;

	@RequestMapping(value="/first")
	public Address sample(@RequestParam("id") String id){
		Address address = addressService.getAddressById(id);
		System.out.println(address);
		return address;
	}
	
	@RequestMapping(value="/listOfAddress")
	public List<Address> addressList(){
		
		List<Address> addressList = addressService.getAllAddress();
		
		return addressList;
	}
}