package org.liferayasif.backend.service;

import java.util.List;

import org.liferayasif.backend.model.Building;

public interface BuildingService {

public List<Building> getAllBuilding();
	
	public Building getBuildingById(Integer id);
	
	public void addBuilding(Building building);
	
	public void deleteBuilding(Integer id);
	
	public Building updateBuilding(Building building);
	
}
