package org.gasan.ctrl.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.gasan.dao.MemberDAO;
import org.gasan.dto.Member;

@WebServlet("/MemberList.do")
public class MemberListCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MemberListCtrl() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		String loginId = (String) session.getAttribute("sid");
		if(!loginId.equals("admin")){
			response.sendRedirect("/pro01");
		}
		
		MemberDAO dao = new MemberDAO();
		
		List<Member> memList = dao.getMemberList();
		request.setAttribute("memList", memList);
		
		RequestDispatcher view = request.getRequestDispatcher("/admin/memberList.jsp");
		view.forward(request, response);
	}

}
