package com.itheima.web.proprietor.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.service.BuilderService;
import com.itheima.service.ProprietorService;

public class ProprietorEditServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String wid=request.getParameter("wid");
		String wdesc=request.getParameter("wdesc");
		
		ProprietorService service = new ProprietorService();
		service.editDesc(wid,wdesc);
		
		response.sendRedirect(request.getContextPath()+"/proprietorAdminWindowList");
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}