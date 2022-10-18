package com.spring.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.member.dao.MemberDAO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	
	MemberServiceImpl(){
		System.out.println("MemberServiceImpl 생성");
	}
	
	@Autowired
	MemberDAO memberDAO;
	
	@Override
	public void listMembers() {
		System.out.println("MemberServiceImpl > listMembers 실행");		
		
		memberDAO.selectAllMemberList();
		
	}
	
}
