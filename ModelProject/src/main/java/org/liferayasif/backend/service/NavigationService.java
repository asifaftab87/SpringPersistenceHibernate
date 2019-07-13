package org.liferayasif.backend.service;

import java.util.List;

import org.liferayasif.backend.model.Navigation;

public interface NavigationService {

	public List<Navigation> getAllNavigation();

	public Navigation getNavigationById(Integer id);

	public Navigation addNavigation(Navigation navigation);

	public List<String> getUrlByPageCode(String pageCode);

	public List<Navigation> getPageCodeByParent(String parent);

}
