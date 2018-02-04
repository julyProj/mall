package com.mall.admin;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mall.shop.HomeController;

@Controller
public class AdminController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@RequestMapping(value = "/admin/login", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
	    logger.info("Admin login page!");
		
		return "/admin/login";
	}
	
	@RequestMapping(value = "/admin/index", method = RequestMethod.GET)
	public String index(Locale locale, Model model) {
	    logger.info("Welcome Admin!");
		
		return "/admin/index";
	}
}
