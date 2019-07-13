package org.liferayasif.backend.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.liferayasif.backend.dao.CollegeDao;
import org.liferayasif.backend.model.College;
import org.liferayasif.backend.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service("college")
public class CollegeServiceImpl implements CollegeService {
	
	@Autowired
	private CollegeDao collegeDao;

	@Override
	public List<College> getAllCollege() {
		List<College> collegeList=collegeDao.getAllCollege();
		return collegeList;
	}

	@Override
	public College getCollegeById(Integer id) {
		College college=collegeDao.getCollegeById(id);
		return college;
	}

	@Override
	public List<College> getCollegeByState(String state) {
		List<College> collegeList=collegeDao.getCollegeByState(state);
		return collegeList;
	}

	@Override
	public College addCollege(College college) {
		return collegeDao.addCollege(college);
		
	}

	@Override
	public College updateCollege(College college) {
		return collegeDao.updateCollege(college);
	}

	@Override
	public void deleteCollegeById(Integer id) {
		collegeDao.deleteCollegeById(id);
		
	}
	
	
	
	

}
