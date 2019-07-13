package org.liferayasif.backend.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.liferayasif.backend.dao.NavigationDao;
import org.liferayasif.backend.model.Navigation;
import org.liferayasif.backend.service.NavigationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("navigationService")
@Transactional
public class NavigationServiceImpl implements NavigationService {
	
	@Autowired
	private NavigationDao navigationDao;

	@Override
	public List<Navigation> getAllNavigation() {
		List<Navigation> navigationList = navigationDao.getAllNavigation();
		return navigationList;
	}

	@Override
	public Navigation getNavigationById(Integer id) {
		Navigation navigation = navigationDao.getNavigationById(id);
		return navigation;
	}

	@Override
	public Navigation addNavigation(Navigation navigation) {
		return navigation = navigationDao.addNavigation(navigation);
	}


	@Override
	public List<String> getUrlByPageCode(String pageCode) {
		List<String> url = navigationDao.getUrlByPageCode(pageCode);
		return url;
	}

	@Override
	public List<Navigation> getPageCodeByParent(String parent) {
		List<Navigation> navigationList = navigationDao.getPageCodeByParent(parent);
		return navigationList;
	}

}
