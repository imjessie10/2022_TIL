package com.spring.ex04;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.spring.ex01.MemberVO;

/**
 * Servlet implementation class MemberServlet
 */
@WebServlet("/mem4")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		MemberDAO dao = new MemberDAO();
		MemberVO memberVO = new MemberVO();
		
		String id=request.getParameter("id");
        String pwd=request.getParameter("pwd");
        String name=request.getParameter("name");
        String email = request.getParameter("email");
        memberVO.setId(id);
        memberVO.setPwd(pwd);
        memberVO.setName(name);
        memberVO.setEmail(email);
        dao.insertMember(memberVO);
        
		List<MemberVO> memList = dao.selectAllMemberList();
		request.setAttribute("memList", memList);
		
		RequestDispatcher dispatch = request.getRequestDispatcher("/test04/listMem.jsp");
		dispatch.forward(request,response);
	}
		
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
}
