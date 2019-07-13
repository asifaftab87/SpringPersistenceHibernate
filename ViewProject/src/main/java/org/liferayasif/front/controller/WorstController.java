package org.liferayasif.front.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.liferayasif.front.constants.Constants;
import org.liferayasif.front.constants.URLConstants;
import org.liferayasif.front.dto.WorstDto;
import org.liferayasif.front.rest.template.WebRestTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value=Constants.WORST)
public class WorstController {
		
	WebRestTemplate webRestTemplate = new WebRestTemplate();
	
	//option page with 4 buttons
	@RequestMapping(value=Constants.OPTIONS, method=RequestMethod.GET)
	public ModelAndView optionsWorst(@ModelAttribute WorstDto worstDto)
	{
	
		ModelAndView mav = new ModelAndView("options");
		mav.addObject("worst",worstDto);
		mav.addObject("curRootPage","worst");
		return mav;
	
	}
	
	
	//form to feed data to be added	
	@RequestMapping(value=Constants.FORM, method=RequestMethod.GET)
	public ModelAndView inputWorst(@ModelAttribute WorstDto worstDto)
	{
		ModelAndView mav = new ModelAndView("worst-form");
		mav.addObject("worst",worstDto);
		mav.addObject("curRootPage","worst");
		return mav;
	
	}
	//hitting and adding data in DB
	@RequestMapping(value=Constants.ADD_INFO, method=RequestMethod.POST)
	public ModelAndView feedDbWorst(@ModelAttribute WorstDto worstDto)
	{
		System.out.println("hitting controller");
		ModelAndView mav = new ModelAndView("worst-display");
		try{
			worstDto=webRestTemplate.postForObject(URLConstants.contextPath+"/worst/addObj", worstDto, WorstDto.class);//worstDto.classmu be of same as wats holding the value on left side here its is worstDto
			mav.addObject("message", "info updated in DB");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			mav.addObject("message","detail not update in DB");
		}
		//mav.addObject("worst",worstDto);
		//mav.addObject("curRootPage","worst");
		return mav;
	
	}

	//delete detail request form
	@RequestMapping(value=Constants.DELETEFORM, method=RequestMethod.GET)
	public ModelAndView delWorst(@ModelAttribute WorstDto worstDto)
	{
	
		ModelAndView mav = new ModelAndView("delete-formWorst");
		mav.addObject("worst",worstDto);
		mav.addObject("curRootPage","worst");
		return mav;
	
	}
	
	
	//hitting and delete data from DB
		@RequestMapping(value=Constants.DELETE, method=RequestMethod.POST)
		public ModelAndView deleteWorst(@RequestParam("worstId") Integer worstId,@ModelAttribute WorstDto worstDto)
		{
			
				ModelAndView mav = new ModelAndView("delete-resultWorst");
						
				String message =  webRestTemplate.postForObject(URLConstants.contextPath+"/worst/delObj?worstId="+worstId, worstDto, String.class);
				mav.addObject("message" , message );
					
				return mav;
		}
	

		
		//form detail request to update
		@RequestMapping(value=Constants.UPDATE_INFO, method=RequestMethod.GET)
		public ModelAndView upWorst(@ModelAttribute WorstDto worstDto)
		{
			System.out.println("HITTING UPDATE CONTROLLER FROM OPTON PAGE");
			ModelAndView mav = new ModelAndView("update-worst");
			mav.addObject("worst",worstDto);
			mav.addObject("curRootPage","worst");
			return mav;
		
		}
		
		
		//hitting controller  to update data from DB
				@RequestMapping(value=Constants.UPDATE_DETAIL, method=RequestMethod.POST)
				public ModelAndView updateWorst(@ModelAttribute WorstDto worstDto)
				{
					String em=worstDto.getEmailAddress();
					System.out.println("hitting controller"+em);
					System.out.println("hitting controller"+worstDto.getEmailAddress());
					
					ModelAndView mav = new ModelAndView("update-worstResult");
										
					String message = webRestTemplate.postForObject(URLConstants.contextPath+"/worst/updateObj", worstDto, String.class);
					
					mav.addObject("message", message);
					return mav;
				
				}
					
			
		
				//get all data from DB
				@RequestMapping(value=Constants.GET_ALL, method=RequestMethod.GET)
				public ModelAndView getAllWorst(@ModelAttribute WorstDto worstDto)
				{
		
					System.out.println("hitting get all controller");
					ModelAndView mav = new ModelAndView("getAll-worstDisplay");
										
					WorstDto[] worstDtoArray = webRestTemplate.postForObject(URLConstants.contextPath+"/worst/getAll",worstDto,  WorstDto[].class);
				
					List<WorstDto> worstDtoList=new ArrayList<WorstDto>();
					if(worstDtoArray!=null && worstDtoArray.length>0)
					{
						worstDtoList=Arrays.asList(worstDtoArray);
						
					}
					
					return mav.addObject("worstDtoList" , worstDtoList);
				}
				
		
}
