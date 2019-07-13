package org.liferayasif.backend.dao;

import java.util.List;

import org.liferayasif.backend.model.College;

public interface CollegeDao {
	
	public List<College> getAllCollege();
	
	public College getCollegeById(Integer id);
	
	public List<College> getCollegeByState(String state);
	
	public College addCollege(College college);
	
	public College updateCollege(College college);
	
	public void deleteCollegeById(Integer id);
	
	
}
