package com.itheima.service;

import java.sql.SQLException;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;

public class UserService {

	public boolean checkProprietorIsTrue(User user) {
		//check if the proprietor is true
		UserDao dao=new UserDao();
		Long check=0L;
		try {
			check=dao.checkProprietorIsTrue(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return check>0?true:false;
	}

	public boolean checkBuilderIsTrue(User user) {
		// check if the builder is true
		UserDao dao=new UserDao();
		Long check=0L;
		try {
			check=dao.checkBuilderIsTrue(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return check>0?true:false;
	}

	public boolean checkBidderIsTrue(User user) {
		// check if the bidder is true
		UserDao dao=new UserDao();
		Long check=0L;
		try {
			check=dao.checkBidderIsTrue(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return check>0?true:false;
	}

}
