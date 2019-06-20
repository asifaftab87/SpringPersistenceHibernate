package org.liferayasif.backend.service.impl;

import java.util.List;

import org.liferayasif.backend.dao.MobileDao;
import org.liferayasif.backend.model.Mobile;
import org.liferayasif.backend.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("mobileService")
@Transactional
public class MobileServiceImpl implements MobileService {

	@Autowired
	private MobileDao mobileDao;
	
	
	@Override
	public List<Mobile> getAllMobiles() {
		List<Mobile> mobileList = mobileDao.getAllMobiles();
		return mobileList;
	}

	@Override
	public Mobile getMobileById(Integer id) {
		Mobile mobile = mobileDao.getMobileById(id);
		return mobile;	}

	@Override
	public Mobile addMobile(Mobile mobile) {
		return mobileDao.addMobile(mobile);
	}

	@Override
	public void deleteMobile(Integer id) {
		mobileDao.deleteMobile(id);
	}

	@Override
	public Mobile updateMobile(Mobile mobile) {
		return mobileDao.updateMobile(mobile);
	}

	@Override
	public List<Mobile> findByName(String name) {
		return mobileDao.findByName(name);
	}

}
