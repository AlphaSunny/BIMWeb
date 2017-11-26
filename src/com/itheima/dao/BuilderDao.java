package com.itheima.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.itheima.domain.Window;
import com.itheima.utils.DataSourceUtils;
import com.itheima.vo.Condition;

public class BuilderDao {

	public List<Window> findAllWindows() throws SQLException {
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from window";
		 List<Window> windowList=runner.query(sql, new BeanListHandler<Window>(Window.class));
		return windowList;
	}

	public void finishWindow(String wid) throws SQLException {
		// which is comes from BuilderService, to directly 
		QueryRunner runner= new QueryRunner(DataSourceUtils.getDataSource());
		String sql="update window set wstate=1 where wid=?";
		runner.update(sql,wid);
		
	}

	public void editDesc(String wid, String wdesc) throws SQLException {
		// which is come from BuilderService, to edit the description of the matrial
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select wdesc from window where wid = ?";
		String get = (String) runner.query(sql,new ScalarHandler(), wid);
		String edit=wdesc;
		String finalDesc = get + " " + edit;
		
		//update the desc
		String sql_2 = "update window set wdesc = ? where wid = ? ";
		runner.update(sql_2,finalDesc,wid);
		
		
		
	}

	public List<Window> findWindowListByCondition(Condition condition) throws SQLException {
		// to find the window by condition
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

	public Window findWindowById(String wid) throws SQLException {
		// select the window by id 
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from window where wid = ?";
		Window window= runner.query(sql, new BeanHandler<Window>(Window.class), wid);
		return window;
	}

}
