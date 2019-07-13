package org.liferayasif.front.validator;

import org.liferayasif.front.dto.MinisterDto;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component("ministerValidator")
public class MinisterValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		
		return true;
	}

	@Override
	public void validate(Object object, Errors errors) {
		if(object instanceof MinisterDto)
		{
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", 				"worker.name.error");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "spouse", 			"mini.spouse");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "noOfChildren", 		"mini.noOfChild");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "annualSalary", 		"mini.annualSalary");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address",			"worker.add.error");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "partyName",			"mini.partyName");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "noOfMember",	 		"mini.noOfMember");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email",				"worker.email.error");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "contactNo", 			"worker.mob.error");
			
			
			
			
		}
		
	}

}
