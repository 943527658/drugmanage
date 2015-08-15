package com.ysj.db;

import java.util.Collection;


public interface SQLTemplate{
	
	//DML ��ɾ��
	/**
	 * �ر����ݿ����
	 */
	public void close();
	public void update(String sql,Object[]args);
	/**
	 *  ����list 
	 *  ���в�ѯ
	 */
	public Collection<?> query(String sql,Object[]args,RsMappingObject mapper);
	/**
	 * ���в�ѯ
	 */
	public Object find(String sql,Object[]args,RsMappingObject mapper);

}
