package com.example.treedemo;

import java.util.List;

public class L3Bean {
	String name;
	String id;
	String parentId;
	List<L4Bean> l4Beans;

	public List<L4Bean> getL4Beans() {
		return l4Beans;
	}

	public void setL4Beans(List<L4Bean> l4Beans) {
		this.l4Beans = l4Beans;
	}

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
	
	
}
