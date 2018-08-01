package org.liferayasif.backend.service;

import java.util.List;

import org.liferayasif.backend.model.Identification;

public interface IdentificationService {

public List<Identification> getAllIdentification();
	
	public Identification getIdentificationById(Integer id);
	
	public void addIdentification(Identification identification);
	
	public void deleteIdentification(Integer id);
	
	public Identification updateIdentification(Identification identification);
	
}
