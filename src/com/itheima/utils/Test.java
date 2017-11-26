package com.itheima.utils;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.itheima.domain.User;

public class Test {

	public static void main(String[] args) throws SQLException {
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		
		String sql="select * from proprietor";
		System.out.println(runner.query(sql,new BeanHandler<User>(User.class)));
		

	}

}
