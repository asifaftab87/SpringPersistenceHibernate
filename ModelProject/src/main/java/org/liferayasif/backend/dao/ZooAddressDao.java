package org.liferayasif.backend.dao;

import java.util.List;

import org.liferayasif.backend.model.ZooAddress;

public interface ZooAddressDao {
	
	public List<ZooAddress> getAllZooAddresses();
	
	public ZooAddress getZooAddressbyId(Integer id);
	
	public void addZooAddress(ZooAddress zooAddress);
	
	public void deleteZooAddressById(Integer id);
	
	public ZooAddress updateZooAddress(ZooAddress zooAddress);
	
	public List<ZooAddress> getZooAddressByZooId(Integer id);
	

}
