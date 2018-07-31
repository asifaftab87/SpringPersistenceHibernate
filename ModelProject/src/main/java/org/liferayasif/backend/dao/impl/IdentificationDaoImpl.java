package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.IdentificationDao;
import org.liferayasif.backend.model.Identification;
import org.springframework.stereotype.Repository;

@Repository("identificationDao")
public class IdentificationDaoImpl extends AbstractDao<Integer, Identification> implements IdentificationDao{


	@Override
	@SuppressWarnings("unchecked")
	public List<Identification> getAllIdentification() {
		Criteria criteria = createEntityCriteria();
		return (List<Identification>) criteria.list();
	}

	@Override
	public Identification getIdentificationById(Integer id) {
		return getByKey(id);
	}

	@Override
	public void addIdentification(Identification identification) {
		persist(identification);
	}

	@Override
	public void deleteIdentification(Integer id) {
		Query query = getSession().createSQLQuery("delete from Employee where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}

	@Override
	public Identification updateIdentification(Identification identification) {
		return null;
	}
	

}
