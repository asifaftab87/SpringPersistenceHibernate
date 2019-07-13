package org.liferayasif.backend.service.impl;

import java.util.List;

import org.liferayasif.backend.dao.BuildingDao;
import org.liferayasif.backend.model.Building;
import org.liferayasif.backend.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("buildingService")
@Transactional
public class BuildingServiceImpl implements BuildingService{

	@Autowired
	private BuildingDao buildingDao;
	
	@Override
	public List<Building> getAllBuilding() {
		List<Building> buildingList = buildingDao.getAllBuilding();
		return buildingList;
	}

	@Override
	public Building getBuildingById(Integer id) {
		Building building = buildingDao.getBuildingById(id);
		return building;
	}

	@Override
	public void addBuilding(Building building) {
		buildingDao.addBuilding(building);
	}

	@Override
	public void deleteBuilding(Integer id) {
		buildingDao.deleteBuilding(id);
	}

	@Override
	public Building updateBuilding(Building building) {
		return null;
	}

}
