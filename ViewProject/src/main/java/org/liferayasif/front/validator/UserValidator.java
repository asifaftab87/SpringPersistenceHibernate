package org.liferayasif.front.validator;

import org.liferayasif.front.dto.UserDto;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component("userValidator")
public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		System.out.println("supports userValidator");
		return true;
	}
	
	@Override
	public void validate(Object object, Errors errors) {
		
		System.out.println("validate userValidator");
		
		if(object instanceof UserDto) {
			System.out.println("UserDto userValidator");
			//errors.rejectValue("name", null, null, "name failed");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "nerror");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "error");
		}
	}
	
}
