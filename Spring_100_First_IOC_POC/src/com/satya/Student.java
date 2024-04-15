package com.satya;

public class Student {

	private String sName;
	private int sRollNo;
	private String Addr;
	
	public Student() {
	}
	
	public Student(String sName, int sRollNo, String addr) {
		super();
		this.sName = sName;
		this.sRollNo = sRollNo;
		Addr = addr;
	}

	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getsRollNo() {
		return sRollNo;
	}
	public void setsRollNo(int sRollNo) {
		this.sRollNo = sRollNo;
	}
	public String getAddr() {
		return Addr;
	}
	public void setAddr(String addr) {
		Addr = addr;
	}
}
