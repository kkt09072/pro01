package org.gasan.ctrl.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Join.do")
public class JoinCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public JoinCtrl() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("msg", "<strong>회원정보를 입력하고, 아이디 중복검사를 진행해주시기 바랍니다.</strong>");
		RequestDispatcher view = request.getRequestDispatcher("/member/join.jsp");
		view.forward(request, response);
	}

}
