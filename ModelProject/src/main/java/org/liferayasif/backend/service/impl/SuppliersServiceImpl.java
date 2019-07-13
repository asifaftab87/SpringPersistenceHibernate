package org.liferayasif.backend.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.liferayasif.backend.dao.SuppliersDao;
import org.liferayasif.backend.model.Suppliers;
import org.liferayasif.backend.service.SuppliersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("SuppliersService")
@Transactional
public class SuppliersServiceImpl implements SuppliersService{

	@Autowired
	private SuppliersDao suppliersDao;
	
	@Override
	public List<Suppliers> getAllSuppliers() {
		List<Suppliers> suppliersList = suppliersDao.getAllSuppliers();
		return suppliersList;
	}

	@Override
	public Suppliers getSupplierById(Integer id) {
		Suppliers suppliers = suppliersDao.getSupplierById(id);
		return suppliers;
	}

	@Override
	public Suppliers addSuppliers(Suppliers suppliers) {

		return suppliersDao.addSuppliers(suppliers);
	}

	@Override
	public void deleteSupplierById(Integer id) {
		suppliersDao.deleteSupplierById(id);
		
	}

	@Override
	public Suppliers updateSuppliers(Suppliers suppliers) {
		
		return suppliersDao.updateSuppliers(suppliers);
	}

	@Override
	public List<Suppliers> findByName(String name) {
		
		return suppliersDao.findByName(name);
	}

}
