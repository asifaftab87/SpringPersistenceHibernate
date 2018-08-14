package org.liferayasif.backend.dao;

import java.util.List;

import org.liferayasif.backend.model.PersonKin;

public interface PersonKinDao {
	
	public List<PersonKin> getAllPersonKins();
	
	public PersonKin getPersonKinById(Integer id);
	
	public PersonKin addPersonKin(PersonKin personKin);
	
	public void deletePersonKin(Integer id);
	
	public PersonKin updatePersonKin(PersonKin personKin);
	
	public List<PersonKin> findByName(String name);

}
