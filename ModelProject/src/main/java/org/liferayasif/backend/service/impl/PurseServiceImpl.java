package org.liferayasif.backend.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.liferayasif.backend.dao.PurseBigDao;
import org.liferayasif.backend.dao.PurseDao;
import org.liferayasif.backend.model.Purse;
import org.liferayasif.backend.service.PurseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("purseService")
@Transactional
public class PurseServiceImpl implements PurseService{

	@Autowired
	private PurseDao purseDao;
	
	@SuppressWarnings("unused")
	@Autowired
	private PurseBigDao purseBigDao;;
	
	@Override
	public List<Purse> getAllPurse() {
		List<Purse> purseList = purseDao.getAllPurse();
		return purseList;
	}

	@Override
	public Purse getPurseById(Integer id) {
				Purse purse = purseDao.getPurseById(id);
				return purse;
	}

	@Override
	public List<Purse> getPurseByPrice(Integer price) {
		List<Purse>  purseList = purseDao.getPurseByPrice(price);
		return purseList;
	}

	@Override
	public void addPurse(Purse purse) {
		purseDao.addPurse(purse);
		
	}

	@Override
	public List<Purse> findByName(String name) {
		List<Purse> purseList = purseDao.findByName(name);
		return purseList;
	}

	@Override
	public void deletePurseById(Integer id) {
		purseDao.deletePurseById(id);
		
	}

	@Override
	public void deletePurseByPrice(Integer price) {
		purseDao.deletePurseByPrice(price);
		
	}

}
