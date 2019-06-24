package org.liferayasif.front.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.liferayasif.front.constants.URLConstants;
import org.liferayasif.front.dto.FooterDto;
import org.liferayasif.front.dto.NavigationDto;
import org.liferayasif.front.rest.template.WebRestTemplate;

public class ViewWebUtil {

	private static WebRestTemplate webRestTemplate = new WebRestTemplate();
	
	public static List<NavigationDto> getNavigation() {
		
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
		return navigationList;
	}
	
	public static List<NavigationDto> getPageCodeByParent(String parent) {

		String url = URLConstants.contextPath + "/navigation/findPageByParent?parent=" + parent;

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
	
	
public static List<FooterDto> getFooter() {
		
		String url = URLConstants.contextPath + "/footer/getAllFooter";
		
		FooterDto[] footerArray = null;

		try {
			footerArray = webRestTemplate.getForObject(url, FooterDto[].class);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		List<FooterDto> footerList = new ArrayList<>();

		if (footerArray != null && footerArray.length > 0) {
			footerList = Arrays.asList(footerArray);
		}
		return footerList;
	}
	
	public static List<FooterDto> getFooterByParent(String parent) {

		String url = URLConstants.contextPath + "/footer/findFooterByParent?parent=" + parent;

		FooterDto[] footerArray = null;

		try {
			footerArray = webRestTemplate.getForObject(url, FooterDto[].class);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		List<FooterDto> footerList = new ArrayList<>();
		
		if(footerArray!=null && footerArray.length>0){
			footerList = Arrays.asList(footerArray);
		}
		
		
		return footerList;

	}

}
