package org.liferayasif.backend.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.liferayasif.backend.model.Address;
import org.liferayasif.backend.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/address")
public class AddressRestController {

//<<<<<<< HEAD
	
//=======
//>>>>>>> branch 'security' of https://github.com/asifaftab87/SpringPersistenceHibernate.git
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
	

		@RequestMapping(value="/getAddList")
		public List<Address> addList(){
			Address address=new Address();
			
			address.setAdd1("Howrah");
			address.setAdd2("Sealdah");
			address.setAdd3("Dharamtalla");
			
			List<Address> addressList = new ArrayList<Address>();
			addressList.add(address);
			
			return addressList;
			
		}
		
		@RequestMapping(value="/addObj")
		public Address addObj(){
			Address address=new Address();
			
			address.setAdd1("CIT Rd.");
			address.setAdd2("MG Road");
			address.setAdd3("A b Road");
		 
			return address;
		
		}
 
 
}
