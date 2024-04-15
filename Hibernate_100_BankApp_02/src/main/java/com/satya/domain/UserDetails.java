package com.satya.domain;

public class UserDetails {
	private int id;
	private String userName;
	private String mobileNo;
	private String bank;
	private String govId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public UserDetails() {
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getGovId() {
		return govId;
	}
	public void setGovId(String govId) {
		this.govId = govId;
	}
	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", userName=" + userName + ", mobileNo=" + mobileNo + ", bank=" + bank
				+ ", govId=" + govId + "]";
	}
	

}
