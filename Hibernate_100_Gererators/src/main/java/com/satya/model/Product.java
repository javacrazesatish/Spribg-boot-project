package com.satya.model;

public class Product {
	private String id ;
	private String p_name;
	private String type;
	private Double prize;
	public Product() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getPrize() {
		return prize;
	}
	public void setPrize(Double prize) {
		this.prize = prize;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", p_name=" + p_name + ", type=" + type + ", prize=" + prize + "]";
	}

}
