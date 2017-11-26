package com.itheima.service;

import java.sql.SQLException;
import java.util.List;

import com.itheima.dao.ProprietorDao;
import com.itheima.domain.Window;
import com.itheima.vo.Condition;

public class ProprietorService {

	public List<Window> findAllWindows() {
		ProprietorDao dao=new ProprietorDao();
		List<Window> windowList=null;
		try {
			windowList = dao.findAllWindows();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return windowList;
	}

	public void finishWindow(String wid) {
		// to update the database
		
	}

	public void editDesc(String wid, String wdesc) {
		// the proprietor can update the description here
		
		ProprietorDao dao = new ProprietorDao();
		try {
			dao.editDesc(wid, wdesc);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

		//give the proprietor a method to search the window by the condition
	public List<Window> findWindowListByCondition(Condition condition) {
			
		ProprietorDao dao = new ProprietorDao();
		List<Window> windowList = null;
		try {
			windowList= dao.findWindowListByCondition(condition);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return windowList;
	}

	public void editPrice(String wid, String wprice) {
		// TODO Auto-generated method stub
		ProprietorDao dao = new ProprietorDao();
		try {
			dao.editPrice(wid, wprice);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void editDeadline(String wid, String wdeadline) {
		// TODO Auto-generated method stub
		
		ProprietorDao dao = new ProprietorDao();
		try {
			dao.editDeadline(wid,wdeadline);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
