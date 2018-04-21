package com.mall.admin.member.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mall.admin.login.controller.AdminLoginController;
import com.mall.admin.member.entity.MemberEntity;
import com.mall.admin.member.service.MemberService;

@Controller
@RequestMapping("member/")
public class MemberController {
    
    private Logger logger = LoggerFactory.getLogger(AdminLoginController.class);
 
    @Autowired
    private MemberService memberService;
    
    @RequestMapping("list")
    public String memManageView(Model model, MemberEntity member){
        logger.info("memberManage LIST Page");
        
        int page = 1;
        member.setPage(page);
        
        model.addAttribute("memberList",memberService.getMemberList(member));
        return "member/list";
    }
}
