package org.liferayasif.backend.service;

import java.util.List;

import org.liferayasif.backend.model.Footer;

public interface FooterService {

	public List<Footer> getAllFooter();

	public List<String> getUrlByPageCode(String pageCode);

	public List<Footer> getPageCodeByParent(String parent);

}
