package com.spring.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@Autowired
	TestService testService;
	
	@RequestMapping(value="/emp", method=RequestMethod.GET)
	public @ResponseBody Map getList() {
		List list = testService.getList();
		Map map = new HashMap();
		map.put("list", list);
		
		return map;
	}
}
