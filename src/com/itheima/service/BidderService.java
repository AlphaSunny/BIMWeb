package com.itheima.service;

import java.sql.SQLException;
import java.util.List;

import com.itheima.dao.BidderDao;
import com.itheima.domain.Window;
import com.itheima.vo.Condition;

public class BidderService {

	
	//find all the window for the bidder
	public List<Window> findAllWindows() {
		BidderDao dao = new BidderDao();
		List<Window> windowList = null;
		try {
			windowList = dao.findAllWindow();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return windowList;
	}

	public List<Window> findWindowListByCondition(Condition condition) {
		BidderDao dao = new BidderDao();
		List<Window> windowList = null;
		try {
			windowList = dao.findWindowListByCondition(condition);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return windowList;
	}
	

}
