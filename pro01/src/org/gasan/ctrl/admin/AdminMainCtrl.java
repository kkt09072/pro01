package org.gasan.ctrl.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AdminMain.do")
public class AdminMainCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdminMainCtrl() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		String loginId = (String) session.getAttribute("sid");
		if(!loginId.equals("admin")){
			response.sendRedirect("/pro01");
		} else {
			request.setAttribute("msg", "관리자 페이지입니다.");
			RequestDispatcher view = request.getRequestDispatcher("/admin/index.jsp");
			view.forward(request, response);
		}
	}
}
