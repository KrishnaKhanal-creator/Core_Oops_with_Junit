package com.kk.oppsproject.hrsystem.entity;

public class Role {
	
	private int id;
	private String name;

	public Role() {
	}

	public Role(int id,String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Role{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
