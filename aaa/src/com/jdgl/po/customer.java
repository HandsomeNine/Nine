package com.jdgl.po;

import java.util.Date;

public class customer {
	
	private String ID;
	private String Sex;
	private int IDnumber;
	private int Phonenumber;
	private Date date;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public int getIDnumber() {
		return IDnumber;
	}
	public void setIDnumber(int iDnumber) {
		IDnumber = iDnumber;
	}
	public int getPhonenumber() {
		return Phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		Phonenumber = phonenumber;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public customer(String iD, String sex, int iDnumber, int phonenumber, Date date) {
		super();
		ID = iD;
		Sex = sex;
		IDnumber = iDnumber;
		Phonenumber = phonenumber;
		this.date = date;
	}
	public customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
