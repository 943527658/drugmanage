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
	
	//DML ��ɾ��
	public SQLTemplateImpl() {
		this.conn = DBUtil.getConn();
	}
	/**
	 * �ر����ݿ����
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
	 *  ����list 
	 *  ��ѯ
	 */
	public Collection<Object> query(String sql,Object[]args,RsMappingObject mapper){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Object> lst = new ArrayList<Object>();   //���ս���ļ��ϱ��������
		try {
			pstmt = conn.prepareStatement(sql);
			if(args != null){     //�����Ϊ�� ������� Ϊ��  ֵ������Ϊnull
				for (int i = 0; i < args.length; i++) {//�滻�滻����
					pstmt.setObject(i + 1, args[i]);
				}
			}
			rs = pstmt.executeQuery();  //������ִ�� SQL ��ѯ�������ظò�ѯ���ɵ� ResultSet ����
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
			if(args != null){     //�����Ϊ�� ������� Ϊ��  ֵ������Ϊnull
				for (int i = 0; i < args.length; i++) {//�滻�滻����
					pstmt.setObject(i + 1, args[i]);
				}
			}
			rs = pstmt.executeQuery();  //������ִ�� SQL ��ѯ�������ظò�ѯ���ɵ� ResultSet ����
			if(rs.next()){
				obj=mapper.mapper2Obj(rs);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return obj;
	}

}


