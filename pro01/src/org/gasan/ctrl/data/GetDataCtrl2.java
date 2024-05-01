package org.gasan.ctrl.data;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.gasan.dao.DataDAO;
import org.gasan.dto.Data;

@WebServlet("/GetData2.do")
public class GetDataCtrl2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GetDataCtrl2() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		int no = Integer.parseInt(request.getParameter("no"));
		
		DataDAO dao = new DataDAO();
		Data data = dao.getData2(no);
		
		request.setAttribute("data", data);
		RequestDispatcher view = request.getRequestDispatcher("/data/getData.jsp");
		view.forward(request, response);
		
	}

}
