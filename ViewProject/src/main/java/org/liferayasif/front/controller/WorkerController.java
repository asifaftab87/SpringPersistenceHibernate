package org.liferayasif.front.controller;

import org.liferayasif.front.constants.Constants;
import org.liferayasif.front.dto.WorkerDto;
import org.liferayasif.front.rest.template.WebRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value=Constants.WORKER)
public class WorkerController {
	
	@Autowired
	@Qualifier("workerValidator")
	private Validator validator;
	
		
	@InitBinder
	public void bindingPreparation(WebDataBinder binder)
	{
		binder.setValidator(validator);
	}

	
	WebRestTemplate webRestTemplate = new WebRestTemplate();
	
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView getData(@ModelAttribute WorkerDto workerDto)
	{
		ModelAndView mav = new ModelAndView("worker-create");
		mav.addObject("workerDto" , workerDto);
		return mav;
		
	}
	
	
	
	@RequestMapping(value=Constants.ADD_OBJ , method=RequestMethod.POST)
	public ModelAndView view(@Validated @ModelAttribute WorkerDto workerDto, BindingResult result, Errors errors)
	{
		ModelAndView mav = new ModelAndView("worker-display");
		if(!result.hasErrors())
		{
			/*workerDto = webRestTemplate.postForObject(URLConstants.contextPath+"/worker/addObj", workerDto, WorkerDto.class);
			//mav.addObject("" , "")
*/		}
		else
		{
			mav=new ModelAndView("worker-create");
		}
		
		mav.addObject("workerDto", workerDto);
		return mav;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
