package org.liferayasif.front.validator;

import org.liferayasif.front.dto.CollegeDto;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component("collegeValidator")

public class CollegeValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
	
		return true;
	}

	@Override
	public void validate(Object object, Errors errors) {
	if(object instanceof CollegeDto)
	{
		CollegeDto collegeDto= (CollegeDto)object;
		
		System.out.println(""+collegeDto.getGender());
		System.out.println(""+collegeDto.getMobNo());
		
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", 				"worker.name.error");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "fatherName", 		"worker.fname.error");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "gender", 			"worker.gen.error");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "mobNo", 				"worker.mob.error");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "country", 			"worker.country.error");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "state", 				"worker.state.error");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", 				"worker.email.error");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", 			"worker.password.error");
		
		
		
		
		
	}
		
	}

}
