package com.mall.admin.login.service;

import javax.servlet.http.HttpSession;

import com.mall.admin.member.entity.AdminMember;

public interface LoginService {
	
	public int login(AdminMember entity);
	
	public void logout(HttpSession session);
	
	public int test1();

}
