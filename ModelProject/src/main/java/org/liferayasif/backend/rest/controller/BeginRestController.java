package org.liferayasif.backend.rest.controller;

import java.util.List;

import org.liferayasif.backend.model.User;
import org.liferayasif.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping(value="/second")
	public User example(@RequestParam("id") int id){
		User user = userService.getUserById(id);
		System.out.println(user);
		return user;
	}
	
	@RequestMapping(value="/getAllUsers")
	public List<User> getAllUsers(){
		List<User> userList = userService.getAllUsers();
		return userList;
	}
	
	
	@RequestMapping(value="/addUser", method=RequestMethod.POST)
	public int addUser(@RequestBody User user){
		userService.addUser(user);
		return 0;
	}
	
	@RequestMapping(value="/welcome")
	public String greet(){
		String greet="Hi welcome to my page";
		return greet;
	}
	
	@RequestMapping(value="/calculation")
	public int cal(){
		
		int cal=65*98;
		return cal;
	}
	
	//to update user
	@RequestMapping(value="/updateUser", method=RequestMethod.POST)
	public int updateUser(@RequestBody User user){
		userService.updateUser(user);
		return 0;
	}
	
	//Search using column name of user table
	@RequestMapping(value="/usersByName", method=RequestMethod.GET)
	public List<User> findByName(@RequestParam("name") String name){
		List<User> userList = userService.findByName(name);
		return userList;
	}
}
