package org.liferayasif.backend.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.liferayasif.backend.dao.PurseBigDao;
import org.liferayasif.backend.dao.PurseDao;
import org.liferayasif.backend.model.PurseBig;
import org.liferayasif.backend.service.PurseBigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("purseBigService")
@Transactional
public class PurseBigServiceImpl implements PurseBigService {

	@Autowired
	private PurseBigDao purseBigDao;
	
	@SuppressWarnings("unused")
	@Autowired
	private PurseDao purseDao;
	
	@Override
	public List<PurseBig> getAllPurseBig() {
		List<PurseBig> purseBigList = purseBigDao.getAllPurseBig();
		return purseBigList;
	}

	@Override
	public PurseBig getPurseBigById(Integer id) {
		PurseBig purseBig = purseBigDao.getPurseBigById(id);
		return purseBig;
	}

	@Override
	public List<PurseBig> getPurseBigByPrice(Integer price) {
		List<PurseBig> purseBigList = purseBigDao.getPurseBigByPrice(price);
		return purseBigList;
	}

	@Override
	public void addPurse(PurseBig purseBig) {
		purseBigDao.addPurse(purseBig);
		
	}

	@Override
	public List<PurseBig> findByName(String name) {
		List<PurseBig> purseBigList= purseBigDao.findByName(name);
		return purseBigList;
	}

	@Override
	public void deletePurseBigById(Integer id) {
		purseBigDao.deletePurseBigById(id);
		
	}

	@Override
	public void deletePurseBigByPrice(Integer price) {
		purseBigDao.deletePurseBigByPrice(price);
		
	}

}
