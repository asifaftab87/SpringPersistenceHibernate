package org.liferayasif.front.validator;

import org.liferayasif.front.dto.ActorDto;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component("actorValidator")
public class ActorValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		
		return true;
	}

	@Override
	public void validate(Object object, Errors errors) {
		if(object instanceof ActorDto )
		{
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", 				"worker.name.error");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "fathername", 		"worker.fname.error");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "location", 			"worker.location");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "mobileNo", 			"worker.mob.error");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "height",				"boc.height");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "weight",				"box.weight");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "bankBalance",	 	"actor.bankBalance");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "maritalStatus",		"actor.maritalstatus");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "qualification", 		"actor.qualification");
			
			
			
		}
		
	}

}
