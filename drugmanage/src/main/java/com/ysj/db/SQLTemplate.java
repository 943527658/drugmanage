package com.ysj.db;

import java.util.Collection;


public interface SQLTemplate{
	
	//DML 增删改
	/**
	 * 关闭数据库对象
	 */
	public void close();
	public void update(String sql,Object[]args);
	/**
	 *  返回list 
	 *  多行查询
	 */
	public Collection<?> query(String sql,Object[]args,RsMappingObject mapper);
	/**
	 * 单行查询
	 */
	public Object find(String sql,Object[]args,RsMappingObject mapper);

}
