package com.example.treedemo;

import java.util.List;

public class L2Bean {
	String name;
	String id;
	String parentId;
	List<L3Bean> l3Beans;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public List<L3Bean> getL3Beans() {
		return l3Beans;
	}
	public void setL3Beans(List<L3Bean> l3Beans) {
		this.l3Beans = l3Beans;
	}
	
	
}
