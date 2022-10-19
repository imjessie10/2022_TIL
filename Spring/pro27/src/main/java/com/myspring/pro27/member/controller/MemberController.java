package com.myspring.pro27.member.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.myspring.pro27.member.dto.MemberDTO;
import com.myspring.pro27.member.service.MemberService;


@Controller
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	MemberService memberService;

	@RequestMapping(value="/member/listMembers.human", method=RequestMethod.GET)
	public ModelAndView listMembers() {
		ModelAndView mav = new ModelAndView();
		
		
		List<MemberDTO> list = memberService.getMemberList();
		logger.info("list size" + list.size());
		
		mav.addObject("list", list);
		mav.setViewName("list");
		
		return mav;
	}
	
	
	@RequestMapping(value="/member/listMembers", method=RequestMethod.GET)
	public String listMembers2(Model model) {
		
		List<MemberDTO> list = memberService.getMemberList();
		model.addAttribute("list",list);
		
		return "list";
	}
}
