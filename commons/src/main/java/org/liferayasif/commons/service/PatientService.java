package org.liferayasif.commons.service;

import java.util.Optional;

import org.liferayasif.commons.model.Patient;
import org.liferayasif.commons.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

	@Autowired
	private PatientRepository patientRepository;
	
	public Iterable<Patient> findAll() {
		Iterable<Patient> patients = patientRepository.findAll();
		return patients;
	}
	
	public Patient findById(Integer id) {
		Optional<Patient> optional = patientRepository.findById(id);
		return optional.isPresent() ? optional.get() : null;
	}
	
	public Patient add(Patient patient) {
		return patientRepository.save(patient);
	}
}
