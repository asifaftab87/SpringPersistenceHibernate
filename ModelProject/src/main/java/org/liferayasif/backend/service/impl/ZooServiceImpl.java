package org.liferayasif.backend.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.liferayasif.backend.dao.ZooDao;
import org.liferayasif.backend.model.Zoo;
import org.liferayasif.backend.service.ZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("zooService")
@Transactional
public class ZooServiceImpl implements ZooService{

	@Autowired
	private ZooDao zooDao;
	
	@Override
	public List<Zoo> getAllZoos() {
		List<Zoo> zooList=zooDao.getAllZoos();
		
		return zooList;
	}

	@Override
	public Zoo getZooById(Integer id) {
		Zoo zoo = zooDao.getZooById(id);
		return zoo;
	}

	@Override
	public void addZoo(Zoo zoo) {
		zooDao.addZoo(zoo);
		
	}

	@Override
	public void deleteZooById(Integer id) {
		zooDao.deleteZooById(id);
		
		
	}

	@Override
	public Zoo updateZoo(Zoo zoo) {
		return zooDao.updateZoo(zoo);
		
	}

	@Override
	public List<Zoo> findByName(String name) {
		List<Zoo> zooList=zooDao.findByName(name);
		return zooList;
	}
	
	

}
