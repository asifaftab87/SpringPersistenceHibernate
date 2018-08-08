package org.liferayasif.backend.service.impl;

import java.util.List;

import org.liferayasif.backend.dao.ShippersDao;
import org.liferayasif.backend.model.Shippers;
import org.liferayasif.backend.service.ShippersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("shippersService")
@Transactional
public class ShippersServiceImpl implements ShippersService{

	@Autowired
	private ShippersDao shippersDao;
	
	@Override
	public List<Shippers> getAllShippers() {
		List<Shippers> shippersList = shippersDao.getAllShippers();
		return shippersList;
	}

	@Override
	public Shippers getShippersById(Integer id) {
		Shippers shippers = shippersDao.getShippersById(id);
		return shippers;
	}

	@Override
	public Shippers addShippers(Shippers shippers) {
		return shippersDao.addShippers(shippers);
	}

	@Override
	public void deleteShippers(Integer id) {
		shippersDao.deleteShippers(id);
	}

	@Override
	public Shippers updateShippers(Shippers shippers) {
		return shippersDao.updateShippers(shippers);
	}
	
	@Override
	public List<Shippers> findByName(String name){
		return shippersDao.findByName(name);
	}

}
