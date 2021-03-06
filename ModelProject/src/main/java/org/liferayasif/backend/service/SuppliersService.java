package org.liferayasif.backend.service;

import java.util.List;

import org.liferayasif.backend.model.Suppliers;

public interface SuppliersService {
	
	public List<Suppliers> getAllSuppliers();
	
	public Suppliers getSupplierById(Integer id);
	
	public Suppliers addSuppliers(Suppliers suppliers);
	
	public void deleteSupplierById(Integer id);
	
	public Suppliers updateSuppliers(Suppliers suppliers);
	
	public List<Suppliers> findByName(String name);

}
