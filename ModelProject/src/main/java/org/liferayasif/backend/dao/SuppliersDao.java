package org.liferayasif.backend.dao;

import java.util.List;

import org.liferayasif.backend.model.Suppliers;

public interface SuppliersDao {
	
	public List<Suppliers> getAllSuppliers();
	
	public Suppliers getSupplierById(Integer id);
	
	public Suppliers addSuppliers(Suppliers suppliers);
	
	public void deleteSupplierById(Integer id);
	
	public Suppliers updateSuppliers(Suppliers suppliers);
	
	public List<Suppliers> findByName(String name);
	

}
