package org.liferayasif.backend.rest.controller;

import java.util.List;

import org.liferayasif.backend.constants.PathConstants;
import org.liferayasif.backend.model.Worst;
import org.liferayasif.backend.service.WorstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value=PathConstants.WORST)
public class WorstRestController {

	@Autowired
	private WorstService worstServie;
	
	@RequestMapping(value=PathConstants.ADD_OBJ, method=RequestMethod.POST)
	public Worst addWorstAll(@RequestBody Worst worst)
	{
		return worstServie.addWorst(worst);
	}
	
	
	@RequestMapping(value=PathConstants.DEL_OBJ, method=RequestMethod.POST)
	public String delWorstById(Integer worstId)
	{
		String message;
		try{
				worstServie.deleteById(worstId);
				message="detail deleted as per the given Id";
		}
		catch(Exception e)
		{
			e.printStackTrace();
			message = "no data found based on given Id";
		}
		return message;
	}
	
	
	@RequestMapping(value=PathConstants.UPDATE_OBJ, method=RequestMethod.POST)
	public String updateWorstByEmail(@RequestBody Worst worst)
	{
			
		String email=worst.getEmailAddress();
		
		String message;
		try{
				List<Worst> worstList = worstServie.findByEmail(email);
				
				if(worstList!=null && worstList.size()>0)
				{
					Worst worst2 = worstList.get(0);
					/*String name = worst.getName();
					worst2.setName(name);*/
					worst2.setName(worst.getName());
					worst2.setBirthDate(worst.getBirthDate());
					worst2.setConfirmPassword(worst.getConfirmPassword());
					worst2.setEmailAddress(worst.getEmailAddress());
					worst2.setFatherName(worst.getFatherName());
					worst2.setGender(worst.getGender());
					worst2.setMotherName(worst.getMotherName());
					worst2.setPassword(worst.getPassword());
					
					worstServie.updateWorst(worst2);
					message = "Updated successfully";
				}
				else{
					message = "Email not found";
				}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
			message = "Failed to update";
		}
		
		return message;
	}
	
	
	
	
	
	@RequestMapping(value=PathConstants.GET_ALL, method=RequestMethod.POST)
	public List<Worst>getALl(@RequestBody Worst worst)
	{
			
		return worstServie.getAllWorst();
		
		
	}
	
	
	
}
