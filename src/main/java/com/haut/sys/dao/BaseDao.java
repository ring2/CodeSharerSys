package com.haut.sys.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class BaseDao {
	
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public Connection getConn() {
		String url = "jdbc:mysql://localhost:3306/codesharesys";
		String username = "root";
		String password = "wqq123";	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {		
			e.printStackTrace();
		}	
		return conn;
	}
	
	public void closeAll(Connection conn,PreparedStatement ps ,ResultSet rs) {
		
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(ps!=null) {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public int exeSqlNoQuery(String sql,String[] object) throws Exception {
		int index = -1;
		ps =  conn.prepareStatement(sql);//通过连接对象创建ps
		if(object!=null) {				
				for(int i = 0;i<object.length;i++) {
					ps.setString(i+1, object[i]);
				}		
		}
		index = ps.executeUpdate();
		
		return index;
	}
	
}
