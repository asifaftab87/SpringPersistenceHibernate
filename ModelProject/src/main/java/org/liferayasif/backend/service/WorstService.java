package org.liferayasif.backend.service;

import java.util.List;

import org.liferayasif.backend.model.Worst;

public interface WorstService {

	
	
	public List<Worst> getAllWorst();
	
	public Worst findById(Integer id);
	
	public List<Worst> findByEmail(String emailAddress);
	
	public Worst addWorst(Worst worst);
	
	public Worst updateWorst(Worst worst);
	
	public void deleteById(Integer worstId);
	
	public void deletbyEmail(String email);
	

	
	
	
}
