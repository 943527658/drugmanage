package com.ysj.db;

import java.sql.ResultSet;
/***
 * 记录集转对象
 * @author admin
 *
 */
public interface RsMappingObject {
	/**
	 * 
	 * @param rs  要转换的结果集对象
	 * @return 把结果集中的数据封装到对象中放回
	 */
	public Object mapper2Obj(ResultSet rs);
}
