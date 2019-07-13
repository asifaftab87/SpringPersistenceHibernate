package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.ContactDao;
import org.liferayasif.backend.model.Contact;
import org.springframework.stereotype.Repository;

@Repository("contactDao")
public class ContactDaoImpl  extends AbstractDao<Integer, Contact> implements ContactDao{

	
	@Override
	@SuppressWarnings("unchecked")
	public List<Contact> getAllContacts() {
		Criteria criteria = createEntityCriteria();
		return (List<Contact>) criteria.list();
	}

	@Override
	public Contact getContactById(Integer id) {
		return getByKey(id);
	}

	@Override
	public void addContact(Contact contact) {
		persist(contact);
	}

	@Override
	public void deleteContact(Integer id) {
		Query query = getSession().createSQLQuery("delete from CONTACT where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}

	
}
