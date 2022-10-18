package com.spring.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.member.service.MemberService;

@Controller
public class MemberController {
	
	MemberController(){
		System.out.println("MemberController 생성");
	}
	
	//@Autowired 객체를 찾는 순서
	/*	1개일 때: 그 객체를 사용
	 * 	2개 이상
	 * 	- @Primary가 있는 객체 우선
	 * 	- @Qualifier가 없는 경우: 변수명과 bean의 id가 같은 객체를 찾는다 (없으면 에러) 
	 * 	- @Qualifier가 있는 경우: 지정한 객체를 찾음
	 * 
	 * 실행순서가 어떻게 되는지 생성자 만들어서 해봄
	    load-on-startup 때문에
		DispatcherServlet 실행
		하면서 config파일인 servlet-context.xml 실행
		<context:component-scan base-package="com.spring" />
		scan하면서 필요한
		컨트롤러, 서비스, dao 생성 및 주입
	 * */
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping("/member/listMembers.do")
	public String listMembers() {
		memberService.listMembers();
		
		return "loginForm";
	}
	
	
}
