package org.liferayasif.backend.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.liferayasif.backend.constants.PathConstants;
import org.liferayasif.backend.model.Zoo;
import org.liferayasif.backend.model.ZooAddress;
import org.liferayasif.backend.service.ZooAddressService;
import org.liferayasif.backend.service.ZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = PathConstants.ZOO)
public class ZooRestController {
	
	@Autowired
	private ZooService zooService;
	
	 
	@Autowired
	private ZooAddressService zooAddressService;
	
	@RequestMapping(value=PathConstants.FIND_ZOO_ID )
	public Zoo findById(@RequestParam ("id") int id)
	{
		Zoo zoo = zooService.getZooById(id);
		
		List<ZooAddress> zooAddressList = new ArrayList<ZooAddress>();
		
		if(zoo!=null)
		{
			
			zooAddressList  = zooAddressService.getZooAddressByZooId(id);
			
				if(zooAddressList !=null && zooAddressList.size()>0)
				{
					
					zoo.setZooAddressList(zooAddressList);
				}
		}
		return zoo;	
	}
	
	
	@RequestMapping(value=PathConstants.ADD_ZOO_USER)
	public void add(@RequestBody  Zoo zoo){
		
		zooService.addZoo(zoo);
		List<ZooAddress> zooAddressList  = zoo.getZooAddressList();
		zooAddressService.addZooAddressList(zooAddressList);
		return;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
