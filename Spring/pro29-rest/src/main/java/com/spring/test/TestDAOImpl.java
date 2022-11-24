package com.spring.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TestDAOImpl implements TestDAO {

	@Autowired
	SqlSession sqlSession;
	
	public List selectEMP() {
		return sqlSession.selectList("mapper.emp.selectList");
	}
		
}
