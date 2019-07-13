package org.liferayasif.front.validator;

import org.liferayasif.front.dto.WorkerDto;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component("workerValidator")
public class WorkerValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		
		return true;
	}

	@Override
	public void validate(Object object, Errors errors) {
	if(object instanceof WorkerDto)
	{
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "fullName", 			"worker.name.error");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "fatherName", 		"worker.fname.error");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "motherName", 		"worker.mname.error");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "gender", 			"worker.gen.error");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "birthDate", 			"worker.dob.error");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address",			"worker.add.error");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "country",			"worker.country.error");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "state",	 			"worker.state.error");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "city", 				"worker.city.error");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pinCode", 			"worker.pin.error");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "mobileNo", 			"worker.mob.error");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "emailAddress",		"worker.email.error");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", 			"worker.password.error");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword",	"worker.cpassword.error");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "yearlyIncome", 		"worker.yearlyIncome.error");
		
	}
		
	}
	

}
