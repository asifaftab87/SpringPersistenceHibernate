package org.liferayasif.backend.dao;

import java.util.List;

import org.liferayasif.backend.model.UserAddress;

public interface UserAddressDao {

	public List<UserAddress> getAllUserAddresses();
	
	public UserAddress getUserAddressById(Integer id);
	
	public UserAddress addUserAddress(UserAddress userAddress);
	
	public void deleteUserAddress(Integer id);
	
	public UserAddress updateUserAddress(UserAddress userAddress);
	
	public List<UserAddress> getUserAddressesByUserId(Integer id);
		
}
