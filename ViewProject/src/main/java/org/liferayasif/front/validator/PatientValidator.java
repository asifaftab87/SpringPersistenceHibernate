package org.liferayasif.front.validator;

import org.liferayasif.front.dto.PatientDto;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component("patientValidator")
public class PatientValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}
	
	@Override
	public void validate(Object object, Errors errors) {
		
		if(object instanceof PatientDto) {
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "fName", "this.patient.fName.error");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lName", "this.patient.lName.error");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "this.patient.email.error");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "age", "this.patient.age.error");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phone", "this.patient.phone.error");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "doctorId", "this.patient.doctorId.error");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "hospitalId", "this.patient.hospitalId.error");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "dob", "this.patient.dob.error");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "doe", "this.patient.doe.error");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "dor", "this.patient.dor.error");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "c", "this.patient.c.error");
		}
	}
	
}
