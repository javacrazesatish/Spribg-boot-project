package com.satya.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("eng")
public class Engine {
	
	@Value("11")
	private int id ;
	@Value("Honda")
	private String type;
	public Engine() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Engine [id=" + id + ", type=" + type + "]";
	}

}
