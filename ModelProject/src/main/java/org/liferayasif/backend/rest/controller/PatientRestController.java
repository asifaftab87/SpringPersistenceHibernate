package org.liferayasif.backend.rest.controller;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.liferayasif.backend.constants.PathConstants;
import org.liferayasif.backend.model.Doctor;
import org.liferayasif.backend.model.Patient;
import org.liferayasif.backend.service.DoctorService;
import org.liferayasif.backend.service.HospitalService;
import org.liferayasif.backend.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = PathConstants.PATIENT)
public class PatientRestController {

	@Autowired
	private PatientService patientService;
	
	@Autowired
	private DoctorService doctorService;
	
	@Autowired
	private HospitalService hospitalService;
	
	@RequestMapping(value=PathConstants.FIND_BY_ID)
	public Patient findById(@RequestParam("id") int id){
		
		Patient patient = patientService.getPatientById(id);
		
		if(patient!=null) {
			Doctor doctor = doctorService.getDoctorById(patient.getDoctorId());
			if(doctor!=null) {
				patient.setDoctor(doctor);
			}
		}
		
		return patient;
	}
	

		
		@RequestMapping(value=PathConstants.FIND_BY_LNAME)
		public List<Patient> findByLastName(@RequestParam("lName") String lName){
			
			return patientService.findByLastName(lName);
		
			
			
		}
	
	@RequestMapping(value=PathConstants.ADD_PATIENT, method=RequestMethod.POST)
	public Patient add(@RequestBody Patient patient){
		
		patient = patientService.addPatient(patient);
		
		patientService.sendSimpleMessage(patient.getEmail(), "Welcome Message", "I tried");
		
		return patient;
		
		
	}
	
	
	@GetMapping(value=PathConstants.GET_ALL_PATIENT)
	public List<Patient> getAllPatients(){
		return patientService.getAllPatients();
	}
	
	@RequestMapping(value=PathConstants.SEARCH_PATIENT)
	public @ResponseBody List<Patient> searchPatient(@RequestParam("fName") String fName, @RequestParam("lName") String lName, @RequestParam("email") String email, @RequestParam("dob") @DateTimeFormat(pattern="yyyy-MM-dd") Date dob, @RequestParam("doe") @DateTimeFormat(pattern="yyyy-MM-dd") Date doe, @RequestParam("dor")  @DateTimeFormat(pattern="yyyy-MM-dd") Date dor){
		
		List<Patient> patientList = patientService.searchPatient(fName, lName, email, dob, doe, dor);
		
		for (Patient p1 : patientList) {
			System.out.println(p1.getDob());
			
			System.out.println("====================");
			
			DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	        String birthdate = formatter.format(p1.getDob());
	        System.out.println("Birthdate : " + birthdate);

		}
		
		
		
		return patientList;
	}
	
	
	@RequestMapping(value=PathConstants.RELEASE_BY_ID , method=RequestMethod.PUT)
	public String releaseById(@RequestParam("id") int id, @RequestParam("dor") @DateTimeFormat(pattern="yyyy-MM-dd") Date dor) throws Exception{
		
		int result = patientService.releaseById(id, dor);
		if(result==-1) {
			throw new Exception("Failed to update");
		}
		if(result==0) {
			throw new Exception("No record found");
		}
		return "Success";
	}
	
	@RequestMapping(value=PathConstants.GET_PATIENT_ID, method=RequestMethod.GET)
	public List<Integer> getPatientIdList(){
		return patientService.getPatientIdList();
	}
	
	@RequestMapping(value=PathConstants.GET_ALL_IDS, method=RequestMethod.GET)
	public Map<String, List<Integer>> getAllIdList(){
		
		Map<String, List<Integer>> idListMap = new HashMap<String, List<Integer>>();
		
		List<Integer> hIdList = hospitalService.getHospitalIdList();
		List<Integer> dIdList = doctorService.getDoctorIdList();
		List<Integer> pIdList = patientService.getPatientIdList();

		idListMap.put("hIdList", hIdList);
		idListMap.put("pIdList", pIdList);
		idListMap.put("dIdList", dIdList);
		
		return idListMap;
	}
	
	
}
