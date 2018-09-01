package org.liferayasif.backend.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.liferayasif.backend.dao.NgoDao;
import org.liferayasif.backend.model.Ngo;
import org.liferayasif.backend.service.NgoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service("ngo")

public class NgoServiceImpl implements NgoService {
	
	@Autowired
	private NgoDao ngoDao;
	
	@Override
	public List<Ngo> getAllNgo() {
		
		List<Ngo> ngoList = ngoDao.getAllNgo();
		return ngoList;
	}

	@Override
	public Ngo getNgoById(Integer id) {
		Ngo ngo = ngoDao.getNgoById(id);
		return ngo;
	}

	@Override
	public List<Ngo> getNgoByState(String state) {
		List<Ngo> ngoList = ngoDao.getNgoByState(state);
		return ngoList;
	}

	@Override
	public Ngo addNgo(Ngo ngo) {
		return ngoDao.addNgo(ngo);
		
	}

	@Override
	public Ngo updateNgo(Ngo ngo) {
		return ngoDao.updateNgo(ngo);
	}

	@Override
	public void deleteNgoById(Integer id) {
		ngoDao.deleteNgoById(id);
		
	}

	@Override
	public void deleteByyearlyIncome(double yearlyIncome) {
		ngoDao.deleteByyearlyIncome(yearlyIncome);
		
	}

}
