package com.myspring.sub27.member.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.myspring.sub27.member.dto.MemberDTO;
import com.myspring.sub27.member.service.MemberService;


@Controller
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	MemberService memberService;
	
	//전체멤버 조회
	@RequestMapping(value="/member/listMembers", method=RequestMethod.GET)
	public String listMembers(Model model) {
		
		logger.info("listMembers 실행");
		
		List<MemberDTO> list = memberService.getMemberList();
		model.addAttribute("dto",list);
		
		return "firstPage";
	}
	
	//부서번호(숫자로) 조회
	@RequestMapping(value="/member/listDnos", method= {RequestMethod.GET, RequestMethod.POST} )
	public String listDnos(Model model, 
			@RequestParam(value="deptno") 
			int dno 
			) {

		logger.info("listDnos 실행");
		
		List<MemberDTO> list = memberService.getDeptnoList(dno);
		model.addAttribute("dto",list);
		
		return "secondPage";
	}
	
	//이름 조회 
	@RequestMapping(value="/member/listEns", method= {RequestMethod.GET, RequestMethod.POST} )
	public String listEns(Model model, 
			@RequestParam(value="ename") String ename ) {

		logger.info("listEns 실행");
		
		List<MemberDTO> list = memberService.getEnameList(ename);
		model.addAttribute("dto",list);
		
		return "secondPage";
	}
	
	//sal 조회
//	@RequestMapping(value="/member/listSals", method= {RequestMethod.GET, RequestMethod.POST} )
//	public ModelAndView listSals(@RequestParam Map info ) {
//
//		logger.info("listSals 실행");
//		
//		ModelAndView mav = new ModelAndView();
//		
//		List<MemberDTO> list = memberService.getSalList(info);
//		
//		mav.addObject("dto", list);
//		
//		mav.setViewName("secondPage");
//		
//		return mav;
//	}
	//sal 조회
	@RequestMapping(value="/member/listSals", method= {RequestMethod.GET, RequestMethod.POST} )
	public String listSals(Model model, 
			@RequestParam Map info ) {

		logger.info("listSals 실행");
		
		List<MemberDTO> list = memberService.getSalList(info);
		
		model.addAttribute("dto", list);
		
		return "secondPage";
	}
	
	//체크조회

	
	
}
