package com.jdgl.op;
import java.util.*;
import java.util.Date;
import java.sql.*;

public class Test {

	public static void main(String[] args) throws Exception {
		ResultSet rs = null;
		PreparedStatement pst = null;
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1?useSSL=false&serverTimezone=UTC",
					"root", "123");
			pst = conn.prepareStatement("select * from customer");
			rs = pst.executeQuery();
			while (rs.next()) {
				String ID = rs.getString("ID");
				String Sex = rs.getString("Sex"); 
				int IDnumber = rs.getInt("IDnumber");
				int Phonenumber = rs.getInt("Phonenumber");
				Date date = rs.getDate("date");
				System.out.println("������"+ ID+"\t" + "�Ԅe��"+ Sex+"\t" + "���֤�ţ�" + IDnumber +"\t"+ "�ֻ����룺" + Phonenumber+"\t" + "��סʱ�䣺" + date);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {

					if (rs != null)
						rs.close();
					if (pst != null)
						pst.close();
					if (conn != null)
						conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

	}

}
