package org.liferayasif.backend.service;

import java.util.List;

import org.liferayasif.backend.model.Ngo;

public interface NgoService {
		
	public List<Ngo> getAllNgo();
	
	public Ngo getNgoById(Integer id);
	
	public List<Ngo> getNgoByState(String state);
	
	public Ngo addNgo(Ngo ngo);
	
	public Ngo updateNgo(Ngo ngo);
	
	public void deleteNgoById(Integer id);
	
	public void deleteByyearlyIncome(double yearlyIncome);

}
