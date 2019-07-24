package org.liferayasif.commons.rest.controller;

import javax.servlet.http.HttpServletRequest;

import org.liferayasif.commons.client.RestClient;
import org.liferayasif.commons.model.Documents;
import org.liferayasif.commons.model.Patient;
import org.liferayasif.commons.model.Report;
import org.liferayasif.commons.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/patient")
public class PatientRestController extends RestClient {

	@Autowired
	private PatientService patientService;
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public void add(@RequestBody Patient patient, HttpServletRequest request) {
		Report report = getReportsClient().getForObject(reportsURL + "/test", Report.class);
		
		Documents documents = new Documents();
		
		if(report!=null) {
			
			documents.setName(report.getFileName());
			documents.setType(report.getMimeType());
			documents.setContents(report.getReportBytes());
			documents.setSize(String.valueOf(report.getReportBytes().length));
			documents = getDocumentsClient().postForObject(documentsURL + "/upload", documents, Documents.class);
			if(documents!=null) {
				patient.setDocId(documents.getId());
			}
		}
		
		patientService.add(patient);
	}
	
	@RequestMapping(value = "/find/Id/{id}")
	public Patient findyId(@PathVariable("id") Integer id) {
		return patientService.findById(id);
	}
	
	@RequestMapping(value = "/findAll")
	public Iterable<Patient> findAll(){
		return patientService.findAll();
	}
	
}
