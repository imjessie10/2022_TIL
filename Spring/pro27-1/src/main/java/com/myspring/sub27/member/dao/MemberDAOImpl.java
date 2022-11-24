package com.myspring.sub27.member.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myspring.sub27.member.dto.MemberDTO;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<MemberDTO> selectMember() {
		List<MemberDTO> list = sqlSession.selectList("mapper.member.selectAllMemberList");
		return list;
	}

	@Override
	public List<MemberDTO> selectDeptno(int dno) {
		List<MemberDTO> dnoList = sqlSession.selectList("mapper.member.selectDeptnoList", dno);
		return dnoList;
	}

	@Override
	public List selectEname(String ename) {
		List<MemberDTO> EnList = sqlSession.selectList("mapper.member.selectEnameList", ename);
		return EnList;
	}

	@Override
	public List selectSal(Map smap) {
		List<MemberDTO> sList = sqlSession.selectList("mapper.member.selectSalList", smap);
		return sList;
	}




	
}
