package org.liferayasif.backend.service;

import java.util.List;

import org.liferayasif.backend.model.Shippers;

public interface ShippersService {
public List<Shippers> getAllShippers();
	
	public Shippers getShippersById(Integer id);
	
	public Shippers addShippers(Shippers shippers);
	
	public void deleteShippers(Integer id);
	
	public Shippers updateShippers(Shippers shippers);
	
	public List<Shippers> findByName(String name);

}
