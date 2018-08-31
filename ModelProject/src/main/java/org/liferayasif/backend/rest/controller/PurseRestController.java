package org.liferayasif.backend.rest.controller;

import org.liferayasif.backend.constants.PathConstants;
import org.liferayasif.backend.model.Purse;
import org.liferayasif.backend.service.PurseBigService;
import org.liferayasif.backend.service.PurseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping(value=PathConstants.PURSE)
	public class PurseRestController {
		
		@Autowired
		private PurseService purseService;
		
		@SuppressWarnings("unused")
		@Autowired
		private PurseBigService purseBigService;

		@RequestMapping(value=PathConstants.ADD_OBJ	, method=RequestMethod.POST)
		public Purse add(@RequestBody Purse purse) throws Exception
		{
			String color1=purse.getColor();
			String name1=purse.getName();
			int price=purse.getPrice();
			int purseBigId=purse.getPurseBigId();
			int quantity=purse.getQuantity();
						
			
			String color=color1.trim();
			String name=name1.trim();
			 
			
			if(color==null || color.isEmpty() || name==null || name.isEmpty() || price==0|| purseBigId==0 || quantity==0)
			{
				throw new Exception ("the field cannot be empty");
			}
			
			purse = purseService.addPurse(purse);
			
			return purse;
		}
	
	
}
