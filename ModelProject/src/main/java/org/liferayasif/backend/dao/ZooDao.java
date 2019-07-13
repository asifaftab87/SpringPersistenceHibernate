package org.liferayasif.backend.dao;

import java.util.List;

import org.liferayasif.backend.model.Zoo;

public interface ZooDao {

	public List<Zoo> getAllZoos();
	
	public Zoo getZooById(Integer id);
	
	public void addZoo(Zoo zoo);
	
	public void deleteZooById(Integer id);
	
	public Zoo updateZoo(Zoo zoo);
	
	public List<Zoo> findByName(String name);
	
	
}
