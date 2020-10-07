package com.shzp.sys.entity;

import java.io.Serializable;

public class Role implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String role;
	private String role_code;

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(Integer id, String role, String role_code) {
		super();
		this.id = id;
		this.role = role;
		this.role_code = role_code;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getRole_code() {
		return role_code;
	}

	public void setRole_code(String role_code) {
		this.role_code = role_code;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", role=" + role + ", role_code=" + role_code + "]";
	}

}
