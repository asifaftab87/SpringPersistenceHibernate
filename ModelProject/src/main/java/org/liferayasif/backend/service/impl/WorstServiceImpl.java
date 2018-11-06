package org.liferayasif.backend.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.liferayasif.backend.dao.WorstDao;
import org.liferayasif.backend.model.Worst;
import org.liferayasif.backend.service.WorstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Transactional
@Service("worst")
public class WorstServiceImpl implements WorstService{

	@Autowired
	private WorstDao worstDao;
	
	@Override
	public List<Worst> getAllWorst() {
		List <Worst> worstList=worstDao.getAllWorst();
		return worstList;
	}

	@Override
	public Worst findById(Integer id) {
		Worst worst=worstDao.findById(id);
		return worst;
	}

	@Override
	public Worst addWorst(Worst worst) {
		Worst worstAdd=worstDao.addWorst(worst);
		return worstAdd;
	}

	@Override
	public Worst updateWorst(Worst worst) {
		return worstDao.updateWorst(worst);
		
	}

	@Override
	public void deleteById(Integer worstId) {
		worstDao.deleteById(worstId);
		
	}

	@Override
	public void deletbyEmail(String email) {
		worstDao.deletbyEmail(email);
		
	}

	@Override
	public List<Worst> findByEmail(String emailAddress) {
		return worstDao.findByEmail(emailAddress);
		
	}

}
