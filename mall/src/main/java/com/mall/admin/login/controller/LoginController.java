package com.mall.admin.login.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mall.admin.login.mapper.LoginDao;
import com.mall.admin.login.service.LoginService;
import com.mall.admin.member.entity.AdminMember;

@Controller
@RequestMapping("/admin/login")
public class LoginController {
	
	@Inject
	private LoginService loginService;
//	private LoginDao loginDao;

	private Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	
	//로그인 화면 호출
	@RequestMapping(value="")
	public ModelAndView index(ModelAndView mav) {
	    logger.info("Admin login page!");
	    
	    mav.setViewName("/admin/login");

		return mav;
	}
	
	//로그인 실행
	@RequestMapping(params= "action=login")
	public ModelAndView login(ModelAndView mav, AdminMember entity) {
	    logger.info("Admin login Process!");
	    
	    String msg = "-";

	    String id = entity.getAdminID();
	   String pwd = entity.getAdminPassword();
	   
	    System.out.println(id  +"\n"+ pwd);
	    
	    int test = loginService.test1();

	    System.out.println(test);
//	    int login = loginService.login(entity);
//	    
//	    System.out.println(login);
//
//	    
//	    if(login == 2 ) {
//	    	msg = "로그인 성공";
//	    	
//	    	mav.setViewName("/admin/index");
//	    }
//	    else {
//	    	msg = "로그인 실패";
//	    	mav.setViewName("redirect:/admin/login");
//	    }
//	    
//	    mav.addObject("msg", msg);
	   
		
		return mav;
	}
	
	
}
