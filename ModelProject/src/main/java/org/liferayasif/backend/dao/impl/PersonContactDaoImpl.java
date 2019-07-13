package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.PersonContactDao;
import org.liferayasif.backend.model.PersonContact;
import org.springframework.stereotype.Repository;

@Repository("personContactDao")
public class PersonContactDaoImpl extends AbstractDao<Integer , PersonContact>implements PersonContactDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<PersonContact> getAllPersonContacts() {
		Criteria criteria = createEntityCriteria();
		return (List<PersonContact>) criteria.list();
	
	}

	@Override
	public PersonContact getPersonContactById(Integer id) {
		return getByKey(id);
	}

	@Override
	public PersonContact addPersonContact(PersonContact personContact) {
		persist(personContact);
		return personContact;
	}

	@Override
	public void deletePersonContact(Integer id) {
		Query query = getSession().createSQLQuery("delete from User where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
		
	}

	@Override
	public PersonContact updatePersonContact(PersonContact personContact) {
		getSession().update(personContact);
		return personContact;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PersonContact> getPersonContactesById(Integer id) {
		Criteria criteria = getSession().createCriteria(PersonContact.class);
		criteria.add(Restrictions.eq("id", id));
		
		List<PersonContact> personContactList = criteria.list();

		return personContactList;				
	}

}
