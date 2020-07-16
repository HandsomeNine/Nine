package com.jdgl.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.jdgl.po.Basedao;
import com.jdgl.po.customer;

public class basedao extends Basedao {

	ResultSet rs = null;
	PreparedStatement pst = null;
	Connection conn = null;

	public void selectAll() {

		try {
			conn = this.getConnection();
			this.excuteQuery("select * from customer");
			int i = 0;
			while (rs.next()) {
				String ID = rs.getString("ID");
				String Sex = rs.getString("Sex");
				int IDnumber = rs.getInt("IDnumber");
				int Phonenumber = rs.getInt("Phonenumber");
				Date date = rs.getDate("date");
				customer c = new customer(ID, Sex, IDnumber, Phonenumber, date);
				System.out.println(i + ":姓名：" + ID + "\t" + "性別：" + Sex + "\t" + "身份证号：" + IDnumber + "\t" + "手机号码："
						+ Phonenumber + "\t" + "入住时间：" + date);
				i++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeResourse();
		}

	}

	public customer selectByID(int c) {

		try {
			conn = this.getConnection();
			this.excuteQuery("select * from customer where IDnumber=?", c);
			while (rs.next()) {
				String ID = rs.getString("ID");
				String Sex = rs.getString("Sex");
				int IDnumber = rs.getInt("IDnumber");
				int Phonenumber = rs.getInt("Phonenumber");
				Date date = rs.getDate("date");
				System.out.println("姓名：" + ID + "\t" + "性別：" + Sex + "\t" + "身份证号：" + IDnumber + "\t" + "手机号码："
						+ Phonenumber + "\t" + "入住时间：" + date);
				int count = pst.executeUpdate();
				System.out.println("执行完毕，影响行数" + count);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeResourse();
		}
		return null;
	}

	public void addone(customer c) {

		try {
			String sql = "insert into customer value(?,?,?,?,?)";
			this.excuteQuery(sql, c.getID(), c.getSex(), c.getIDnumber(), c.getPhonenumber(), c.getDate());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeResourse();
		}

	}

	public void delByID(int c) {
		String sql = "delete from customer where IDnumber=?";
		this.excuteUpdate(sql, c);
//		
	}

	public void update(customer c) {
		String sql = "update customer set ID=?,Sex=?,Phonenumber=?,date=? where IDnumber=?";
		this.excuteUpdate(sql, c.getID(), c.getSex(), c.getPhonenumber(), (java.sql.Date) c.getDate(), c.getIDnumber());

	}

	public static void main(String[] args) {
		basedao b = new basedao();
//		customer cu = new customer("贺强","男",123, 18004, null);
//		b.addone(cu);
		customer cc = b.selectByID(123);
		cc.setID("强强");
		cc.setIDnumber(12345);
		b.update(cc);
		// b.selectAll();

	}

	public ResultSet excuteQuery(String sql, Object... params) {
		this.getConnection();
		try {
			pst = conn.prepareStatement(sql);
			if (params != null) {
				for (int i = 0; i < params.length; i++) {
					pst.setObject(i + 1, params[i]);
				}
			}
			ResultSet rs = pst.executeQuery();
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResourse();
		}
		return null;

	}

	public void excuteUpdate(String sql, Object... params) {
		this.getConnection();
		try {
			pst = conn.prepareStatement(sql);
			if (params != null) {
				for (int i = 0; i < params.length; i++) {
					pst.setObject(i + 1, params[i]);
				}
			}
			pst.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResourse();
		}

	}
}
