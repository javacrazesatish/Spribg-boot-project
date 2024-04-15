package com.satya.model;


public class Products {
	
	private int pId;
	
	private String pName;
	
	private String pType;
	
	private Double prize;

	public Products() {
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpType() {
		return pType;
	}

	public void setpType(String pType) {
		this.pType = pType;
	}

	public Double getPrize() {
		return prize;
	}

	public void setPrize(Double prize) {
		this.prize = prize;
	}

	@Override
	public String toString() {
		return "Products [pId=" + pId + ", pName=" + pName + ", pType=" + pType + ", prize=" + prize + "]";
	}

}
