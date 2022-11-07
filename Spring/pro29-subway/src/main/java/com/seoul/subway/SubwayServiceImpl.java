package com.seoul.subway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubwayServiceImpl implements SubwayService {
	
	@Autowired
	SubwayDAO subwayDAO;
	
	public int addSubway(SubwayDTO sDTO) {
		return subwayDAO.insert(sDTO); 
	}
}
