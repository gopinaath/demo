package com.springapp.form.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springapp.form.model.HealthInfoDTO;
import com.springapp.form.validator.HealthInfoValidator;

@Controller
public class HealthInfoController {

	@Autowired
	HealthInfoValidator healthInfoValidator;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(healthInfoValidator);
	}

	@RequestMapping(value = "healthinfo", method = RequestMethod.GET)
	public String showHealthForm(Model model) {
		HealthInfoDTO healthDTO = new HealthInfoDTO();
		model.addAttribute("healthInfo", healthDTO);
		ControllerHelper.populateHealthModel(model);
		return "users/healthinfo";
	}
	
	@RequestMapping(value = "/healthinfo", method = RequestMethod.POST)
	public String saveOrUpdateUser(@ModelAttribute("healthForm") @Validated HealthInfoDTO healthInfoDTO,
			BindingResult result, Model model, final RedirectAttributes redirectAttributes) {

		if (result.hasErrors()) {
			ControllerHelper.populateContactModel(model);
			return "users/healthinfo";
		} else {			
			return "redirect:incomeinfo";
		}

	}

	
}
