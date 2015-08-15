package com.ysj.db;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;


public class SQLTemplateImpl implements SQLTemplate{
	private Connection conn = null;
	
	//DML 增删改
	public SQLTemplateImpl() {
		this.conn = DBUtil.getConn();
	}
	/**
	 * 关闭数据库对象
	 */
	public void close(){
		if(this.conn!=null){
			try {
				this.conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void update(String sql,Object[]args){
		PreparedStatement pstmt = null;
		try {
			pstmt= conn.prepareStatement(sql);
			for (int i = 0; i < args.length; i++) {
				pstmt.setObject(i + 1, args[i]);
			}
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 *  返回list 
	 *  查询
	 */
	public Collection<Object> query(String sql,Object[]args,RsMappingObject mapper){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Object> lst = new ArrayList<Object>();   //接收结果的集合必须带泛型
		try {
			pstmt = conn.prepareStatement(sql);
			if(args != null){     //如果不为空 替代变量 为空  值可以设为null
				for (int i = 0; i < args.length; i++) {//替换替换变量
					pstmt.setObject(i + 1, args[i]);
				}
			}
			rs = pstmt.executeQuery();  //对象中执行 SQL 查询，并返回该查询生成的 ResultSet 对象。
			while (rs.next()) {
				Object obj = mapper.mapper2Obj(rs);
				lst.add(obj);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lst;
	}
	public Object find(String sql,Object[]args,RsMappingObject mapper){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Object obj=null;
		try {
			pstmt = conn.prepareStatement(sql);
			if(args != null){     //如果不为空 替代变量 为空  值可以设为null
				for (int i = 0; i < args.length; i++) {//替换替换变量
					pstmt.setObject(i + 1, args[i]);
				}
			}
			rs = pstmt.executeQuery();  //对象中执行 SQL 查询，并返回该查询生成的 ResultSet 对象。
			if(rs.next()){
				obj=mapper.mapper2Obj(rs);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return obj;
	}

}


