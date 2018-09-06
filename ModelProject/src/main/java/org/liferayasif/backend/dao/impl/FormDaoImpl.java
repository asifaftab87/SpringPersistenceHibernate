package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.FormDao;
import org.liferayasif.backend.model.Form;
import org.springframework.stereotype.Repository;

@Repository("formDao")
public class FormDaoImpl  extends AbstractDao<Integer, Form> implements FormDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Form> getAllForm() {
		Criteria criteria = createEntityCriteria();
		return (List<Form>) criteria.list();
	}

	@Override
	public Form getFormById(Integer id) {
		return getByKey(id);
	}

	@Override
	public Form addForm(Form form) {
		persist(form);
		return form;
	}

	@Override
	public void deleteForm(Integer id) {
		Query query = getSession().createSQLQuery("delete from Form where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();		
	}

	@Override
	public Form updateForm(Form form) {
		getSession().update(form);
		return form;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Form> findByName(String name) {
		Criteria criteria = getSession().createCriteria(Form.class);
		criteria.add(Restrictions.eq("name", name));
		
		List<Form> formList = criteria.list();

		return formList;	
	}

}
