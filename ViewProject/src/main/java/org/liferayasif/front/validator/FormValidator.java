package org.liferayasif.front.validator;

import org.liferayasif.front.dto.FormDto;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component("formValidator")
public class FormValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}
	
	@Override
	public void validate(Object object, Errors errors) {
		
		if(object instanceof FormDto) {
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "this.form.name.error");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "this.form.email.error");
		}
	}
}
