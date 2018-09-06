package org.liferayasif.front.controller;

import org.liferayasif.front.constants.PathConstants;
import org.liferayasif.front.dto.FormDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = PathConstants.HOME)
public class HomeController {

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView add(@ModelAttribute FormDto formDto)
	{
		ModelAndView mav = new ModelAndView("home/home");
		mav.addObject("form",formDto);
		return mav;
			
	}
	
}
