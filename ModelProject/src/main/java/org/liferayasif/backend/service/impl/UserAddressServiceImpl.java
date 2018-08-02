package org.liferayasif.backend.service.impl;

import java.util.List;

import org.liferayasif.backend.dao.UserAddressDao;
import org.liferayasif.backend.model.UserAddress;
import org.liferayasif.backend.service.UserAddressService;
import org.liferayasif.backend.util.time.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userAddressService")
@Transactional
public class UserAddressServiceImpl implements UserAddressService{

	@Autowired
	private UserAddressDao userAddressDao;
	
	@Override
	public List<UserAddress> getAllUserAddresses() {
		List<UserAddress> userAddressList = userAddressDao.getAllUserAddresses();
		return userAddressList;
	}

	@Override
	public UserAddress getUserAddressById(Integer id) {
		UserAddress UserAddress = userAddressDao.getUserAddressById(id);
		return UserAddress;
	}

	@Override
	public void addUserAddress(UserAddress userAddress) {
		
		userAddress.setCreateDt(TimeUtil.getSqlTimStmp());
		userAddress.setUpdateDt(TimeUtil.getSqlTimStmp());
		
		userAddressDao.addUserAddress(userAddress);
	}

	@Override
	public void addUserAddressList(List<UserAddress> userAddressList){
	
		if(userAddressList != null && userAddressList.size()>0){
			
			for(UserAddress userAddress : userAddressList){
				addUserAddress(userAddress);
			}
		}
	}

	
	@Override
	public void deleteUserAddress(Integer id) {
		userAddressDao.deleteUserAddress(id);
	}

	@Override
	public UserAddress updateUserAddress(UserAddress userAddress) {
		return userAddressDao.updateUserAddress(userAddress);
	}
	
	public List<UserAddress> getUserAddressesByUserId(Integer id){
		List<UserAddress> userAddressList = userAddressDao.getUserAddressesByUserId(id);
		return userAddressList;
	}
	
}
