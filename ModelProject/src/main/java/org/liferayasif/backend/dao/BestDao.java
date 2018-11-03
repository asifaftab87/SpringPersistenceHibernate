package org.liferayasif.backend.dao;

import java.util.List;

import org.liferayasif.backend.model.Best;

public interface BestDao {
	
	public List<Best> getAllBest();
	
	public Best findById(Integer id);
	
	public Best findByName(String name);
	
	public Best updateBest(Best best);
	
	public Best addBest(Best best);
	
	public void deleteByEmail(String email);
	
	public void deleteById(Integer id);
	
	
	
	

}
