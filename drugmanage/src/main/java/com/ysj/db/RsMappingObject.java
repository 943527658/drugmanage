package com.ysj.db;

import java.sql.ResultSet;
/***
 * ��¼��ת����
 * @author admin
 *
 */
public interface RsMappingObject {
	/**
	 * 
	 * @param rs  Ҫת���Ľ��������
	 * @return �ѽ�����е����ݷ�װ�������зŻ�
	 */
	public Object mapper2Obj(ResultSet rs);
}
