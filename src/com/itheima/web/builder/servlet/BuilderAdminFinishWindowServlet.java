package com.itheima.web.builder.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.service.BuilderService;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class BuilderAdminFinishWindowServlet extends HttpServlet {
	//in this method, the builder can change the state of the window if they have finished it
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String wid=request.getParameter("wid");
		System.out.println(wid);
		BuilderService service=new BuilderService();
		service.finishWindow(wid);
		
		response.sendRedirect(request.getContextPath()+"/builderAdminWindowList");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
