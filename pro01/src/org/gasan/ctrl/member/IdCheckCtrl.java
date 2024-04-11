package org.gasan.ctrl.member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.gasan.dao.MemberDAO;
import org.gasan.dto.Member;
import org.json.JSONObject;

@WebServlet("/IdCheck.do")
public class IdCheckCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public IdCheckCtrl() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		boolean pass = false;
		MemberDAO dao = new MemberDAO();
		pass = dao.idCheck(id);
		
		JSONObject json = new JSONObject();
		json.put("result", pass);
		PrintWriter out = response.getWriter();
		out.println(json.toString());
	}

}
