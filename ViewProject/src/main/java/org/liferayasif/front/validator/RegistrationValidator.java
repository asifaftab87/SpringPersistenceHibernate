package org.liferayasif.front.validator;

import org.liferayasif.front.dto.PatientDto;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component("registrationValidator")
public class RegistrationValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}
	
	@Override
	public void validate(Object object, Errors errors) {
		
		if(object instanceof PatientDto) {
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "hospitalId", "this.registration.hospitalId.error");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "doctorId", "this.registration.doctorId.error");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "patientId", "this.registration.patientId.error");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "dor", "this.registration.dor.error");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "outpatient", "this.registration.outpatient.error");
		}
	}
	
}
