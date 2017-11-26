package com.itheima.service;

import java.sql.SQLException;
import java.util.List;

import com.itheima.dao.BuilderDao;
import com.itheima.domain.Window;
import com.itheima.vo.Condition;

public class BuilderService {

	public void finishWindow(String wid) {
//		 which is comes from the BuilderAdminFinishWindowServlet, the method for
//		builder to make sure if they have finished the window
		BuilderDao dao=new BuilderDao();
		try {
			dao.finishWindow(wid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public List<Window> findAllWindows() {
		//which is comes from BuilderAdminWindowListServlet, 
		//the method for builder to see all the windows the building have
		BuilderDao dao=new BuilderDao();
		List<Window> windowList=null;
		try {
			windowList = dao.findAllWindows();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return windowList;
	}

	public void editDesc(String wid, String wdesc) {
		BuilderDao dao = new BuilderDao();
		try {
			dao.editDesc(wid,wdesc);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public List<Window> findWindowListByCondition(Condition condition) {
		// find the window by condition
		BuilderDao dao = new BuilderDao();
		List<Window> windowList = null;
		try {
			windowList = dao.findWindowListByCondition(condition);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return windowList;
	}

	public Window findWindowById(String wid) {
		// to show the specified information of the window
		BuilderDao dao = new BuilderDao();
		Window window = null;
		try {
			window = dao.findWindowById(wid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return window;
	}

}
