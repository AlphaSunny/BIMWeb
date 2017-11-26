package com.itheima.web.builder.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.domain.Window;
import com.itheima.service.BuilderService;

public class WindowInfoServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String wid =  request.getParameter("wid");
		
		BuilderService service = new BuilderService();
		
		Window window = service.findWindowById(wid);
		
		request.setAttribute("window", window);
		
		
		request.getRequestDispatcher("/window_info.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}