package com.itheima.web.proprietor.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.service.ProprietorService;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class ProprietorAdminFinishWindowServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String wid=request.getParameter("wid");
		System.out.println(wid);
		ProprietorService service=new ProprietorService();
		service.finishWindow(wid);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
