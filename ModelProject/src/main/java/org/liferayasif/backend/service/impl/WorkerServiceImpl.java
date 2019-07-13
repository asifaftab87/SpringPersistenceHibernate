package org.liferayasif.backend.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.liferayasif.backend.dao.WorkerDao;
import org.liferayasif.backend.model.Worker;
import org.liferayasif.backend.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Transactional
@Service("worker")
public class WorkerServiceImpl implements WorkerService {

	
	@Autowired
	private WorkerDao workerDao;
	
	
	
	@Override
	public List<Worker> getAllWorkers() {
		List<Worker> workerList = 	workerDao.getAllWorkers();
		return workerList;
	}

	@Override
	public Worker findWorkerById(Integer id) {
		return	workerDao.findWorkerById(id);
		
	}

	@Override
	public List<Worker> getWorkerByName(String name) {
		return workerDao.getWorkerByName(name);
	}

	@Override
	public Worker addWorker(Worker worker) {
		return workerDao.addWorker(worker);
	}

	@Override
	public Worker updateWorker(Worker worker) {
		return workerDao.updateWorker(worker);
	}

	@Override
	public void deleteWorkerById(Integer id) {
		workerDao.deleteWorkerById(id);
	}

	@Override
	public void deleteByAnnualIncome(double yearlyIncome) {
		workerDao.deleteByAnnualIncome(yearlyIncome);
		
	}

}
