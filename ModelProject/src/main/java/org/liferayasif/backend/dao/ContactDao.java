package org.liferayasif.backend.dao;

import java.util.List;

import org.liferayasif.backend.model.Contact;

public interface ContactDao {

	public List<Contact> getAllContacts();
	
	public Contact getContactById(Integer id);
	
	public void addContact(Contact contact);
	
	public void deleteContact(Integer id);
	
	
}
