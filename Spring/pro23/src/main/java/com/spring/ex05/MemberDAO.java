package com.spring.ex05;

import java.io.Reader;
import java.util.List;

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

	public List<MemberDTO> selectAllMemList() {
		
		System.out.println("selectAllMemList 실행");
		
		List<MemberDTO> memlist = null;
		
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		
		memlist = session.selectList("mapper.member.selectAllMemList");
		
		return memlist;
	}
	
	public int insertMem(MemberDTO dto) {
		
		System.out.println("insertMem 실행");
		
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		
		int result = 0;
		result = session.insert("mapper.member.insertMember", dto);
		session.commit();
		
		System.out.println(result);
		
		return result;
	}
	
	public MemberDTO selectMemById(String id) {

		System.out.println("selectMemById 실행");
		
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		
		MemberDTO dto = session.selectOne("mapper.member.selectMemById", id);
		
		return dto;
	}
	
	public int updateMem(MemberDTO dto) {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		int result = session.update("mapper.member.updateMem", dto);
		session.commit();
		return result;
	}
	
    public int deleteMem(String id) {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		int result = 0;
		result = session.delete("mapper.member.deleteMem", id);
		session.commit();
		return result;
    }
    
    public List<MemberDTO>  searchMember(MemberDTO  dto){
        sqlMapper=getInstance();
        SqlSession session=sqlMapper.openSession();
        List list=session.selectList("mapper.member.searchMember",dto);
        return list;		
    }
    
    public int delCheck (List clist) {
        sqlMapper=getInstance();
        SqlSession session=sqlMapper.openSession();
        int result = 0;
        result =session.delete("mapper.member.delCheck",clist);
        session.commit();
        return result;	
    }

}
