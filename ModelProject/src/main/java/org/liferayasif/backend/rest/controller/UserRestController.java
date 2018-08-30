package org.liferayasif.backend.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.liferayasif.backend.constants.PathConstants;
import org.liferayasif.backend.model.User;
import org.liferayasif.backend.model.UserAddress;
import org.liferayasif.backend.service.UserAddressService;
import org.liferayasif.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = PathConstants.USER)
public class UserRestController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private UserAddressService userAddressService;
	
	@RequestMapping(value=PathConstants.FIND_BY_ID)
	public User findById(@RequestParam("id") int id){
		
		User user = userService.getUserById(id);
		
		 List<UserAddress> userAddressList = new ArrayList<UserAddress>();
		 
		
		if(user != null){
			userAddressList = userAddressService.getUserAddressesByUserId(id);		
			user.setUserAddressList(userAddressList);
		} 
		
		return user;
	}
	
	@RequestMapping(value=PathConstants.ADD_USER, method=RequestMethod.POST)
	public User add(@RequestBody User user) throws Exception{
		
		String name = user.getName();
		
		if(name==null || name.isEmpty()){
			throw new Exception("Name will not empty");
		}
		
		String email = user.getEmail();
		
		if(email==null || email.isEmpty()){
			throw new Exception("Email will not empty");
		}
		
		user = userService.addUser(user);
		
		List<UserAddress> userAddressList = user.getUserAddressList();
		
		if(userAddressList != null){
			for(UserAddress userAddress : userAddressList){
				userAddress.setUserId(user.getId());
			}
			
			userAddressService.addUserAddressList(userAddressList);
		}
		
		return user;
	}
	
}
