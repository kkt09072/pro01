package org.gasan.ctrl.qna;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.gasan.dao.QnaDAO;
import org.gasan.dto.Qna;

@WebServlet("/EditProQna.do")
public class EditProQnaCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EditProQnaCtrl() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		int no = Integer.parseInt(request.getParameter("no"));
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		Qna qna = new Qna();
		qna.setNo(no);
		qna.setTitle(title);
		qna.setContent(content);
		
		QnaDAO dao = new QnaDAO();
		int cnt = dao.editProQna(qna);
		
		if(cnt>=1) {
			response.sendRedirect("/pro01/GetQnaList.do");
		} else {
			response.sendRedirect("/pro01/GetQna.do?no="+no);
		}
	}

}
