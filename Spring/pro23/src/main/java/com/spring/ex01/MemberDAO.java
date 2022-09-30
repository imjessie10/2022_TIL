package com.spring.ex01;

import java.io.Reader;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MemberDAO {
	
	public static SqlSessionFactory sqlMapper = null;

	private static SqlSessionFactory getInstance() {
		if (sqlMapper == null) {
			try {
				String resource = "mybatis/SqlMapConfig.xml";
				Reader reader = Resources.getResourceAsReader(resource);
				
				sqlMapper = new SqlSessionFactoryBuilder().build(reader);
				
				reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sqlMapper;

	}

	public List<MemberVO> selectAllMemberList() {
		List<MemberVO> memlist = null;
		
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		
		memlist = session.selectList("mapper.member.selectAllMemberList");
		
		return memlist;
	}
	
	
	/*09/30 실습*/
	public String  selectName() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		
		String name = session.selectOne("mapper.member.selectName");
		
		return name;
	} 
		
	public String  selectPwd() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		
		String pwd = session.selectOne("mapper.member.selectPwd");
		
		return pwd;
	}

	public List<Map> selectAllMemberList2() {
		List<Map> list = null;
		
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		
		list = session.selectList("mapper.member.selectAllMemberList2");
		
		return list;
	}
	
}
