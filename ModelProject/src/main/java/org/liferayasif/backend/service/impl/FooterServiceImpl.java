package org.liferayasif.backend.service.impl;

import java.util.List;
import javax.transaction.Transactional;
import org.liferayasif.backend.dao.FooterDao;
import org.liferayasif.backend.model.Footer;
import org.liferayasif.backend.service.FooterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("footerService")
@Transactional
public class FooterServiceImpl implements FooterService {

	@Autowired
	private FooterDao footerDao;

	@Override
	public List<Footer> getAllFooter() {
		List<Footer> footerList = footerDao.getAllFooter();
		return footerList;
	}

	@Override
	public List<String> getUrlByPageCode(String pageCode) {
		List<String> url = footerDao.getUrlByPageCode(pageCode);
		return url;
	}

	@Override
	public List<Footer> getPageCodeByParent(String parent) {
		List<Footer> footerList = footerDao.getPageCodeByParent(parent);
		return footerList;
	}

}
