package org.liferayasif.backend.dao;

import java.util.List;

import org.liferayasif.backend.model.Ngo;

public interface NgoDao {
	
	public List<Ngo> getAllNgo();
	
	public Ngo getNgoById(Integer id);
	
	public List<Ngo> getNgoByState(String state);
	
	public Ngo addNgo(Ngo ngo);
	
	public Ngo updateNgo(Ngo ngo);
	
	public void deleteNgoById(Integer id);
	
	public void deleteByyearlyIncome(double yearlyIncome);
	
	public void deleteEmail(String emailAddress);
	
	public List<Ngo>  getByEmail(String emailAddress);
	

}
