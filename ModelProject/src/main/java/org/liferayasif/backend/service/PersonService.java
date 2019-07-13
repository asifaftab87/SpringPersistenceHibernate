package org.liferayasif.backend.service;

import java.util.List;

import org.liferayasif.backend.model.Person;

public interface PersonService {
	

	public  List<Person> getAllPersons();
	
	public Person getPersonByid(Integer id);
	
	public Person addperson(Person person);
	
	public List<Person> findPersonByName(String name);
	
	public void deletePersonById(Integer id);
	
	public Person updateperson(Person person);
	
	

}
