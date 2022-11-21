package com.example.mybook1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		System.out.println("hello world");
		return "<h1>hello world</h1>";
	}
	
	@RequestMapping("/human")
	public String human(
			@RequestParam("id") String id
			, Model model
			) {
		System.out.println("/human");
		
		model.addAttribute("human", id);
		
		return "human";
	}
	
}
