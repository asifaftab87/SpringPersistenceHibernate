package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.SchoolDao;
import org.liferayasif.backend.model.School;
import org.springframework.stereotype.Repository;

@Repository("schoolDao")
public  class SchoolDaoImpl extends  AbstractDao<Integer, School> implements SchoolDao{

@Override
@SuppressWarnings("unchecked")
public List<School> getAllSchools()
{
	Criteria criteria = createEntityCriteria();
	return (List<School>) criteria.list();
}

@Override
public School getSchoolById(Integer id) {
	 
	return getByKey(id);
}

@Override
public void addSchool(School school) {
	persist(school);
	
}

@Override
public void deleteSchool(Integer id) {
	Query query = getSession().createSQLQuery("delete from School where id = :id" );
	query.setInteger("id", id);
	query.executeUpdate();
}

}
