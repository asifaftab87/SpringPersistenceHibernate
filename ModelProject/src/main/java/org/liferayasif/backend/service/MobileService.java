package org.liferayasif.backend.service;

import java.util.List;

import org.liferayasif.backend.model.Mobile;

public interface MobileService {

public List<Mobile> getAllMobiles();
	
	public Mobile getMobileById(Integer id);
	
	public Mobile addMobile(Mobile mobile);
	
	public void deleteMobile(Integer id);
	
	public Mobile updateMobile(Mobile mobile);
	
	public List<Mobile> findByName(String name);
	
}
