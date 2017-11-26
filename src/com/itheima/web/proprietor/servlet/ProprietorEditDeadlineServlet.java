package com.itheima.web.proprietor.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.service.ProprietorService;

public class ProprietorEditDeadlineServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String wid = request.getParameter("wid");
		String wdeadline = request.getParameter("wdeadline");
		
		ProprietorService service= new ProprietorService();
		service.editDeadline(wid,wdeadline);
		
		response.sendRedirect(request.getContextPath()+"/proprietorAdminWindowList");
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
