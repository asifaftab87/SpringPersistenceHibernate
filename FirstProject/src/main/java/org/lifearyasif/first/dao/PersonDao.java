package org.lifearyasif.first.dao;

import javax.persistence.EntityNotFoundException;

import org.lifearyasif.first.model.Person;

public interface PersonDao extends GenericDao<Person>{

	public Person getPersonByUsername(String username) throws EntityNotFoundException;
	public Person authenticatePerson(String username, String password) throws Exception ;
	
}
