package com.spring.ex04;

import java.io.Reader;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.spring.ex01.MemberVO;

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

	public int insertMember(MemberVO vo) {
		
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		
		int result = 0;
		result = session.insert("mapper.member.insertMember", vo);
		session.commit();
		
		/*오토커밋- SqlSession session = sqlMapper.openSession(true); 트루값을 주면 됨*/
		
		System.out.println(result);
		
		return result;
	}

	public List<MemberVO> selectAllMemberList() {
		
		List<MemberVO> memlist = null;
		
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		
		memlist = session.selectList("mapper.member.selectAllMemberList");
		
		return memlist;
	}
	
	
	
	
}
