package org.liferayasif.backend.service.impl;

import java.util.List;

import org.liferayasif.backend.dao.WiproDao;
import org.liferayasif.backend.model.Wipro;
import org.liferayasif.backend.service.WiproService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("wiproService")
@Transactional
public class WiproServiceImpl implements WiproService {

	@Autowired
	private WiproDao wiproDao;

	@Override
	public List<Wipro> getAllWipros() {
		List<Wipro> wiproList = wiproDao.getAllWipros();
		return wiproList;
	}

	@Override
	public Wipro getWiproById(Integer id) {
		Wipro wipro=wiproDao.getWiproById(id);
		return wipro;
	}

	@Override
	public void adddWipro(Wipro wipro) {
		wiproDao.adddWipro(wipro);
		
	}
	
	

	@Override
	public void deleteWipro(Integer id) {
		wiproDao.deleteWipro(id);
		
	}
	
	
}
