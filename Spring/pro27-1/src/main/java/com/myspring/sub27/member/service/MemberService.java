package com.myspring.sub27.member.service;

import java.util.List;
import java.util.Map;

import com.myspring.sub27.member.dto.MemberDTO;

public interface MemberService {
	
	List<MemberDTO> getMemberList();

	List<MemberDTO> getDeptnoList(int dno);
	
	List<MemberDTO> getEnameList(String ename);

	List<MemberDTO> getSalList(Map smap);
}
