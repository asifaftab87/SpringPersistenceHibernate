package org.liferayasif.backend.service.impl;

import java.util.List;

import org.liferayasif.backend.dao.IdentificationDao;
import org.liferayasif.backend.model.Identification;
import org.liferayasif.backend.service.IdentificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("identificationService")
@Transactional
public class IdentificationServiceImpl implements IdentificationService{
	
	@Autowired
	private IdentificationDao identificationDao;
	
	@Override
	public List<Identification> getAllIdentification() {
		List<Identification> identificationList = identificationDao.getAllIdentification();
		return identificationList;
	}

	@Override
	public Identification getIdentificationById(Integer id) {
		Identification identification = identificationDao.getIdentificationById(id);
		return identification;
	}

	@Override
	public void addIdentification(Identification identification) {
		identificationDao.addIdentification(identification);
	}

	@Override
	public void deleteIdentification(Integer id) {
		identificationDao.deleteIdentification(id);
	}

	@Override
	public Identification updateIdentification(Identification identification) {
		return null;
	}


}
