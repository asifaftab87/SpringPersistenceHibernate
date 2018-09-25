package org.liferayasif.front.validator;

import org.liferayasif.front.dto.MobileDto;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component("mobileValidator")
public class MobileValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return true;
	}

	@Override
	public void validate(Object object, Errors errors) {
		if(object instanceof MobileDto)
		{
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "model", 		"mobile.model");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "year", 		"mobile.year");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "price", 		"mobile.price");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "spectrum", 	"mobile.spectrum");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "weight",		"box.weight");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "expense",	"mobile.expense");
			
			
			
			
		}
		
	}
	
	
	

}
