package com.example.treedemo;

import java.util.List;

public class L1Bean {
	String name;
	String id;
	String parentId;
	List<L2Bean> l2Beans;
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
	public List<L2Bean> getL2Beans() {
		return l2Beans;
	}
	public void setL2Beans(List<L2Bean> l2Beans) {
		this.l2Beans = l2Beans;
	}
	
	
}
