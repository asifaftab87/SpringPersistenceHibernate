package org.liferayasif.backend.rest.controller;

import java.util.List;

import org.liferayasif.backend.constants.PathConstants;
import org.liferayasif.backend.model.Ngo;
import org.liferayasif.backend.service.NgoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value=PathConstants.NGO)
public class NgoRestController {
	
	@Autowired
	private NgoService ngoService;
	
	
	
	
	@RequestMapping(value=PathConstants.ADD_OBJ	, method=RequestMethod.POST)
	public Ngo addNgoObj(@RequestBody Ngo ngo)
	{
		/*if(ngo.getFullName()||ngo.getFatherName()||ngo.ge)*/
		
		return ngoService.addNgo(ngo);
	}
	
	@RequestMapping(value=PathConstants.DISPLAY	, method=RequestMethod.GET)
	public List<Ngo> getNgoObj()
	{
		
		System.out.println("--------------getNgoObj-------------------------------------------");
		
		List<Ngo> ngoList = ngoService.getAllNgo();
		 
		return ngoList;
	}
	
	
	
	
	@RequestMapping(value=PathConstants.DEL_OBJ, method=RequestMethod.POST)//its not working so trying alternaate directly with email below
	public void delNgo(@RequestParam("emailAddress") String emailAddress) throws Exception
	{
			List<Ngo> ngoList =		ngoService.getByEmail(emailAddress);
		
			System.out.println("its hitting rest controller");
			
			int id = 0;
			if(ngoList!=null && ngoList.size()>0)
			{
				for(Ngo ngo : ngoList)
				{
					id = ngo.getId();
					System.out.println(""+id);
				}
			}
			else
			{
				throw new Exception("no such detail found with given name and email (please provide both name and email, email : "+emailAddress);	
			}
			
			ngoService.deleteNgoById(id);
		
		
	}	
	
	
	@RequestMapping(value=PathConstants.DELETE_BY_EMAIL, method=RequestMethod.POST)
	public void delNgoByEmail(@RequestParam("emailAddress") String emailAddress)
	{
		System.out.println("hitting rest controller 1 ");
			
			
			try{
				
				ngoService.deleteEmail(emailAddress);
			
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("email not found");
			}
			System.out.println("hitting rest controller 2");
		
	}	
	
	
	@RequestMapping(value=PathConstants.UPDATE_OBJ,method=RequestMethod.POST)
	public Ngo updateNgo(@RequestBody Ngo ngo)
	{
		
		return ngoService.updateNgo(ngo);
	}

}
