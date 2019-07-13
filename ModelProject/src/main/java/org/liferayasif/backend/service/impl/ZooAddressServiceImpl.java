package org.liferayasif.backend.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.liferayasif.backend.dao.ZooAddressDao;
import org.liferayasif.backend.model.ZooAddress;
import org.liferayasif.backend.service.ZooAddressService;
import org.liferayasif.backend.util.time.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ZooAddressService")
@Transactional
public class ZooAddressServiceImpl  implements ZooAddressService{

	@Autowired
	private ZooAddressDao zooAddressDao;
	
	
	@Override
	public List<ZooAddress> getAllZooAddresses() {
		List<ZooAddress> zooAddressList = 	zooAddressDao.getAllZooAddresses();
		return zooAddressList;
	}

	@Override
	public ZooAddress getZooAddressById(Integer id) {
		ZooAddress zooAddress = zooAddressDao.getZooAddressbyId(id);
		return zooAddress;
	}

	@Override
	public void addZooAddress(ZooAddress zooAddress) {
		zooAddress.setCreateDt(TimeUtil.getSqlTimStmp());
		zooAddress.setUpdateDt(TimeUtil.getSqlTimStmp());
		
		zooAddressDao.addZooAddress(zooAddress);
		
	}

	@Override
	public void addZooAddressList(List<ZooAddress> zooAddressList) {
	if(zooAddressList !=null && zooAddressList.size()>0)
	{
		for(ZooAddress zooAddress : zooAddressList)
		{
			addZooAddress(zooAddress);
		}
		
		
	}
		
	}
	
	
	@Override
	public void deleteZooAddressById(Integer id) {
		zooAddressDao.deleteZooAddressById(id);
		
	}

	@Override
	public ZooAddress updateZooAddress(ZooAddress zooAddress) {
		return zooAddressDao.updateZooAddress(zooAddress);
		 
	}

	@Override
	public List<ZooAddress> getZooAddressByZooId(Integer id) {
		List<ZooAddress> zooAddressList = zooAddressDao.getZooAddressByZooId(id);
		return zooAddressList;
	}

	



	
	

	

}
