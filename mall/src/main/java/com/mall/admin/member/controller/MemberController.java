package com.mall.admin.member.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mall.admin.member.entity.MemberEntity;
import com.mall.admin.member.service.MemberService;

@Controller
@RequestMapping("member/")
public class MemberController {
    
    private Logger logger = LoggerFactory.getLogger(MemberController.class);
 
    @Autowired
    private MemberService memberService;
    
    @RequestMapping("list")
    public ModelAndView memManageView(MemberEntity member){
        ModelAndView mav = new ModelAndView("/admin/member/list");
        logger.info("memberManage LIST Page");
        
        int page = 1;
        member.setPage(page);
        
        mav.addObject("memberList", memberService.getMemberList(member));
        return mav;
    }
    
    @RequestMapping("detail")
    public ModelAndView memDetailView(MemberEntity member) {
        ModelAndView mav = new ModelAndView("/admin/member/detail");
        
        mav.addObject("memberInfo", memberService.getMember(member));
        return mav;
    }
}
