package org.liferayasif.backend.service.impl;

import java.util.List;

import org.liferayasif.backend.dao.AddressDao;
import org.liferayasif.backend.model.Address;
import org.liferayasif.backend.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("addressService")
@Transactional
public class AddressServiceImpl implements AddressService{


	@Autowired
	private AddressDao addressDao;
	
	@Override
	public List<Address> getAllAddress() {
		List<Address> addressList = addressDao.getAllAddress();
		return addressList;
	}

	@Override
	public Address getAddressById(Integer id) {
		Address address = addressDao.getAddressById(id);
		return address;
	}

	@Override
	public void addAddress(Address address) {
		addressDao.addAddress(address);
	}

	@Override
	public void deleteAddress(Integer id) {
		addressDao.deleteAddress(id);
	}

	@Override
	public Address updateAddress(Address address) {
		return null;
	}

	
}
