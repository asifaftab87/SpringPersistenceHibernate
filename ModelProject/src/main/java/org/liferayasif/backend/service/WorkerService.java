package org.liferayasif.backend.service;

import java.util.List;

import org.liferayasif.backend.model.Worker;

public interface WorkerService {
	
	public List<Worker> getAllWorkers();
	
	public Worker findWorkerById(Integer id);
	
	public List<Worker> getWorkerByName(String name);					
	
	public Worker addWorker(Worker worker);					
						
	public Worker updateWorker(Worker worker);					
						
	public void deleteWorkerById(Integer id);					
						
	public void deleteByAnnualIncome(double yearlyIncome);	

}
