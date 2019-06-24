package org.liferayasif.front.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.liferayasif.front.constants.URLConstants;
import org.liferayasif.front.dto.DoctorDto;
import org.liferayasif.front.dto.HospitalDto;
import org.liferayasif.front.dto.PatientDto;
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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/dropdown")
public class DropDownController {

//	
//	  @Autowired
//	  @Qualifier("dropdownValidator") 
//	  private Validator validator;
//	 
	
	
//	  @InitBinder 
//	  public void bindingPreparation(WebDataBinder binder) {
//		  binder.setValidator(validator); 
//	  }
	 
	
	WebRestTemplate webRestTemplate = new WebRestTemplate();

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView view(@ModelAttribute PatientDto patientDto, @ModelAttribute DoctorDto doctorDto){
	
		ModelAndView mav = new ModelAndView("/dropdown");
		
		String url1 = URLConstants.contextPath+"/patient/getPatientIdList";
		String url2 = URLConstants.contextPath+"/doctor/getDoctorIdList";
		String url3 = URLConstants.contextPath+"/hospital/getHospitalIdList";
				
		Integer[] patientArray = null;
		Integer[] doctorArray = null;
		Integer[] hospitalArray = null;
		
		try{
			patientArray = webRestTemplate.getForObject(url1, Integer[].class);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try{
			doctorArray = webRestTemplate.getForObject(url2, Integer[].class);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try{
			hospitalArray = webRestTemplate.getForObject(url3, Integer[].class);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		List<Integer> patientList = new ArrayList<>();
		
		if(patientArray!=null && patientArray.length>0){
			patientList = Arrays.asList(patientArray);
		}
		
		List<Integer> doctorList = new ArrayList<>();
		
		if(doctorArray!=null && doctorArray.length>0){
			doctorList = Arrays.asList(doctorArray);
		}
		
		List<Integer> hospitalList = new ArrayList<>();
		
		if(hospitalArray!=null && hospitalArray.length>0){
			hospitalList = Arrays.asList(hospitalArray);
		}

		
		mav.addObject("patientList", patientList);
		mav.addObject("doctorList", doctorList);
		mav.addObject("hospitalList", hospitalList);
		return mav;
	}
	
	
	@RequestMapping(value="/getAllIdList", method=RequestMethod.GET)
	public ModelAndView getAllIdList(@ModelAttribute PatientDto patientDto, @ModelAttribute DoctorDto doctorDto){
	
		ModelAndView mav = new ModelAndView("dropdown");
		
		String url = URLConstants.contextPath+"/patient/getAllIdList";
	
		Map<String, List<Integer>> idListMap = new HashMap<String, List<Integer>>();

		List<Integer> patientList = new ArrayList<>();
		List<Integer> doctorList = new ArrayList<>();
		List<Integer> hospitalList = new ArrayList<>();
		
		try{
			idListMap = webRestTemplate.getForObject(url, Map.class);
		}
		
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		if(idListMap!=null) {
			patientList = idListMap.get("pIdList");
			doctorList = idListMap.get("dIdList");
			hospitalList = idListMap.get("hIdList");
		}
		
		mav.addObject("patientList", patientList);
		mav.addObject("doctorList", doctorList);
		mav.addObject("hospitalList", hospitalList);
		return mav;
	}
	
	
	@RequestMapping(value="/getAllPatient/{doctorId}", method=RequestMethod.GET)
	public @ResponseBody List<PatientDto> findPatientByDoctorId(@PathVariable Integer doctorId,  @ModelAttribute PatientDto patientDto){
	
		String url = URLConstants.contextPath+"/hospital/findPatientByDoctorId/"+doctorId;
		
		PatientDto[] patientArray = null;
		try{
			patientArray = webRestTemplate.getForObject(url, PatientDto[].class);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		List<PatientDto> patientList = new ArrayList<>();
		
		if(patientArray!=null && patientArray.length>0){
			patientList = Arrays.asList(patientArray);
		}
		
		return patientList;
	}
	
	
	@RequestMapping(value="/getAllDoctor/{hospitalId}", method=RequestMethod.GET)
	public @ResponseBody List<DoctorDto> getDoctorsByHospitalId(@PathVariable Integer hospitalId,  @ModelAttribute DoctorDto doctorDto){
		
		String url = URLConstants.contextPath+"/hospital/findDoctorsByHospitalId/"+hospitalId;
				
		DoctorDto[] doctorArray = null;
		try{
			doctorArray = webRestTemplate.getForObject(url, DoctorDto[].class);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		List<DoctorDto> doctorList = new ArrayList<>();
		
		if(doctorArray!=null && doctorArray.length>0){
			doctorList = Arrays.asList(doctorArray);
		}
		
		return doctorList;
	}
	
	@RequestMapping(value="/getAllHospital/{hospitalId}", method=RequestMethod.GET)
	public @ResponseBody HospitalDto findHospitalByHospitalId(@PathVariable Integer hospitalId,  @ModelAttribute HospitalDto hospitalDto){
		
		String url = URLConstants.contextPath+"/hospital/findHospitalByHospitalId/"+hospitalId;
				
		HospitalDto hospital = null;
		try{
			hospital = webRestTemplate.getForObject(url, HospitalDto.class);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return hospital;
	}
	
	@RequestMapping(value="/getAllHospital", method=RequestMethod.GET)
	public ModelAndView view(@ModelAttribute HospitalDto hospitalDto){
	
		ModelAndView mav = new ModelAndView("drop-down");
		
		String url = URLConstants.contextPath+"/hospital/getAllHospital";
				
		HospitalDto[] hospitalArray = null;
		
		try{
			hospitalArray = webRestTemplate.getForObject(url, HospitalDto[].class);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		List<HospitalDto> hospitalList = new ArrayList<>();
		
		if(hospitalArray!=null && hospitalArray.length>0){
			hospitalList = Arrays.asList(hospitalArray);
		}
		
		mav.addObject("hospitalList", hospitalList);
		
		return mav;
	}
	
	
}
