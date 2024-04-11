package org.gasan.ctrl.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.gasan.dao.MemberDAO;

@WebServlet("/DelMember.do")
public class DelMemberCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DelMemberCtrl() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String id = request.getParameter("id");
		MemberDAO dao = new MemberDAO();
		int cnt = dao.memberOut(id);
		
		HttpSession session = request.getSession(); 
		
		if(cnt>0) {
			session.invalidate();
			response.sendRedirect("/pro01");
		} else {
			response.sendRedirect("/EditMember.do?id="+id);
		}
	}
}
