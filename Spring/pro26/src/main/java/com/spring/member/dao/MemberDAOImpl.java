package com.spring.member.dao;

import org.springframework.stereotype.Repository;

@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO {
	
	MemberDAOImpl(){
		System.out.println("MemberDAOImpl 생성");
	}
	
	@Override
	public void selectAllMemberList() {
		System.out.println("MemberDAOImpl > selectAllMemberList 실행");
	}

}
