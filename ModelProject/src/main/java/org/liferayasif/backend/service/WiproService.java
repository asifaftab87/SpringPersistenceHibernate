package org.liferayasif.backend.service;

import java.util.List;

import org.liferayasif.backend.model.Wipro;

public interface WiproService {
	
	public List<Wipro> getAllWipros() ;
	
	public Wipro getWiproById(Integer id);
	
	public void adddWipro(Wipro wipro);
	
	public void deleteWipro(Integer id);
	
	

	
	
}