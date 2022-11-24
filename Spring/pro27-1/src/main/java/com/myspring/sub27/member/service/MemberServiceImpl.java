package com.myspring.sub27.member.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myspring.sub27.member.dao.MemberDAO;
import com.myspring.sub27.member.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDAO memberDAO;
	
	@Override
	public List<MemberDTO> getMemberList() {
		//list로 받아서 써도되고 그냥 이렇게 리턴해줘도 됨 
		return memberDAO.selectMember();
	}

	@Override
	public List<MemberDTO> getDeptnoList(int dno) {
		return memberDAO.selectDeptno(dno);
	}

	@Override
	public List<MemberDTO> getEnameList(String ename) {
		return memberDAO.selectEname(ename);
	}

	@Override
	public List<MemberDTO> getSalList(Map smap) {
		return memberDAO.selectSal(smap);
	}


	
	
}
