package com.myspring.sub27.member.dao;

import java.util.List;
import java.util.Map;

public interface MemberDAO {
	
	public List selectMember();

	public List selectDeptno(int dno);
	
	public List selectEname(String ename);
	
	public List selectSal(Map smap);
	
	
}
