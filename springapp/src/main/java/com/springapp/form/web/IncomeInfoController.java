package com.springapp.form.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springapp.form.model.HealthInfoDTO;
import com.springapp.form.model.IncomeInfoDTO;

@Controller
public class IncomeInfoController {

	@RequestMapping(value = "thankyou", method = RequestMethod.GET)
	public String endState(Model model) {
		return "users/thankyou";
	}

	@RequestMapping(value = "incomeinfo", method = RequestMethod.GET)
	public String showIncomeForm(Model model) {
		IncomeInfoDTO incomeInfoDTO = new IncomeInfoDTO();
		model.addAttribute("incomeForm", incomeInfoDTO);
		ControllerHelper.populateIncomeModel(model);
		return "users/incomeinfo";
	}

	@RequestMapping(value = "/incomeinfo", method = RequestMethod.POST)
	public String saveOrUpdateUser(HttpServletRequest request,
			@ModelAttribute("incomeForm") @Validated IncomeInfoDTO incomeInfoDTO, BindingResult result, Model model,
			final RedirectAttributes redirectAttributes) {

		if (result.hasErrors()) {
			ControllerHelper.populateIncomeModel(model);
			return "users/incomeinfo";
		} else {
			redirectAttributes.addFlashAttribute("name", request.getSession().getAttribute("username"));
			return "redirect:thankyou";
		}

	}
}
