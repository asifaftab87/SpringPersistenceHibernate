package org.liferayasif.backend.rest.controller;

import java.util.List;

import org.liferayasif.backend.constants.PathConstants;
import org.liferayasif.backend.model.Navigation;
import org.liferayasif.backend.service.NavigationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = PathConstants.NAVIGATION)
public class NavigationRestController {

	@Autowired
	private NavigationService navigationService;

	@GetMapping(value = PathConstants.GET_ALL_NAVIGATION)
	public List<Navigation> getAllNavigation() {
		return navigationService.getAllNavigation();
	}

	@RequestMapping(value = PathConstants.FIND_BY_ID)
	public Navigation getNavigationById(@RequestParam("id") int id) {

		Navigation navigation = navigationService.getNavigationById(id);
		return navigation;
	}

	@RequestMapping(value = PathConstants.GET_NAV_URL)
	public List<String> getUrlByPageCode(@RequestParam("pageCode") String pageCode) {
		return navigationService.getUrlByPageCode(pageCode);
	}

	@PostMapping(value = PathConstants.ADD_NAVIGATION)
	public Navigation add(@RequestBody Navigation navigation) {

		navigation = navigationService.addNavigation(navigation);

		return navigation;
	}

	@RequestMapping(value = PathConstants.FIND_PAGE_BY_PARENT)
	public List<Navigation> getPageCodeByParent(@RequestParam("parent") String parent) {
		return navigationService.getPageCodeByParent(parent);
	}

}
