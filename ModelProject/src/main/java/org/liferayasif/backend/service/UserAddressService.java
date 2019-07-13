package org.liferayasif.backend.service;

import java.util.List;

import org.liferayasif.backend.model.UserAddress;

public interface UserAddressService {

	public List<UserAddress> getAllUserAddresses();
	
	public UserAddress getUserAddressById(Integer id);
	
	public UserAddress addUserAddress(UserAddress userAddress);
	
	public List<UserAddress> addUserAddressList(List<UserAddress> userAddressList);
	
	public void deleteUserAddress(Integer id);
	
	public UserAddress updateUserAddress(UserAddress userAddress);
	
	public List<UserAddress> getUserAddressesByUserId(Integer id);
	
}
