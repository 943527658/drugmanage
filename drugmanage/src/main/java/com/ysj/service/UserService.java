package com.ysj.service;

import java.util.List;
import com.ysj.pojo.User;


public interface UserService {
	public List<User> queryAllUser();
	public void addUser(User u);
	public void updateUser(User u);
	public void deleteUser(User u);

}
