package org.liferayasif.backend.dao;

import java.util.List;

import org.liferayasif.backend.model.Wipro;



public interface WiproDao {
	
	public List<Wipro> getAllWipros() ;
	
	public Wipro getWiproById(Integer id);
	
	public List<Wipro> getWiproByAvgSalary(double avgSalary);
	
	public void adddWipro(Wipro wipro);
	
	public void deleteWipro(Integer id);
	
	
}
