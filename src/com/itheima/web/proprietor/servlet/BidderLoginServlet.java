package com.itheima.web.proprietor.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.domain.User;
import com.itheima.service.UserService;

public class BidderLoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		
		User user=new User();
		user.setUsername(username);
		user.setPassword(password);
		
		UserService service=new UserService();
		boolean isTrue=service.checkBidderIsTrue(user);
		
		if(isTrue){
			response.getWriter().write("welcome");
		}else{
			response.getWriter().write("sorry");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}