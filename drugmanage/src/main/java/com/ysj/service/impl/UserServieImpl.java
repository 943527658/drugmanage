package com.ysj.service.impl;

import java.util.List;

import com.ysj.dao.UserDAO;
import com.ysj.dao.impl.UserDAOImpl;
import com.ysj.pojo.User;
import com.ysj.service.UserService;

public class UserServieImpl implements UserService {
	private UserDAO userDao = new UserDAOImpl();
	
	public List<User> queryAllUser() {
		List<User> l = userDao.queryAll();
		return l;
	}

	public void addUser(User u) {
		userDao.add(u);
		
	}

	public void updateUser(User u) {
		userDao.update(u);
		
	}

	public void deleteUser(User u) {
		// TODO Auto-generated method stub
		
	}

}
