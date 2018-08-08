package org.liferayasif.backend.rest.controller;

import java.util.List;

import org.liferayasif.backend.constants.PathConstants;
import org.liferayasif.backend.model.Product;
import org.liferayasif.backend.model.Suppliers;
import org.liferayasif.backend.service.SuppliersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = PathConstants.SUPPLIER)
public class SuppliersRestController {

	@Autowired
	private SuppliersService suppliersService;
	
	@Autowired
	private Product producService;
	
	@RequestMapping(value=PathConstants.ADD_SUPPLIERS, method=RequestMethod.POST)
	public Suppliers add(@RequestBody Suppliers suppliers){
		
		suppliers = suppliersService.addSuppliers(suppliers);
		
		return suppliers;
		
		
	}
	
	@RequestMapping(value=PathConstants.FIND_SUPPLIERS_BY_ID, method=RequestMethod.GET)
	public Suppliers findSupplierById(@RequestParam("id") int id)
	{
		Suppliers suppliers = suppliersService.getSupplierById(id);
		return suppliers;
		
	}		
	
	@RequestMapping(value=PathConstants.ALL_SUPPLIERS, method=RequestMethod.GET)
	public List<Suppliers> getAllSupp()
	{
		List<Suppliers> suppliersList = suppliersService.getAllSuppliers();
		return suppliersList;
		
	}	
	
	/*@RequestMapping(value=PathConstants.ALL_PRODUCTS, method=RequestMethod.GET)
	public List<Product> getAllPro()
	{
		producService
		
	}	*/
	
}
