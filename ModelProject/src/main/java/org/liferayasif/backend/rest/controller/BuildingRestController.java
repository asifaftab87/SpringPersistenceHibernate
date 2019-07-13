package org.liferayasif.backend.rest.controller;

import java.util.List;

import org.liferayasif.backend.model.Building;
import org.liferayasif.backend.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/building")
public class BuildingRestController {


	@Autowired
	private BuildingService buildingService;
	
	@RequestMapping(value="/first")
	public Building sample(@RequestParam("id") int id){
		Building building = buildingService.getBuildingById(id);
		System.out.println(building);
		return building;
	}
	
	@RequestMapping(value="/getAllBuilding")
	public List<Building> getAllUsers(){
		List<Building> buildingList = buildingService.getAllBuilding();
		return buildingList;
	}
	
	
	@RequestMapping(value="/addBuilding", method=RequestMethod.POST)
	public int addBuilding(@RequestBody Building building)
	{
		buildingService.addBuilding(building);
		return 0;
	}
}
