package org.liferayasif.backend.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.liferayasif.backend.model.Home;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/home")
public class HomeRestController {


	@RequestMapping(value="/listOfHome")
	public List<Home> HomeList(){
		List<Home> homeList = new ArrayList<Home>();
		Home home = new Home();

		home.setDoor(4);
		home.setRooms(2);
		home.setWindow(5);
		
		homeList.add(home);
		
		return homeList;
	}
}
