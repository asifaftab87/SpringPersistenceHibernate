package org.liferayasif.backend.dao;

import java.util.List;

import org.liferayasif.backend.model.Navigation;

public interface NavigationDao {

	public List<Navigation> getAllNavigation();

	public Navigation getNavigationById(Integer id);

	public Navigation addNavigation(Navigation navigation);

	public List<String> getUrlByPageCode(String pageCode);

	public List<Navigation> getPageCodeByParent(String parent);
}
