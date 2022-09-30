package com.spring.ex03;

public class MemberDAOImpl implements MemberDAO {
	
	MemberDAOImpl(){
		System.out.println("MemberDAOImpl 생성자 실행");
	}

	@Override
	public void listMembers() {
		System.out.println("MemberDAOImpl > listMembers 실행 ");
	}

}
