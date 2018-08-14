package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.PersonKinDao;
import org.liferayasif.backend.model.PersonKin;
import org.springframework.stereotype.Repository;

@Repository("personKinDao")
public class PersonKinDaoImpl extends AbstractDao<Integer , PersonKin> implements PersonKinDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<PersonKin> getAllPersonKins() {
		Criteria criteria = createEntityCriteria();
		return (List<PersonKin>) criteria.list();
		
	}

	@Override
	public PersonKin getPersonKinById(Integer id) {
		 
		return getByKey(id);
	}

	@Override
	public PersonKin addPersonKin(PersonKin personKin) {
		persist(personKin);
		return personKin;
	}

	@Override
	public void deletePersonKin(Integer id) {
		Query query =getSession().createSQLQuery("delete from PersonKin where id :id");
		query.setInteger("Id", id);
		query.executeUpdate();
		
	}

	@Override
	public PersonKin updatePersonKin(PersonKin personKin) {
		getSession().update(personKin);
		return personKin;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PersonKin> findByName(String name) {
		Criteria criteria = getSession().createCriteria(PersonKin.class);
		criteria.add(Restrictions.eq("name", name));
		List<PersonKin> personKinList = criteria.list();
		return personKinList;
	}

}
