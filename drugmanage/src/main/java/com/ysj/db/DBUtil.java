package com.ysj.db;
/*
import java.io.IOException;*/
import java.io.InputStream;
import java.sql.Connection;
/*import java.sql.DriverManager;*/
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSourceFactory;

/**
 * ���ݿ�Ĳ������ʣ��������ݿ⹤����
 * @author admin
 * @version 1.0
 * @since 1.5
 *
 */
public class DBUtil {
	/*private static String driverClassName = null;
	private static String url=null;
	private static String username=null;
	private static String password=null;
	
	private DBUtil(){
		
	}
	
	static{
		Class<DBUtil> clazz = DBUtil.class;
		InputStream is = clazz.getResourceAsStream("/dbconf.properties");
		Properties props=new Properties();
		try {
			props.load(is);
			driverClassName= props.getProperty("driverClassName");
			url= props.getProperty("url");
		    username= props.getProperty("username");
		    password= props.getProperty("password");
		} catch (IOException e) {
			System.out.println("���������ļ�ʧ��");
		}
		try {
			Class.forName(driverClassName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
	}
	public static Connection getConn(){
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static void main(String[] args) {
		
	}*/
private static DataSource ds = null;
	
	static{
		Properties prop = new Properties();
		Class<DBUtil> clazz  = DBUtil.class;
		InputStream is = clazz.getResourceAsStream("/dbconf.properties");
		try {
			prop.load(is);
			ds = BasicDataSourceFactory.createDataSource(prop);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private DBUtil() {// ���췽��˽�л� ��˭���������������Ķ���
		
	}
	
	public static Connection getConn() {
		Connection conn = null;
		try {
			conn = ds.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void main(String[] args) {
		while(true){
			System.out.println(getConn());
		}
	}


}
