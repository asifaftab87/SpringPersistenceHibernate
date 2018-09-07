package org.liferayasif.backend.service.impl;

import java.util.List;

import org.liferayasif.backend.dao.FormDao;
import org.liferayasif.backend.model.Form;
import org.liferayasif.backend.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("formService")
@Transactional
public class FormServiceImpl implements FormService {

	@Autowired
	private FormDao formDao;
	
	
	@Override
	public List<Form> getAllForm() {
		List<Form> purseList = formDao.getAllForm();
		return purseList;
	}

	@Override
	public Form getFormById(Integer id) {
		Form form = formDao.getFormById(id);
		return form;	}

	@Override
	public Form addForm(Form form) {
		return formDao.addForm(form);
	}

	@Override
	public void deleteForm(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Form updateForm(Form form) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Form> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
