package org.liferayasif.backend.rest.controller;

import org.liferayasif.backend.constants.PathConstants;
import org.liferayasif.backend.model.Suppliers;
import org.liferayasif.backend.service.SuppliersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = PathConstants.SUPPLIER)
public class SuppliersRestController {

	@Autowired
	private SuppliersService suppliersService;
	
	
	@RequestMapping(value=PathConstants.ADD_SUPPLIERS, method=RequestMethod.POST)
	public Suppliers add(@RequestBody Suppliers suppliers){
		
		suppliers = suppliersService.addSuppliers(suppliers);
		
		return suppliers;
		
		
	}
	
}
