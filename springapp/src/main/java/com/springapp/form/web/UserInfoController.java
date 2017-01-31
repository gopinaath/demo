package com.springapp.form.web;

import javax.servlet.http.HttpServletRequest;

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

import com.springapp.form.model.User;
import com.springapp.form.validator.UserFormValidator;

@Controller
public class UserInfoController {

	@Autowired
	UserFormValidator userFormValidator;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(userFormValidator);
	}

	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {		
		return "redirect:/users/add";
	}


	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public String saveOrUpdateUser(HttpServletRequest request,@ModelAttribute("userForm") @Validated User user,
			BindingResult result, Model model, final RedirectAttributes redirectAttributes) {
		request.getSession().setAttribute("username",user.getName());
		if (result.hasErrors()) {
			ControllerHelper.populateUserModel(model);
			return "users/userinfo";
		} else {		
			return "redirect:contactinfo";
		}
	}

	@RequestMapping(value = "/users/add", method = RequestMethod.GET)
	public String showAddUserForm(Model model) {
		createDefaults(model);
		ControllerHelper.populateUserModel(model);
		return "users/userinfo";
	}
	
	private void createDefaults(Model model){
		User user = new User();
		// set default value
		
		/*user.setName("test123");
		user.setEmail("test@test.com");
		user.setAddress("abc 88");
		user.setNewsletter(true);
		user.setGender("M");
		user.setFramework(new ArrayList<String>(Arrays.asList("Spring MVC", "GWT")));
		user.setSkill(new ArrayList<String>(Arrays.asList("Spring", "Grails", "Groovy")));
		user.setCountry("SG");
		user.setNumber(2);*/
		model.addAttribute("userForm", user);
	}
	
	

}