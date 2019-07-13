package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.NavigationDao;
import org.liferayasif.backend.model.Navigation;
import org.springframework.stereotype.Repository;

@Repository("navigationDao")
public class NavigationDaoImpl extends AbstractDao<Integer, Navigation> implements NavigationDao {

	@Override
	@SuppressWarnings("unchecked")
	public List<Navigation> getAllNavigation() {
		Criteria criteria = createEntityCriteria();
		return (List<Navigation>) criteria.list();
	}

	@Override
	public Navigation getNavigationById(Integer id) {
		return getByKey(id);
	}

	@Override
	public Navigation addNavigation(Navigation navigation) {
		persist(navigation);
		return navigation;
	}

	@Override
	public List<String> getUrlByPageCode(String pageCode) {
		Session session = getSession();

		StringBuilder hql = new StringBuilder(" select n.url from Navigation n ");

		if (pageCode != null && !pageCode.isEmpty()) {
			hql.append(" where n.pageCode= :pageCode ");
		}

		Query query = session.createQuery(new String(hql));

		if (pageCode != null && !pageCode.isEmpty()) {
			query.setParameter("pageCode", pageCode);
		}
		List<String> url = query.list();

		return url;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Navigation> getPageCodeByParent(String parent) {
		Session session = getSession();
		StringBuilder hql = new StringBuilder(" select n from Navigation n ");

		if (parent != null && !parent.isEmpty()) {
			hql.append(" where n.parentCode= :parent ");
		}

		Query query = session.createQuery(new String(hql));

		if (parent != null && !parent.isEmpty()) {
			query.setParameter("parent", parent);
		}
		List<Navigation> navigationList = query.list();
		return navigationList;
	}

}
