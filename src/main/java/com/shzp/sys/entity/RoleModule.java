package com.shzp.sys.entity;

import java.io.Serializable;

import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Table(name = "sys_role_module")
@Component
public class RoleModule implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String role_code;
	private String module_code;

	public RoleModule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RoleModule(Integer id, String role_code, String module_code) {
		super();
		this.id = id;
		this.role_code = role_code;
		this.module_code = module_code;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRole_code() {
		return role_code;
	}

	public void setRole_code(String role_code) {
		this.role_code = role_code;
	}

	public String getModule_code() {
		return module_code;
	}

	public void setModule_code(String module_code) {
		this.module_code = module_code;
	}

	@Override
	public String toString() {
		return "RoleModule [id=" + id + ", role_code=" + role_code + ", module_code=" + module_code + "]";
	}

}
