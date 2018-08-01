package org.liferayasif.backend.dao;

import java.util.List;

import org.liferayasif.backend.model.School;

public interface SchoolDao {
	
	public List<School> getAllSchools();
	
	public School getSchoolById(Integer id);
	
	public void addSchool(School school);
	
	public void deleteSchool(Integer id);

}
