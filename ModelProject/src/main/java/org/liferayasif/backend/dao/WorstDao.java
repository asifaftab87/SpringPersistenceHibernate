package org.liferayasif.backend.dao;

import java.util.List;

import org.liferayasif.backend.model.Worst;

public interface WorstDao {
	
	public List<Worst> getAllWorst();
	
	public Worst findById(Integer id);
	
	public List<Worst> findByEmail(String emailAddress);
	
	public Worst addWorst(Worst worst);
	
	public Worst updateWorst(Worst worst);
	
	public void deleteById(Integer worstId);
	
	public void deletbyEmail(String email);
	

}
