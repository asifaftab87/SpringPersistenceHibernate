package org.liferayasif.front.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.liferayasif.front.constants.URLConstants;
import org.liferayasif.front.dto.NavigationDto;
import org.liferayasif.front.rest.template.WebRestTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/navigation")
public class NavigationController {

	WebRestTemplate webRestTemplate = new WebRestTemplate();

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView view(@ModelAttribute NavigationDto navigationDto) {

		ModelAndView mav = new ModelAndView("navigation/navigation");

		String url = URLConstants.contextPath + "/navigation/getAllNavigation";

		NavigationDto[] navigationArray = null;

		try {
			navigationArray = webRestTemplate.getForObject(url, NavigationDto[].class);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		List<NavigationDto> navigationList = new ArrayList<>();

		if (navigationArray != null && navigationArray.length > 0) {
			navigationList = Arrays.asList(navigationArray);
		}

		mav.addObject("navigationList", navigationList);

		return mav;
	}

	@RequestMapping(value = "/addNavigation", method = RequestMethod.GET)
	public ModelAndView toAdd(@ModelAttribute NavigationDto navigationDto) {

		ModelAndView mav = new ModelAndView("navigation/navigation-create");

		mav.addObject("navigation", navigationDto);

		return mav;
	}

	@RequestMapping(value = "/addNavigation", method = RequestMethod.POST)
	public ModelAndView add(@Validated @ModelAttribute NavigationDto navigationDto, BindingResult result,
			Errors errors) {

		if (result.hasErrors()) {
			ModelAndView mav = new ModelAndView("navigation/navigation-create");

			mav.addObject("navigation", navigationDto);

			return mav;
		}
		String url = URLConstants.contextPath + "/navigation/addNavigation";

		navigationDto = webRestTemplate.postForObject(url, navigationDto, NavigationDto.class);
		System.out.println("navigationDto: " + navigationDto);

		return new ModelAndView("redirect:/navigation");
	}

	@RequestMapping(value = "/getNavigationUrl/{pageCode}", method = RequestMethod.GET)
	public @ResponseBody String getNavUrl(@PathVariable String pageCode, @ModelAttribute NavigationDto navigationDto) {

		String url = URLConstants.contextPath + "/navigation/getNavigationUrl" + pageCode;

		NavigationDto navigation = null;

		try {
			navigation = webRestTemplate.getForObject(url, NavigationDto.class);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		String navUrl = navigation.getUrl();

		return navUrl;
	}

	@RequestMapping(value = "/findPageByParent/{parent}", method = RequestMethod.GET)
	public @ResponseBody List<NavigationDto> getPageCodeByParent(@PathVariable String parent,
			@ModelAttribute NavigationDto navigationDto) {

		String url = URLConstants.contextPath + "/navigation/findPageByParent" + parent;

		NavigationDto[] navigationArray = null;

		try {
			navigationArray = webRestTemplate.getForObject(url, NavigationDto[].class);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		List<NavigationDto> navigationList = new ArrayList<>();
		
		if(navigationArray!=null && navigationArray.length>0){
			navigationList = Arrays.asList(navigationArray);
		}
		
		return navigationList;

	}

}
