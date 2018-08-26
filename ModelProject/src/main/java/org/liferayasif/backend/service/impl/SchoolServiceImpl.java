package org.liferayasif.backend.service.impl;

import java.util.List;

import org.liferayasif.backend.dao.SchoolDao;
import org.liferayasif.backend.model.School;
import org.liferayasif.backend.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("schoolService")
@Transactional
public class SchoolServiceImpl implements SchoolService {

	@Autowired
	private SchoolDao schoolDao;
	
	
	
	@Override
	public List<School> getAllSchools() {
		List<School> schoolList = schoolDao.getAllSchools();
		return schoolList;
	}

	@Override
	public School getSchoolById(Integer id) {
		School school = schoolDao.getSchoolById(id);
		return school;
	}

	@Override
	public void addSchool(School school) {
		schoolDao.addSchool(school);
		
	}

	@Override
	public void deleteSchool(Integer id) {
		schoolDao.deleteSchool(id);
		
	}

	@Override
	public School updateSchool(School school) {
		 
		return null;
	}

	@Override
	public List<School> getByFees(Integer fees) {
		return schoolDao.getByFees(fees);
		
	}

	

	 
	

}
