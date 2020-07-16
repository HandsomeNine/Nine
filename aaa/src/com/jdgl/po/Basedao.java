package com.jdgl.po;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Basedao {

	PreparedStatement pst = null;
	Connection conn = null;
	public static final String drivername = "com.mysql.cj.jdbc.Driver";
	public static final String url = "jdbc:mysql://localhost:3306/test1?useSSL=false&serverTimezone=UTC";
	public static final String username = "root";
	public static final String password = "123";

	// 获取数据库连接
	public Connection getConnection() {
		try {
			Class.forName(drivername);
			try {
				conn = DriverManager.getConnection(url, username, password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;

	}

	// 关闭资源
	public void closeResourse() {
		try {

			if (pst != null)
				pst.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
