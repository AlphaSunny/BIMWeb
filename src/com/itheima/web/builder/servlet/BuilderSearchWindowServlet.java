package com.itheima.web.builder.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.itheima.domain.Window;
import com.itheima.service.BuilderService;
import com.itheima.vo.Condition;

public class BuilderSearchWindowServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String,String[]> properties = request.getParameterMap();
		Condition condition = new Condition();
		try {
			BeanUtils.populate(condition, properties);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		
		BuilderService service = new BuilderService();
		
		List<Window> windowList = service.findWindowListByCondition(condition);
		
		request.setAttribute("windowList", windowList);
		
		request.getRequestDispatcher("/builderAdmin/product/list.jsp").forward(request, response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}