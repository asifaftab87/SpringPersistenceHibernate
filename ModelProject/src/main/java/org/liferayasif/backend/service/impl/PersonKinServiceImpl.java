package org.liferayasif.backend.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.liferayasif.backend.dao.PersonContactDao;
import org.liferayasif.backend.dao.PersonDao;
import org.liferayasif.backend.dao.PersonKinDao;
import org.liferayasif.backend.model.PersonKin;
import org.liferayasif.backend.service.PersonKinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("personKinService")
@Transactional
public class PersonKinServiceImpl implements PersonKinService {

	@SuppressWarnings("unused")
	@Autowired
	private PersonDao personDao;
	
	@SuppressWarnings("unused")
	@Autowired
	private PersonContactDao personContactDao;
	
	@Autowired
	private PersonKinDao personKinDao;
	
	@Override
	public List<PersonKin> getAllPersonKins() {
		List<PersonKin> personKinList = personKinDao.getAllPersonKins();
		return personKinList;
		
	}

	@Override
	public PersonKin getPersonKinById(Integer id) {
		PersonKin personKin = personKinDao.getPersonKinById(id);
		return personKin;
	}

	@Override
	public PersonKin addPersonKin(PersonKin personKin) {
		return personKinDao.addPersonKin(personKin);
		
	}

	@Override
	public void deletePersonKin(Integer id) {
		personKinDao.deletePersonKin(id);
		
	}

	@Override
	public PersonKin updatePersonKin(PersonKin personKin) {
		return personKinDao.updatePersonKin(personKin);
	}

	@Override
	public List<PersonKin> findByName(String name) {
		List<PersonKin> personKinList = personKinDao.findByName(name);
		return personKinList;
	}

	@Override
	public List<PersonKin> addPersonKinList(List<PersonKin> perKinList) {
		
		for(PersonKin personKin : perKinList){
			addPersonKin(personKin);
		}
		
		return perKinList;
	}

}
