package org.liferayasif.backend.dao;

import java.util.List;

import org.liferayasif.backend.model.PersonContact;

public interface PersonContactDao {
	
public List<PersonContact> getAllPersonContacts();
	
	public PersonContact getPersonContactById(Integer id);
	
	public PersonContact addPersonContact(PersonContact personContact);
	
	public void deletePersonContact(Integer id);
	
	public PersonContact updatePersonContact(PersonContact personContact);
	
	public List<PersonContact> getPersonContactesById(Integer id);

}
