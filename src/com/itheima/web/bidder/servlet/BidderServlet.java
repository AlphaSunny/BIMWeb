package com.itheima.web.bidder.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.itheima.domain.User;
import com.itheima.domain.Window;
import com.itheima.service.BidderService;
import com.itheima.service.BuilderService;
import com.itheima.service.UserService;
import com.itheima.vo.Condition;

public class BidderServlet extends BaseServlet {

	public void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		
		User user=new User();
		user.setUsername(username);
		user.setPassword(password);
		
		UserService service=new UserService();
		boolean isTrue=service.checkBuilderIsTrue(user);
		
		if(isTrue){
			response.sendRedirect(request.getContextPath()+"/bidderAdmin/home.jsp");
		}else{
			response.getWriter().write("sorry");
		}
	}
	
	public void windowList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BidderService service=new BidderService();
		//the proprietor manager the window
		List<Window> windowList=service.findAllWindows();
		
		request.setAttribute("windowList", windowList);
		request.getRequestDispatcher("/bidderAdmin/product/list.jsp").forward(request,response);
			
	}
	

	public void searchWindow(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//the proprietor manager the window
		Map<String,String[]> properties = request.getParameterMap();
		Condition condition = new Condition();
		try {
			BeanUtils.populate(condition, properties);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		
		BidderService service=new BidderService();
		
		List<Window> windowList = service.findWindowListByCondition(condition);
		
		request.setAttribute("windowList", windowList);
		
		request.getRequestDispatcher("/bidderAdmin/product/list.jsp").forward(request, response);
			
	}
}
	
	
