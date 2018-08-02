package org.liferayasif.backend.rest.controller;

import java.util.List;

import org.liferayasif.backend.model.Wipro;
import org.liferayasif.backend.service.WiproService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/wipro")
public class WiproRestConroller {

	@Autowired
	private WiproService wiproService;
	
	@RequestMapping(value="/listWipro")
	public Wipro sample(@RequestParam("id") int id){
		Wipro wipro=wiproService.getWiproById(id);
		System.out.println(wipro);
		return wipro;
	}
	
	@RequestMapping(value="/getBySalary")
	public Wipro salary(@RequestParam("avgSalary") int id){
		Wipro wipro=wiproService.getWiproById(id);
		System.out.println(wipro);
		return wipro;
	}
	
	@RequestMapping(value="getAllWipros")
	public List<Wipro> getAllWipros()
	{
		List<Wipro> wiproList = wiproService.getAllWipros();
		
		return wiproList;
		
	}
	@RequestMapping(value="addWipro" , method=RequestMethod.POST)
	public int addWipro(@RequestBody Wipro wipro)
	{
		wiproService.adddWipro(wipro);
		return 0;
	}
	
	@RequestMapping(value="addWipros" , method=RequestMethod.POST)
	public int addWipros(@RequestBody List<Wipro> wiproList)
	{
		for(Wipro wiprosList : wiproList)
		{
			wiproService.adddWipro(wiprosList);
		}
		return 0;
	}
}
