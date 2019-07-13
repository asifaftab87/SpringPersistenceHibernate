package org.liferayasif.front.validator;

import org.liferayasif.front.dto.DoctorDto;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component("doctorValidator")
public class DoctorValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}
	
	@Override
	public void validate(Object object, Errors errors) {
		
		if(object instanceof DoctorDto) {
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "fName", "this.doctor.fName.error");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lName", "this.doctor.lName.error");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "this.doctor.email.error");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phone", "this.doctor.phone.error");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "hospitalId", "this.doctor.hospitalId.error");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "specialization", "this.doctor.specialization.error");
		}
	}
	
}
