package com.mall.admin.member.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mall.admin.member.mapper.AdminDao;
import com.mall.admin.member.service.AdminService;

@Controller
public class AdminController1 {
	
	@Inject
	AdminDao AdminDao;
	
	@RequestMapping("/admin/test")
	public ModelAndView test(ModelAndView mav) {
		
		int count = AdminDao.test();
		mav.addObject("testCount", count);
		mav.setViewName("/admin/test");
		
		return mav;
	}

}
