package org.lifearyasif.first.dao.jpa;

import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;

import org.lifearyasif.first.dao.PersonDao;
import org.lifearyasif.first.model.Person;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository("personDao")
public class PersonDaoJpa extends GenericDaoJpa<Person> implements PersonDao{

	public PersonDaoJpa () {
		super(Person.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Person getPersonByUsername(String username) throws EntityNotFoundException {
	
		List<Person> results = null;
		Query query = entityManager.createQuery( "from Person as p where p.username = :username" );
		query.setParameter("username", username);
		results = query.getResultList();
		
		if (results == null || results.size() <= 0) {
			throw new EntityNotFoundException(username + " not found");
		} 
		else {
			return results.get(0);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public Person authenticatePerson(String username, String password) throws DataAccessException, Exception {
		
		List<Person> results = null;
		Query query = entityManager.createQuery("from Person as p where p.username = :username and p.password = :password" );
		query.setParameter("username", username);
		query.setParameter("password", password);
		results = query.getResultList();
		
		if (results == null || results.size() <= 0) {
			throw new Exception("No users found");
		} 
		else {
			return results.get(0);
		}
	}
	
}
