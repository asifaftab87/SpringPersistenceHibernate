package org.liferayasif.front.validator;

import org.liferayasif.front.dto.BoxDto;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component("boxValidator")
public class BoxValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		
		return true;
	}

	@Override
	public void validate(Object object, Errors errors) {
		if(object instanceof BoxDto)
		{
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "company", 				"box.comp");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "size", 					"box.size");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "price", 					"box.price");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "weight", 				"box.weight");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "manufacturer", 			"box.manufacturer");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "place", 					"box.place");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "area", 					"box.area");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pinCode", 				"box.pinCode");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "contactNo", 				"box.contactNo");
			
			
		}
		
	}

}
