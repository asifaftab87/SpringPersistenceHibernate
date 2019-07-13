package org.liferayasif.backend.service;

import java.util.List;

import org.liferayasif.backend.model.Form;

public interface FormService {


	public List<Form> getAllForm();
	
	public Form getFormById(Integer form);
	
	public Form addForm(Form form);
	
	public void deleteForm(Integer id);
	
	public Form updateForm(Form form);
	
	public List<Form> findByName(String name);
}
