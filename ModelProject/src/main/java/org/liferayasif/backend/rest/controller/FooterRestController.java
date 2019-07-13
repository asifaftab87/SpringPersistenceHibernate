package org.liferayasif.backend.rest.controller;

import java.util.List;
import org.liferayasif.backend.constants.PathConstants;
import org.liferayasif.backend.model.Footer;
import org.liferayasif.backend.service.FooterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = PathConstants.FOOTER)
public class FooterRestController {

	@Autowired
	private FooterService footerService;

	@GetMapping(value = PathConstants.GET_ALL_FOOTER)
	public List<Footer> getAllFooter() {
		return footerService.getAllFooter();
	}

	@RequestMapping(value = PathConstants.GET_FOOTER_URL)
	public List<String> getUrlByPageCode(@RequestParam("pageCode") String pageCode) {
		return footerService.getUrlByPageCode(pageCode);
	}

	@RequestMapping(value = PathConstants.FIND_FOOTER_BY_PARENT)
	public List<Footer> getPageCodeByParent(@RequestParam("parent") String parent) {
		return footerService.getPageCodeByParent(parent);
	}

}
