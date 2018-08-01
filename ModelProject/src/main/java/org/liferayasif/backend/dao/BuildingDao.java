package org.liferayasif.backend.dao;

import java.util.List;

import org.liferayasif.backend.model.Building;
import org.liferayasif.backend.model.User;

public interface BuildingDao {

	public List<Building> getAllBuilding();
	
	public Building getBuildingById(Integer id);
	
	public void addBuilding(Building building);
	
	public void deleteBuilding(Integer id);
	
	public User updateBuilding(Building building);
	

}
