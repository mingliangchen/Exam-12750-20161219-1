package com.hand.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hand.service.CustomerService;




@Controller
@RequestMapping("/hand")
public class CustomerController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	CustomerService customerService;
	
	
	@RequestMapping(value = "/login")
	public String login(String first_name,Model model){
		if(first_name==null){
			return "/login";
		}
		Boolean f=customerService.login(first_name);
		if (f) {
			return "successLogin";
		}
		return "login";  //WEB-INF/jsp/list.jsp    look at spring-web.xml			
	}
	
}
