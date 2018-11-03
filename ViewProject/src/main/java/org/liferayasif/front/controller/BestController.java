package org.liferayasif.front.controller;

import org.liferayasif.front.constants.Constants;
import org.liferayasif.front.constants.URLConstants;
import org.liferayasif.front.dto.BestDto;
import org.liferayasif.front.rest.template.WebRestTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value=Constants.BEST , method=RequestMethod.POST)
public class BestController {
	
	WebRestTemplate webRestTemplate = new WebRestTemplate();
	
	@RequestMapping(value=Constants.ADD_INFO, method=RequestMethod.GET)
	public ModelAndView addBest(@ModelAttribute BestDto bestDto)
	{
		
		ModelAndView mav = new ModelAndView("best-create");
		mav.addObject("best" , bestDto);
		mav.addObject("curRootPage", "best");
		
		return mav;
	}
	
	@RequestMapping(value=Constants.UPDATE_DB, method=RequestMethod.POST)
	public ModelAndView addBestDB(@ModelAttribute BestDto bestDto)
	{
		/*System.out.println("i m hiting updateDB method");
		ModelAndView mav = new ModelAndView("best-result");
		
		try{
		bestDto = webRestTemplate.postForObject(URLConstants.contextPath+"/best/addObj", bestDto, BestDto.class);
		mav.addObject("result", "Thank you, form submitted sucessfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			mav.addObject("result","Unable to process your request....!! please try again.");
		}
		mav.addObject("best" , bestDto);*/
		
		
		ModelAndView mav = new ModelAndView("best-result");
		bestDto = webRestTemplate.postForObject(URLConstants.contextPath+"/best/addObj", bestDto, BestDto.class);
		mav.addObject("result", "Thank you, form submitted sucessfully");
		
		mav.addObject("best", bestDto);
		return mav;
	}
	
	@RequestMapping(value=Constants.TEST, method=RequestMethod.GET)
	public  ModelAndView testBest()
	{
		System.out.println("hitting controller from view page");
		return null;
	}

}
