package org.liferayasif.backend.service;

import java.util.List;

import org.liferayasif.backend.model.PersonKin;

public interface PersonKinService {
	
	public List<PersonKin> getAllPersonKins();
	
	public PersonKin getPersonKinById(Integer id);
	
	public PersonKin addPersonKin(PersonKin personKin);
	
	public List<PersonKin> addPersonKinList(List<PersonKin> perKinList);
	
	public void deletePersonKin(Integer id);
	
	public PersonKin updatePersonKin(PersonKin personKin);
	
	public List<PersonKin> findByName(String name);

}
