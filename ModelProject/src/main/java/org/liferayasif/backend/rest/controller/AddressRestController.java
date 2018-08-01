package org.liferayasif.backend.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.liferayasif.backend.model.Address;
import org.liferayasif.backend.model.Contact;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/address")
public class AddressRestController {


	//single line comment
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
			Address address1=new Address();
			Address address2=new Address();
			Address address3=new Address();
			
			address1.setAdd1("Howrah");
			address1.setAdd2("Sealdah");
			address1.setAdd3("Dharamtalla");
			
			address2.setAdd1("aaa");
			address2.setAdd2("bbbb");
			address2.setAdd3("ccccc");
			
			address3.setAdd1("11111");
			address3.setAdd2("22222");
			address3.setAdd3("333333");
			
			List<Address> addList=new ArrayList<Address>();
			
			addList.add(address1);
			addList.add(address2);
			addList.add(address3);
			
			/*List<Address> addressList = new ArrayList<Address>();
			addressList.add(address);*/
			
			return addList;
			
		}
		
		@RequestMapping(value="/addObj")
		public Address addObj(){
			Address address=new Address();
			
			address.setAdd1("CIT Rd.");
			address.setAdd2("MG Road");
			address.setAdd3("A b Road");
		 
			return address;
		
		}
 
		
		@RequestMapping(value="/contact")
		public Contact contactObj(){
			Contact contact=new Contact();
			Address address=new Address();
			address.setAdd1("DM block");
			address.setAdd2("PM block");
			address.setAdd3("CM block");
			
			contact.setEmail("karim@ymail.com");
			
			return contact;
		
		}
		
}
