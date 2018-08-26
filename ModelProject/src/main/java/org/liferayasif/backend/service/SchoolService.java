package org.liferayasif.backend.service;

import java.util.List;

import org.liferayasif.backend.model.School;


public interface SchoolService {

		 
		public List<School> getAllSchools();
		
		public School getSchoolById(Integer id);
		
		public void addSchool(School school);
		
		public void deleteSchool(Integer id);

		School updateSchool(School school);
		
		List<School> getByFees(Integer fees);
	 
}
