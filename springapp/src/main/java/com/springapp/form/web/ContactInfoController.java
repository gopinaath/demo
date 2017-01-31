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

import com.springapp.form.model.ContactInfoDTO;
import com.springapp.form.model.User;
import com.springapp.form.validator.ContactInfoValidator;
import com.springapp.form.validator.HealthInfoValidator;

@Controller
public class ContactInfoController {

	@Autowired
	ContactInfoValidator contactInfoValidator;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(contactInfoValidator);
	}

	@RequestMapping(value = "contactinfo", method = RequestMethod.GET)
	public String showContactForm(Model model) {
		ControllerHelper.createContact(model);
		ControllerHelper.populateContactModel(model);
		return "users/contactinfo";
	}

	@RequestMapping(value = "/contact", method = RequestMethod.POST)
	public String saveOrUpdateUser(@ModelAttribute("contactForm") @Validated ContactInfoDTO contact,
			BindingResult result, Model model, final RedirectAttributes redirectAttributes) {

		if (result.hasErrors()) {
			ControllerHelper.populateContactModel(model);
			return "users/contactform";
		} else {
			return "redirect:healthinfo";
		}

	}

}
