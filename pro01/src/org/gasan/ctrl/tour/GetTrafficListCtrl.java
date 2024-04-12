package org.gasan.ctrl.tour;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.gasan.dao.TrafficDAO;
import org.gasan.dto.Traffic;
import org.gasan.dto.TrafficVO;

@WebServlet("/GetTrafficList.do")
public class GetTrafficListCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GetTrafficListCtrl() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TrafficDAO dao = new TrafficDAO();
		List<Traffic> tList = dao.getTrafficList();
		List<TrafficVO> voList = dao.getTab();
		request.setAttribute("tList", tList);
		request.setAttribute("voList", voList);
		RequestDispatcher view = request.getRequestDispatcher("/tour/trafficList.jsp");
		view.forward(request, response);
	}
}
