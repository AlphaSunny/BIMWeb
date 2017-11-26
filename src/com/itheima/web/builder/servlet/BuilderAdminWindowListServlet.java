package com.itheima.web.builder.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.domain.Window;
import com.itheima.service.BuilderService;


public class BuilderAdminWindowListServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BuilderService service=new BuilderService();
		//the proprietor manager the window
		List<Window> windowList=service.findAllWindows();
		
		request.setAttribute("windowList", windowList);
		request.getRequestDispatcher("/builderAdmin/product/list.jsp").forward(request,response);
	}
	

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
