package com.example.treedemo;

import java.util.List;


public class TreeRootBean {
	String rootName;
	String rootEng;
	String rootZh;
	List<L1Bean> l1Beans;
	public String getRootName() {
		return rootName;
	}
	public void setRootName(String rootName) {
		this.rootName = rootName;
	}
	public String getRootEng() {
		return rootEng;
	}
	public void setRootEng(String rootEng) {
		this.rootEng = rootEng;
	}
	public String getRootZh() {
		return rootZh;
	}
	public void setRootZh(String rootZh) {
		this.rootZh = rootZh;
	}
	public List<L1Bean> getL1Beans() {
		return l1Beans;
	}
	public void setL1Beans(List<L1Bean> l1Beans) {
		this.l1Beans = l1Beans;
	}
	
}
