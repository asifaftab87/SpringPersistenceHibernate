package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.FooterDao;
import org.liferayasif.backend.model.Footer;
import org.springframework.stereotype.Repository;

@Repository("footerDao")
public class FooterDaoImpl extends AbstractDao<Integer, Footer> implements FooterDao {

	@Override
	@SuppressWarnings("unchecked")
	public List<Footer> getAllFooter() {
		Criteria criteria = createEntityCriteria();
		return (List<Footer>) criteria.list();
	}

	@Override
	public List<String> getUrlByPageCode(String pageCode) {
		Session session = getSession();

		StringBuilder hql = new StringBuilder(" select f.url from Footer f ");

		if (pageCode != null && !pageCode.isEmpty()) {
			hql.append(" where f.pageCode= :pageCode ");
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
	public List<Footer> getPageCodeByParent(String parent) {
		Session session = getSession();
		StringBuilder hql = new StringBuilder(" select f from Footer f ");

		if (parent != null && !parent.isEmpty()) {
			hql.append(" where f.parentCode= :parent ");
		}

		Query query = session.createQuery(new String(hql));

		if (parent != null && !parent.isEmpty()) {
			query.setParameter("parent", parent);
		}
		List<Footer> footerList = query.list();
		return footerList;
	}

}
