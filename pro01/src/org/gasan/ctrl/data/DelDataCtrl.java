package org.gasan.ctrl.data;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.gasan.dao.DataDAO;

@WebServlet("/DelNotice.do")
public class DelDataCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DelDataCtrl() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		int no = Integer.parseInt(request.getParameter("no"));
		
		DataDAO dao = new DataDAO();
		int cnt = dao.delData(no);
		
		if(cnt>0) {
			response.sendRedirect("/pro01/DataList.do");
		} else {
			response.sendRedirect("/pro01/GetData2.do?no="+no);
		}
	}

}
