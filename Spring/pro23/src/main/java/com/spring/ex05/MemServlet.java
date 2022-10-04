package com.spring.ex05;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemServlet
 */
@WebServlet("/memTest")
public class MemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String action = request.getParameter("action");
		String nextPage = "";
		
		MemberDTO dto = new MemberDTO();
		MemberDAO dao = new MemberDAO();
		
		if (action == null || action.equals("viewList")) {
			List<MemberDTO> memList = dao.selectAllMemList();
			request.setAttribute("memList", memList);
			nextPage = "test05/viewList.jsp";
		}else if (action.equals("insertMem")) {
			String id=request.getParameter("id");
            String pwd=request.getParameter("pwd");
            String name=request.getParameter("name");
            String email = request.getParameter("email");
            dto.setId(id);
            dto.setPwd(pwd);
            dto.setName(name);
            dto.setEmail(email);
            dao.insertMem(dto);
            nextPage="/memTest?action=viewList"; 
		}else if (action.equals("detailMem")) {
			String id=request.getParameter("id");
			dto = dao.selectMemById(id);
			request.setAttribute("dmem", dto);
			nextPage="test05/detailMem.jsp"; 
		}else if(action.equals("goUpdateMem")) {
			String id=request.getParameter("id");
			dto = dao.selectMemById(id);
			request.setAttribute("umem", dto);
			System.out.println("modMem.jsp로 이동");
			nextPage="test05/modMem.jsp"; 
		} else if(action.equals("updateMem")){
	          String id=request.getParameter("id");
	          System.out.println(id);
	          String pwd=request.getParameter("pwd");
	          String name=request.getParameter("name");
	          String email = request.getParameter("email");
	          dto.setId(id);
	          dto.setPwd(pwd);
	          dto.setName(name);
	          dto.setEmail(email);
	          dao.updateMem(dto);
	          nextPage="/memTest?action=detailMem";     
	      }else if(action.equals("deleteMem")){
	  	      String id=request.getParameter("id");
		      dao.deleteMem(id);
		      nextPage="/memTest?action=viewList";
	      }else if(action.equals("searchMember")){
	          String name=request.getParameter("name");
	          String email=request.getParameter("email");
	          dto.setName(name);
	          dto.setEmail(email);
	          List<MemberDTO> membersList =dao.searchMember(dto);
	          System.out.println(membersList.size());
	          request.setAttribute("membersList",membersList);
	          nextPage="test05/searchResult.jsp";
	      }else if(action.equals("delCheck")) {
	    	  String[] delId = request.getParameterValues("check");
	    	  
//	    	  System.out.println(delId[0]+delId[1]);
	    	  
	    	  List idList = new ArrayList();
	    	  
	    	  for(String id : delId) {
	    		  idList.add(id);
	    	  }
	    	  
	    	  System.out.println(idList.size());
	    	  
	    	  int delResult = dao.delCheck(idList);
	    	  System.out.println("삭제 갯수: "+ delResult);
	    	  
	          nextPage="/memTest?action=viewList";
	      }
		
		RequestDispatcher dispatch = request.getRequestDispatcher(nextPage);
		dispatch.forward(request, response);
	}

}
