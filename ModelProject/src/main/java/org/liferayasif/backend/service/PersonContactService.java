package org.liferayasif.backend.service;

import java.util.List;

import org.liferayasif.backend.model.PersonContact;

public interface PersonContactService {

	public List<PersonContact> getAllPersonContacts();
	
	public PersonContact getPersonContactById(Integer id);
	
	public PersonContact addPersonContact(PersonContact personContact);
	
	public List<PersonContact> addPersonContactList(List<PersonContact> personContactList);
	
	public void deletePersonContact(Integer id);
	
	public PersonContact updatePersonContact(PersonContact personContact);
	
	public List<PersonContact> getPersonContactsByUserId(Integer id);
	
	
}
