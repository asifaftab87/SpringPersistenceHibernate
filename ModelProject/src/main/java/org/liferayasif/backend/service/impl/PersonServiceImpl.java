package org.liferayasif.backend.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.liferayasif.backend.dao.PersonDao;
import org.liferayasif.backend.model.Person;
import org.liferayasif.backend.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
@Transactional
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDao personDao;
	
	@Override
	public List<Person> getAllPersons() {
		List<Person> personList = personDao.getAllPersons();
		return personList;
	}

	@Override
	public Person getPersonByid(Integer id) {
		Person person = personDao.getPersonByid(id);
		return person;
	}

	@Override
	public Person addperson(Person person) {
		return personDao.addperson(person);
		
	}

	@Override
	public List<Person> findPersonByName(String name) {
		List<Person> personList = personDao.findPersonByName(name);
		return personList;
	}

	@Override
	public void deletePersonById(Integer id) {
		personDao.deletePersonById(id);
		
	}

	@Override
	public Person updateperson(Person person) {
		return personDao.updateperson(person);
		
	}

}
