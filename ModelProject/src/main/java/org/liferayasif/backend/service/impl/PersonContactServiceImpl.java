package org.liferayasif.backend.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.liferayasif.backend.dao.PersonContactDao;
import org.liferayasif.backend.dao.PersonDao;
import org.liferayasif.backend.dao.PersonKinDao;
import org.liferayasif.backend.model.PersonContact;
import org.liferayasif.backend.model.UserAddress;
import org.liferayasif.backend.service.PersonContactService;
import org.liferayasif.backend.util.time.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("personContactService")
@Transactional
public class PersonContactServiceImpl implements PersonContactService {

	@Autowired
	private PersonContactDao personContactDao;
	
	@SuppressWarnings("unused")
	@Autowired
	private PersonKinDao personKinDao;
	
	@SuppressWarnings("unused")
	@Autowired
	private PersonDao personDao;
	
	@Override
	public List<PersonContact> getAllPersonContacts() {
		List<PersonContact> personContact = personContactDao.getAllPersonContacts();
		return personContact;
	}

	@Override
	public PersonContact getPersonContactById(Integer id) {
		PersonContact personContact = personContactDao.getPersonContactById(id);
		return personContact;
	}

	@Override
	public PersonContact addPersonContact(PersonContact personContact) {
		personContact.setCrtDt(TimeUtil.getSqlTimStmp());
		personContact.setUpdtDt(TimeUtil.getSqlTimStmp());
		
		
		return personContactDao.addPersonContact(personContact);
				
	}

	@Override
	public List<PersonContact> addPersonContactList(List<PersonContact> personContactList) {
		if(personContactList != null && personContactList.size()>0){
			
			for(PersonContact personContact : personContactList){
				addPersonContact(personContact);
			}
		}
		
		return personContactList;
	}

	@Override
	public void deletePersonContact(Integer id) {
		personContactDao.deletePersonContact(id);
		
	}

	@Override
	public PersonContact updatePersonContact(PersonContact personContact) {
		return personContactDao.updatePersonContact(personContact);
	}

	@Override
	public List<PersonContact> getPersonContactsByUserId(Integer id) {
		List<PersonContact> personContactList = personContactDao.getPersonContactesById(id);
		return personContactList;
	}
	
	

}
