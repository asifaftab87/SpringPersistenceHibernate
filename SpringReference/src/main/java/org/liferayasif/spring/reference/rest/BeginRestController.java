package org.liferayasif.spring.reference.rest;

import java.util.List;

import org.liferayasif.spring.reference.model.User;
import org.liferayasif.spring.reference.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/begin")
public class BeginRestController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/first")
	public String sample(){
		return "hi";
	}
	
	
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public void addUser(@RequestBody User user){
		userService.addUser(user);
	}
	
	@RequestMapping(value="/getUser/{id}", produces="application/json")
	public User getUser(@PathVariable("id") int id){
		User user = userService.getUser(id);
		return user;
	}
	
	@RequestMapping(value="/getAllUsers")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
}
