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
		return true;
	}
	
	@Override
	public void validate(Object object, Errors errors) {
		
		if(object instanceof UserDto) {
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "this.user.name.error");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "this.user.email.error");
		}
	}
	
}
