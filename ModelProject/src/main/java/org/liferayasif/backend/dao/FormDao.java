package org.liferayasif.backend.dao;


import java.util.List;

import org.liferayasif.backend.model.Form;

public interface FormDao {
	

	public List<Form> getAllForm();
	
	public Form getFormById(Integer id);
	
	public Form addForm(Form form);
	
	public void deleteForm(Integer id);
	
	public Form updateForm(Form form);
	
	public List<Form> findByName(String name);
	
}
