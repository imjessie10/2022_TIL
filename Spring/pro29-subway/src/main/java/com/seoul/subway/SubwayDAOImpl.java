package com.seoul.subway;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SubwayDAOImpl implements SubwayDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	public int insert(SubwayDTO sDTO) {
		return sqlSession.insert("mapper.subway.insert", sDTO);
	}
}
