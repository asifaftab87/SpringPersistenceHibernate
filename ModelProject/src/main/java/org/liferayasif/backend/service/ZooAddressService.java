package org.liferayasif.backend.service;

import java.util.List;

import org.liferayasif.backend.model.ZooAddress;

public interface ZooAddressService {
	
	public List<ZooAddress> getAllZooAddresses();
	
	public ZooAddress getZooAddressById(Integer id);
	
	public void addZooAddress(ZooAddress zooAddress);
	
	public void addZooAddressList(List<ZooAddress> zooAddressList);
	
	public void deleteZooAddressById(Integer id);
	
	public ZooAddress updateZooAddress(ZooAddress zooAddress);
	
	public List<ZooAddress> getZooAddressByZooId(Integer id);
	

}
