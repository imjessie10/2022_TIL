package com.spring.ex03;

public class MemberServiceImpl implements MemberService {

	MemberDAO memberDAO;
	
	MemberServiceImpl(){
		System.out.println("MemberServiceImpl 생성자 실행");
	}
	
	@Override
	public void setMemberDAO(MemberDAO dao) {
		
		System.out.println("setMemberDAO 실행");
		this.memberDAO = dao;
		
	}

	@Override
	public void callListMembers() {
		
		System.out.println("MemberDAOImpl > callListMembers 실행");
		memberDAO.listMembers();
		
	}

}
