package org.liferayasif.backend.dao;

import java.util.List;

import org.liferayasif.backend.model.Purse;

public interface PurseDao {
	
	public List<Purse> getAllPurse();
	
	public Purse getPurseById(Integer id);
	
	public List<Purse> getPurseByPrice(Integer price);
	
	public Purse addPurse(Purse purse);
	
	public List<Purse> findByName(String name);
	
	public void deletePurseById(Integer id);
	
	public void deletePurseByPrice(Integer price);
	
	

}
