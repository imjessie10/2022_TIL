package com.example.mybook3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpController {
	
	@Autowired
	EmpDAO empDAO;
	
	@RequestMapping("/emp")
	public String emp(Model model) {
		System.out.println("/emp");
		
		List list = empDAO.selectEmp();
		model.addAttribute("list", list);
		
		return "list";
	}
	
	
}
