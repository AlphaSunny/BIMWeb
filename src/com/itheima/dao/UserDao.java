package com.itheima.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.itheima.domain.User;
import com.itheima.utils.DataSourceUtils;

public class UserDao {

	public Long checkProprietorIsTrue(User user) throws SQLException {
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		//check if the proprietor is true in the database
		String sql="select count(*) from proprietor where username=? and password=?";
		
		Long query = (Long) runner.query(sql, new ScalarHandler(), user.getUsername(),user.getPassword());
		
		return query;
	}

	public Long checkBuilderIsTrue(User user) throws SQLException {
		// check if the proprietor is true in the database
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		
		String sql="select count(*) from builder where username=? and password=?";
		
		Long query = (Long) runner.query(sql, new ScalarHandler(), user.getUsername(),user.getPassword());
		
		return query;
		
		
	}

	public Long checkBidderIsTrue(User user) throws SQLException {
		// check if the bidder is true
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		
		String sql="select count(*) from bidder where username=? and password=?";
		
		Long query = (Long) runner.query(sql, new ScalarHandler(), user.getUsername(),user.getPassword());
		
		return query;
	}

}
