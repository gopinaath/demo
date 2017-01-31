package com.springapp.form.web;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.ui.Model;

import com.springapp.form.model.ContactInfoDTO;

public class ControllerHelper {

	public static void populateUserModel(Model model) {

		List<String> frameworksList = new ArrayList<String>();
		frameworksList.add("Spring MVC");
		frameworksList.add("Struts 2");
		frameworksList.add("JSF 2");
		frameworksList.add("GWT");
		frameworksList.add("Play");
		frameworksList.add("Apache Wicket");
		model.addAttribute("frameworkList", frameworksList);

		Map<String, String> skill = new LinkedHashMap<String, String>();
		skill.put("Hibernate", "Hibernate");
		skill.put("Spring", "Spring");
		skill.put("Struts", "Struts");
		skill.put("Groovy", "Groovy");
		skill.put("Grails", "Grails");
		model.addAttribute("javaSkillList", skill);

		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		model.addAttribute("numberList", numbers);

		Map<String, String> country = new LinkedHashMap<String, String>();
		country.put("US", "United Stated");
		country.put("CN", "China");
		country.put("SG", "Singapore");
		country.put("MY", "Malaysia");
		model.addAttribute("countryList", country);

	}

	public static void populateHealthModel(Model model) {
		List<String> yesOrNo = new ArrayList<String>();
		yesOrNo.add("Yes");
		yesOrNo.add("No");

		model.addAttribute("yesOrNoList", yesOrNo);

	}

	public static void populateIncomeModel(Model model){
		List<String> list1=new ArrayList<String>();
		list1.add("From my Income");
		list1.add("From my Savings/Investments");
		model.addAttribute("paySourceList",list1 );
		
		List<String> list2=new ArrayList<String>();
		list2.add("Under $10,000");
		list2.add("$10,000-$20,000");
		model.addAttribute("incomeSourceList",list2 );
		
		List<String> list3=new ArrayList<String>();
		list3.add("No Change");
		list3.add("Increase");
		model.addAttribute("incomeGrowthList", list3);
		
		List<String> list4=new ArrayList<String>();
		list4.add("No Change");
		list4.add("Decrease");
		model.addAttribute("assetsChangeList", list4);
	}

	public static void createContact(Model model) {
		ContactInfoDTO contact = new ContactInfoDTO();
		model.addAttribute("contactForm", contact);
	}

	public static void populateContactModel(Model model) {
				
		Map<String, String> state = new LinkedHashMap<String, String>();
		state.put("IN", "Indiana");
		state.put("MA", "Maine");
		state.put("WI", "Wisconsin");
		state.put("TE", "Texas");
		model.addAttribute("stateList", state);
	}
}
