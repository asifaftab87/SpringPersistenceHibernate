package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.PersonDao;
import org.liferayasif.backend.model.Person;
import org.springframework.stereotype.Repository;

@Repository("PersonDao")
public class PersonDaoImpl extends AbstractDao<Integer , Person> implements PersonDao  {

 

	@SuppressWarnings("unchecked")
	@Override
	public List<Person> getAllPersons() {
	Criteria criteria = createEntityCriteria();
		return (List<Person>) criteria.list();
	}

	@Override
	public Person getPersonByid(Integer id) {
		return getByKey(id);
		 
	}

	@Override
	public Person addperson(Person person) {
		persist(person);
		return person;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Person> findPersonByName(String name) {
		Criteria criteria = getSession().createCriteria(Person.class);
		criteria.add(Restrictions.eq("name", name));
		List<Person> personList = criteria.list();
		return personList;
	}

	@Override
	public void deletePersonById(Integer id) {
		Query query =getSession().createSQLQuery("delete from Person where id :id");
		query.setInteger("Id", id);
		query.executeUpdate();
	}

	@Override
	public Person updateperson(Person person) {
		getSession().update(person);
		return person;
		
	}

}
