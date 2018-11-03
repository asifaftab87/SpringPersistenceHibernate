package org.liferayasif.backend.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.liferayasif.backend.dao.BestDao;
import org.liferayasif.backend.model.Best;
import org.liferayasif.backend.service.BestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service("best")

public class BestServiceImpl implements BestService {
	
	@Autowired
	private BestDao bestDao;

	@Override
	public List<Best> getAllBest() {
		List<Best> bestAll=bestDao.getAllBest();
		return bestAll;
	}

	@Override
	public Best findById(Integer id) {
		Best best=bestDao.findById(id);
		return best;
	}

	@Override
	public Best findByName(String name) {
		Best best= bestDao.findByName(name);
		return best;
	}

	@Override
	public Best updateBest(Best best) {
		return bestDao.updateBest(best);
	}

	@Override
	public Best addBest(Best best) {
		return bestDao.addBest(best);
		
	}

	@Override
	public void deleteByEmail(String email) {
		bestDao.deleteByEmail(email);
		
	}

	@Override
	public void deleteById(Integer id) {
		bestDao.deleteById(id);
		
	}

}
