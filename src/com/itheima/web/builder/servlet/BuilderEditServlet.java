package com.itheima.web.builder.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.service.BuilderService;

public class BuilderEditServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String wid=request.getParameter("wid");
		String wdesc=request.getParameter("wdesc");
		
		BuilderService service = new BuilderService();
		service.editDesc(wid,wdesc);
		
		response.sendRedirect(request.getContextPath()+"/builderAdminWindowList");
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}