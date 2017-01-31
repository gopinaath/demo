package com.springapp.form.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.springapp.form.model.HealthInfoDTO;

@Component
public class HealthInfoValidator implements Validator {

	@Autowired
	@Qualifier("emailValidator")
	EmailValidator emailValidator;

	@Override
	public boolean supports(Class<?> clazz) {
		return HealthInfoDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		HealthInfoDTO healthInfoDTO = (HealthInfoDTO) target;

	}

}