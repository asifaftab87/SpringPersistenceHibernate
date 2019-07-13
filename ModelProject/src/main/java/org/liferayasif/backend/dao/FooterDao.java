package org.liferayasif.backend.dao;

import java.util.List;

import org.liferayasif.backend.model.Footer;

public interface FooterDao {

	public List<Footer> getAllFooter();

	public List<String> getUrlByPageCode(String pageCode);

	public List<Footer> getPageCodeByParent(String parent);
}
