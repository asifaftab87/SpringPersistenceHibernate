package org.liferayasif.front.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.liferayasif.front.constants.URLConstants;
import org.liferayasif.front.dto.CompanyDto;
import org.liferayasif.front.dto.NgoDto;
import org.liferayasif.front.rest.template.WebRestTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/ngo")
public class NgoController {

	WebRestTemplate webRestTemplate = new WebRestTemplate();
	
	@RequestMapping(value="/addNgo", method=RequestMethod.GET)
	public ModelAndView inputNgo(@ModelAttribute NgoDto ngoDto){
		
		ModelAndView mav = new ModelAndView("ngo-create");
		mav.addObject("ngo",ngoDto);
		mav.addObject("curRootPage","ngo");
		return mav;
	}
	
	@RequestMapping(value="/displayNgo", method=RequestMethod.POST)
	public ModelAndView addNgo(@ModelAttribute NgoDto ngoDto){
		
		ModelAndView mav = new ModelAndView("ngo-result");
		
		try{
			//ngoDto=webRestTemplate.postForObject(URLConstants.contextPath+"/ngo/addObj", ngoDto, NgoDto.class);
			mav.addObject("result", "Thank you, form submitted sucessfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			mav.addObject("result","Unable to process your request....!! please try again.");
		}
	
		mav.addObject("ngo",ngoDto);
		return mav;
	}
	
	
	@RequestMapping(value="/displayNgo", method=RequestMethod.GET)
	public ModelAndView DeNgo(@ModelAttribute NgoDto ngoDto){
		
		ModelAndView mav = new ModelAndView("ngo-result");
		
		
		mav.addObject("ngo",ngoDto);
		return mav;
	}
	
	
	@RequestMapping(value="/displayAll", method=RequestMethod.GET)
	public ModelAndView disAll(@ModelAttribute NgoDto ngoDto)
	{
		ModelAndView mav = new ModelAndView("ngo-displayAll");
		
		System.out.println("this is my method--------------------------------------------------------------------");
		
		
		NgoDto[] ngoDtoArray = webRestTemplate.getForObject(URLConstants.contextPath+"/ngo/display", NgoDto[].class);
		
		List<NgoDto> ngoDtoList = new ArrayList<NgoDto>();
		
		if(ngoDtoArray!=null && ngoDtoArray.length>0){
			ngoDtoList = Arrays.asList(ngoDtoArray);
		}
		
		mav.addObject("ngoDtoList", ngoDtoList);
		return mav;
		
	}
	
	
	
	
	
	
	@RequestMapping(value="/updateNgo", method=RequestMethod.GET)
	public ModelAndView upNgo(@ModelAttribute NgoDto ngoDto){
		
		System.out.println("hitting update");
		ModelAndView mav = new ModelAndView("ngo-update");
		mav.addObject("ngo",ngoDto);
		mav.addObject("curRootPage","ngo");
		return mav;
	}
	
	@RequestMapping(value="/displayUpdateNgo", method=RequestMethod.POST)
	public ModelAndView updateNgo(@ModelAttribute NgoDto ngoDto){
		
		ModelAndView mav = new ModelAndView("ngo-updateresult");
		
		try{
			//ngoDto=webRestTemplate.postForObject(URLConstants.contextPath+"/ngo/updateObj", ngoDto, NgoDto.class);
			mav.addObject("result", "Thank you, form submitted sucessfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			mav.addObject("result","Unable to process your request....!! please try again.");
		}
	
		mav.addObject("ngo",ngoDto);
		return mav;
	}
	
	
	
	
	@RequestMapping(value="/deleteNgo" , method=RequestMethod.GET)
	public ModelAndView delNgo(@ModelAttribute NgoDto ngoDto)
	{
		ModelAndView mav = new ModelAndView("ngo-delete");
		
		mav.addObject("ngo" , ngoDto);
		return mav;
	}
	
	@RequestMapping(value="/ngoDel" , method=RequestMethod.POST)
	public ModelAndView   deleteNgo(@RequestParam("emailAddress") String emailAddress, @ModelAttribute NgoDto ngoDto){
		
		System.out.println("Passing email---------------------------------------"+emailAddress);
		ModelAndView mav = new ModelAndView("ngo-deleteresult");
		
		try{
				ngoDto=webRestTemplate.postForObject(URLConstants.contextPath+"/ngo/delObj",ngoDto, NgoDto.class);
				mav.addObject("result" , "deleted sucessfully" );
				
																	
		}
		catch(Exception e)
		{
			e.printStackTrace();
			mav.addObject("result" ,"delete failed as email address not matched" );
		}
		
		return mav;
		
	}
	
	
	@RequestMapping(value="/delByEmail", method=RequestMethod.POST)
	public ModelAndView delNgoByEmail(@RequestParam("emailAddress") String emailAddress, @ModelAttribute NgoDto ngoDto){
	
		ModelAndView mav = new ModelAndView("ngo-deleteresult");	
				
		ngoDto = webRestTemplate.postForObject(URLConstants.contextPath+"/ngo/deleteByEmail?emailAddress="+emailAddress,ngoDto, NgoDto.class);
		System.out.println("ngoDto: "+ngoDto);
		System.out.println("bck from RC");
		if(ngoDto==null){
			ngoDto = new NgoDto();
		}
		mav.addObject("ngoDto", ngoDto);
		
		return mav;
	}
	
	
	
	
	
}
