package org.liferayasif.backend.rest.controller;

import java.util.List;

import org.liferayasif.backend.model.User;
import org.liferayasif.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/begin")
public class BeginRestController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/first")
	public User sample(@RequestParam("id") int id){
		User user = userService.getUserById(id);
		System.out.println(user);
		return user;
	}
	
	@RequestMapping(value="/getAllUsers")
	public List<User> getAllUsers(){
		List<User> userList = userService.getAllUsers();
		return userList;
	}
	
	
	@RequestMapping(value="/addUser")
	public int addUser(@RequestBody User user){
		userService.addUser(user);
		return 0;
	}
	
	
}
