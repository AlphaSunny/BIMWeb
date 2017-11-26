package com.itheima.web.proprietor.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.domain.Window;
import com.itheima.service.ProprietorService;

public class ProprietorAdminWindowListServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProprietorService service=new ProprietorService();
		//the proprietor manager the window
		List<Window> windowList=service.findAllWindows();
		
		request.setAttribute("windowList", windowList);
		request.getRequestDispatcher("/proprietorAdmin/product/list.jsp").forward(request,response);
	}
	

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
