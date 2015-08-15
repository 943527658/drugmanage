package com.ysj.dao;

import java.util.List;
import com.ysj.pojo.User;



public interface UserDAO {
	public List<User> queryAll();
	public void add(User u);
	public void update(User u);
	public void delete(User u);

}
