package com.spring.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService{
	
	@Autowired
	TestDAO testDAO;
	
	public List getList() {
		return testDAO.selectEMP();
	}
}
