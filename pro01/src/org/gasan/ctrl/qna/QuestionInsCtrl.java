package org.gasan.ctrl.qna;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.gasan.dao.QnaDAO;
import org.gasan.dto.Qna;

@WebServlet("/QuestionIns.do")
public class QuestionInsCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public QuestionInsCtrl() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		HttpSession session = request.getSession();
		
		String aid = (String) session.getAttribute("sid");
		
		Qna qna = new Qna();
		qna.setTitle(request.getParameter("title"));
		qna.setContent(request.getParameter("content"));
		qna.setAid(aid);
		QnaDAO dao = new QnaDAO();
		int cnt = dao.insQuestion(qna);
		
		if(cnt>=1) {
			response.sendRedirect("/pro01/GetQnaList.do");
		} else {
			response.sendRedirect("/qna/qIns.jsp");
		}
	}

}
