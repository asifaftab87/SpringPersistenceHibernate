package org.liferayasif.backend.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.liferayasif.backend.constants.PathConstants;
import org.liferayasif.backend.model.Person;
import org.liferayasif.backend.model.PersonContact;
import org.liferayasif.backend.model.PersonKin;
import org.liferayasif.backend.service.PersonContactService;
import org.liferayasif.backend.service.PersonKinService;
import org.liferayasif.backend.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = PathConstants.PERSON)
public class PersonRestController {

	@Autowired
	private PersonService personService;
	
	@Autowired
	private PersonContactService personContactService;
	
	@Autowired
	private PersonKinService personKinService;
	
	
	@RequestMapping(value = PathConstants.ADD_PERSON, method=RequestMethod.POST)
	public Person add(@RequestBody Person person) throws Exception
	{
		person = personService.addperson(person);
		 
		List<PersonContact> personContactList = person.getPersonContactList();
		 
		 if(personContactList !=null)
		 {
			 
			 for(PersonContact personConList  : personContactList)
			 {
				 personConList.setPersonId(person.getId());
			 }
			
			 personContactService.addPersonContactList(personContactList);
		 }
		 else
		 {
			 throw new Exception("no Person Contact List passed");
		 }
		 
		 List<PersonKin> personKinList = person.getPersonKinList();
		 StringBuffer personKinId = new StringBuffer();
		 
		 if(personKinList!=null)
		 {
			for(PersonKin personKin: personKinList) 
			{
				personKin.setPersonId(person.getId());
			}
			List<PersonKin> personKinList2 = personKinService.addPersonKinList(personKinList);
			
			for(PersonKin personKin: personKinList2) 
			{
				System.out.println("personKin id: "+personKin.getId());
				personKinId.append(personKin.getId()+",");
			}
			 personKinId =personKinId.deleteCharAt(personKinId.length()-1);
		 }
		 person.setPersonKinId(personKinId+"");
		 personService.updateperson(person);
		 return person;
	}
	
	
	@RequestMapping(value=PathConstants.GET_PKIN_LIST, method=RequestMethod.GET)
	public List<PersonKin> getPKinList(@RequestParam("id") Integer id) throws Exception
	{
		Person person = personService.getPersonByid(id);
		String pkinid = person.getpersonKinId();
		String [] kinIdArray = pkinid.split(",");
		
		List<PersonKin> personKinList= new ArrayList<PersonKin>();
		for(int i=0;i<kinIdArray.length;i++)
		{
			String kinid=kinIdArray[i];
			int kinidIn=Integer.parseInt(kinid);
			PersonKin personKin=personKinService.getPersonKinById(kinidIn);
			personKinList.add(personKin);
		}
		
		System.out.println("first id : "+personKinList);
		
		return personKinList;
	}
	

	
	
		
}
