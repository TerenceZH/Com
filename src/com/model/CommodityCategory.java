package com.model;

import java.io.Serializable;

public class CommodityCategory implements Serializable{
	private int node_id;//start from 1
	private String name;
	private int parent_id;//=0 if toppest

	public CommodityCategory() {
		// TODO Auto-generated constructor stub
	}

	public CommodityCategory(int node_id, String name, int parent_id) {
		super();
		this.node_id = node_id;
		this.name = name;
		this.parent_id = parent_id;
	}

	public int getNode_id() {
		return node_id;
	}

	public void setNode_id(int node_id) {
		this.node_id = node_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getParent_id() {
		return parent_id;
	}

	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}

	
}
