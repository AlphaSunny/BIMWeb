package com.itheima.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.itheima.domain.Window;
import com.itheima.utils.DataSourceUtils;
import com.itheima.vo.Condition;

public class BidderDao {

	
	// to find all the window from the dabatbase
	public List<Window> findAllWindow() throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql= "select * from window";
		List<Window> windowList = runner.query(sql, new BeanListHandler<Window>(Window.class));
		return windowList;
	}

	public List<Window> findWindowListByCondition(Condition condition) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		List<String> list = new ArrayList<String>();
		String sql = "select * from window where 1=1 ";
		if(condition.getWfloor()!=null&&!condition.getWfloor().trim().equals("")){
			sql += " and wfloor=? ";
			list.add(condition.getWfloor());
		}if(condition.getIsFinished()!=null&&!condition.getIsFinished().trim().equals("")){
			sql += " and wstate=? ";
			list.add(condition.getIsFinished());
		}if(condition.getWdateFrom()!=null&&!condition.getWdateFrom().trim().equals("")&&condition.getWdateTo()!=null&&!condition.getWdateTo().trim().equals("")){
			sql += " and wdeadline>=? and wdeadline<=? ";
			list.add(condition.getWdateFrom());
			list.add(condition.getWdateTo());
		}
		
		List<Window> windowList = runner.query(sql, new BeanListHandler<Window>(Window.class),list.toArray());
		return windowList;

	}
	
	

}
