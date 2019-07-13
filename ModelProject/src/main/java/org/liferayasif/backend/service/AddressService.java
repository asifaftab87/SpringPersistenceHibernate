package org.liferayasif.backend.service;

import java.util.List;

import org.liferayasif.backend.model.Address;

public interface AddressService {
	

public List<Address> getAllAddress();
	
	public Address getAddressById(Integer id);
	
	public void addAddress(Address address);
	
	public void deleteAddress(Integer id);
	
	public Address updateAddress(Address address);

}
