package com.mall.admin.member.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mall.admin.member.mapper.AdminDao;

@Controller
public class AdminController1 {
	
	@Inject
	AdminDao adminDao;
	
	@RequestMapping("/admin/test")
	public ModelAndView test(ModelAndView mav) {
		
		int count = adminDao.test();
		mav.addObject("testCount", count);
		mav.setViewName("/admin/test");
		
		return mav;
	}

}
