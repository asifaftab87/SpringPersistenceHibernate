package org.liferayasif.backend.rest.controller;

import org.liferayasif.backend.constants.PathConstants;
import org.liferayasif.backend.model.Worker;
import org.liferayasif.backend.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value=PathConstants.WORKER)
public class WorkerRestController {

	@Autowired
	public WorkerService workerService;
	
	@RequestMapping(value=PathConstants.ADD_OBJ	, method=RequestMethod.POST)					
	public Worker addWorkerObj(@RequestBody Worker worker)						
	{
								
		/*if(ngo.getFullName()||ngo.getFatherName()||ngo.ge)*/					
							
		return workerService.addWorker(worker);
		
		
	}						
							

	
	
	
}
