package com.spring.ex02;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	// 926p 실습
	@RequestMapping(value = { "/test/loginForm.do", "/test/loginForm2.do" }, method = RequestMethod.GET )
	public ModelAndView loginForm(HttpServletRequest req) {
		
		String uri = req.getRequestURI();
		System.out.println("uri: "+uri);
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("uri", uri);
		mav.setViewName("loginForm");
		return mav;
	}
	
    @RequestMapping(value = "/test/login.do", method={RequestMethod.GET, RequestMethod.POST})
	public ModelAndView login(HttpServletRequest req) throws Exception {
    	
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("userID", req.getParameter("userID"));
		mav.addObject("userName",req.getParameter("userName"));
		mav.addObject("msg", "한글");	//필터가 리턴하는 것도 해주는지 한 번 넣어봄
		mav.setViewName("result");

		return mav;
	}
	
    @RequestMapping(value = "/test/login0.do")
    //method 안쓰면 제한이 없어서 다 받을 수 있음,get과 post 모두 허용
    //즉, method 명시해놨을 경우 다르게 보내면 안되는 것을 알 수 있음
	public ModelAndView login0(HttpServletRequest req) throws Exception {
    	
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("userID", req.getParameter("userID"));
		mav.addObject("userName",req.getParameter("userName"));
		mav.addObject("msg", "한글");	//필터가 리턴하는 것도 해주는지 한 번 넣어봄
		mav.setViewName("result");

		return mav;
	}
    
    // 928p,930p 실습
	@RequestMapping(value = "/test/login2.do", 
			method = { RequestMethod.GET, RequestMethod.POST })
		public ModelAndView login2(
				@RequestParam("userID") String userID, 
		        @RequestParam("userName") String userName,
		        @RequestParam(value="email", required=false) String email				
				) {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("userID", userID);
		mav.addObject("userName",userName);
		mav.addObject("email",email);
		mav.setViewName("result");
		
		return mav;
		}

	//932p map은 실무에선 잘 안쓰이긴함 왜? 값을 꺼낼때 뭐가 있는지 알고있어야하니까 그런경우가 아니면 뭐가 들어있는지 몰라서...DTO를 넣어서 함
	@RequestMapping(value = "/test/login3.do", 
			method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView login3(
			@RequestParam Map info){
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("info", info);
		mav.setViewName("result");
		
		return mav;
	}	
	
	//933p 두가지가 복합적으로 나온것
	//첫번째
//	@RequestMapping(value = "/test/login4.do", 
//			method = { RequestMethod.GET, RequestMethod.POST })
//	public ModelAndView login4(
//			@ModelAttribute LoginDTO loginDTO){
//		
//		System.out.println("login4.do 실행");
//		ModelAndView mav = new ModelAndView();
//		
//		mav.addObject("info", loginDTO);
//		mav.setViewName("result");
//		
//		return mav;
//	}
	//두번째(근데 이거보다는 위의 버전으로 많이 씀)
	@RequestMapping(value = "/test/login4.do", 
			method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView login4(
			@ModelAttribute("info") LoginDTO loginDTO){
			//괄호하고 이렇게 써주면
		
		System.out.println("login4.do 실행");
		ModelAndView mav = new ModelAndView();
		
		//addObject를 할 필요가 없어짐 
		mav.setViewName("result");
		
		return mav;
	}
	
	//935p
	@RequestMapping(value = "/test/login5.do", 
			method = { RequestMethod.GET, RequestMethod.POST })
		public String login5(
				Model model,
				@RequestParam("userID") String userID, 
		        @RequestParam("userName") String userName,
		        @RequestParam(value="email", required=false) String email				
				) {
		
		
		model.addAttribute("userID", userID);
		model.addAttribute("userName",userName);
		model.addAttribute("email",email);
		
		return "result";
		}
	
	// return String을 지원하는지 보기
	// 들어가짐
	@RequestMapping(value = "/test/login5_1.do", 
			method = { RequestMethod.GET, RequestMethod.POST })
		public String login5() {
			return "result";
		}
	//리턴이 널인 경우: 뷰리졸버를 타긴 타지만 기본값으로 자기주소로 들어감 리턴 안한것과 동일.즉 리턴 안한 것과 동일하게 됨
	
	
	
}
